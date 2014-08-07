/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package t3_Ejercicios;

/**
 *
 * @author Trabajar
 */
public class Punto3 {
 
  private int x , y ;
  static private int n_puntos = 0;

  public Punto3(int x, int y) {
    this.x = x;
    this.y = y;
    n_puntos++;
  }

  public Punto3() {
  n_puntos++;
  }
  
  public void set_x (int a ){
    x = a;
  }
  
  public void set_y (int a){
    y = a;
  }
  
  public static void cambiar_puntos(int num){
     n_puntos = num;
  }
  
  public int get_x(){
   System.out.println(x);
   return x;
  }
  
  public int get_y(){
   System.out.println(y);
    return y;
  }
  
  public static int devolver_puntos(){
    return n_puntos;
  }
  
  public static void main(String[] args) {

    Punto3 p00 = new Punto3();
    Punto3 p0 = new Punto3(1, 2);
    Punto3 p1 = new Punto3(11, 22);
    Punto3 p2 = new Punto3(111, 222);
    
    System.out.println("numero de puntos "+n_puntos);
    
    System.out.println("---------");
    p0.get_x();
    p0.get_y();
    System.out.println("---------");
    p1.get_x();
    p1.get_y();
    System.out.println("---------");
    p2.get_x();
    p2.get_y();
    System.out.println("---------");
    p0.x = 5;
    p0.y = 10;
    p0.get_x();
    p0.get_y();
    System.out.println("---------");
    p0.set_x(10);
    p0.set_y(20);
    p0.get_x();
    p0.get_y();
    System.out.println("---------");
    p0.n_puntos = 10;
    System.out.println("numero de puntos "+n_puntos);

    p1.n_puntos = 11;
    System.out.println("numero de puntos "+n_puntos);
    
    n_puntos = n_puntos;
    System.out.println("numero de puntos "+(++n_puntos));

    Punto3.cambiar_puntos(1000+n_puntos);
    int p = Punto3.devolver_puntos();
    System.out.println("valor es "+p);
            
  }
}
