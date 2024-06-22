/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adapter_edad;

import java.util.Date;

/**
 *
 * @author Andro
 */
public class Adapter_Edad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        //creo un objeto de sistema 2 que almacena la fecha de nacimiento
        
        Sistema_2 fechaNacimiento = new Sistema_2(2005, 1, 18);
        
        // quiero saber mi edad
        Adaptador adaptador = new Adaptador();
        
        Sistema_1 edad = new Sistema_1(adaptador);
      
        System.out.println("su edad es " + edad.obtener_edad(fechaNacimiento)+" años");
        
    }
    
}
