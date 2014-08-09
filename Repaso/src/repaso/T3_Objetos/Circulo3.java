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
public class Circulo3 {

  private Punto3 centro;
  private int radio;
  
  public Circulo3() {
    centro = new Punto3();
  }
  
  public Circulo3(int x , int y , int r){
    centro = new Punto3(x,y);
    radio = r;
  }

  public double superficie(){
    return 3.14 * radio * radio;
  }

  public static void main(String[] args) {

    Circulo3 c = new Circulo3();
    c.centro.set(3, 5);
    c.centro.get_x();
    c.centro.get_y();
    
    System.out.println("coordenadas ");
    System.out.println(c.centro.get_x()+c.centro.get_y());
   
    Circulo3 c1 = new Circulo3(5,6,7);
    System.out.println(c1.superficie());
    c1.centro.set(10, 20);
    c.radio = 200;
    c.superficie();
    System.out.println(c.superficie());
    int xx = c1.centro.get_x();
    int tt = c1.centro.get_y();
    System.out.println(xx);
    System.out.println(tt);
    
    
    
    
    
  }
}










