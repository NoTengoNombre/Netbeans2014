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
public class Variables {

  int a = 1;
  int b = 2;

  public void setA(int a) {
    this.a = a;
  }

  public void setB(int b) {
    this.b = b;
  }
  
  public int getA() {
    return a;
  }

  public int getB() {
    return b;
  }

  public static void main(String[] args) {

    Variables v = new Variables();
    Variables v1 = new Variables();
    Variables v2 = new Variables();
    
//   int aa = v.a = 5;
//   int bb = v.b = 6;
//   v.a = 5;
//   v.b = 6;
   
   // System.out.println("a "+aa);
    System.out.println("a con obj "+v.a+5);
   // System.out.println("b "+bb);
    System.out.println("b con obj "+v.b+5);
    
    System.out.println("-- Metodos --");
    
//   v.setA(6);
//    v.setB(7);
    
    System.out.println(v.getA()+5);
    System.out.println(v.getA()+v.getA());
    System.out.println(v.getB()+5);
    System.out.println(v.getB());
    
    System.out.println("otro objeto : v1 ");
    System.out.println(v1.a);
    System.out.println(v1.b);
    System.out.println("---------");
    v1.setA(5);
    v1.setA(10);
    System.out.println(v1.getA());
    System.out.println(v1.getB());
    v1.setB(10);
    System.out.println(v1.getB());
    System.out.println("---------------");
    
    
  }
}
