/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bridge_control;

/**
 *
 * @author Andro
 */
public class Bridge_Control {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        TV tv = new TV();
        
        Control control = new Control(tv);
        
        control.controlar_volumen(true);
        control.controlar_volumen(true);//subo 3 veces ek volumebn
        control.controlar_volumen(true);
        
        System.out.println(tv.getVolumen());
        
        
        
        
    }
    
}
