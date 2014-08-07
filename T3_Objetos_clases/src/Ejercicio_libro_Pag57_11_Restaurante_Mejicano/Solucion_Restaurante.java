/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejercicio_libro_Pag57_11_Restaurante_Mejicano;



/**
 *
 * @author Trabajar
 */
public class Solucion_Restaurante {
  
  static int total_clientes = 0;
  static int t_patatas = 6;
  static int t_chocos = 3;
  
 public static int cuantos_clientes_comen_en_total(){
  int total_p = t_patatas;
  int total_c = t_chocos;
   for (int i = t_patatas - 2, j = t_chocos - 1 ; i >= 0 || j >= 0 ; i = i - 2 , j = j -1 ){
//     System.out.println("patatas "+i--+" chocos "+j--);
    System.out.printf(" -- %d Patatas \n - %d Chocos \n ",total_p = total_p - 2 , total_c = total_c - 1 );
     if ( t_patatas  == t_chocos || t_patatas >= t_chocos * 2 )
       if (t_chocos  < t_patatas  && t_chocos * 2 >= t_patatas )
        total_clientes = t_patatas * 3;
        else
        System.out.println(" !! faltas chocos !! ");
        else
        System.out.println(" !! faltas patatas !! ");
   }
   return total_clientes;
 }   
 
   public static void addChocos(int chocos){
     Solucion_Restaurante.t_chocos = chocos;
   }
   
   public static void addPatatas(int patatas){
     Solucion_Restaurante.t_patatas = patatas;
   }

   public static int total_clientes_que_comen(){
    return total_clientes;
   }
   
   public static int getComensales(int comensales){
    return total_clientes = comensales;
   }
   
   public static int showChocos(){
     System.out.println("Chocos "+Solucion_Restaurante.t_chocos);
    return (int) t_chocos;
   }
   
   public static int showPatatas(){
     System.out.println("Patatas "+Solucion_Restaurante.t_patatas);
    return (int) t_patatas;
   }
   
  public static void main(String[] args) {
    
    cuantos_clientes_comen_en_total();
    showPatatas();
    showChocos();
    System.out.println("total clientes "+total_clientes); 
    
    
  }
}
