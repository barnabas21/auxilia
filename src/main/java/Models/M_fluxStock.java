/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**classe représentant une association porteuse de propriete
 *
 * @author Jeff
 */
public class M_fluxStock {
    private long qteEnStock;
    private long idStock; //clé étrangère
    private long idLivraison; //clé étrangère
    private long idVente; //clé étrangère
    //

    public M_fluxStock() {
    }

    public M_fluxStock(long qteEnStock, long idStock, long idLivraison, long idVente) {
        this.qteEnStock = qteEnStock;
        this.idStock = idStock;
        this.idLivraison = idLivraison;
        this.idVente = idVente;
    }
    //

    public long getQteEnStock() {
        return qteEnStock;
    }

    public void setQteEnStock(long qteEnStock) {
        this.qteEnStock = qteEnStock;
    }

    public long getIdStock() {
        return idStock;
    }

    public void setIdStock(long idStock) {
        this.idStock = idStock;
    }

    public long getIdLivraison() {
        return idLivraison;
    }

    public void setIdLivraison(long idLivraison) {
        this.idLivraison = idLivraison;
    }

    public long getIdVente() {
        return idVente;
    }

    public void setIdVente(long idVente) {
        this.idVente = idVente;
    }
    //

    @Override
    public String toString() {
        return "FluxStock{" + "qteEnStock=" + qteEnStock + ", idStock=" + idStock + ", idLivraison=" + idLivraison + ", idVente=" + idVente + '}';
    }
    
}
