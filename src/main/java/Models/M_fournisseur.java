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
public class M_fournisseur extends M_personne{
   private long idFounisseur;
   private long noCarteFournisseur;
   private String nomEntrepriseFourn;
   
   //Constructeurs
   public M_fournisseur(){
       
   }
   public M_fournisseur(long idFounisseur, long noCarteFournisseur, String nomEntrepriseFourn, String nomPers, String prenomsPers, long idAuth, String userName, String pwd, Date createdAt, Date updatedAt) {
        super(nomPers, prenomsPers, idAuth, userName, pwd, createdAt, updatedAt);
        this.idFounisseur = idFounisseur;
        this.noCarteFournisseur = noCarteFournisseur;
        this.nomEntrepriseFourn = nomEntrepriseFourn;
   }
   
   //Acceseurs & Mutatteurs

    public long getIdFounisseur() {
        return idFounisseur;
    }

    public void setIdFounisseur(long idFounisseur) {
        this.idFounisseur = idFounisseur;
    }

    public long getNoCarteFournisseur() {
        return noCarteFournisseur;
    }

    public void setNoCarteFournisseur(long noCarteFournisseur) {
        this.noCarteFournisseur = noCarteFournisseur;
    }

    public String getNomEntrepriseFourn() {
        return nomEntrepriseFourn;
    }

    public void setNomEntrepriseFourn(String nomEntrepriseFourn) {
        this.nomEntrepriseFourn = nomEntrepriseFourn;
    }
    
    //Methode d'Affichage
    @Override
    public String toString() {
        return "Fournisseur{" + "idFounisseur=" + idFounisseur + ", noCarteFournisseur=" + noCarteFournisseur + ", nomEntrepriseFourn=" + nomEntrepriseFourn + '}';
    }
   
    

   

   
   
}
