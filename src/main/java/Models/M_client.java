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
public class M_client extends M_personne{
    private long idClient;
    private String adresseClient;
    private long noCarteSS;
    private long idContactClient; //clé étrangère de la table Contact(0 à plusieurs)
    
    //Constructeurs
    public M_client(){
        
    }
    
    public M_client(long idClient, String adresseClient, long noCarteSS, long idContactClient, String nomPers, String prenomsPers, long idAuth, String userName, String pwd, Date createdAt, Date updatedAt) {
        super(nomPers, prenomsPers, idAuth, userName, pwd, createdAt, updatedAt);
        this.idClient = idClient;
        this.adresseClient = adresseClient;
        this.noCarteSS = noCarteSS;
        this.idContactClient = idContactClient;
    }
    
    //Accesseurs & Mutateurs

    public long getIdClient() {
        return idClient;
    }

    public void setIdClient(long idClient) {
        this.idClient = idClient;
    }

    public String getAdresseClient() {
        return adresseClient;
    }

    public void setAdresseClient(String adresseClient) {
        this.adresseClient = adresseClient;
    }

    public long getNoCarteSS() {
        return noCarteSS;
    }

    public void setNoCarteSS(long noCarteSS) {
        this.noCarteSS = noCarteSS;
    }

    public long getIdContactClient() {
        return idContactClient;
    }

    public void setIdContactClient(long idContactClient) {
        this.idContactClient = idContactClient;
    }
    
    //Methode d'Affichage
    @Override
    public String toString() {
        return "Client{" + "idClient=" + idClient + ", adresseClient=" + adresseClient + ", noCarteSS=" + noCarteSS + ", idContactClient=" + idContactClient + '}';
    }
    
    
}
