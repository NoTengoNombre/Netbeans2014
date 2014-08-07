/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entrada_Salida_Teclado;

/**
 *
 * @author Trabajar
 */
public class Enumerado2 {

  public enum mes {
    enero,febrero,marzo,
    abril,mayo,junio,julio,
    agosto,
    septiembre,octubre,noviembre,diciembre
  }
  
  public enum letras 
  {
    a , b , c , d , e , f , g 
    , h , i , j , k , l , m , n 
    , o , p , q , r , s , t , 
    u , v , w , x , y , z 
  }
  
  
  public static void main(String[] args) {
    mes m = mes.abril;
    System.out.println("mes es "+m);
    
    String meshoy="abril";
    m = mes.valueOf(meshoy);
    System.out.println("valor variable m es "+m);
    
    letras l = letras.a;
    System.out.println("letra es "+l);
    
    String letra1 = "a";
    l = letras.valueOf(letra1);
    System.out.println("valor variable l es "+l);
    
    
  }
}
