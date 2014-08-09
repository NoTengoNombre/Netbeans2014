/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicar;

/**
 *
 * @author Trabajar
 */
public class Formato_salida {

  static int x = (int) (Math.random()*(1+1000));
  static double xx = (Math.random()*(1+1000));
  
  public static void main(String[] args) {
    
    int a = x;
    double aa = xx;
    String bbb = "pepe";
    
    
    
    System.out.printf("%d \n  ",a);
    System.out.printf("%,.2f \n ",aa);
    System.out.printf("%s ",bbb);
    
  }
}
