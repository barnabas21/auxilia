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
public class M_medicament {
    private long idMedicament;
    private String nomMedicament;
    private String typeMedicament;
    
    //constructeur

    public M_medicament() {
    }

    public M_medicament(long idMedicament, String nomMedicament, String typeMedicament) {
        this.idMedicament = idMedicament;
        this.nomMedicament = nomMedicament;
        this.typeMedicament = typeMedicament;
    }
    
    //accesseurs & mutateurs
    public long getIdMedicament() {
        return idMedicament;
    }

    public void setIdMedicament(long idMedicament) {
        this.idMedicament = idMedicament;
    }

    public String getNomMedicament() {
        return nomMedicament;
    }

    public void setNomMedicament(String nomMedicament) {
        this.nomMedicament = nomMedicament;
    }

    public String getTypeMedicament() {
        return typeMedicament;
    }

    public void setTypeMedicament(String typeMedicament) {
        this.typeMedicament = typeMedicament;
    }
    
//affichage
    @Override
    public String toString() {
        return "Medicament{" + "idMedicament=" + idMedicament + ", nomMedicament=" + nomMedicament + ", typeMedicament=" + typeMedicament + '}';
    }
    
    
    
}
