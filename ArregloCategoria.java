/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArregloCat;

import java.util.ArrayList;
import claseCat.Categoria;

/**
 *
 * @author fabid
 */
public class ArregloCategoria {
    private ArrayList<Categoria>arreglo;
    
    public ArregloCategoria(){
        arreglo=new ArrayList<Categoria>();
    }
    
     public void adicionar(Categoria c){
         arreglo.add(c);
     }
     
     public Categoria obtener(int posicionC){
         return arreglo.get(posicionC);
     }
     
     public int tamañoC(){
         return arreglo.size();
     }
}
