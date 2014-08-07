/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Practica;

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
  
  String toString(double real , double imag){
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
}
