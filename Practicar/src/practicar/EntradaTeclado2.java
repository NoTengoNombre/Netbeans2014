/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicar;

import java.util.Scanner;

/**
 *
 * @author Trabajar
 */
public class EntradaTeclado2 {
 
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    String nombre;
    int edad;
    boolean estudias;
    double salario;
    System.out.println("Nombre ");
    nombre = teclado.nextLine();
    System.out.println("Edad ");
    edad = teclado.nextInt();
    System.out.println("estudias  ");
    estudias = teclado.nextBoolean();
    System.out.println("salario ");
    salario = teclado.nextDouble();
    
    System.out.println("Nombre "+nombre);
    System.out.println("Edad "+edad);
    System.out.println("estudias  "+estudias);
    System.out.println("salario "+salario);

  }
}
