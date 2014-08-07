/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejercicio_libros.Pag56ej6_Peso;

import java.util.Scanner;

/**
 *
 * @author Trabajar
 */
public class Peso2 {
  
  // se le pasara el peso a kg
  double peso;
  double peso2;
  final static double Libras = 2.2046 ; 
  final static double Onzas  = 35.274; 
  final static double Lingotes  = 14.59 ; 
  final static double Peniques  = 643.01; 
  final static double Quintales  = 0.019684 ; 
  final static double Gramos  = 0.001; 

  // medidas a kg
  public Peso2(double peso){
    System.out.print(this.peso = peso * Libras);
    System.out.print(" libras ");
    System.out.println("");
    System.out.print(this.peso = peso * Onzas);
    System.out.print(" onzas ");
    System.out.println("");
    System.out.print(this.peso = peso * Lingotes);
    System.out.print(" lingotes ");
    System.out.println("");
    System.out.print(this.peso = peso * Peniques);
    System.out.print(" peniques ");
    System.out.println("");
    System.out.print(this.peso = peso * Quintales);
    System.out.print(" quintales ");
    System.out.println("");
    System.out.print(this.peso = peso * Gramos);
    System.out.print(" gramos ");
    System.out.println("");
  }

  // unidades a medidas 
  public Peso2(double peso , double libras , double lingotes , double onzas , double peniques , double quintal , double gramos , double kg){

    double peso_li_onzas = libras * 16 ;
    System.out.println("libras a onzas "+peso_li_onzas);
    this.peso2 = peso_li_onzas;
    
    double peso_li_gramos = libras * 453 ;
    System.out.println("libras a gramos "+peso_li_gramos);
    this.peso2 = peso_li_gramos;
    System.out.println("----------");
    
    double peso_ling_libras = lingotes * 32.17 ;
    System.out.println("lingotes a libras "+peso_ling_libras);
    this.peso2 = peso_ling_libras;
    
    double peso_ling_kg = lingotes * 14.59;
    System.out.println("lingotes a kg "+peso_ling_kg);
    this.peso2 = peso_ling_kg;
    System.out.println("----------");
    
    double peso_on_libras = onzas * 0.0625 ;
    System.out.println("onzas a libras "+peso_on_libras);
    this.peso2 = peso_on_libras;
    
    double peso_on_gramos = onzas * 28.35 ;
    System.out.println("onzas a gramos "+peso_on_gramos);
    this.peso2 = peso_on_gramos;
    System.out.println("----------");
    
    double peso_peni_on = peniques * 0.054 ;
    System.out.println("peniques a onzas "+peso_peni_on);
    this.peso2 = peso_peni_on;
    
    double peso_peni_gr = peniques * 1.55 ;
    System.out.println("peniques a onzas "+peso_peni_gr);
    this.peso2 = peso_peni_gr;
    System.out.println("----------");
    
    double peso_quin_libras = quintal * 112 ;
    System.out.println("quintales a libras "+peso_quin_libras);
    this.peso2 = peso_quin_libras;
    
    double peso_quin_kg = quintal * 100;
    System.out.println("quintales a kg "+peso_quin_kg);
    this.peso2 = peso_quin_kg;
    System.out.println("----------");
    
    double peso_kg_gr = 1000 * peso;
    System.out.println("kg a gramos "+peso_kg_gr);
    this.peso2 = peso_kg_gr;
    
    double peso_gr_kg = 0.001 * peso;
    System.out.println("gramos a kg "+peso_gr_kg);
    this.peso2 = peso_gr_kg;
    System.out.println("----------");
    
    
  }

  public static double getLibras(int kg){
    System.out.println("libras a kg ");
    return kg * Libras;
  }
  
  public static double getLingotes(int kg){
    System.out.println("lingotes a kg ");
    return kg * Lingotes;
  }
  
  public static double getPeso(double Libras,double Lingotes,double Onzas,double Peniques,double Kilos,double Gramos , double Quintales){
  double pesom1 = 0.453 * Libras; 
    System.out.println("libras "+pesom1+" kg");
  double pesom12 = 0.0283 * Onzas;
    System.out.println("Onzas "+pesom12+" kg");
  double pesom13 = 0.00155 * Peniques;
    System.out.println("Peniques "+pesom13+" kg");
  double pesom14 = 1 * Kilos;
    System.out.println("Kilos "+pesom14+" kg");
  double pesom15 = 0.001 * Gramos;
    System.out.println("Gramos "+pesom15+" kg");
  double pesom16 = 14.59 * Lingotes;
    System.out.println("Lingotes "+pesom16+" kg");
  double pesom17 = 100 * Quintales;
    System.out.println("Quintales "+pesom17+" kg");
   return pesom1 + pesom12 + pesom13 + pesom14 + pesom15 + pesom16 + pesom17;
  }

  public static void main(String[] args) {
    System.out.println("introduce el peso del objeto ");
    Scanner sc = new Scanner(System.in);
    double peso= sc.nextDouble();

    System.out.println("---- 1º constructor ----- ");
    Peso2 p = new Peso2(peso);

    System.out.println("-------- 2º constructor ------");
    System.out.println(" 1º intro peso "); 
    double peso_= sc.nextDouble();
    System.out.println(" 2º intro peso a libras "); 
    double peso_libras = sc.nextDouble();
    System.out.println(" 3º intro peso a lingotes "); 
    double peso2_lingotes = sc.nextDouble();
    System.out.println(" 4º intro peso a onzas "); 
    double peso3_onzas = sc.nextDouble();
    System.out.println(" 5º intro peso a peniques "); 
    double peso4_peniques = sc.nextDouble();
    System.out.println(" 6º intro peso a quintal "); 
    double peso5_quintal = sc.nextDouble();
    System.out.println(" 7º intro peso a gramos "); 
    double peso6_gramos = sc.nextDouble();
    System.out.println(" 8º intro peso a kilogramos "); 
    double peso7_kilos = sc.nextDouble();

    Peso2 p2 = new Peso2(peso_,peso_libras,peso2_lingotes,peso3_onzas,peso4_peniques,peso5_quintal,peso6_gramos,peso7_kilos);

    /*    System.out.println(" metodos "); 
    System.out.println(getPeso(0, 5, 0, 0, 0, 0, 0));
    System.out.println(getPeso(0, 0, 110, 0, 0, 0, 0));
    
    System.out.println(getLibras(100));
*/
  }
}
