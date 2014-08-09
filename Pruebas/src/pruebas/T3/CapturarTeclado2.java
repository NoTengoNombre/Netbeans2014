/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pruebas.T3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Trabajar
 */
public class CapturarTeclado2 {

  
  public String captura(){
    BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
    String retorno = "";
  try{
  retorno = lector.readLine();
  }catch(IOException e){
  e.printStackTrace();
}
  return retorno;
}
  
  
  public static String captura2(){
    BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
    String retorno = "";
  try{
  retorno = lector.readLine();
  }catch(IOException e){
  e.printStackTrace();
}
  return retorno;
}
  
  public static void main(String[] args) {
  
    CapturarTeclado2 ct = new CapturarTeclado2();
  //  System.out.println(ct.captura());
 
 //   System.out.println("static");
  //  System.out.println(captura2());
    
    
    
    System.out.printf("input float(e.g %5.2f): \n",2.123456666);
    System.out.printf("input double(e.g %6.3e): \n",4.93e15);
    
    
    
  }
}
