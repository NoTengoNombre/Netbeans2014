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
public class Pag51Ej1_temperatura {
 
  double c;
  static double cc;
  double f;
  static double ff;

  public Pag51Ej1_temperatura(){}
  
  public double metodo_FtC(double F){
   c = (F - 32)/1.8;
   System.out.printf("%,.2f\n",c);
    return c;
  }
  
  public double metodo_CtF(double c){
    f = (1.8)* c + 32; 
   System.out.printf("%,.2f\n",f);
    return f;
  }
  
  public static double metodo2_CtF(double c){
    ff = (1.8)* c + 32; 
   System.out.printf("%,.2f\n",ff);
    return ff;
  }
  
  public static double metodo1_FtC(double F){
   cc = (F - 32)/1.8;
   System.out.printf("%,.2f\n",cc);
    return cc;
  }
  
  public static double libro_CtF(double cc){
    double fff = (1.8)* cc + 32;
    System.out.printf("%,.2f\n",fff);
    return fff;
  }
  
  public static double libro_FtC(double ff){
    double ccc = (ff - 32) / 1.8 ;
    System.out.printf("%,.2f\n",ccc);
    return ccc;
  }
  
  public static void main(String[] args) {
    
    Pag51Ej1_temperatura t = new Pag51Ej1_temperatura();

    t.metodo_CtF(0);
    t.metodo_CtF(10);
    t.metodo_CtF(50);
    t.metodo_CtF(100);
    
    t.metodo_FtC(0);
    t.metodo_FtC(10);
    t.metodo_FtC(50);
    t.metodo_FtC(100);

    System.out.println("------- Static -------");

    metodo2_CtF(0);
    metodo2_CtF(10);
    metodo2_CtF(50);
    metodo2_CtF(100);
    System.out.println("------- Static -------");
    
    metodo1_FtC(0);
    metodo1_FtC(10);
    metodo1_FtC(50);
    metodo1_FtC(100);

    System.out.println("----- Libro -------");
    libro_CtF(100);
    libro_CtF(50);
    libro_CtF(10);
    libro_CtF(0);
    System.out.println("----- Libro -------");
    libro_FtC(100);
    libro_FtC(50);
    libro_FtC(10);
    libro_FtC(0);
  }
}
