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
public class Usa_Humano {

  public static void main(String[] args) {
    
    Humano h1 = new Humano(32, 69, 160, "pepe");
    
    System.out.println(h1.getNombre());
    System.out.println(h1.getAltura());
    System.out.println(h1.getEdad());
    System.out.println(h1.getPeso());
    
    h1.setEdad(70);
    System.out.println(h1.getEdad());
  }
}
