/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package t3_entrada_teclado_basico;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Trabajar
 */
public class Crear_File_Basico {

  public static void main(String[] args) {
  File f = new File("fichero.txt");
  Scanner s;
  try{
  s = new Scanner(f);
  // método hasNextLine() que nos indica si hay o no una línea más que leer,
  while(s.hasNextLine()){
   // nextLine() que nos la devuelve la linea leida
    String linea = s.nextLine();
    Scanner sl = new Scanner(linea);
    sl.useDelimiter("\\s*,\\s*");
    System.out.println(sl.next());
    System.out.println(sl.next());
    System.out.println(sl.next());
  }
  s.close();
  }
 catch(FileNotFoundException e){
  e.printStackTrace();
    }
  }
}
