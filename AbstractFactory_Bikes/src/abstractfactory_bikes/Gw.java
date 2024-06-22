/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory_bikes;

/**
 *
 * @author Andro
 */
public class Gw implements Poseidon{

    @Override
    public Ruta vender_Ruta() {
        return new Gw_flamma(); }

    @Override
    public Montaña vender_Montaña() {
         return new Gw_zebra(); }

    @Override
    public Urbana vender_Urbana() {
         return new Gw_sacramento(); }
    
}
