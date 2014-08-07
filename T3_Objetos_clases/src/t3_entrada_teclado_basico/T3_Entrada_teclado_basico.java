/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package t3_entrada_teclado_basico;

/**
 *
 * @author Trabajar
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T3_Entrada_teclado_basico {

  public static void main(String[] args) throws IOException {

    int num = 0;
    while(num!= -1){
    try
    {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    
    System.out.println("Intro texto");
    String cad = br.readLine();
    
    System.out.println(cad);
    System.out.println("intro numero");
    num = Integer.parseInt(br.readLine());
    
    System.out.println(num);
    } catch( Exception e){
      System.out.println("error leer datos");  
      e.printStackTrace();
       }
    }
  }
}
