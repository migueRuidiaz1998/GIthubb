/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;

/**
 *
 * @author Jorge Miguel
 */
public class Principal {
    public static void main(String arg[]){
    
  Libro lib = leer();
 Mostrar(lib);

  
    
    
    }
    
    
    
    
    
    public static Libro leer(){
      Libro l = new Libro();  
    
    l.setTitulo("Harry Potter");
    l.setEdicion("3a");
    l.setErnonbre("Juan");
    l.setDonombre("Eduardo");
    l.setErapellido("Alvarado");
    l.setISBN("12-sdf-3456");
    l.setEditorial("Salamanca");
    l.setCiudad("Valledupar");
    l.setFechaedicion("Marzo 16 de 2013");
    l.setPaginas(123);
    
    return l;
    
    }
    
    
    
 public static void  Mostrar(Libro l){
 
     System.out.println("Titulo: "+l.getTitulo());
     System.out.println("edicion "+l.getEdicion());
     System.out.println("Autor: "+l.getErapellido()+"," +l.getErnonbre()+"," +l.getDonombre());
     System.out.println("ISBN: "+l.getISBN());
     System.out.printf(""+l.getEditorial());
     System.out.printf(","+l.getCiudad());
     System.out.printf(","+l.getFechaedicion()+"\n");
     System.out.println("Paginas: "+l.getPaginas());
 
 
 }
 
 
 
 }
    
    
    
    

