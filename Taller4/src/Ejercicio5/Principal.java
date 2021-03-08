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
public class Principal {
    
    public static void main(String []arg){
    
    
    Producto p = new Producto();
    
    p.setCodigo(2345);
    p.setNombre("Arroz");
    p.setPreciocompra(2500);
    p.setPorcutilidad(12);
    
    
        System.out.println("Codigo: " +p.getCodigo());
        System.out.println("Nombre: " +p.getNombre());
        System.out.println("Precio de compra: "+p.getPreciocompra());
        System.out.println("Porcentaje de utilidad: " +p.getPorcutilidad());
        System.out.println("Precio de venta: "+p.precioVenta());
    
    
    
    
    
    }
    
}
