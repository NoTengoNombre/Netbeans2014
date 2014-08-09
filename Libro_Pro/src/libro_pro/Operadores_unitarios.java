/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package libro_pro;

/**
 *
 * @author Trabajar
 */
public class Operadores_unitarios {
 
  
  public static void main(String[] args) {
    
    int m = 2 ; 
    int m1 = 2 ; 
    int n = 5 ;
    m++;
    --n;
    System.out.println(m);
    System.out.println(n);
    System.out.println(~m1);
    System.out.println(-m1);
    System.out.println("m1 "+m1--);
    System.out.println("m1 "+m1++);
    
    int m2 = 3 ; 
    m2 = ~m2;
    System.out.println("m2 "+m2);
    m2 = -m2;
    System.out.println("m2 "+m2);
    
    
  }
}
