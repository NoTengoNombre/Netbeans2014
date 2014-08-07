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
public class Pag56Ej6_Peso {

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

  
  public Pag56Ej6_Peso(double peso , double Libras , double Lingotes , double Onzas , double Peniques , double Kilos , double Gramos , double Quintales) 
  {
  this.peso_libras = Libras * 0.453;
  this.peso_lingotes = Lingotes * 14.59;
  this.peso_onzas = Onzas * 0.02835 ;
  this.peso_peniques = Peniques * 0.00155;
  this.peso_kilos = Kilos;
  this.peso_gramos = Gramos * 1000;
  this.peso_quintales = Quintales * 43.3;
  }

  public Pag56Ej6_Peso( double peso , double medida ){
    this.peso = 1000 * (gramos);
    this.peso = peso ;
    this.peso = peso * libras;
  } 

  /*
  public Pag56Ej6_Peso( double libras ) {
    this.peso = 1000 * (gramos);
    Pag56Ej6_Peso n = new Pag56Ej6_Peso(libras);
    onzas = 16 / libras;
    onzas = 0.03 * gramos; 
  }
  */
  
  
  /*
  public Pag56Ej6_Peso( double libras , double medida) {
    onzas = 16 / libras;
    onzas = 0.03 * gramos; 
  }
  */
  
  public double getLibras(double peso){
    return libras = peso * 0.453;
  }
  
  public double getLingotes(double peso){
    return lingotes = peso * 14.59;
  }
  
  public double getPeso (double lingotes ,double onzas ,double peniques , double kilos , double gramos , double quintales){
    return peso = lingotes = onzas = peniques = kilos = gramos = quintales;
  }

  public static void main(String[] args) {

    Pag56Ej6_Peso p1 = new Pag56Ej6_Peso(0, 3, 0, 0, 0, 0, 0, 0);
    System.out.println(p1.peso_libras);
  
  
  }
}
