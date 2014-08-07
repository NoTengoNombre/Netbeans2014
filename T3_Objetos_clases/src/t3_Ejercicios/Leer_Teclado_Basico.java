/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package t3_Ejercicios;


import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.lang.*;


public class Leer_Teclado_Basico {

 
  public static void main(String[] args) throws IOException {
    InputStreamReader isr  = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    String leer = br.readLine();
    System.out.println(leer);
    int n = Integer.parseInt(leer);
    System.out.println(n);
  }
}
