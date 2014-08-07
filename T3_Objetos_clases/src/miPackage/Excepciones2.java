/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package miPackage;

import java.util.Scanner;
/**
 *
 * @author Trabajar
 */
public class Excepciones2 {

  public static void main(String[] args) {

    int numero = 1;
    while(numero > 0){
    Scanner entrada = new Scanner(System.in);
    System.out.println("Introduce numero entero");
    try{
      numero = entrada.nextInt();
    } 
    catch(Exception e){
      System.err.println("Error de lectura de numeros . codigo error "+e);
      e.printStackTrace();
      System.exit(1);
    }
    System.out.println("numero es "+numero); 
    }
  }
}














