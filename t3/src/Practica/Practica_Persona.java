/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Practica;

import java.io.*;

/**
 *
 * @author Trabajar
 */
public class Practica_Persona {
  
  String nombre;
  int edad;
  float altura;

  public Practica_Persona() {
  }

  public Practica_Persona(String nombre, int edad, float altura) {
    this.nombre = nombre;
    this.edad = edad;
    this.altura = altura;
  }
  
  
  
  public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
  
  void fijar_Nombre(String nom){
    nom = "";
    System.out.println(" fijar nombre ");
    nombre = nom;
      try {
        nom = new String(entrada.readLine());
      }catch(IOException e){
        System.out.println("Error de E/S");
      }
  }

  void fijar_edad(){
    boolean error = false;
    do {
      try{
      error = false;
      edad = Integer.valueOf(entrada.readLine()).intValue();
      }catch(NumberFormatException e1){
        error = true;
        System.out.println("Error en el formato ");
      }catch(IOException ee){
        System.out.println("error entrada/S ");}
    }while(error);
  }
  
  void fijar_altura(){
    boolean error = false;
    do {
      try {
     error = false;
  altura = Float.valueOf(entrada.readLine()).floatValue();
      }catch(NumberFormatException e1){
        error = true;
        System.out.println("error en el formato del numero , intentalo de nuevo ");
      }catch(IOException e){
        System.out.println("Error de E/S ");}
      }while(error);
  }
  
  String consulta_Nombre(){
    return nombre;
  }
  
  int consulta_edad(){
    return edad;
  }

  float consulta_altura(){
    return altura;
  }

   public static void main(String[] args) {
     Practica_Persona p = new Practica_Persona();

     p.fijar_Nombre(null);
     
     p.consulta_edad();
     System.out.println("introduce la edad ");
     p.fijar_edad();

     p.consulta_altura();
     System.out.println("introduce la altura ");
     p.fijar_altura();
     
     Practica_Persona p1 = new Practica_Persona();
     p1.nombre = " Luisa Perez";
     p1.edad = 32;
     p1.altura = 1.70f;
     
     System.out.println("");     
     System.out.println("Otra persona ");

     System.out.println("Nombre "+p1.consulta_Nombre());
     System.out.println("Edad "+p1.consulta_altura());
     System.out.println("Altura "+p1.consulta_edad());
     
     
     Practica_Persona pa1 = new Practica_Persona("Pepa", 53, 1.63f);
     
     System.out.println("");     
     System.out.println("2º persona ");
     System.out.println("Nombre "+pa1.consulta_Nombre());
     System.out.println("Edad "+pa1.consulta_altura());
     System.out.println("Altura "+pa1.consulta_edad());
     
     
  }
}
