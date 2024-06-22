/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory_bikes;

/**
 *
 * @author Andro
 */
public class Speacialized implements Poseidon{

    @Override
    public Ruta vender_Ruta() {
              return new Specialized_aethos(); }

    @Override
    public Montaña vender_Montaña() {
              return new Specialized_rockhoppes(); }

    @Override
    public Urbana vender_Urbana() {
              return new Specialized_sirrus(); }
    
}
