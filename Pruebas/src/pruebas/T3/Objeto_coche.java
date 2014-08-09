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
public class Objeto_coche {

  int rueda;
  int puerta;

  public Objeto_coche(int rueda, int puerta) {
    this.rueda = rueda;
    this.puerta = puerta;
  }

  public static int suma(int a , int b){
    int c = a + b;
    return c;
  }
  
  
  public static void main(String[] args) {

    Objeto_coche deportivo = new Objeto_coche(4, 2);
    Objeto_coche burgoneta = new Objeto_coche(4, 3);
    Objeto_coche coche = new Objeto_coche(4, 4);
    Objeto_coche moto = new Objeto_coche(2, 0);

    deportivo.puerta = 4;
    deportivo.rueda = 3;
    
    System.out.println(suma(1,1));
    
    
    
  }
}
