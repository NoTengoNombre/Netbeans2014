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
public class Peso1 {

     double peso;
     final static double libra_onzas = 16;
     final static double libra_gramos = 453;
     final static double libra_lingotes = 0.031;
     final static double libra_penique = 291.67;
     final static double libra_quintal = 0.01;
     final static double libra_kg = 0.433;
     
 Peso1(double Libras,double Lingotes,double Onzas,double Peniques,double Kilos,double Gramos,double Quintales) 
  {
    System.out.println("libras a onzas ");
    System.out.println(this.peso = Libras * libra_onzas);
    System.out.println("libras a gramos ");
    System.out.println(this.peso = Libras * libra_gramos);             
    System.out.println("libras a lingotes ");
    System.out.println(this.peso = Libras * libra_lingotes);
    System.out.println("libras a peniques ");
    System.out.println(this.peso = Libras * libra_penique);
    System.out.println("libras a quintal ");
    System.out.println(this.peso = Libras * libra_quintal);
    System.out.println("libras a kg ");
    System.out.println(this.peso = Libras * libra_kg);
    System.out.println("--------------");
     }
 /* double libras = 0.453;
  double peso_libras;
  double Lb;
  double lingotes = 14.59;
  double peso_lingotes;
  double Li;
  double onzas = 0.02835;
  double peso_onzas;
  double Oz;
  double peniques = 1550;
  double peso_peniques;
  double P;
  double kilos = 1;
  double peso_kilos = 1;
  double K;
  double gramos = 0.001;
  final double libra_gramos = 453;
  double peso_gramos;
  double G;
  double quintales = 43.3;
  double peso_quintales;
  double Q;
*/

  public static void main(String[] args) {

    Peso1 p_libras = new Peso1(6, 0, 0, 0, 0, 0, 0);
    System.out.println("peso "+p_libras.peso);
    
    
    
  }
}


