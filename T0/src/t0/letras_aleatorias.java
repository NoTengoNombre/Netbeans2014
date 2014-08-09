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
public class letras_aleatorias {

  public static void main(String[] args) {
    char c;
    c = (char)(Math.random()* 26 + 'a');
    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' )
    {
    System.out.println("--------------");
    if (c == 'a') 
      System.out.println("consonante es "+c);
    else if( c == 'e')
      System.out.println("consonante es "+c);
    else if( c == 'i')
      System.out.println("consonante es "+c);
    else if( c == 'o')
      System.out.println("consonante es "+c);
    else if( c == 'u')
      System.out.println("consonante es "+c);
    }
    System.out.println("--------------");
    
    for (int i = 0; i < 10; i++) {
    boolean consonante = true;
    c = (char)(Math.random()* 26 + 'a');
      switch (c) 
      {
        case 'a': consonante = false;break;
        case 'e': consonante = false;break;
        case 'i': consonante = false;break;
        case 'o': consonante = false;break;
        case 'u': consonante = false;break;
      }
      System.out.print("Generar "+c+ " -> ");
      if (consonante) {
        System.out.println("consonante");
      }else{
        System.out.println("vocal");
      }
    }
  
  
  
  }
}
