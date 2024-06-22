/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bd;


import java.sql.*;

/**
 *
 * @author Andro
 */
public class CConexion {
    
    public Connection conectar = null;
    
    String usuario = "root";
    String contrasena = "mysql";
    String bd = "tienda";
    String ip = "localhost";
    String puerto = "3307";
    
    String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    
    public void establecerConexion(){
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar =DriverManager.getConnection(cadena,usuario,contrasena);
            System.out.println("conexion exitosa");
        } catch (Exception e) {
            System.out.println("error en la conexion  por"+e.toString());
        }
        
      
    }
    
    public void cerrar()  {
        try {
            
            if(conectar!=null){
            if(!conectar.isClosed()){
                conectar.close();
            }
        }
            
        } catch (   SQLException e) {
            e.printStackTrace();
        }
     
        
    }
    
}
