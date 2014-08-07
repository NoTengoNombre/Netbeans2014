/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejercicios_Resueltos;

/**
 *
 * @author Trabajar
 */
public class Ej_Metodo_Estaticos {

  //E = nº real
  //S = cuadrado num
  static double cuadrado(double num){
    double r = num * num;
    System.out.println(r);
    return r;
  }
  
  // E: Precio inicial , precio final
  // S: descuento
  static double calcula_descuento(double precio_original , double precio_final){
    double precio_descuento = ( precio_original - precio_final ) * 100 / precio_original;
    System.out.println("descuento "+precio_descuento);
    return precio_descuento;
  };
  
    // E: Precio inicial , precio descuento
  // S: Precio final
  static double precio_descuento(double precio_final , double descuento){
    double precio_descuento = ( precio_final - descuento);
    return precio_descuento;
  }

  // E: precio y descuento
  // D: precio con el descuento
  static double precio_descuento2(double precio , double descuento){
    double precio_descuento = ( precio * descuento / 100);
    return precio - precio_descuento;
  }

  public static double precio_final( double descuento , double precio){
    double p_final = precio - precio * descuento / 100;
    return p_final;
  } 
  
  static double FtC(double f){
    double res = ( f - 32 ) / 1.8;
    return res;
  }
  
  static double CtF(double c){
    double res =  1.8 * ( c  + 32) ;
    return res;
  }
  
  
  public static void main(String[] args) {
    cuadrado(20.5);
    System.out.println("precio "+calcula_descuento(100,50));
    System.out.println("precio es "+precio_descuento(100,10));
    System.out.println("precio2 es "+precio_descuento2(1000,50));
    System.out.println("precio22 es "+precio_descuento2(150,25));
    System.out.println("precio222  es "+precio_final(25,150));
      
    System.out.println("c "+CtF(32));
    System.out.println("f "+FtC(32));
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  }
}
