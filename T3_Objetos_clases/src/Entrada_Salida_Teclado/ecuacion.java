/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entrada_Salida_Teclado;

/**
 *
 * @author Trabajar
 */
public class ecuacion {

  public static void main(String[] args) {
    
    int x = (int) (Math.random()*(1+10));
    int y = (int) (Math.random()*(1+10));
    String g;
    System.out.println(x);
    System.out.println(y);
    
    g = (x==0)?" error ":String.valueOf(-y/x);
    System.out.println("valor x en la ecuacion es x + y = 0 es "+g);
  }
}
