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
public class Pag31n1 {

  public static void letra(){
    char l = (char)(Math.random()*(26 + 'a'));
    System.out.println((char)(Math.random()*(26 + 'a')));
    System.out.println((char)(Math.random()*(26 + 'a')));
    System.out.println((char)(Math.random()*(26 + 'a')));
    System.out.println((char)(Math.random()*(26 + 'a')));
  }

  public static char letra1(){
    char l = (char)(Math.random()*26 + 'a');
    return l;
  }
  
  public static void main(String[] args) {
    letra();
    System.out.println("------------");
    System.out.println(letra1());
    
  }
}
