/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pruebas.T3;

/**
 *
 * @author Trabajar
 */
public class Objetos {
 
  int x = 5;
  int y = 55;
  int z = 555;
  
  public Objetos(){
   x = 1;
   y = 0;
  }
  
  public Objetos(int x, int y, int z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  public void setX(int x) {
    this.x = x;
  }

  public void setY(int y) {
    this.y = y;
  }

  public void setZ(int z) {
    this.z = z;
  }
  
  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public int getZ() {
    return z;
  }
  
  public static int static_getX() {
     Objetos o = new Objetos();
    return o.x;
  }

  public static int static_getY() {
     Objetos o = new Objetos(10, 20, 30);
     Objetos o1 = new Objetos(100, 200, 300);
    return o1.y;
  }
  
  public static void static_setY(){
    Objetos o = new Objetos(1000,2000,3000);
    o.y = 4000;
    System.out.println("valor de static set_y "+o.y);
  }

  /*
  public static int static_getY() {
    return y;
  }

  public static int static_getZ() {
    return z;
  }
  */
  

  public static void main(String[] args) {
    
    Objetos o = new Objetos();
    System.out.println(o.getX());
    System.out.println(o.getY());
    System.out.println("---------"); 
    o.x = 1 ;
    o.y = 2 ;
    o.z = 3 ;
    System.out.println(o.getX());
    System.out.println(o.getY());
    System.out.println(o.getZ());
    System.out.println("---------"); 
    o.setX(4);
    o.setY(5);
    o.setZ(6);
    System.out.println(o.getX());
    System.out.println(o.getY());
    System.out.println(o.getZ());
    
    System.out.println("statico "+static_getX());
    System.out.println("statico 2 "+static_getY());
    
    static_setY();
    System.out.println(o.y);
  }
}
