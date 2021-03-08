/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

/**
 *
 * @author Jorge Miguel
 */
public class PruebaRectangulo {
 public static void main(String args[]){
 
 Rectangulo r =new Rectangulo();
 
 r.setAncho(25);
 r.setLongitud(10);
 
 
 System.out.println("Base: " + r.getAncho());
        System.out.println("Altura: " + r.getLongitud());
        System.out.println("Area de rectangulo: " + r.calcArea());
        System.out.println("Perimetro de rectangulo:  "+ r.calcPerimetro());
 
 }   
}
