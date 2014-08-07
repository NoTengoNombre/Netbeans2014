/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejercicio_libros;

/**
 *
 * @author Trabajar
 */
public class Peso {

   double peso;
  double libras = 0.453;
  double peso_libras;
  double lingotes = 14.59;
  double peso_lingotes;
  double onzas = 0.02835;
  double peso_onzas;
  double peniques = 1550;
  double peso_peniques;
  double kilos = 1;
  double peso_kilos = 1;
  double gramos = 0.001;
  double peso_gramos;
  double quintales = 43.3;
  double peso_quintales;
    
  Peso(double peso, double peso_libras, double peso_lingotes, double peso_onzas, double peso_peniques, double peso_gramos, double peso_quintales) {
    this.peso = peso;
    this.peso_libras = libras * peso_libras;
    this.peso_lingotes = lingotes * peso_lingotes;
    this.peso_onzas = onzas * peso_onzas;
    this.peso_peniques = peniques * peso_peniques;
    this.peso_gramos = gramos * peso_gramos;
    this.peso_quintales = quintales * peso_quintales;
  }
  
  
}

