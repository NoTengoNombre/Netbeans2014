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

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class EntradaTeclado {

  public static void main(String[] args) {
    
    try 
    {
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      
      System.out.println("leer cadena");
      String cadena = br.readLine();
      System.out.println(cadena);
      
      System.out.println("leer entero");
      int entero = Integer.parseInt(br.readLine());
      System.out.println(entero);
      
      System.out.println("leer float ");
      double decimal = Double.parseDouble(br.readLine());
      System.out.println(decimal);
    }catch(Exception e){
      System.err.println("Error al leer datos");
      e.printStackTrace();
    }
    
    

    
    
    
    
    
    
    
    
    
    
    
    
  }
}
