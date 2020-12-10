/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.M_medicament;
import Models.Ms_vente;
import Views.connexion;
import Views.menuAdmin;
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
public class C_vente {

    Connection con;
    DbConnexion Dcon;
    String Rq;
    Statement stm;
    PreparedStatement ps;
    Ms_vente mv;
    ResultSet Rs;

    public C_vente() {
    }

    public DefaultTableModel getAllStock() throws SQLException {
        DefaultTableModel listStock = new DefaultTableModel();
        Rq = "SELECT * FROM vente";
        listStock.addColumn("idVente");
        listStock.addColumn("Quantité Vendue");
        listStock.addColumn("Prix");
        listStock.addColumn("Date Vente");
        listStock.addColumn("Date Modif_Vente");

        listStock.addColumn("Etat");

        Connection conn = (Connection) SingletonConnection.getConnection();

        try {
            stm = conn.createStatement();
            System.out.println("Connexion");
            Rs = stm.executeQuery(Rq);
            while (Rs.next()) {
                System.out.println("" + Rs.getInt("idVente"));
                listStock.addRow(new Object[]{
                    Rs.getInt("idVente"), Rs.getInt("qteVendu"), Rs.getInt("prixUVendu"),
                    Rs.getDate("dateSaisieVente"), Rs.getDate("dateModifVente"),});
            }
        } catch (SQLException e) {
            System.err.println("Erreur !!! " + e);
        }
        return listStock;
    }
}
