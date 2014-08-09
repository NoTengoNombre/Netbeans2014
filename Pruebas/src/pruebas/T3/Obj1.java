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
public class Obj1 {

  int x;
  static int xx;
  int y;
  static int yy;
  int z;
  static int zz;

  public Obj1(){}
  
  public Obj1(int x, int y, int z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  public static void setXx(int xx) {
    Obj1.xx = xx;
  }

  public static void setYy(int yy) {
    Obj1.yy = yy;
  }

  public static void setZz(int zz) {
    Obj1.zz = zz;
  }
  
  public static void main(String[] args) {

    Obj1 o = new Obj1();
    o.x = 10;
    o.y = 100;
    o.z = 1000;
    System.out.println(o.x);
    System.out.println(o.y);
    System.out.println(o.z);
    
    System.out.println("----------");
    
    Obj1 oo = new Obj1(5, 10, 15);
    oo.x = 20;
    oo.y = 200;
    oo.z = 2000;
    System.out.println(oo.x); 
    System.out.println(oo.y); 
    System.out.println(oo.z); 
    
    setXx(400);
    setYy(600);
    setZz(800);
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  }
}
