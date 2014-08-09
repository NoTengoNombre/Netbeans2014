/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicar;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Trabajar
 */
public class ScanConsoleApp {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    try{
      System.out.printf("Input int(e.g %4d):",3501);
      int int_val = sc.nextInt();
      System.out.println("You entered "+int_val+ "\n");
      
      System.out.printf("Input float (e.g %5.2f):",2.43);
      float float_val = sc.nextFloat();
      System.out.println("You entered "+float_val+"\n");
      
      System.out.printf("Input double (e.g %6.3e):",4.943e15);
      double double_val = sc.nextDouble();
      System.out.println("You entered "+double_val+"\n");
    }catch(InputMismatchException e){
      System.out.println("MismatchException : "+e);
    }
  }
}
