/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicar.Bucles_for;

/**
 *
 * @author Trabajar
 */
public class Ej7_Algoritmo_Euclides {
  
  public static void main(String[] args) {
    
    
//    int cociente = mayor / menor;
//    System.out.println(cociente);   
/*
    int Mresto = mayor % menor;
    System.out.println(Mresto);
    int Meresto0 = menor % Mresto;
    System.out.println(Meresto0);
    int Mresto1 = Mresto  % Meresto0;
    System.out.println(Mresto1);
    int Mresto2 = Meresto0 % Mresto1;
    System.out.println(Mresto2);
    int Mresto3 = Mresto1 % Mresto2;
    System.out.println(Mresto3);
  */
    int mayor = 4;
    int menor = 2;
    /*
    for (int i = 0; i < mayor ; i++) {
    int Mresto = mayor % menor;
    int Mresto0 = menor % Mresto -1 ;
    }*/

    int b = 100;
    int a = 21;
    while( b != 0 ){
      System.out.println(a); 
      b = b % a;
      b = b;
      a = b;
    }
    
    
  }
  }
