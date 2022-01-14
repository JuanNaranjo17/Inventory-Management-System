/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArregloProd;

import java.util.ArrayList;
import claseProd.Producto;

/**
 *
 * @author fabid
 */
public class ArregloProducto {
    private ArrayList<Producto>arreglo;
    
    public ArregloProducto(){
        arreglo=new ArrayList<Producto>();
    }
    
     public void adicionar(Producto p){
         arreglo.add(p);
     }
     
     public Producto obtener(int posicion){
         return arreglo.get(posicion);
     }
     
     public int tamaño(){
         return arreglo.size();
     }
     
}
