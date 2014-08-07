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
public class mostrar_teclado {

  public static void main(String[] args) {
    
    
    int d1;
    int d2;
    int d3;
    int d4;
    int d5;
    
    String cadena , resultado;
    
    System.out.println("intro num entero 5 digitos");
    
    int num = (int) (Math.random()*(1+1000));
    System.out.println(num);

    d5 = num % 10;
    num = num /10;
    
    d4 = num % 10;
    num = num /10;
    
    d3 = num % 10;
    num = num /10;
    
    d2 = num % 10;
    num = num /10;

    d1 = num % 10;
    
    System.out.printf("\n\t %d\t %d\t %d\t %d\t %d\t \n",d1,d2,d3,d4,d5);
    
    
    
    
    
    
    
    
  }
}
