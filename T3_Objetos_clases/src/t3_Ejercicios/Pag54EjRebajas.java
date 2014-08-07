/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package t3_Ejercicios;

/**
 *
 * @author Trabajar
 */
public class Pag54EjRebajas {

  static double precio;
  static double total_precio;
  
  public static void rebaja( double valor_original , double valor_final){
    total_precio = (valor_original - valor_final ) * 100 / valor_original;
    System.out.printf("%,.2f \n",total_precio);
  } 
  
  public static double rebajas2( double ant , double nue ){
    return ( ant - nue ) * 100 / ant;
  }
  
  public static double rebaja3 ( double valor_or , double p ){
    return precio = valor_or / rebajas2(p, p) ;
  } 
  
  public static void main(String[] args) {

    rebaja(100,50);
    System.out.printf("%,.2f rebajas \n ",rebajas2(2300,200));
  }
}
