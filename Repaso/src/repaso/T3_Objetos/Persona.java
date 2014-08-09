/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package repaso.T3_Objetos;

/**
 *
 * @author Trabajar
 */
public class Persona {

  private String nombre;
  private int dni;
  private short edad;
  
  public void set (String nombre1 , int dni1 , short edad1){
    nombre = nombre1;
    dni = dni1;
    edad = edad1;
  }
  
  public String get_nombre(){
    return nombre;
  }
  
  public int get_dni(){
    return dni;
  }
  
  public short get_edad(){
    return edad;
  }
  
  public boolean mayor(){
    boolean mayor = 18 <= edad;
    boolean si = mayor;
    return si;
  }
  
  public void mostrar(){
    System.out.println("mostrar "+nombre+" "+dni+" "+edad+" "+mayor());
  }
  
  public static void main(String[] args) {

    Persona p = new Persona();
    p.dni = 1111;
    p.edad = 30;
    p.nombre = "pepe";
    p.mayor();
    p.mostrar();
    
    Persona p1 = new Persona();
    p1.set("lala",2222, (short)21);
    p1.mostrar();
    
    System.out.println(p1.dni+" "+p1.edad+" "+p1.nombre+" "+p1.mayor());
    
    
    
    
    
    
    
    
  }
}
