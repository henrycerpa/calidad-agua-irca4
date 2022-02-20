/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Bito
 */
public class Conexion {
    
    private static Connection basededatos;
    
    public static Connection conectar() throws SQLException{
        if (basededatos == null){
            new Conexion ();
        } 
        return basededatos;
    }
    
    private Conexion() throws SQLException{
        try {
            basededatos = DriverManager.getConnection("jdbc:sqlite:./test.db");
                            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    
    }
    
}
