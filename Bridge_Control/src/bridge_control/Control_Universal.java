/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bridge_control;

/**
 *
 * @author Andro
 */
public class Control_Universal extends Control {

    public Control_Universal(Dispositivo dispositivo) {
        super(dispositivo);
    }
    
    public void controlar_frecuencia(boolean a ){
        if (a) {
            System.out.println("cambió a fm");
        }else{
            System.out.println("cambió a am");
        }
    }
    
    public void Cambiar_entrada(boolean a ){
        if (a) {
            System.out.println("reproduciendo usb");
        }else{
            System.out.println("reproduciendo radio");
        }
    }
    
}
