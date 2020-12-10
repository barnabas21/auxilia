/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.M_liivraison;
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
public class C_livraison {
     Connection con;
    DbConnexion Dcon;
    String Rq;
    Statement stm;
    PreparedStatement ps;
    M_liivraison ml;
    ResultSet Rs;
    
    public C_livraison(){
        Dcon = new DbConnexion();
        //con = Dcon.con;
    }
    public DefaultTableModel getAllStock() throws SQLException{
        
        DefaultTableModel listStock = new DefaultTableModel();
        Rq = "SELECT * FROM livraison";
        listStock.addColumn("idLiv");
        listStock.addColumn("Quantité Livrée");
        listStock.addColumn("Date Livraison");
        listStock.addColumn("Date Modif");
        listStock.addColumn("Prix");
        listStock.addColumn("Etat");
        
        Connection conn = (Connection) SingletonConnection.getConnection();
        
        try{
            stm = conn.createStatement();
            System.out.println("Connexion");
            Rs = stm.executeQuery(Rq);
            while(Rs.next()){
                System.out.println(""+Rs.getInt("idStock"));
                listStock.addRow(new Object[]{
                    Rs.getInt("idLiv"),Rs.getInt("qteLiv"),
                    Rs.getDate("dateSaisieLiv"), Rs.getDate("dateModifLiv"),
                    Rs.getInt("prixLiv"), Rs.getString("etatLiv")
                });
            }
        }catch(SQLException e){
            System.err.println("Erreur !!! "+e);
        }
        return listStock;
    }
}
