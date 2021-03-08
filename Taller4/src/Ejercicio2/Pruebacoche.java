/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

/**
 *
 * @author Jorge Miguel
 */
public class Pruebacoche {
    
    public static void main(String args[]){
    
    Coche a = new Coche();
    Coche b = new Coche();
    a.setColor("verde");
    a.setMarca("Masda");
    a.setModelo("adsdasj");
    a.setCaballos(1234);
    a.setNropuertas(4);
    a.setMatricula("jhjjh");
    
    b.setColor("Rojo");
    b.setMarca("Ford");
    b.setModelo("xcv");
    b.setCaballos(44);
    b.setNropuertas(2);
    b.setMatricula("sdfg");
        System.out.println("Color : " + a.getColor());
        System.out.println("Marca :"+ a.getMarca());
        System.out.println("Modelo : " + a.getModelo());
        System.out.println("Caballos :"+ a.getCaballos());
        System.out.println("Numero de puertas : "+ a.getNropuertas());
        System.out.println("Matricula :" + a.getMatricula());
    
     System.out.println("\nColor : " + b.getColor());
        System.out.println("Marca :"+ b.getMarca());
        System.out.println("Modelo : " + b.getModelo());
        System.out.println("Caballos :"+ b.getCaballos());
        System.out.println("Numero de puertas : "+ b.getNropuertas());
        System.out.println("Matricula :" + b.getMatricula());
    
    
    
    
    
    
    
    
    }
    
    
    
}
