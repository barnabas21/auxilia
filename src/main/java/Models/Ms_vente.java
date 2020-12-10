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
public class Ms_vente {
    private long idVente;
    private int qteVendu;
    private float prixUVendu;
    private Date venteSaisieAt;
    private Date venteUpdateAt;
    
    //

    public Ms_vente() {
    }

    public Ms_vente(long idVente, int qteVendu, float prixUVendu, Date venteSaisieAt, Date venteUpdateAt) {
        this.idVente = idVente;
        this.qteVendu = qteVendu;
        this.prixUVendu = prixUVendu;
        this.venteSaisieAt = venteSaisieAt;
        this.venteUpdateAt = venteUpdateAt;
    }
    //

    public long getIdVente() {
        return idVente;
    }

    public void setIdVente(long idVente) {
        this.idVente = idVente;
    }

    public int getQteVendu() {
        return qteVendu;
    }

    public void setQteVendu(int qteVendu) {
        this.qteVendu = qteVendu;
    }

    public float getPrixUVendu() {
        return prixUVendu;
    }

    public void setPrixUVendu(float prixUVendu) {
        this.prixUVendu = prixUVendu;
    }

    public Date getVenteSaisieAt() {
        return venteSaisieAt;
    }

    public void setVenteSaisieAt(Date venteSaisieAt) {
        this.venteSaisieAt = venteSaisieAt;
    }

    public Date getVenteUpdateAt() {
        return venteUpdateAt;
    }

    public void setVenteUpdateAt(Date venteUpdateAt) {
        this.venteUpdateAt = venteUpdateAt;
    }
    //

    @Override
    public String toString() {
        return "Vente{" + "idVente=" + idVente + ", qteVendu=" + qteVendu + ", prixUVendu=" + prixUVendu + ", venteSaisieAt=" + venteSaisieAt + ", venteUpdateAt=" + venteUpdateAt + '}';
    }
    
}
