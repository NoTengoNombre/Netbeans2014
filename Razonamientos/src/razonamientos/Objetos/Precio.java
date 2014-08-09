/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package razonamientos.Objetos;

/**
 *
 * @author Trabajar
 * Pdf_uni_madrid_tipo_variables 
 */

public class Precio {
  
  public double euros = 1;
  public static double euros1 = 133;

  public Precio(){}
  
  public double ver(){
    return euros * 10;
  }
  
  public void pone(double euros){
    euros1 = euros;
  }
  
  public void prueba(double euros){
    this.euros = euros1 * euros;
  }
  
  
  public static void main(String[] args) {
 
    
    System.out.println(euros1);
    System.out.println("---------");
    
    Precio p = new Precio();
    p.pone(56.8);
    System.out.println(p.euros);

    /*
    Precio q = new Precio();
    q.pone(75.6);
    System.out.println(q.euros);
    
    System.out.println(p.ver());
    System.out.println(euros1+p.ver());
    System.out.println("---------");
    p.prueba(4);
    */
    System.out.println(p.euros);
  }
}
  