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
public class Pag56Pag7_millas_a_metros {

     
  final private static double distancia = Math.random()*(1+100);
  final private static double distancia2 = Math.random()*(1+100);
  static double d1 = Math.random()*(1+100);
  static double d2 = Math.random()*(1+100);

  // constante
  final static int MetrosMilla = 1852;
  
  public static double SmillasAMetros(double m){
    return MetrosMilla * m;
  }
  
  //E: millas 
  //S: metros
    public static double millas_a_metros(double milla){
 //      double millas = Math.random()*(1+100) * 1852;
      double millas = milla * 1852;
 //     System.out.printf("millas %,.2f m \n ",millas);
      return millas;
    }
  
    
   public static double Smillas_a_km(double m){
     return MetrosMilla * m / 1000;
   }
    
  //E: millas
  //S: km
    public static double millas_a_km(double milla){
      double km_millas = milla * 1.852;
   //   System.out.printf("millas %,.2f km metodo \n",km_millas);
      return km_millas;
    }
    
 
  public static void main(String[] args) {

//    millas_a_metros(distancia);
 //   millas_a_km(distancia2);
    System.out.println("----------");
    millas_a_metros(d1);
    System.out.println("----------");
    millas_a_metros(1);
    System.out.println("----------");
    millas_a_metros(d2);
    System.out.println("----------");
    millas_a_km(d1);
    millas_a_km(Math.random()*(1+100));
    millas_a_km(d2);
 
    System.out.println("--------- "); 
    System.out.println("---LIBRO------ "); 
    System.out.println("--------- "); 
    
    System.out.println(SmillasAMetros(d1));
    System.out.println(millas_a_metros(d1));
    System.out.println("--------- "); 
    System.out.println(Smillas_a_km(d1));
    System.out.println(millas_a_km(d1));
    
    
  }
}
