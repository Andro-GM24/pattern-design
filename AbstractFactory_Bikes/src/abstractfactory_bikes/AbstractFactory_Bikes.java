/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstractfactory_bikes;

/**
 *
 * @author Andro
 */
public class AbstractFactory_Bikes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               Poseidon gw = new Gw();
       
       Gw_zebra gw_zebra =  (Gw_zebra) gw.vender_Montaña();
       Gw_flamma gw_flamma = (Gw_flamma) gw.vender_Ruta();
       
        System.out.println("las bicicletas de ruta cambian de plato y las de montaña saltan");
       gw_zebra.saltar();
       gw_flamma.cambio_de_Plato();
    }
    
}
