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
public class Punto {

 private int x;
 private int y;

  public Punto(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public Punto(){
    x = 0 ; 
    y = 0 ;
  }
  
  public void set(int x , int y){
   this.x = x;
   this.y = y;
  }
  
  public int get_x(){
    return x;
  }

  public int get_y(){
    return y;
  }
  
  public static void main(String[] args) {
    Punto p = new Punto(2, 4);
    p.x = 5;
    p.y = 10;
    System.out.println(p.y);
    System.out.println(p.x);
  }
}










