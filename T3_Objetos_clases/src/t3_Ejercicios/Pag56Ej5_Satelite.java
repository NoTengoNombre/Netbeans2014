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
public class Pag56Ej5_Satelite {

  private double meridiano;
  private double paralelo;
  private double distancia_tierra;

  public Pag56Ej5_Satelite(double meridiano, double paralelo, double distancia_tierra) {
    this.meridiano = meridiano;
    this.paralelo = paralelo;
    this.distancia_tierra = distancia_tierra;
  }
          
  public Pag56Ej5_Satelite() {
   meridiano = paralelo = distancia_tierra;
  }

    public void variaAltura(double desplazamiento){
     distancia_tierra =  distancia_tierra + ( - desplazamiento );  
    }
  
    public boolean enOrbita(){
      boolean tierra;
      tierra = ( 0 != this.distancia_tierra );
      System.out.println(tierra);
      return tierra;
    }

    public void variaPosicion(double variap , double variam){
        this.meridiano = variam;
        this.paralelo = variap;
    }
    
  public void set_posicion(double m , double p , double d){
    meridiano = m;
    paralelo = p;
    distancia_tierra = d;
  }
  
  public void printPosicion(){
    System.out.println("satelite esta "+paralelo+" meridano "+meridiano+ " distancia es "+distancia_tierra+ " km ");
  }
  
  public static void main(String[] args) {

    Pag56Ej5_Satelite s = new Pag56Ej5_Satelite();
    Pag56Ej5_Satelite s1 = new Pag56Ej5_Satelite(4,5,6);
    s.printPosicion();
    s1.printPosicion();
    s1.enOrbita();
    s1.variaAltura(2);
    s1.variaPosicion(5, 10);
    s1.printPosicion();
    s1.variaAltura(0);
    s1.enOrbita();
    s1.set_posicion(130, 233, 400);
    s1.printPosicion();
    s1.enOrbita();
    
  }
}
