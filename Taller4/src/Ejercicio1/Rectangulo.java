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
public class Rectangulo {

   
    private float longitud;
    private float ancho;

    public Rectangulo() {
    }
    
     public float getLongitud() {
        return longitud;
    }

    public float getAncho() {
        return ancho;
    }

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }
    
    public double calcArea(){
    
    return this.ancho*this.longitud;
    }
    public double calcPerimetro(){
    
    return 2*(this.ancho*this.longitud);
    }
    
}
