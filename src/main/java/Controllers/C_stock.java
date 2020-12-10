/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.M_stock;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author theHood
 */
public class C_stock {
    Connection con;
    DbConnexion Dcon;
    String Rq;
    Statement stm;
    PreparedStatement ps;
    M_stock ms;
    ResultSet Rs;
    
    public C_stock(){
        Dcon = new DbConnexion();
        //con = Dcon.con;
    }  
    public DefaultTableModel getAllMedoc() throws SQLException{
        DefaultTableModel listStock = new DefaultTableModel();
        Rq = "SELECT * FROM medicament";
        listStock.addColumn("id Medicament");
        listStock.addColumn("Nom Medicament");
        listStock.addColumn("Type Medicament");
        
        Connection conn = (Connection) SingletonConnection.getConnection();
        
        try{
            stm = conn.createStatement();
            System.out.println("Connexion");
            Rs = stm.executeQuery(Rq);
            while(Rs.next()){
                System.out.println(""+Rs.getInt("idMed"));
                listStock.addRow(new Object[]{
                    Rs.getInt("idMed"),Rs.getString("nomMed"),
                    Rs.getString("typeMed")
                });
            }
        }catch(SQLException e){
            System.err.println("Erreur !!! "+e);
        }
        return listStock;
    }
    public DefaultListModel<String> getCatMedoc() throws SQLException{
        DefaultListModel<String> dlm = new DefaultListModel<String>();
        Rq = "SELECT * FROM medicament";
        
        Connection conn = (Connection) SingletonConnection.getConnection();
        
        try{
            stm = conn.createStatement();
            System.out.println("Connexion");
            Rs = stm.executeQuery(Rq);
            while(Rs.next()){
                System.out.println(""+Rs.getInt("idMed"));
                dlm.set(1,"typeMed");
            }
        }catch(SQLException e){
            System.err.println("Erreur !!! "+e);
        }
        return dlm;
    }
}
