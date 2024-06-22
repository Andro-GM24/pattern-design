/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter_edad;

import java.util.*;

/**
 *
 * @author Andro
 */
public class Adaptador {
    
    Sistema_2 sistema2;
    
    
    public int convertir (Sistema_2  sistema2){
        int edad = 0;
        Date fechactual = new Date();
        edad=( fechactual.getYear()+1900)-sistema2.getAño() ;
        
        return edad;
    }
    
    
    
}
