/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Practica;

import java.util.Scanner;

/**
 *
 * @author Trabajar
 */
public class Empresa1 {

  Empleado enlace1;
  Empleado e;
  
  
  public Empresa1(String nombre ,String apellidos,String cargo,int nif, int sueldo) {
      e = new Empleado(nombre,apellidos,cargo,nif,sueldo);
      Scanner sc = new Scanner(System.in);
    System.out.println("nombre ");
      e.nombre = sc.nextLine();
    System.out.println("apellidos ");
      e.apellidos = sc.nextLine();
    System.out.println("cargo ");
      e.cargo = sc.nextLine();
    System.out.println("nif ");
      e.nif = sc.nextInt();
    System.out.println("sueldo ");
      e.sueldo = sc.nextInt();
  }
  
  String ver_nombre(){
    System.out.println("metodo devolver nombre ");
   return e.get_nombre();
  }

  public static void main(String[] args) {

   Empresa1 emp1 = new Empresa1(null, null, null,0,0);
    System.out.println(emp1.ver_nombre());
    
  }
}
