/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Jugador_Basket;

import java.io.*;
import java.util.Scanner;

public class Usa_jugador {

  Jugador_Basket juega;

  public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  
  public Usa_jugador(Jugador_Basket juega) {
    this.juega = juega;
  }
  
  public Usa_jugador() {
    Scanner sc = new Scanner(System.in);
    System.out.println("nombre ");
    String nombre = sc.nextLine();
    System.out.println("dorsal ");
    String dorsal = sc.nextLine();
    System.out.println("puesto ");
    String puesto = sc.nextLine();
    System.out.println("puntos ");
    int punto = 0;

   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    boolean error = false;
    do {
      try{
        error = false;
        punto = Integer.valueOf(br.readLine()).intValue();
    }catch(NumberFormatException e){
      error = true;
      System.out.println("Error el formato ");
    }catch(IOException e){
        System.out.println("");}
    }
      while(error);
    
    juega = new Jugador_Basket(nombre,puesto,dorsal,punto);
    juega.get_nombre();
    juega.get_puesto();
    juega.get_dorsal();
    juega.get_puntos();
  }

  public static int leer_entero(String mensaje){
    Scanner entrada = new Scanner(System.in);
    int num1 = 0;
    System.out.print(mensaje);
    try{
      num1 = entrada.nextInt();
    }catch(Exception e){
      System.err.println("Error numero leido "+e);
      e.printStackTrace();
      System.exit(1);
  }
    return num1;
  }
  
  public int leer_entero1(String mensaje){
    Scanner entrada = new Scanner(System.in);
    int num1 = 0;
    System.out.print(mensaje);
    try{
      num1 = entrada.nextInt();
    }catch(Exception e){
      System.err.println("Error numero leido "+e);
      e.printStackTrace();
      System.exit(1);
  }
    return num1;
  }
  
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Usa_jugador j4 = new Usa_jugador();
    
    System.out.println("");
    System.out.println("jugador1 ");
    System.out.println("");
        
    System.out.println("nombre ");
    try{
    j4.juega.set_nombre(sc.nextLine());
    }catch(Exception e){
      System.out.println("Error lectura numero "+e);
      e.printStackTrace();
    }
    
    System.out.println("dorsal ");
    try{
    j4.juega.set_dorsal(sc.nextLine());
    }catch(Exception e){
      System.out.println("Error lectura numero "+e);
      e.printStackTrace();
    }
     
    System.out.println("puesto ");
    try{
    j4.juega.set_puesto(sc.nextLine());
    }catch(Exception e){
      System.out.println("Error lectura numero "+e);
      e.printStackTrace();
    }
                
//    j4.juega.set_puntos(leer_entero("!!! intro numero !!!"));
    int x = leer_entero("puntos sin expeccion ");
    j4.juega.set_puntos(x);
    int x1 = leer_entero("puntos ganados : ");
    j4.juega.SumaPuntos(x1);
    System.out.println(j4.juega.DatosJugador());

    System.out.println("");
    System.out.println("jugador 2 ");
    System.out.println("");
        
    Usa_jugador j5 = new Usa_jugador();
    int x2 = leer_entero("puntos ganados : ");
    j5.juega.SumaPuntos(x2);
    System.out.println(j5.juega.DatosJugador());
    
    System.out.println("");
    System.out.println("jugador 3 ");
    System.out.println("usa_jugador constructor con ref en argumentos");
    System.out.println("tiene argum ref clase jugador_basket");

    Jugador_Basket jb1 = new Jugador_Basket();
    Usa_jugador j6 = new Usa_jugador(jb1);
    int x3 = leer_entero(" puntos ganados \t");
    j6.juega.SumaPuntos(x3);
    System.out.println(j6.juega.DatosJugador());

    System.out.println("");
    System.out.println("jugador 4 ");
    System.out.println("");
    
    Jugador_Basket presenta = new Jugador_Basket();
    Usa_jugador jb2 = new Usa_jugador(presenta);
    System.out.println(jb2.juega.DatosJugador());
    int xx3 = leer_entero(" puntos ganados \t");
    jb2.juega.SumaPuntos(xx3);
    System.out.println(jb2.juega.DatosJugador());
    
    
    
  }
}
