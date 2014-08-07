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
public class Humano {
private int edad;  
private int peso;  
private int altura;  
private String nombre;

  public Humano() {
  }

  public Humano(int edad, int peso, int altura, String nombre){
    this.edad = edad;
    this.peso = peso;
    this.altura = altura;
    this.nombre = nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public void setPeso(int peso) {
    this.peso = peso;
  }

  public void setAltura(int altura) {
    this.altura = altura;
  }

  public String getNombre() {
    return nombre;
  }

  public int getPeso() {
    return peso;
  }

  public int getEdad() {
    return edad;
  }

  public int getAltura() {
    return altura;
  }

  












}
