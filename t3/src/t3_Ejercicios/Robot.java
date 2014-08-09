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
public class Robot {

  String nombre = "";
  char letra;
  int numero;
  double energia;
  boolean activado;

  public Robot(char letra, int numero, double energia, boolean activado) {
    this.letra = letra;
    this.numero = numero;
    this.energia = energia;
    this.activado = activado;
  }
  
  public int mover(int px , int py){
    int posicion = px + py;
    return posicion;
  }

  public int velocidad(int km , int h){
    int velocidad = km * h;
    return velocidad;
  }
  
  public int fuerza( int masa , int aceleracion){
    int fuerza = masa * aceleracion;
    return fuerza;
  }
  
  public static void main(String[] args) {

    
    Robot r1 = new Robot('a', 123, 100.00, true);
    Robot r2 = new Robot('b', 222, 100.00, false);
    Robot r3 = new Robot('c', 333, 100.00, false);
    
    System.out.println(r1.activado);
    System.out.println(r1.energia);
    System.out.println(r1.nombre = "T900");
    System.out.println(r1.mover(40, 30));
    System.out.println(r1.velocidad(100,1));
    System.out.println(r1.fuerza(40, 10));
    
  }
}
