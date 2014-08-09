/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package t3_entrada_teclado_basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Trabajar
 */
public class CapturadorDeTeclado {

  public String capturar(){
    BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
    String retorno = "";
    try {
      retorno = lector.readLine();
    } catch(IOException e){
    } 
    return retorno;
  }
  
  public static void main(String[] args) {
    CapturadorDeTeclado capturador = new CapturadorDeTeclado();
    System.out.println(capturador.capturar());
  }
}
