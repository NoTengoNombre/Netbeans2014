/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entrada_Salida_Teclado;

/**
 *
 * @author Trabajar
 */
public class Salida_Teclado {
  
  
  public enum sexo { V , M };
  
  public static void main(String[] args) {
  
    System.out.println(" Println");
    boolean casado =true;
    final int MAXIMO = 999999;
    byte diasem = 1;
    short diaanual = 300;
    
    // segundos desde el 01/01/1970 hasta el 22/02/2001
    long miliseg = 1298442800000L;
    float totalfactura = 10350.678000f;
    long poblacion = 6775235741L;
    sexo s = sexo.M;
    
 
System.out.println("\tEl valor de la variable casado es " + casado);
System.out.println("\tEl valor de la variable MAXIMO es " + MAXIMO);
System.out.println("\tEl valor de la variable diasem es " + diasem);
System.out.println("\tEl valor de la variable diaanual es " + diaanual);
System.out.println("\tEl valor de la variable miliseg es " + miliseg);
System.out.println("\tEl valor de la variable totalfactura es " + totalfactura);
System.out.println("\tEl valor de la variable poblacion es " + poblacion);
System.out.println("\tEl valor de la variable sexo es " +s);

    System.out.println("print");  
    System.out.println("\t el valor es "+casado+"\n");
    System.out.print("\tEl valor de la variable MAXIMO es " + MAXIMO + "\n");
    System.out.print("\tEl valor de la variable diasem es " + diasem + "\n");
    System.out.print("\tEl valor de la variable diaanual es " + diaanual + "\n");
    System.out.print("\tEl valor de la variable miliseg es " + miliseg + "\n");
    System.out.print("\tEl valor de la variable totalfactura es " + totalfactura + "\n");
    System.out.print("\tEl valor de la variable poblacion es " + poblacion + "\n");
    System.out.print("\tEl valor de la variable sexo es " + s +"\n");

  
    System.out.println("printf");
    System.out.printf("\n\n--Ejercicio variable y tipo de datos \n");
    System.out.printf("\t valor variable casado es %b\n",casado);    
    System.out.printf("\t valor maximo es %d\n",MAXIMO);
  System.out.printf("\t valor variable diasem %bd\n",diasem);
  System.out.printf("\t valor variable dianual %d\n",diaanual);
System.out.printf("\t valor variable miliseg es %d\n",miliseg);
System.out.printf("\t valor variable totalfactura %f\n",totalfactura);
    System.out.printf("\t valor variable poblacion es %d\n",poblacion);
    System.out.printf("\t valor variable sexo %s\n",s);
  
    
  
  }
}



