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
public class Restaurante2 {

    static int total_clientes = 0;
//                                                                8                  4
    public static int cuantos_clientes_comen_en_total(int t_patatas , int t_chocos){
//                8               8     
    int Total_patatas = t_patatas;
    int Total_patatas1 = t_patatas;
//                4            4      
    int Total_chocos = t_chocos;
//               4       0.5  = 8  ||       8 * 1 = 8                
//               4       0.5  = 8  ||       8 * 1 = 8 / 1 = 5               
//    if (( Total_chocos / 0.5 ) == (( Total_patatas * 2 ) / 3 )){
// Solucion   if (( Total_chocos / 0.5  ) == ( Total_patatas * 1 )){
//             4             ==       8  / 2 = 4     y        8         * 1 = 8 == 4 * 2 = 8   
    if (( Total_chocos / 0.5 == Total_patatas / 2 )  &&  (Total_patatas * 1 == Total_chocos)){
      total_clientes = Total_patatas1 * 3; 
  }  else
      System.out.println("te faltan patatas ");
      System.out.println("clientes que comen "+total_clientes);
    return total_clientes;
  }
    
    static int total_clientes_que_comen;
    
    public static int cuantos_clientes_comen_en_total_con2(int t_patatas , int t_chocos){
    int Total_patatas = t_patatas;
    int Total_patatas1 = t_patatas;
    int Total_patatas2 = t_patatas;
    int Total_patatas3 = t_patatas;

    int Total_chocos = t_chocos;
    int Total_chocos1 = t_chocos;
    int total_clientes1 = 0;
    
    if ( Total_chocos / 0.5 == Total_patatas ){
      total_clientes1 = Total_patatas2 * 3; 
    } else 
        System.out.println("te falta patatas ");
    if  (Total_patatas1 * 1 == Total_chocos1 / 0.5 ){
      total_clientes = Total_patatas3 * 3;}
      else
      System.out.println("te faltan chocos ");
    total_clientes_que_comen = (total_clientes + total_clientes1) / 2 ;
    return total_clientes_que_comen;
  }
    
    public static int cuantos_clientes_comen_en_total_con3(int t_patatas , int t_chocos){
    int Total_patatas = t_patatas;
    int Total_patatas1 = t_patatas;
    int Total_patatas2 = t_patatas;
    int Total_patatas3 = t_patatas;

    int Total_chocos = t_chocos;
    int Total_chocos1 = t_chocos;
    int total_clientes1 = 0;
    
//                  4 / 0.5 == 8
    if ( Total_chocos / 0.5 == Total_patatas ){
//                  8 * 1 ==   8 
    if  (Total_patatas1 == Total_chocos1 / 0.5 ){
      total_clientes1 = Total_patatas2 * 3; 
    } else 
        System.out.println("te falta patatas ");
    }else
      System.out.println("te faltan chocos ");
    return total_clientes1;
  }
    
    public static int cuantos_clientes_comen_en_total_con4(int t_chocos , int t_patatas){
      if (( t_chocos / 0.5) ==  t_patatas )
        if ( t_patatas / 2 == t_chocos )
      total_clientes = t_patatas * 3; 
     else 
        System.out.println("te falta patatas ");
    else
      System.out.println("te faltan chocos ");
    return total_clientes;
  }
    
    
    public static int cuantos_clientes_comen_en_total_con5(int t_chocos , int t_patatas){
      int t_patatas1 = t_patatas;
      int t_chocos1 = t_chocos;
      
      int cal_patata = (int) (t_patatas % 0.5) ;
      int cal_chocos = t_chocos % 1;
      
      if ( t_chocos ==  cal_patata )
      if ( t_patatas % 2 == cal_chocos )
      total_clientes = t_patatas * 3; 
     else 
      System.out.println("te faltan chocos ");
    else
        System.out.println("te falta patatas ");
    return total_clientes;
  }
    
    public static int cuantos_clientes_comen_en_total_con6(int t_chocos , int t_patatas){
      int t_patatas1 = t_patatas;
      int t_patatas2 = t_patatas;
      int t_chocos1 = t_chocos;
      int t_chocos2 = t_chocos;
      
      if ( t_chocos * 2  !=  t_patatas1 )
      System.out.println("te faltan chocos ");
     else 
      total_clientes = t_patatas * 3; 
      if ( t_patatas / 2 != t_chocos1 )
        System.out.println("te falta patatas ");
    else
      total_clientes = t_patatas * 3; 
    return total_clientes;
  }
    
    public static int cuantos_clientes_comen_en_total_con7(int t_chocos , int t_patatas){
      int t_patatas1 = t_patatas;
      int t_patatas2 = t_patatas;
      int t_chocos1 = t_chocos;
      int t_chocos2 = t_chocos;
      
      if ( t_chocos * 2  ==  t_patatas1 && t_chocos >= t_patatas1 / 2)
      System.out.println("te faltan chocos ");
     else 
      total_clientes = t_patatas * 3; 
      if ( t_patatas == t_chocos1 * 2 && t_patatas <= (t_chocos2 * 2))
        System.out.println("te falta patatas ");
    else
      total_clientes = t_patatas * 3; 
    return total_clientes;
  }
    public static int cuantos_clientes_comen_en_total_con8(int t_chocos , int t_patatas){
      // me falta 2 interruptores 
//     para controlar los cambios 
      int t_patatas1 = t_patatas;
      int t_patatas2 = t_patatas;
      int t_chocos1 = t_chocos;
      int t_chocos2 = t_chocos;
      
      if ( t_chocos2 * 2  ==  t_patatas1 || t_chocos2 > t_patatas1  && t_patatas1 / 0.5 == t_chocos2)
      total_clientes = t_patatas * 3; 
      else 
        System.out.println("te falta patatas ");
        if ( t_patatas2 == t_chocos1 * 2  || t_patatas2 >= (t_chocos2) && t_patatas2 / 2 == t_chocos1)
      total_clientes = t_patatas2 * 3; 
     else 
        System.out.println("te falta chocos ");
    return total_clientes;
  }
    
    static int total_patatas = 8;
    static int total_chocos = 4;
    
      public static int cuantos_comen(){
      System.out.println("clientes que comen "+total_clientes);
      return total_clientes;
    }
    public static int cuantos_clientes_comen_en_total_con9(int t_chocos , int t_patatas){
           if ( t_patatas  == t_chocos || t_patatas >= t_chocos * 2 )
        if (t_chocos  < t_patatas  && t_chocos * 2 >= t_patatas )
        total_clientes = t_patatas * 3;
        else
        System.out.println(" faltas chocos");
        else
        System.out.println(" faltas patatas");
      return total_clientes;
        }
        /*
        do{ 
          total_patatas = total_patatas - t_patatas;
          total_chocos = total_chocos - t_chocos;
      }
      while(total_patatas >= 1 && total_chocos >= 0.5);
     */
    public static void main(String[] args) {

      cuantos_clientes_comen_en_total_con9(1,2);
      cuantos_comen();
      
  }
}
