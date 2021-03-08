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
public class Trianguloiso {
    private double base;
    private double altuta;
    private double lado1;
    private int hipo;

    public Trianguloiso() {
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltuta() {
        return altuta;
    }

    public void setAltuta(double altuta) {
        this.altuta = altuta;
    }
    
    public double calcArea(){
    return (this.base*this.altuta)/2;
    
    }
    
    
    public double calcLados(){
    
   double lado1=(this.base/2);
    double hipo=(this.lado1*this.lado1)+(this.altuta*this.altuta);
    
    return Math.sqrt(hipo);
    
    }
    
    public double calcPerimetro(){
    
        return 2*(this.hipo)+this.base;
    
    
    }
    
    }    
    
    
    

