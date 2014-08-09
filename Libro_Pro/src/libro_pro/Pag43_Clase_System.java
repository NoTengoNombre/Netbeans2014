/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package libro_pro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Trabajar
 */
public class Pag43_Clase_System {

  public static void leer(String ln) throws IOException{
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    ln = br.readLine();
    System.out.println("soy el metodo "+ln);
  }

  private static int dato(){
    String sdato = System.console().readLine();
    int dato = Integer.parseInt(sdato);
    System.out.println("valor del dato "+dato);
    return dato;
  }
  
  
  public static void main(String[] args) throws IOException {

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    String ln = br.readLine();
    System.out.println(ln);
    
    leer(ln);

    /*
    System.out.println("mete char");  
  char c;
  try{
  c = (char) System.in.read();
  }catch(Exception e){
    e.printStackTrace();
    }
  */

    
  }
}









