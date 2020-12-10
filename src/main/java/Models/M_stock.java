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
public class M_stock {
    private long idStock;
    private long idMedicament; //clé étrangère de Medicament(1 à plusieurs)

    public M_stock() {
    }

    public M_stock(long idStock, long idMedicament) {
        this.idStock = idStock;
        this.idMedicament = idMedicament;
    }

    public long getIdStock() {
        return idStock;
    }

    public void setIdStock(long idStock) {
        this.idStock = idStock;
    }

    public long getIdMedicament() {
        return idMedicament;
    }

    public void setIdMedicament(long idMedicament) {
        this.idMedicament = idMedicament;
    }

    @Override
    public String toString() {
        return "Stock{" + "idStock=" + idStock + ", idMedicament=" + idMedicament + '}';
    }
    
    
}
