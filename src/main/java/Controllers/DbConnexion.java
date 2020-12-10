/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author theHood
 */

public class DbConnexion {
    private String dbUri = "jdbc:mysql://";
    private String dbDriver = "com.mysql.cj.jdbc.Driver";
    private Connection connection;

    public boolean connect(String host, String base, String user, String pass) throws SQLException  {
       try {
            Class.forName(dbDriver);
            String uri = dbUri + host + '/' + base;
            connection = DriverManager.getConnection(uri, user, pass);
            return true;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return false;
            // Could not find the database driver
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
            // Could not connect to the database
        }
    }

    public Connection getConnection() {
        return connection;
    }
}