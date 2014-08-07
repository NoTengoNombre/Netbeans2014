/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entrada_Salida_Teclado;

import java.util.Scanner;

/**
 *
 * @author Trabajar
 */
public class Calculo_salida_por_pantalla {

  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    double x , y ; 
    int e = 5;
    short de = 443;
      
    
    System.out.println("intro 1º num");
    x = Math.random()*(1+10);
    System.out.println("intro 2 num");
    y = Math.random()*(1+10);

    
//    System.out.printf(" asi que \n %,.2f eso es lo que quieres %,.2f \n \t %d \n %d  ",x,y,e,de);
 //   System.out.printf(" el siguiente %d \n \t ",e);
    System.out.printf("\te mas e es valor %s ",String.valueOf(e+e));
    System.out.printf("\n e mas e es valor %s \n ",String.valueOf(e/e));
    System.out.printf("\tx + y %s \n = ",String.valueOf(y+x));
    System.out.printf("\tx + y %s \n = ",String.valueOf(y-x));
    System.out.printf("\tx + y %s \n = ",String.valueOf(y*x));
    System.out.printf("\tx + y %s \n = ",String.valueOf(y/x));
    System.out.println("--------------------------");
    System.out.printf("\t la division es %,.2f \n = ",y/x);
    System.out.printf("\t la suma es %,.2f \n = ",y+x);
    System.out.printf("\t la resta es %,.2f \n = ",y-x);
    System.out.printf("\n valor para la potencia es  %,.2f  \n",y);
    System.out.printf("\t la potencia es %,.2f \n = ",(Math.pow(y,2)));
    
    System.out.printf("\tx ^ 2 %s \n = ",String.valueOf(Math.pow(x,2)));
    System.out.printf("\t\u221A x %s \n = ",String.valueOf(Math.sqrt(x)));
    
    System.out.printf("\n input double %6.3e ): = ",3444.333);
  
  }
}
