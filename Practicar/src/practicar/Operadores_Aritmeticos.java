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
public class Operadores_Aritmeticos {

  public static void main(String[] args) {

    //  la variable n2 va guardando el resultado
    int n1 = 2 , n2;
    n2 = n1 * n1;
    //  la variable n2 va guardando el resultado
    System.out.println(n2);
    //  la variable n2 va guardando el resultado
    n2 = n2 - n1;
    System.out.println(n2);
    //  la variable n2 va guardando el resultado
    n2 = n2 + n1 + 15;
    System.out.println(n2);
    //  la variable n2 va guardando el resultado
    n2 = n2 / n1;
    System.out.println(n2);
    //  la variable n2 va guardando el resultado
    n2 = n2 % n1;
    System.out.println(n2);
    
    int n11 = 5 ;
    int n111 = 5 ;
    int n22 = 10 ;
    int n222 = 10 ;
    int n33;
    int n333;
    System.out.println("Operadores +- el valor sera negativo");
    n33 = n11 +- n22;
    System.out.println("valor es "+n33);
    System.out.println("Operadores -+ el valor sera positivo");
    n333 = n222 -+ n111;
    System.out.println("valor es "+n333);
    
    int m = 2 , n = 5;
    boolean res;
    System.out.println("operadores logicos ");
    res = m > n && m >= n;
    System.out.println(res);
    res = !( m < n || m != n);
    System.out.println(res);
 
    System.out.println("operadores unitarios");
    System.out.println("cambia el valor de ~2 a = "+~m);
    System.out.println("cambia el valor de ~40 a = "+~40);
    System.out.printf("cambia el valor de ~-40 a = "+~-40+" -> le resta 1 \ny lo convierte en positivo \n");
    System.out.println("operaciones (~40-5) * 5) = "+(~40-5) * 5);
    System.out.println("operaciones (~-40-5) * 5) = "+(~-40-5) * 5);
    System.out.println("operaciones (~m-5) * 5 = "+(~m-5) * 5);
    
    System.out.println("------- valor de decremento e incremento ------");
    int zz = 1;
    System.out.println("--zz = "+--zz);
    int zzz = 11;
    System.out.println("--zzz = "+--zzz);
    //
    int d = 5;
    int dd = 10;
    int g1 = ++d + ++dd/2;
    System.out.println(g1);

    System.out.println("--------");
    double d1 = 10;
    double dd1 = 20;
    double g2 = d1++ + dd1++/2;
  //  g2 = d1++;
    System.out.println(" 2º operacion incremento "+d1);
  //  g2 = dd1++;
    System.out.println(" 2º operacion incremento "+dd1);
    System.out.println(g2);
    System.out.println("--------");
    double z1 = 20;
    double zz1 = 40;
    double g3 = z1++ + zz1++/2;
    System.out.println(g3);
    System.out.println("---------");
    double z11 = 20;
    double zz11 = 40;
    double g33 = zz11++/2 + z11++;
    System.out.println(g33);
    System.out.println("----------");
    int l1 = 8;
    int ll1 = 6;
    int l = l1 ^ ll1;
    System.out.println("valor de la l "+l);
    boolean h = true;
    boolean h1 = false;
    boolean hh = h1 ^ h;
    System.out.println(hh); 
    System.out.println("----------");
    int num = 20;
    num = num << 3;
    System.out.println("num "+num);
    
  }
}
