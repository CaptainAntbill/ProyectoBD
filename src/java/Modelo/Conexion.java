/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Anthony Mejía
 */
public class Conexion {
    Connection con;
    String url="jdbc:oracle:thin:@localhost:1521:xe";
    String user="system";
    String pass="mejialeiva12";
    public Connection conectar() throws ClassNotFoundException{
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection(url, user, pass);
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex);
    }
        return con;        
    
}
}
