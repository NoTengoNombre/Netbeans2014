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
public class Vehiculo {

  private String color , marca , modelo;

  public Vehiculo(String color, String marca, String modelo) {
    this.color = color;
    this.marca = marca;
    this.modelo = modelo;
  }
  
  public void mostrar(){
    System.out.println(" color "+color+" marca "+marca+" modelo "+modelo);
  }

  public static void main(String[] args) {

    Vehiculo c1 = new Vehiculo("verde", "A1", "1");
    Vehiculo c2 = new Vehiculo("verde", "A1", "1");
    Vehiculo c3 = new Vehiculo("rojo", "B2", "2");

    c1.mostrar();
    System.out.println("-------");
    c2.mostrar();
    System.out.println("-------");
    c3.mostrar();
    System.out.println("-------");
    
    boolean a = c1.equals(c2);
    c1 = c2;
    boolean aa = c1==(c2);
    boolean aaa = c1.equals(c3);
    System.out.println(a);
    System.out.println("-------");
    System.out.println(aa);
    System.out.println("-------");
    System.out.println(aaa);
    System.out.println("-------");
    c3=c1;
    boolean cc = c3 == c2;
    System.out.println("soy c "+cc);
    
  }
}
