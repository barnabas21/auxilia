package main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Views.connexion;
import java.awt.Component;

/**
 *
 * @author theHood
 */
public class MainClass {

    private static Component frame;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        connexion Conn = new connexion();
        Conn.setVisible(true);

        /*menu menu = new menu();
        menu.setVisible(true);*/
        
        /*menuAdmin menuAd = new menuAdmin();
        menuAd.setVisible(true);*/
        
        //licence();
    }
    

}
