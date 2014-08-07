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
public class Clase_Scanner {

  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
 //   int i = teclado.nextInt();
    String cadena = teclado.nextLine();
    System.out.println(cadena);
  }
}
