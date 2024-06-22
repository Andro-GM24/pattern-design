/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter_edad;

/**
 *
 * @author Andro
 */
public class Sistema_1 {
    
    Adaptador adaptador;
    
    public Sistema_1(Adaptador adaptador) {
        this.adaptador = adaptador;
    }
    
    public int edad;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public int obtener_edad(Sistema_2 Sistema2){
        return adaptador.convertir(Sistema2);
    }
    
    
    
}
