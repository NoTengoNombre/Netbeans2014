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
public class Pag52Ej2Coche {

  private int velocidad;
  private int velocidad1;

  public Pag52Ej2Coche() {
    velocidad1 = 0;
  }
  
  public int LgetVelocidad(){
    return velocidad1;
  }

  public void Lacelera(int mas){
    velocidad1 = velocidad1 + mas;
  }
  
  public void Lfrenar(int menos){
    velocidad1 = velocidad1 - menos;
  }

  public int fijar(int velocidad){
    System.out.println(" velocidad "+velocidad);
    return this.velocidad;
  }
  
  public int ver_velocidad(){
    return fijar(150);
  }
  
  public void frenar(){
    fijar(velocidad--);
  }
  
  public void aumentar(){
    fijar(velocidad++);
  }
  
  public static void main(String[] args) {

    Pag52Ej2Coche c = new Pag52Ej2Coche();
    c.ver_velocidad();
    c.aumentar();
    c.aumentar();
    c.aumentar();
    c.frenar();
    System.out.println("---libro-----");
    c.velocidad1 = 100;
    c.Lacelera(40);
    for (int i = 0; i < 14; i++) {
      c.Lfrenar(10);
    System.out.println(c.LgetVelocidad());
    }
  }
}
