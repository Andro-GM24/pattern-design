/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bridge_control;

/**
 *
 * @author Andro
 */
public class Control {
    private Dispositivo dispositivo;

    public Control(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }
    
    
    
    public void controlar_volumen(boolean a) {
    this.dispositivo.volumen(a);
    }
    
    public void controlar_canal(boolean a) {
    this.dispositivo.canal(a);
    }
    


    public void controlar_estado(boolean a) {
    this.dispositivo.estado(a);
    }
}
