/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dao.dto_tienda;

import daoo.*;
import modelo.Articulo;
import java.util.Scanner;
/**
 *
 * @author Andro
 */
public class DaoDto_tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Articulo articul = new Articulo();
        /*articul.setCodigo(5);
        articul.setNombre("gaban");
         articul.setPrecio(100000);
          articul.setCantidad(3);
          */
        int i=1;
        DAO<Articulo, String> dao = new ArticuloDAO();
          try {
            
           /* dao.modificar(articul, 2);*/
           for (Articulo arti : dao.listar()){
               System.out.println(i+"."+arti.getNombre()+"unidades disponibles"+arti.getCantidad());
               i++;
           }
        } catch (Exception e) {
              System.out.println("error"+ e.toString());
        }
          System.out.println("seleccione el numero de prenda que quiere comprar");
          int eleccion=leer.nextInt();
          System.out.println("seleccione la cantidad  de prenda que quiere comprar");
          int cantidad=leer.nextInt();
          dao.modificar(dao.listar().get(eleccion-1), cantidad);
          
    }
    
}
