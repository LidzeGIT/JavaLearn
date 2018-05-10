package javabd;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;



public class JavaBD {
  
    public static final String DRIVER_NAME="com.mysql.cj.jdbc.Driver";
    
    public static final String CONNE_STRING = "jdbc:mysql://localhost:3306/?user=root&password=root&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false" ;
    
    
    public static void main(String[] args) {
        
        try {
            Class.forName(DRIVER_NAME);
        } catch (ClassNotFoundException ex) {
            System.out.println("MySQL Driver not found!");
        }
        
        Enumeration<Driver> drvs = DriverManager.getDrivers();
        while(drvs.hasMoreElements())
            System.out.println(drvs.nextElement());
        Connection conn = null;
        
        try {
            conn = DriverManager.getConnection(CONNE_STRING);
        } catch (SQLException ex) {
            System.out.println("Cannot open connection!");
        }
        
        try {
            ResultSet rs = conn.getMetaData().getCatalogs();
            while(rs.next())
                System.out.println(rs.getString("TABLE_CAT"));
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
           
        try {
            Statement st = conn.createStatement();
            st.executeQuery("CREATE DATABASE db");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        try {
            Statement st = conn.createStatement();
            st.executeUpdate("USE db");
            st.executeUpdate("INSERT INTO persons (id,name,surname,age)  VALUES (1001,'Name3211','Surname3222',22)");
            //st.executeUpdate("CREATE TABLE persons (name varchar(32), age int(4),num int(11)");
            ResultSet rs = st.executeQuery("SELECT * FROM persons ORDER BY name");
            while(rs.next())
                System.out.println(rs.getString("name")+ " " + rs.getString("surname") + " " + rs.getString("age"));
//          ResultSet rs = conn.getMetaData().getColumns("db" , null ,"persons" , null);
//          while (rs.next())
//                System.out.println(rs.getString("COLUMN_NAME"));
        }
        catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        
    }
    
}
