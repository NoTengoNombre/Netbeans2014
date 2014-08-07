/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Numeros;

/**
 *
 * @author Trabajar
 */
public class Complejo {
 
  float real;
  float imag;

  public Complejo() {
  }

  public Complejo(float real, float imag) {
    this.real = real;
    this.imag = imag;
  }
  
  public double consulta_Real_(){
    return real;
  }
  
  public double consulta_Imag(){
    return imag;
  }
  
  void cambia_real(double real){
    this.real = (float)real;
  }
  
  void cambia_imag(double imag){
    this.imag = (float)imag;
  }
  
  @Override
  public String toString(){
    this.real = (float)real;
    this.imag = (float)imag;
    String mostrar = "parte real "+this.real+" parte imaginaria "+this.imag+" ";
    return mostrar;
  }

  //ineres
  void sumar(Complejo b){
    this.real = real + b.real;
    this.imag = imag + b.imag;
  }
  
  public static void main(String[] args) {
    
    Complejo c = new Complejo();
    c.imag = 3;
    c.real = 5;
    System.out.println(c.consulta_Real_());
    System.out.println(c.consulta_Imag());
    c.cambia_real(20);
    c.cambia_imag(50);
    System.out.println("");
    System.out.println(c.consulta_Real_());
    System.out.println(c.consulta_Imag());
    
    c.sumar(c);
    System.out.println("");
    System.out.println(c.toString());
  }
}
