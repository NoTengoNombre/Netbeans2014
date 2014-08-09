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
public class Pag77Ej1_Variables_menor_mayor_valor {

  public static void main(String[] args) {
    
    int a , b , c = 0; 
    a = (int) (Math.random()*(1+10));
    b = (int) (Math.random()*(1+10));
    c = (int) (Math.random()*(1+10));
   
    System.out.println("a  ->"+a);
    System.out.println("b  ->"+b);
    System.out.println("c  ->"+c);
      System.out.println("");

    if((a < 10 && a < b && a < c) && a != b && a !=c ) {
      System.out.println("a es menor");
    }else if ((b < 10 && b < a && b < c) && b != a && b !=c ){
      System.out.println("b es menor");
    }else if ((c < 10 && c < a && c < b) && c != b && c !=a ){
      System.out.println("c es menor");
    }else if ( c == b && c == a && a == c && a == b && b == a && b == c ){
        System.out.println("todos son iguales ");
    }else if( a == c && c == a ){ 
      System.out.println("a y c son iguales y son menores b");
    }else if ( a == b && b == a){
      System.out.println("a y b son iguales y son menores c");
    }else if ( a == c && c == a ){
      System.out.println("a y c a son iguales y son menores b");
      
     }else if ( b == c && c == b ){
      System.out.println("b y c son iguales y son menores a");
     }else if ( b == a && a == b ){
      System.out.println("b y a son iguales y son menores c");

    }else if ( c == b && b == c ){
      System.out.println("c y b a son iguales y son menores a");
    }else if ( c == a && a == c ){
      System.out.println("c y a son iguales y son menores b ");
       }
    }
  }










