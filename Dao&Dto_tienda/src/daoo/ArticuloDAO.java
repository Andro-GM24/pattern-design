/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daoo;

import bd.CConexion;
import com.mysql.cj.jdbc.PreparedStatementWrapper;
import com.mysql.cj.protocol.Resultset;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import modelo.Articulo;

/**
 *
 * @author Andro
 */
public class ArticuloDAO extends CConexion implements DAO<Articulo,String>{
    
    final ArrayList<Articulo> articulo = new ArrayList<>();

    @Override
    public ArrayList<Articulo> listar() {
        
        ArrayList<Articulo> articulo =null; 
        
         try {
            this.establecerConexion();
            PreparedStatement st = this.conectar.prepareStatement("SELECT * FROM articulo");
            ResultSet rs = st.executeQuery();
             articulo = new ArrayList<>();
             while (rs.next()) {     
                 Articulo z= new Articulo();
                 z.setCodigo(rs.getInt("id"));
                 z.setNombre(rs.getString("name"));
                 z.setPrecio(rs.getInt("precio"));
                 z.setCantidad(rs.getInt("cantidad"));
                 articulo.add(z);
             }
             rs.close();
             st.close();
             
            
        } catch (Exception e) {
            System.out.println("error "+ e);
        }finally{
            this.cerrar();
        }
        
        
        
       return articulo;
    }

    @Override
    public void insertar(Articulo x) {
        
        try {
            this.establecerConexion();
            PreparedStatement st = this.conectar.prepareStatement("INSERT INTO articulo(name, precio, cantidad) VALUES (?,?,?)");
            st.setString(1,x.getNombre());
            st.setDouble(2, x.getPrecio());
            st.setInt(3, x.getCantidad());
            st.executeUpdate();
        } catch (Exception e) {
            System.out.println("error "+ e);
        }finally{
            this.cerrar();
        }
        
        
      /*articulo.add(x);*/
    }

    @Override
    public void modificar(Articulo x,int comprada) {
        
         try {
            this.establecerConexion();
            PreparedStatement st = this.conectar.prepareStatement("UPDATE articulo SET cantidad = ? WHERE ID = ?");
            st.setInt(1,x.getCantidad()-comprada);
            st.setInt(2,x.getCodigo());
            st.executeUpdate();
        } catch (Exception e) {
            System.out.println("error "+ e);;
        }finally{
            this.cerrar();
        }
        
        
        

      /*  for (int i = 0; i < articulo.size(); i++) {
             if(articulo.get(i).getCodigo().equals(x.getCodigo()))
               {
                 System.out.println("modificando a: " + articulo.get(i).getNombre());
                    articulo.remove(i);
                   articulo.add(x);
            }  
        }*/
        
        

    }

    @Override
    public void eliminar(Articulo x) {
        
         try {
            this.establecerConexion();
            PreparedStatement st = this.conectar.prepareStatement("DELETE FROM articulo WHERE ID = ?");
            st.setInt(1,x.getCodigo());
            st.executeUpdate();
        } catch (Exception e) {
            System.out.println("error "+ e);;
        }finally{
            this.cerrar();
        }
        
        
        
      /* for(int i = 0;i<articulo.size();i++)
        {
            if(articulo.get(i).getCodigo().equals(y))
            {
                System.out.println("eliminando a: " + articulo.get(i).getNombre());
                articulo.remove(i);
            }
        }*/
    }
    
    public Articulo buscarArticulo(String codigo)
    {
        
        
        
     /*
        for(int i = 0;i<articulo.size();i++)
        {
            if(articulo.get(i).getCodigo().equals(codigo))
            {
                return articulo.get(i);
            }
        }*/
        return null;
    }
    
}
