/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.M_pharmacien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author theHood
 */
public class C_pharmacien {
    Connection con;
    DbConnexion Dcon;
    String Rq;
    Statement stm;
    PreparedStatement ps;
    M_pharmacien ph;
    ResultSet Rs;
    
    public C_pharmacien(){
        Dcon = new DbConnexion();
        //con = Dcon.con;
    }
    
    public DefaultTableModel getAllUsers() throws SQLException {
        DefaultTableModel listStock = new DefaultTableModel();
        Rq = "SELECT * FROM vente";
        listStock.addColumn("Id Pharmacien");
        listStock.addColumn("Nom");
        listStock.addColumn("Prénoms");
        listStock.addColumn("Pseudo");
        listStock.addColumn("Fonction");

        listStock.addColumn("Etat");

        Connection conn = (Connection) SingletonConnection.getConnection();

        try {
            stm = conn.createStatement();
            System.out.println("Connexion");
            Rs = stm.executeQuery(Rq);
            while (Rs.next()) {
                System.out.println("" + Rs.getInt("idPharm"));
                listStock.addRow(new Object[]{
                    Rs.getInt("idVente"), Rs.getString("nomPharm"), Rs.getString("prenomPharm"),
                    Rs.getString("pseudo"), Rs.getString("function"),});
            }
        } catch (SQLException e) {
            System.err.println("Erreur !!! " + e);
        }
        return listStock;
    }
}
