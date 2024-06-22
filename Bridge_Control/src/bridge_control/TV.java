/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bridge_control;

/**
 *
 * @author Andro
 */
public class TV implements Dispositivo{

    public int volumen,canal;
    public boolean estado;        

    public int getVolumen() {
        return volumen;
    }

    public int getCanal() {
        return canal;
    }

    public boolean isEstado() {
        return estado;
    }
    
    

    public TV() {
        this.volumen = 10;
        this.canal = 1;
        this.estado = false;
    }
    
@Override
    public void estado(boolean a) {
        if (a) {
            this.estado=true;
        }else{
            this.estado=false;
        }
    }

    @Override
    public void volumen(boolean a) {
       if (a) {
            this.volumen=volumen+1;
        }else{
            this.volumen=volumen-1; 
        }
    }

    @Override
    public void canal(boolean a) {
       if (a) {
            this.canal=canal+1;
        }else{
            this.canal=canal-1; 
        }
    }
    
}
