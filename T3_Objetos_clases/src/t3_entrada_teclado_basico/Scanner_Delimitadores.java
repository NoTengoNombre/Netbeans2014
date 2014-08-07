/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package t3_entrada_teclado_basico;

import java.util.Scanner;

/**
 *
 * @author Trabajar
 */
public class Scanner_Delimitadores {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    sc.useDelimiter("[:\\s]");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    
    System.out.println(a+"-"+b+"-"+c); 
    
    
  }
}
