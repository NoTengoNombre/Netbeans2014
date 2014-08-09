/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicar.Bucles_for;

/**
 *
 * @author Trabajar
 */
public class Ordenar_num {
  
  
  public static void main(String[] args) {

    int n1 = 1;
    int n2 = 2;
    int n3 = 3;
    int n4 = 4;

//if (n1 < n2 && n1 < n3 && n1 < n4 || n2 < n1 && n2 < n3 && n2 < n4 || n3 < n1 && n3 < n2 && n3 < n4 || n4 < n1 && n4 < n2 && n4 < n3 ) {
//}
    
    if (n1 <= n2){
      if (n1 <= n3) {
        if (n1 <= n4) {
           System.out.println(n1);
        }
          if (n2 <= n1) {
            if (n2 <= n3) {
              if (n2 <= n4) {
                System.out.println(n2);
              }
              if (n3 <= n1) {
                if (n3 <= n2) {
                  if (n3 <= n4) {
                    System.out.println(n3);
                  }
                  if (n4 <= n1) {
                    if (n4 <= n2) {
                      if (n4 <= n3) {
                    System.out.println(n4);
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
        

    
    
    
    
    
    
    
    
    
    
    
    
    
    
