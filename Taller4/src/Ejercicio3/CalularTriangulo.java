/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

/**
 *
 * @author Jorge Miguel
 */
public class CalularTriangulo {
    public static void main(String[]args){
    
        Trianguloiso a=new Trianguloiso();
        
        a.setBase(8);
        a.setAltuta(12);
        
        
        System.out.println("El area es: "+a.calcArea());
        System.out.println("Los lados son: "+ a.calcLados());
        System.out.println("El perimetro es: " + a.calcPerimetro());
    
    
    
    }
    
}
