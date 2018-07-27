/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author William Gonzalez
 */
public class CustomersDB {
    
    public static final String URL = "jdbc:mysql://localhost:3306/customers";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "Temporal0";

    PreparedStatement ps;
    ResultSet rs;

    public static Connection getConnection() {
        Connection con = null;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
            JOptionPane.showMessageDialog(null, "Successful connection");
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return con;
    }
    
    
}
