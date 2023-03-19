/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.database.management;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
/**
 *
 * @author Acer
 */
public class DatabaseConnection {
    public static Connection getConnection()
    {
        Connection con=null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/lms","root","");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex, "Could not Establish Connection", 0);
        }
        
        return con;
    }
    
}
