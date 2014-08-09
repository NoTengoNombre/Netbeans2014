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
public class Con_Ob {
         int x;
         int y;
  static int xx = 1000;
  static int yy = 5;

  public Con_Ob(){
    this.x = 2 + x;
    this.y = 3 + y;
    xx = x + y;
  }

  public Con_Ob(int a, int b) {
    this.x = a;
    this.y = b;
  }

  public void setX(int x) {
    this.x = x;
  }

  public void setY(int y) {
    this.y = y;
  }
  
  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public static void setXx(int xx) {
    Con_Ob.xx = xx;
  }

  public static void setYy(int yy) {
    Con_Ob.yy = yy;
  }

  public static int getXx() {
    return xx;
  }

  public static int getYy() {
    return yy;
  }
  
  public static void main(String[] args) {

    System.out.println(getXx());
    Con_Ob n = new Con_Ob();
    Con_Ob n0 = new Con_Ob();
    Con_Ob nn1 = new Con_Ob(1, 2);
    int z = nn1.x + nn1.y;
    System.out.println(z);
    
    System.out.println("soy xx "+xx);
  //  n.setX(3);
  //  n.setY(4);
    System.out.println("----------");
    System.out.println(n.getX());
    System.out.println(n.getY());
    System.out.println("----------");
    
  }
}
