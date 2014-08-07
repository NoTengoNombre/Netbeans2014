/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejercicio_Resuelto_Paco_Notas;

/**
 *
 * @author Trabajar
 */
public class Usa_Notas {

  public static void main(String[] args) {
     
    Notas valor = new Notas();
    System.out.println("1º nota "+valor.get_n1());
    System.out.println("1º nota "+valor.get_n2());
    System.out.println("1º nota "+valor.get_n3());
    System.out.println("-----------------------");
    valor.set(10, 10, 10);
    System.out.println("1º nota "+valor.get_n1());
    System.out.println("1º nota "+valor.get_n2());
    System.out.println("1º nota "+valor.get_n3());
    System.out.println("-----------------------");
    System.out.println("----------nota media-------------");
    System.out.println(" "+valor.nota_media());
    System.out.println("-----------------------");
    
    Notas valor2 = new Notas();
    valor2.set(5f,4.6f,7.8f);
    System.out.println("1º nota "+valor2.get_n1());
    System.out.println("1º nota "+valor2.get_n2());
    System.out.println("1º nota "+valor2.get_n3());
    System.out.println("-----------------------");
    System.out.println("----------nota media-------------");
    System.out.printf("\n %,.2f \t \t \n ",valor2.nota_media());
    
    
    
    
  }
}
