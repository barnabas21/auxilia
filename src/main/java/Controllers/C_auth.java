/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.M_auth;
import Views.connexion;
import Views.menuAdmin;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author theHood
 */
public class C_auth {

    Connection con;
    DbConnexion Dcon;
    String Rq;
    Statement stm;
    PreparedStatement ps;
    M_auth ma;
    ResultSet Rs;

    public C_auth(String usn, String mdp) throws SQLException {

        String string = "select * from pharmacien where pseudo like ?";
        Connection conn = (Connection) SingletonConnection.getConnection();
        int count = 0;
        try {
            PreparedStatement ps = (PreparedStatement) conn.prepareStatement(string);
            ps.setString(1, "%" + usn + "%");
            ResultSet result = ps.executeQuery();
            while (result.next()) {
                String name = result.getString(2);
                String pass = result.getString(3);
                String pseudo = result.getString("pseudo");
                String pwd = result.getString("pwd");
                String funct = result.getString(6);
                String output = "User #%d: %s - %s - %s - %s - %s";
                System.out.println(String.format(output, ++count, name, pass, pseudo, pwd, funct));
                if(pwd.equals(mdp)){
                    menuAdmin menu = new menuAdmin();
                    menu.setVisible(true);
                    
                }else if(!pwd.equals(mdp) || usn.equals("") || usn!=pseudo){
                    connexion connn = new connexion();
                    connn.setVisible(true);
                }
            }

            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /*DbConnexion db = new DbConnexion();
        if (db.connect("localhost", "pharmacie", "root", "2105")) {
            final Connection conn = db.getConnection();
            try {
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement
					("insert into CATEGORIES(NOM_CAT) values(?)");
			ps.setString(1, c.getNomCat());
			ps.executeUpdate();
			ps.close();
			
		}catch(SQLException e){
			
		}
		
        }
    }*/
}
