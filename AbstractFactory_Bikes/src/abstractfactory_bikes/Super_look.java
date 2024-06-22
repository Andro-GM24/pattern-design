/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory_bikes;

/**
 *
 * @author Andro
 */
public class Super_look implements Poseidon{

    @Override
    public Ruta vender_Ruta() {
              return new Super_look_r8000(); }

    @Override
    public Montaña vender_Montaña() {
              return new Super_look_arezzo(); }

    @Override
    public Urbana vender_Urbana() {
              return new Super_look_etna(); }
    
}
