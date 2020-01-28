/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sport;
import java.sql.*; 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class JavaConnection {
    private static Connection con =null;
   static Statement st;
    public static Connection dbConnect()
    {
         String url="jdbc:oracle:thin:@localhost:1521:xe";
            
         try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
          System.out.println("Driver Loaded");
            
             con = DriverManager.getConnection(url,"MYDATABASE","12345");
                         System.out.println("Connection Established");
                          
               return con;
              
         


            } 
           
           catch (ClassNotFoundException  | SQLException ex) {
           Logger.getLogger(Alogin.class.getName()).log(Level.SEVERE, null, ex);
       return null;
       
       } 
         
    
    }
}
