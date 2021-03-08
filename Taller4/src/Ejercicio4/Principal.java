/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

/**
 *
 * @author Jorge Miguel
 */
public class Principal {
    public static void main(String []args){
    
        Bicicleta b= new Bicicleta();
        
        b.setVelocidadActual(12);
        b.setPlatoactual(2);
        b.setPiñonActual(5);
        
        System.out.println("Aceleracion: "+ b.acelerar());
        System.out.println("Freno: " + b.frenar());
        System.out.println("Cambio de  plato a : "+ b.cambiarPlato());
        System.out.println("Cambio de piñon a : " + b.cambiarPiñon());
    
    
    
    
    
    }
    
    
    
    
    
    
}
