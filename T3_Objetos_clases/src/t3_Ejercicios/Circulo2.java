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
public class Circulo2 {

  public Punto2 centro2;
  public int radio;
  
  public double superficie(){
    return Math.PI * radio * radio;
  }
  
  public static void main(String[] args) {
    //       R        Objeto
    Circulo2 c = new Circulo2();
    c.centro2 = new Punto2(3, 3);
    
    c.centro2.x = 2;
    c.centro2.y = 3;
    
    c.radio = 5;
    
    double s = c.superficie();
  
    
    System.out.println("superficie circulo es "+Math.rint( s * 100)/100);
    
    System.out.println("coordenadas (x,y) del circulo son : "+c.centro2.x+ " , "+c.centro2.y);

    System.out.println(Math.rint(Math.PI * 1000000)/1000000);
            
  }
}
