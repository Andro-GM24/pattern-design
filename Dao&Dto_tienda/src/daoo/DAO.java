/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daoo;

/**
 *
 * @author Andro
 */
import java.util.ArrayList;

public interface DAO <X,Y>
{
    ArrayList<X> listar();
    void insertar(X x);
    void modificar(X x,int y);
    void eliminar(X x);
}
