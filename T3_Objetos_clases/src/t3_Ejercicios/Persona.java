/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package t3_Ejercicios;

/**
 *
 * @author Trabajar
 */
public class Persona {

  private String nombre;
  private int dni;
  private int edad;

  public Persona(String nombre, int dni, int edad) {
    this.nombre = nombre;
    this.dni = dni;
    this.edad = edad;
  }
  
  public void set (String nombre1 , int dni1 , int edad1){
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
  
  public int get_edad(){
    return edad;
  }
  
  public boolean mayor_edad(){
    boolean re = edad >= 18;
    return re;
  }
  
  
  public static void main(String[] args) {
 
    Persona ind1 = new Persona("juan", 22222, 40);
    System.out.println(ind1.nombre);
    System.out.println(ind1.dni);
    System.out.println(ind1.edad);
    System.out.println("...........");
    ind1.set("pepe",11111,20);
    System.out.println(ind1.get_nombre());
    System.out.println(ind1.get_dni());
    System.out.println(ind1.get_edad());
    System.out.println("...........");
    System.out.println(ind1.mayor_edad());
    
    
    
    
    
    
  }
}