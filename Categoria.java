/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claseCat;

/**
 *
 * @author fabid
 */
public class Categoria {
    int idcategoria;
    int filacat;
    int columnacat;
    String categoria;
    String nuevo_datocat;

    public Categoria (int idcategoria, int filacat, int columnacat, String categoria, String nuevo_datocat){
        this.idcategoria=idcategoria;
        this.filacat=filacat;
        this.columnacat=columnacat;
        this.categoria=categoria;
        this.nuevo_datocat=nuevo_datocat;
    }
    
    public int getIdcategoria(){
        return idcategoria;
    }
    
    public void setIdcategoria(int idcategoria){
        this.idcategoria=idcategoria;
    }
        
    public int getFilacat(){
        return filacat;
    }
    
    public void setFilacat(int filacat){
        this.filacat=filacat;
    }
    
    public int getColumnaCat(){
        return columnacat;
    }
    
    public void setColumnacat(int columnacat){
        this.columnacat=columnacat;
    }
    
    public String getCategoria(){
        return categoria;
    }
    
    public void setCategoria(String categoria){
        this.categoria=categoria;
    }
    
    public String getNuevo_datocat(){
        return nuevo_datocat;
    }
    
    public void setNuevo_datocat(String nuevo_datocat){
        this.nuevo_datocat=nuevo_datocat;
    }
}