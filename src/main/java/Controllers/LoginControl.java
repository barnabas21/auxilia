/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

/**
 *
 * @author theHood
 */
import Models.LoginModel;
import Views.LoginView;
import Views.connexion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class LoginControl {
    private LoginModel model;
    private LoginView view;
   
    public LoginControl(LoginView view){
        this.view = view;
       
        view.addLoginListener(new LoginListener());
    }

    public LoginControl(connexion Conn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    class LoginListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                model = view.getUser();
                if(checkUser(model)){
                    view.showMessage("Login succesfully!");
                }else{
                    view.showMessage("Invalid username and/or password!");
                }               
            } catch (Exception ex) {
                view.showMessage(ex.getStackTrace().toString());
            }
        }
    }
   
    public boolean checkUser(LoginModel user) throws Exception {
       
        String dbUrl = "jdbc:mysql://localhost:3306/pharmacie?useSSL=false&serverTimezone=UTC";
        String dbClass = "com.mysql.cj.jdbc.Driver";
        String query = "Select * FROM pharmacien WHERE pseudo ='" + user.getUserName()
                + "' AND pwd ='" + user.getPassword() + "'";

        try {
            Class.forName(dbClass);
            try (Connection con = DriverManager.getConnection (dbUrl, "root" ,"2105")) {
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(query);
                
                if (rs.next()) {
                    return true;
                }
            }
        }catch(ClassNotFoundException | SQLException e) {
            throw e;
        }
        return false;
      }
}
