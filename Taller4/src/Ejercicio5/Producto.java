/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

/**
 *
 * @author Jorge Miguel
 */
public class Producto {
    
    private int codigo;
    private String nombre;
    private double preciocompra;
    private int porcutilidad;

    public Producto() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPreciocompra() {
        return preciocompra;
    }

    public void setPreciocompra(double preciocompra) {
        this.preciocompra = preciocompra;
    }

    public int getPorcutilidad() {
        return porcutilidad;
    }

    public void setPorcutilidad(int porcutilidad) {
        this.porcutilidad = porcutilidad;
    }

    
   public double precioVenta(){
       double precio = (this.preciocompra*this.porcutilidad )/100 + this.preciocompra;
   
   return precio;
   }
    
    
    
    
    
    
    
    
}
