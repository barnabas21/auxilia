/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Models;

import java.util.Date;
import java.sql.*;

/**
 *
 * @author Jeff
 */
public class M_auth 
{
   private String userName;
   private String pwd;
   private Date createdAt;
   private Date updatedAt;
   
   //Constructeurs
    public M_auth() {
    }

    public M_auth(String userName, String pwd, Date createdAt, Date updatedAt) {
        this.userName = userName;
        this.pwd = pwd;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
    
    //Accesseurs et Mutatteurs 
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
   
    //Méthode d'affichage

    @Override
    public String toString() {
        return "Authentification{" + "userName=" + userName + ", pwd=" + pwd + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + '}';
    }

    
    
    
   
}

   

    
    
    

