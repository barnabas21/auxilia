package com.compatb.auxilia;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Views.*;
import Views.connexion;
import Controllers.DbConnexion;
import Controllers.LoginControl;
import Models.LoginModel;
import java.awt.Component;
import java.sql.Connection;

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
        /*menuAdmin menuAd = new menuAdmin();
        menuAd.setVisible(true);*/
        
        connexion Conn = new connexion();
        Conn.setVisible(true);
        
        /*LoginView view = new LoginView();
        view.setVisible(true);*/
        /*LoginModel model = new LoginModel();
        LoginControl c = new LoginControl(Conn);
        c.checkUser(model);*/
        
        

        /*menu menu = new menu();
        menu.setVisible(true);*/
        
        //licence();
    }
    

}
