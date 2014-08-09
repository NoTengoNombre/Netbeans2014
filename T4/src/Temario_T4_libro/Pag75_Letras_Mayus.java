/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Temario_T4_libro;

/**
 *
 * @author Trabajar
 */
public class Pag75_Letras_Mayus {

  
  private char letra;

  Pag75_Letras_Mayus (char l){
    letra = l;
    if (l >= 'a') {
      letra -= 'a';
      letra += 'A';
    }
  }
  
    char getLetra(){
      return letra;
    }
    
    void printLetra(){
      System.out.println(letra);
    }
  
  
  public static void main(String[] args) {
    
   Pag75_Letras_Mayus x = new Pag75_Letras_Mayus('b');
   x.getLetra();
   x.printLetra();
    
  }
}
