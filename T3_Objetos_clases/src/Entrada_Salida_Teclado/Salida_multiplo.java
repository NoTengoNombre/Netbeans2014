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
public class Salida_multiplo {

  public static void main(String[] args) {

    int n1 = (int) (Math.random()*(1+10));
    int n2 = (int) (Math.random()*(1+10));
    
    boolean c;
    try{
    c = (n1%n2==0);
      System.out.printf("valor es ",c);
    }
    catch(ArithmeticException e){
      System.err.println("error "+e.getMessage());
      return;
    }
    System.out.println(n1);
    System.out.println(n2);
    System.out.println(c);

    ////////PDF//////////
    int x ; 
    int y ; 
  
    System.out.print("intro 1º num \n");
    x = (int) (Math.random()*(1+10));
    System.out.print("intro 2º num \n");
    y = (int) (Math.random()*(1+10));
    
    String resultado = ((x%y)==0)?"\n ES multiplo":"\n no es multiplo" ;
    System.out.println("\tx = "+x+" "+resultado+ " de y = "+y); 
  }
}
