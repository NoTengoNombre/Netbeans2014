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
public class Punto {
  int x;
  int y;
  static int z;

  public Punto() {
    x = 0;
    y = 0;
  }
  
  Punto(int a , int b){
    x = a;
    y = b;
  }
  
public static int suma(int a , int b ){
  int c = a + b;
  return c;
}

static void mostrar(){
  System.out.println(" void "+suma(1, 1));
  Punto.z = 33;
  System.out.println(Punto.z);
}

  public static void main(String[] args) {

    Punto p = new Punto(2, 3);
    p.x = 4;
    System.out.println(p.x);
    p.y = 5;
    System.out.println(p.y);

    System.out.println("----------");
    
    int s = suma(1+1,+10);
    System.out.println(s);
    
    mostrar();
    
    System.out.println("----------");
    Punto pp = new Punto();
    System.out.println(pp.x);
    System.out.println(pp.y);
    
    
  }
}

