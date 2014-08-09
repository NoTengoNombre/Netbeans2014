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
public class jasp2 {

  public static void main(String[] args) {
    
    int edad = (int) (Math.random()*(1+99));
    System.out.println("edad "+edad);
    int nivel = (int)(Math.random()*(1+3));
    System.out.println("nivel "+nivel);
    int ingresos = (int)(Math.random()*(1+30000));
    System.out.println("ingresos "+ingresos);

    boolean jasp = 
   (edad<=28 && nivel > 3) || (edad< 30 && ingresos > 10000)?true:false;
    System.out.println("es jasp "+jasp);
  }
}
