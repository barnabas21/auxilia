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
public class M_liivraison {
    private long idLivraison;
    private long qteLivree;
    private Date livrCreatedAt; //date de première saisie d'une livraison
    private Date livrUpdatedAt; //date de dernière modification
    private String etatLivr; // livraison active ou non
    private long idFournisseur; //clé etrangère de Fournisseur(1 à plusieurs)
    private float prixParUniteLivree; //prix par unité livrée
    
    //Constructeur
    public M_liivraison() {
    }

    public M_liivraison(long idLivraison, long qteLivree, Date livrCreatedAt, Date livrUpdatedAt, String etatLivr, long idFournisseur, float prixParUniteLivree) {
        this.idLivraison = idLivraison;
        this.qteLivree = qteLivree;
        this.livrCreatedAt = livrCreatedAt;
        this.livrUpdatedAt = livrUpdatedAt;
        this.etatLivr = etatLivr;
        this.idFournisseur = idFournisseur;
        this.prixParUniteLivree = prixParUniteLivree;
    }
    
    //accesseur et mutateurs
    public long getIdLivraison() {
        return idLivraison;
    }

    public void setIdLivraison(long idLivraison) {
        this.idLivraison = idLivraison;
    }

    public long getQteLivree() {
        return qteLivree;
    }

    public void setQteLivree(long qteLivree) {
        this.qteLivree = qteLivree;
    }

    public Date getLivrCreatedAt() {
        return livrCreatedAt;
    }

    public void setLivrCreatedAt(Date livrCreatedAt) {
        this.livrCreatedAt = livrCreatedAt;
    }

    public Date getLivrUpdatedAt() {
        return livrUpdatedAt;
    }

    public void setLivrUpdatedAt(Date livrUpdatedAt) {
        this.livrUpdatedAt = livrUpdatedAt;
    }

    public String getEtatLivr() {
        return etatLivr;
    }

    public void setEtatLivr(String etatLivr) {
        this.etatLivr = etatLivr;
    }

    public long getIdFournisseur() {
        return idFournisseur;
    }

    public void setIdFournisseur(long idFournisseur) {
        this.idFournisseur = idFournisseur;
    }

    public float getPrixParUniteLivree() {
        return prixParUniteLivree;
    }

    public void setPrixParUniteLivree(float prixParUniteLivree) {
        this.prixParUniteLivree = prixParUniteLivree;
    }
    
    
    
    //methode d'affichage

    @Override
    public String toString() {
        return "Livraison{" + "idLivraison=" + idLivraison + ", qteLivree=" + qteLivree + ", livrCreatedAt=" + livrCreatedAt + ", livrUpdatedAt=" + livrUpdatedAt + ", etatLivr=" + etatLivr + ", idFournisseur=" + idFournisseur + ", prixParUniteLivree=" + prixParUniteLivree + '}';
    }
    
    
    
    
    
}
