
package databaseCon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ConnectDB {
    
    Connection conn=null;
    

    

    public  Connection connect() {
        
        try {
            // db parameters
            String url = "jdbc:sqlite:Database/db/sample.db";
            // create a connection to the database
            conn = DriverManager.getConnection(url);
            
            System.out.println("Connection to SQLite has been established.");
         
             return conn;
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } 
        return null;
    }
    
    
    
  
    
    
}





