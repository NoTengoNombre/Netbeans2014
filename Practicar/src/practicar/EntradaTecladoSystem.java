/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicar;

/**
 *
 * @author Trabajar
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EntradaTecladoSystem {

  public static void main(String[] args) throws IOException {
    try{
    // convierte los bytes a caracteres
    InputStreamReader isr = new InputStreamReader(System.in);
    // lee hasta el final 
    BufferedReader br = new BufferedReader(isr);
    
    System.out.println("Introduce el texto ");
    String cad = br.readLine();
    
    //salida por pantalla del texto introducido
    System.out.println(cad);
    
    System.out.print("introduce numero ");
    int num = Integer.parseInt(br.readLine());
    
    System.out.println(num);
    }catch(Exception e){
      System.out.println("Error al leer datos");
      e.printStackTrace();
    }
  }
}
