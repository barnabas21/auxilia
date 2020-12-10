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
public class M_commande {
    private long idCommande;
    private long qteCommandee;
    private Date commandeCreatedAt; //date de première saisie de la commande
    private Date commandeUpdatedAt; //date de dernière modification
    private String etatCommande; //si la commaande est active ou pas(anuler)
    
    //Constructeur
    public M_commande() {
    }

    public M_commande(long idCommande, long qteCommandee, Date commandeCreatedAt, Date commandeUpdatedAt, String etatCommande) {
        this.idCommande = idCommande;
        this.qteCommandee = qteCommandee;
        this.commandeCreatedAt = commandeCreatedAt;
        this.commandeUpdatedAt = commandeUpdatedAt;
        this.etatCommande = etatCommande;
    }
    
    //Accesseurs & mutatteurs

    public long getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(long idCommande) {
        this.idCommande = idCommande;
    }

    public long getQteCommandee() {
        return qteCommandee;
    }

    public void setQteCommandee(long qteCommandee) {
        this.qteCommandee = qteCommandee;
    }

    public Date getCommandeCreatedAt() {
        return commandeCreatedAt;
    }

    public void setCommandeCreatedAt(Date commandeCreatedAt) {
        this.commandeCreatedAt = commandeCreatedAt;
    }

    public Date getCommandeUpdatedAt() {
        return commandeUpdatedAt;
    }

    public void setCommandeUpdatedAt(Date commandeUpdatedAt) {
        this.commandeUpdatedAt = commandeUpdatedAt;
    }

    public String getEtatCommande() {
        return etatCommande;
    }

    public void setEtatCommande(String etatCommande) {
        this.etatCommande = etatCommande;
    }
    
    //methode d'affichage

    @Override
    public String toString() {
        return "Commande{" + "idCommande=" + idCommande + ", qteCommandee=" + qteCommandee + ", commandeCreatedAt=" + commandeCreatedAt + ", commandeUpdatedAt=" + commandeUpdatedAt + ", etatCommande=" + etatCommande + '}';
    }
    
    
}
