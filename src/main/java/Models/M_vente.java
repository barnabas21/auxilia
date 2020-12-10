/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Jeff
 */
public class M_vente {
    private long idAchat;
    private long idVente;
    private long idClient;
    private long idPharmacien;
    private long idMedicament;
    //

    public M_vente() {
    }

    public M_vente(long idAchat, long idVente, long idClient, long idPharmacien, long idMedicament) {
        this.idAchat = idAchat;
        this.idVente = idVente;
        this.idClient = idClient;
        this.idPharmacien = idPharmacien;
        this.idMedicament = idMedicament;
    }
    //

    public long getIdAchat() {
        return idAchat;
    }

    public void setIdAchat(long idAchat) {
        this.idAchat = idAchat;
    }
    
    public long getIdVente() {
        return idVente;
    }

    public void setIdVente(long idVente) {
        this.idVente = idVente;
    }

    public long getIdClient() {
        return idClient;
    }

    public void setIdClient(long idClient) {
        this.idClient = idClient;
    }

    public long getIdPharmacien() {
        return idPharmacien;
    }

    public void setIdPharmacien(long idPharmacien) {
        this.idPharmacien = idPharmacien;
    }

    public long getIdMedicament() {
        return idMedicament;
    }

    public void setIdMedicament(long idMedicament) {
        this.idMedicament = idMedicament;
    }
    //

    @Override
    public String toString() {
        return "AchatClient{" + "idVente=" + idVente + ", idClient=" + idClient + ", idPharmacien=" + idPharmacien + ", idMedicament=" + idMedicament + '}';
    }
    
}
