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
public class M_medicamentLivre {
    
    private long idPharmacien;
    private long idLivraison;
    private long idMedicament;
    
    //
    public M_medicamentLivre() {
    }

    public M_medicamentLivre(long idPharmacien, long idLivraison, long idMedicament) {
        this.idPharmacien = idPharmacien;
        this.idLivraison = idLivraison;
        this.idMedicament = idMedicament;
    }
    //

    public long getIdPharmacien() {
        return idPharmacien;
    }

    public void setIdPharmacien(long idPharmacien) {
        this.idPharmacien = idPharmacien;
    }

    public long getIdLivraison() {
        return idLivraison;
    }

    public void setIdLivraison(long idLivraison) {
        this.idLivraison = idLivraison;
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
        return "MedicamentLivre{" + "idPharmacien=" + idPharmacien + ", idLivraison=" + idLivraison + ", idMedicament=" + idMedicament + '}';
    }
    
    
}
