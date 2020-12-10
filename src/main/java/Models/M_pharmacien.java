/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.Date;

/**
 *
 * @author Jeff
 */
public class M_pharmacien extends M_personne
{
   private long idPharmacien;
   private String fonctionPharm;
   private long idContactPharm; //ce attribut représente la clé étrangère de la table Contact(de 1 à plusieurs)
   
   //Constructeurs
    public M_pharmacien(){
       
    } 
    
    public M_pharmacien(long idPharmacien, String fonctionPharm, long idContactPharm, String nomPers, String prenomsPers, long idAuth, String userName, String pwd, Date createdAt, Date updatedAt) {
        super(nomPers, prenomsPers, idAuth, userName, pwd, createdAt, updatedAt);
        this.idPharmacien = idPharmacien;
        this.fonctionPharm = fonctionPharm;
        this.idContactPharm = idContactPharm;
    }
   
    //Accesseurs & Mutateurs
    public long getIdPharmacien() {
        return idPharmacien;
    }

    public void setIdPharmacien(long idPharmacien) {
        this.idPharmacien = idPharmacien;
    }

    public String getFonctionPharm() {
        return fonctionPharm;
    }

    public void setFonctionPharm(String fonctionPharm) {
        this.fonctionPharm = fonctionPharm;
    }

    public long getIdContactPharm() {
        return idContactPharm;
    }

    public void setIdContactPharm(long idContactPharm) {
        this.idContactPharm = idContactPharm;
    }
    
    //Methode d'Affichage

    @Override
    public String toString() {
        return "Pharmacien{" + "idPharmacien=" + idPharmacien + ", fonctionPharm=" + fonctionPharm + ", idContactPharm=" + idContactPharm + '}';
    }
    
    
    
}
