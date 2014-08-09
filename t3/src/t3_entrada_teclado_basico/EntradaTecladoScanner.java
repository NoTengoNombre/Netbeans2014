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
public class EntradaTecladoScanner {

  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    String nombre;
    int edad;
    boolean estudias;
    double salario;
    System.out.println("Nombre ");
    nombre = teclado.nextLine();
    System.out.println("edad ");
    edad = teclado.nextInt();
    System.out.println("Estudias ");
    estudias = teclado.nextBoolean();
    System.out.println("Salario ");
    salario = teclado.nextDouble();
    
    System.out.println(nombre);
    System.out.println(edad);
    System.out.println(estudias);
    System.out.println(salario);
  }
}
