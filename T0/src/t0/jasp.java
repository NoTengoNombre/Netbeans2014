/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package t0;

/**
 *
 * @author Trabajar
 */
public class jasp {

  public static void main(String[] args) {
    
    int edad = (int) (Math.random()*(1+99));
    System.out.println("edad "+edad);
    int nivel = (int)(Math.random()*(1+3));
    System.out.println("nivel "+nivel);
    int ingresos = (int)(Math.random()*(1+30000));
    System.out.println("ingresos "+ingresos);

    if ( edad <= 28 && nivel == 3 && ingresos >= 10000) 
      System.out.println(" entonces es jasp ");
    else 
      System.out.println(" es un farsante ");
  }
}
