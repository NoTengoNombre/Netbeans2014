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
public class Objeto_Basico {

  static int z = 5;
  int x;
  int y;

  public Objeto_Basico() {
    System.out.println(" mensaje ");
  }
  
  public Objeto_Basico(int x , int y){
    System.out.println(" mensaje1 ");
    this.x = x+x;
    this.y = y+y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }
  
  public static void main(String[] args) {

    
    
  }
}
