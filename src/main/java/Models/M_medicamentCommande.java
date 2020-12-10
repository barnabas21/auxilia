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
public class M_medicamentCommande {
    
    private long idPharmacien;
    private long idMedicament;
    private long idCommande;
    //

    public M_medicamentCommande() {
    }

    public M_medicamentCommande(long idPharmacien, long idMedicament, long idCommande) {
        this.idPharmacien = idPharmacien;
        this.idMedicament = idMedicament;
        this.idCommande = idCommande;
    }
    //

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

    public long getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(long idCommande) {
        this.idCommande = idCommande;
    }

    @Override
    public String toString() {
        return "MedicamentCommande{" + "idPharmacien=" + idPharmacien + ", idMedicament=" + idMedicament + ", idCommande=" + idCommande + '}';
    }
    
    
}
