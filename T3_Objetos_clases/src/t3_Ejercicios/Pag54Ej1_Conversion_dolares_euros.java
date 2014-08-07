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
public class Pag54Ej1_Conversion_dolares_euros {

  static double DtE;
  static double EtD;
  
  double euros_a_dolar;
  double dolares_a_euros;

  public Pag54Ej1_Conversion_dolares_euros(){
    dolares_a_euros = 1.36;
  }
  
  public Pag54Ej1_Conversion_dolares_euros(double cambiar ) {
    dolares_a_euros = cambiar;
  }
  
  public static double Dollar_Euro( int c ){
    DtE = c * 0.734748459;
    System.out.printf("%,.2f \n",DtE);
    return DtE;
  }
  
  public static double Euro_Dollar( int c ){
    EtD = c * 1.36101;
    System.out.printf("%,.2f \n",EtD);
    return EtD;
  }

  public static void main(String[] args) {

    Pag54Ej1_Conversion_dolares_euros p = new Pag54Ej1_Conversion_dolares_euros();
    Pag54Ej1_Conversion_dolares_euros p1 = new Pag54Ej1_Conversion_dolares_euros(100);
    System.out.println();
    System.out.println("------------");
    Dollar_Euro(100);
    Euro_Dollar(100);
    
  }
}
