/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Models.M_auth;
import java.util.Date;

/**
 * la Classe Root sert de porte dérobée. Elle sera utilisée pour des maintenances.
 * 
 *
 * @author Jeff
 */
public class M_root extends M_auth{
    private long idRoot;
    private long idContactRoot; //cet attribut représente la clé étrangère de la table Contact(relation de 1 à plusieurs)
    
    //Constructeurs
    public M_root() {
    }

    public M_root(long idRoot, long idContactRoot, String userName, String pwd, Date createdAt, Date updatedAt) {
        super(userName, pwd, createdAt, updatedAt);
        this.idRoot = idRoot;
        this.idContactRoot = idContactRoot;
    }

    //Accesseurs & Mutateurs
    public long getIdRoot() {
        return idRoot;
    }

    public void setIdRoot(long idRoot) {
        this.idRoot = idRoot;
    }

    public long getIdContactRoot() {
        return idContactRoot;
    }

    public void setIdContactRoot(long idContactRoot) {
        this.idContactRoot = idContactRoot;
    }
    
    //Methode d'affichage

    @Override
    public String toString() {
        return "Root{" + "idRoot=" + idRoot + ", idContactRoot=" + idContactRoot + '}';
    }
    
      
}
