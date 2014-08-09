/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package razonamientos.Objetos;

/**
 *
 * @author Trabajar
 */
public class VariablesS {

  static int a = 0 ;
  static int b = 1;
  static int c = 2;

  public VariablesS(){}
  
  public static void fijar(){
    a  = a + 5 ;
    System.out.println("a "+a);
  }
  
  public static int devolver(){
    return a;
  }

  public static int [] devolver_arr(){
    int c = 0;
   int [] arr = new int[14];
    for (int i = 0; i < arr.length; i++) 
      System.out.println(a+" soy el metodo"+c++);
    return arr;
  }
  
  public static void devolver_arr2(){
    int c = 0;
   int [] arr = new int[14];
    for (int i = 0; i < arr.length; i++) {
      System.out.println(a+" soy el metodo"+c++);
  }
  }
  
  public static void main(String[] args) {
//    VariablesS  v = new VariablesS();
  //  int devolver_a = devolver();
  //  System.out.println(devolver_a);  
  //  v.fijar();
    System.out.println("soy posicio memoria "+VariablesS.devolver_arr());
     devolver_arr2();
  //   System.out.println(a=1000);
    // System.out.println(v.a);
    
  }
}
