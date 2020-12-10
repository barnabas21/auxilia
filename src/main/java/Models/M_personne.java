/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Models.M_auth;
import java.util.Date;

/**
 *
 * @author Jeff
 */
public class M_personne extends M_auth
{
    private String nomPers;
    private String prenomsPers;
    
    //Constructeurs

    public M_personne() {
    }
    
    public M_personne(String nomPers, String prenomsPers) {
        this.nomPers = nomPers;
        this.prenomsPers = prenomsPers;
    }

    public M_personne(String nomPers, String prenomsPers, long idAuth, String userName, String pwd, Date createdAt, Date updatedAt) {
        super(userName, pwd, createdAt, updatedAt);
        this.nomPers = nomPers;
        this.prenomsPers = prenomsPers;
    }
    
    //Acesseurs et Mutateurs
    public String getNomPers() {
        return nomPers;
    }

    public void setNomPers(String nomPers) {
        this.nomPers = nomPers;
    }

    public String getPrenomsPers() {
        return prenomsPers;
    }

    public void setPrenomsPers(String prenomsPers) {
        this.prenomsPers = prenomsPers;
    }
    
    //Methode d'Affichage

    @Override
    public String toString() {
        return "Personne{" + "nomPers=" + nomPers + ", prenomsPers=" + prenomsPers + '}';
    }
    
    

    
    
    
}

    