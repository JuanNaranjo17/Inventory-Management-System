/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claseProd;

/**
 *
 * @author fabid
 */
public class Producto {
    int idproduc;
    int fila;
    int columna;
    String nombre;
    String descripcion;
    String categoria;
    String nuevo_dato;
    double precio;
    double cantidad;
    //double pago;
    
    public Producto (int idproduc,int fila,int columna,String nombre,String descripcion,String categoria,String nuevo_dato,double precio,double cantidad) {
        this.idproduc=idproduc;
        this.fila=fila;
        this.columna=columna;
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.categoria=categoria;
        this.nuevo_dato=nuevo_dato;
        this.precio=precio;
        this.cantidad=cantidad;
     //   this.pago=getPago();
    }
    
    public int getIdproduc(){
        return idproduc;
    }
    
    public void setIdproduc(int idproduc){
        this.idproduc=idproduc;
    }
    
    public int getFila(){
        return fila;
    }
    
    public void setFila(int fila){
        this.fila=fila;
    }
    
    public int getColumna(){
        return columna;
    }
    
    public void setColumna(int columna){
        this.columna=columna;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
    
    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }
    
    public String getCategoria(){
        return categoria;
    }
    
    public void setCategoria(String categoria){
        this.categoria=categoria;
    }
    
    public String getNuevo_dato(){
        return nuevo_dato;
    }
    
    public void setNuevo_dato(String nuevo_dato){
        this.nuevo_dato=nuevo_dato;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public void setPrecio(double precio){
        this.precio=precio;
    }
    
    public double getCantidad(){
        return cantidad;
    }
    
    public void setCantidad(double cantidad){
        this.cantidad=cantidad;
    }
    
   /** public double getPago(){
        return precio*cantidad;
    }*/
}
