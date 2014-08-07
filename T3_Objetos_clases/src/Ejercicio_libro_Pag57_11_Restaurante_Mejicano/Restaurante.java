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
public class Restaurante {

  int comen;
  static int total_patatas;
  static double total_chocos;
//  static int total_clientes;
  
  final static int patata = 1;
  final static double chocos = 0.5;
  final static int clientes = 3;
  
  public Restaurante(){
  }

  public Restaurante(int patatas, int chocos) {
    total_patatas = patatas;
    total_chocos = chocos;
  }
/*
  public static int cuantos_clientes_comen_3(int t_patatas , double t_chocos){
    int patata_1_por_persona = 3;
    double chocos_05_por_persona = 0.5;
    
    int total_patatas1 = t_patatas;
    total_patatas = t_patatas;
    
    double total_chocos1 = t_chocos;
    total_chocos = t_chocos;
    do {
// cantidad patata para alimentar los clientes 
        total_clientes = (int) ((total_patatas1 * patata_1_por_persona) * (total_chocos1 * chocos_05_por_persona));
//  total de patatas que dispongo     
        total_patatas = total_patatas - patata;
        total_chocos = total_chocos - chocos;
// cantidad chocos para alimentar clientes 
      }
    while(total_patatas >= 0 && (total_patatas % 3) <= 1 && total_chocos >= 0 && (total_chocos % 3) <= 0.5);
    return total_clientes;
  }
  
  public static int cuantos_clientes_comen_3_for(int t_patatas , int t_chocos){
    int patata_1_por_persona = 3;
    double chocos_1_por_persona = 1/2;
    
    int total_patatas1 = t_patatas;
    total_patatas = t_patatas;
    
    int total_chocos1 = t_chocos;
    total_chocos = t_chocos;
    
    for (int i = 0; i < total_patatas && i < total_chocos ; i++) {
        total_clientes = (int) ((total_patatas1 * patata_1_por_persona) * (total_chocos1 * chocos_1_por_persona)) ;
        total_patatas = total_patatas - patata;
        total_chocos = total_chocos - chocos;
  }
    return total_clientes;
  }
  
  static int total_clientes_a_01 = 0;
  
  /*
    static double Total_chocos;
    static int Total_patatas;
    final static double Chocos_para_3_personas = 0.5;
    final static double Patatas_para_3_personas = 1;
    static int total_patatas1 = 0;  
*/
    static int total_clientes = 0;
//                                                                8                  4
    public static int cuantos_clientes_comen_en_total(int t_patatas , int t_chocos){
//                8               8     
    int Total_patatas = t_patatas;
    int Total_patatas1 = t_patatas;
//                4            4      
    int Total_chocos = t_chocos;
//               4       0.5  = 8  ||       8 * 2 = 16 / 3 = 8                
    if (( Total_chocos / (int) 0.5 ) == (( Total_patatas * 2 ) / 3 )){
      total_clientes = Total_patatas1 * 3; 
  }  else
      System.out.println("te faltan patatas ");
    return total_clientes;
  }
  
/*  
  public static double cuantos_clientes_comen_en_total(int t_patatas ,double t_chocos){
    Total_patatas = t_patatas;
    Total_chocos = t_chocos;
    if (( Total_chocos / 0.5 ) == ( Total_patatas * 2 / 1 )){
      total_patatas1 = t_patatas;
      total_clientes = total_patatas1 * 3; 
  }else{
      System.out.println("te faltan patatas ");
    }
    return total_clientes;
  }
  */
  
  
  
/*
  public static double cuantos_clientes_comen_1(double t_patatas){
    // 330 g x 1 persona
    double patata_1_por_persona = 0.33 ;
//    total patatas entra a 
    double total_patatas_a_033 = t_patatas;
//  total patatas entra 
    double total_patatas1 = t_patatas;
    do {
        total_clientes_a_01 = (int) (total_patatas1 / 0.33);
        total_patatas_a_033 = total_patatas_a_033 - patata_1_por_persona;
      }
    while(total_patatas_a_033 > 0 && (total_patatas_a_033 % 0.33) >= 1);
    return total_clientes_a_01;
 }
*/  
  
  /* NO ME SIRVE 
  public static int cuantos_clientes_comen2(int t_patatas , int chocos){
    total_patatas = t_patatas;
    int total_patatas1 = t_patatas;
    while ( total_patatas >= 0 && total_patatas%clientes==0){
    do{
      total_patatas = total_patatas - 1;
      total_clientes = total_patatas1 / 3;
    }
  }
    return total_clientes;
  }
  */
  
  /*
  public int cuantos_comen(int patatas , int chocos){
    if (patatas == 1 && chocos == 0.5){
    double comen = 3 * patatas * chocos;
    }
    else if 
    (patatas == 0.33 && chocos == 0.16){
    }
    return comen;
  }
  
  public static void cuanto_consumen_personas(int personas){
    if (personas == 1){
      int personas_comen = (int) (( patatas * 0.33 ) * (chocos * 0.16)); 
    }else if (personas == 2){
      int personas_comen = (int) (( patatas * 0.66) *  (chocos * 0.32)); 
    }else if (personas == 3){
      int personas_comen = (int) (( patatas * 1) * (chocos * 0.5));
    }
    }
  
  
  public static void un_cliente_comen(){
    int clientes = (int) ((patatas * 0.33) * (chocos * 0.16)); 
  }
  
  public int clientes_totales(){
    return clientes;
  }
  */
  
  public static void main(String[] args) {
    
//    System.out.print("\t \n "+cuantos_clientes_comen_3(10)+" \t ");
//    System.out.print("\t \n "+cuantos_clientes_comen_3(3,3)+" \t ");
  
    System.out.println("cuantos clientes comen "+cuantos_clientes_comen_en_total(8,4));
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
}
