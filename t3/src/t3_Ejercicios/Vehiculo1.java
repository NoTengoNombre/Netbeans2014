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
public class Vehiculo1 {

  private int ruedas;
  private int puertas;
  private int matricula;
  private static int contador;
  private String marca;

  public Vehiculo1() {
    this.ruedas = 0;
    this.matricula = 0;
    this.marca = "";
    this.puertas = 0;
    contador++;
  }

  public Vehiculo1(int ruedas, int puertas, int matricula, String marca) {
    this.ruedas = ruedas;
    this.puertas = puertas;
    this.matricula = matricula;
    this.marca = marca;
    contador++;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public void setMatricula(int matricula) {
    this.matricula = matricula;
  }

  public void setPuertas(int puertas) {
    this.puertas = puertas;
  }

  public void setRuedas(int ruedas) {
    this.ruedas = ruedas;
  }

  public String getMarca() {
    return marca;
  }

  public int getMatricula() {
    return matricula;
  }

  public int getPuertas() {
    return puertas;
  }

  public int getRuedas() {
    return ruedas;
  }

  public static int getContador() {
    System.out.println("vehiculos creados ");
    return contador;
  }
  
  public void mostrar(){
    System.out.println(ruedas+" ruedas "+puertas+" puertas "+matricula+" matricula "+marca+" marca ");
    System.out.println(contador);
  } 
  
  
  public static void main(String[] args) {

    Vehiculo1 v = new Vehiculo1(4,5,1111,"v");
    Vehiculo1 v1 = new Vehiculo1(3,2,2222,"v1");
    Vehiculo1 v2 = new Vehiculo1(2,0,3333,"v2");
    System.out.println(v.getMarca());
    System.out.println(v.getMatricula());
    System.out.println(v.getPuertas());
    System.out.println(v.getRuedas());
    System.out.println(getContador());
    
    System.out.println("----------");
    System.out.println(v1.getMarca());
    System.out.println("----------");
    v.mostrar();
    v1.mostrar();
    v2.mostrar();
  }
}











