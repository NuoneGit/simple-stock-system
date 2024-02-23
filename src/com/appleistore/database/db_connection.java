package com.appleistore.database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class db_connection {
    
    protected Connection connection;

    public Connection connection() {
  
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/istore_db", "root",""); 
            } catch (Exception e) {
                Logger.getLogger(db_connection.class.getName()).log(Level.SEVERE, null, e);
            }
            System.out.println("Connected...");
        } catch (ClassNotFoundException e) {
            Logger.getLogger(db_connection.class.getName()).log(Level.SEVERE, null, e);
        }
        return connection;
    }

 
}
