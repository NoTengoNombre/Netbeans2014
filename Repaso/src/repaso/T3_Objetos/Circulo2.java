/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package repaso.T3_Objetos;

/**
 *
 * @author Trabajar
 */
public class Circulo2 {

  public Punto centro;
  public int radio;
  
  public double superficie(){
    return 3.14 * radio * radio;
  }
  
  public static void main(String[] args) {

    Circulo2 c = new Circulo2();
    c.centro = new Punto(34, 43);
    c.centro.x = 2;
    c.centro.y = 3;
    
    c.radio = 5;
    
    double s = c.superficie();
    
    System.out.println("superficie "+s);
    System.out.println("coordenadas "+c.centro.x+ " otra "+c.centro.y);
    System.out.println(" suma coordenadas "+c.centro.x+c.centro.y);
    
  }
}
