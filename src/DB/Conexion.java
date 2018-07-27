
package DB;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author William Gonzalez
 */

public class Conexion {
 
        private static final String db="projectpoo";
    private static final String user="root";
    private static final String pass="Temporal0";
    private static final String host="localhost:3306";
    private static final String server="jdbc:mysql://"+host+"/"+db;
    
    public static  Connection getConexion() {
        Connection cn=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn=(Connection)DriverManager.getConnection(server,user,pass);         
        }
        catch(ClassNotFoundException | SQLException e){
         System.out.println(String.valueOf(e));}
        return cn;
    }
    public static ResultSet getTabla(String Consulta){
        Connection cn=getConexion();
        Statement st;
        ResultSet datos=null;
        try{
            st=cn.createStatement();
            datos=st.executeQuery(Consulta);            
        }
        catch(SQLException e){ System.out.print(e.toString());}
        return datos;
    } 

    public Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
