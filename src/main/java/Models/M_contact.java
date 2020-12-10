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
public class M_contact {
    private long idContact;
    private String valeurContact;
    
    //Constructeur

    public M_contact() {
    }
    
    public M_contact(long idContact, String valeurContact) {
        this.idContact = idContact;
        this.valeurContact = valeurContact;
    }
    
    //Accesseurs et Mutateurs

    public long getIdContact() {
        return idContact;
    }

    public void setIdContact(long idContact) {
        this.idContact = idContact;
    }

    public String getValeurContact() {
        return valeurContact;
    }

    public void setValeurContact(String valeurContact) {
        this.valeurContact = valeurContact;
    }
    
    //Methode d'Affichage

    @Override
    public String toString() {
        return "Contact{" + "idContact=" + idContact + ", valeurContact=" + valeurContact + '}';
    }
    
}
