/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package miPackage;

/**
 *
 * @author Trabajar
 */
public class Excepciones {

  
  
  public static void main(String[] args) {

    int n1 = 7; 
    int n2 = 0; 
    int division; 
    
    try {
      division = n1 / n2; 
    }
    catch (ArithmeticException e) {
      System.err.println("Error expresion "+e.getMessage());
      return;
    }
    System.out.println("resultado "+division); 
  }
}







