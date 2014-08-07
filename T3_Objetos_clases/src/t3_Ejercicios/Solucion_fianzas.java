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
public class Solucion_fianzas {

  private float cambio;

  public Solucion_fianzas() {
    cambio = 1.36f;
  }

  public Solucion_fianzas(float cambio) {
    this.cambio = cambio;
  }
  
  public double dolaresToEuros(float dolares){
    return dolares/cambio;
  }
  
  public double eurosToDolares(float euros){
    return euros * cambio;
  }
  
  public static void main(String[] args) {

    Solucion_fianzas d = new Solucion_fianzas();
    System.out.println("dolares son"+d.dolaresToEuros(1));
    System.out.println("euros son "+d.eurosToDolares(1));
    
    System.out.println("--------------------");
    Solucion_fianzas dd = new Solucion_fianzas(1.36f);
    System.out.println("dolar a euros "+dd.dolaresToEuros(100));
    System.out.println("euros a dolar "+dd.eurosToDolares(100));
    
  }
}
