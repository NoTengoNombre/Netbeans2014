/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicar;

/**
 *
 * @author Trabajar
 */
public class Punto3 {

  private int x;
  private int y;
  static private int num_puntos = 0;

  public Punto3(int x1, int y1) {
    this.x = x1;
    this.y = y1;
    num_puntos++;
  }

  public Punto3(){
    num_puntos++;
  }
  
  public void set_x(int a){ x = a;}
  public void set_y(int b){ y = b;}
  
  public static void set_num_puntos(int num){
    num_puntos = num;
  }
  
  public int get_x(){
    return x;
  }
  
  public int get_y(){
    return y;
  }
  
  public static int get_num_puntos(){
    return num_puntos;
  }

  public static void main(String[] args) {

    Punto3 p = new Punto3();
    p.set_x(3);
    p.set_y(3);
    System.out.println(p.get_x()+p.get_y());
    p.set_x(5);
    p.set_y(6);
    System.out.println(p.get_x()+p.get_y());
    System.out.println("----------------");
    int zd = p.get_x()+p.get_y();
    System.out.println(zd);
    p.set_x(zd);
    p.set_y(zd);
    
    
    
  int x =  p.num_puntos = 54;
    set_num_puntos(3);
    System.out.println(x);
    Punto3 p2 = new Punto3(3, 4);
    Punto3 p21 = new Punto3(3, 4);
    Punto3 p22 = new Punto3(3, 4);
    Punto3 p23 = new Punto3(3, 4);
    int xx = p2.get_x();
    int zz = p2.get_y();
    System.out.println(xx);
    System.out.println(zz);
    System.out.println(get_num_puntos());

  }
}
