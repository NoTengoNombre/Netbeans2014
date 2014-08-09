/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Temario_T4_libro;

/**
 *
 * @author Trabajar
 */
public class Pag74_Ej_4_Nº_Armstrong {

    public static int potencia ( int ba , int ex){
    int res = ba;
    for (int i = 0; i < ex - 1 ; i++) {
       res = ex * ba;
    }
    return res;
    }
    
    public static int armstrong(int numero){
      int cifra1 = numero/100;
      int cifra2 =(numero - 100 * cifra1) /10;
      int cifra3 = numero - 100 * cifra1 - 10 * cifra2;
      int dat = potencia(cifra1,3) + potencia(cifra2,3) + potencia(cifra3,3);
      if (dat == numero)return 1;
      return 0;
      }
    
  public static void main(String[] args) {

    if (armstrong(371)==1){
      System.out.println("el nº 371 es armstrong");
    }else{
      System.out.println("no lo es");
    }
    if (armstrong(423)==1){
      System.out.println("el nº 423 es armstrong ");
    }else {
      System.out.println("no lo es");
    }
  }
}




