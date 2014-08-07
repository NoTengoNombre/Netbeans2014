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
public class Circulo {

  private Punto centro;
  
  private int radio;

  public Circulo(int x , int y , int radio) {
    this.centro = centro;
    this.radio = radio;
  }
  
  Circulo(){
    centro = new Punto();
  }
  
  public double superficie(){
    return 3.14 * radio * radio;
  }
  
  public static void main(String[] args) {

    Circulo c = new Circulo();
    c.centro.set(2, 3);
    c.radio = 5;
    
    int c1 = c.centro.get_x();
    int c2 = c.centro.get_y();
    
    System.out.println("soy c1 "+c1);
    System.out.println("soy c2 "+c2);
    double s = c.superficie();
    
    
    
    
    
    
    
    
    
    
    
    
  }
}



















