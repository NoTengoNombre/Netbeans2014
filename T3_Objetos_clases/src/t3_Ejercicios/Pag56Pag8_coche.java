/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package t3_Ejercicios;

/**
 *
 * @author Trabajar
 */
public class Pag56Pag8_coche {

  String marca;
  String modelo;

  public Pag56Pag8_coche() {
    marca = "sin marca";
    modelo = "sin modelo";
  }
  
  public Pag56Pag8_coche(String marca, String modelo) {
    this.marca = marca;
    this.modelo = modelo;
  }

  public static void main(String[] args) {

    Pag56Pag8_coche c = new Pag56Pag8_coche();
    System.out.println(c.marca);
    System.out.println(c.modelo);
    
    System.out.println("-------------");
    Pag56Pag8_coche c1 = new Pag56Pag8_coche("seat", "v1");
    System.out.println(c1.marca);
    System.out.println(c1.modelo);
    
  }
}
