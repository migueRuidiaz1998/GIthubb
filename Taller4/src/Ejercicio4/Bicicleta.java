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
public class Bicicleta {
    
    private int velocidadActual;
    private int platoactual;
    private int  piñonActual;

    public Bicicleta() {
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public int getPlatoactual() {
        return platoactual;
    }

    public void setPlatoactual(int platoactual) {
        this.platoactual = platoactual;
    }

    public int getPiñonActual() {
        return piñonActual;
    }

    public void setPiñonActual(int piñonActual) {
        this.piñonActual = piñonActual;
    }
    
    public int acelerar(){
    
    return 2*this.velocidadActual;
    
    }
    
    public int frenar(){
    
    return this.velocidadActual/2;
    
    }
    
    public int cambiarPlato(){
        
        
        return this.platoactual=10;
    
    
    }
    
    public int cambiarPiñon(){
    
    return this.piñonActual=13;
    
    }
    
    
    
    
}
