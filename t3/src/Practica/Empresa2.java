/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Practica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Empresa2 {
  
  // Referencias con objetos
  Empleado e1;

  // sin argumentos
  public Empresa2(){
    System.out.println("constr sin argumentos");
    Scanner sc = new Scanner(System.in);
    System.out.println("nombre ");
    String nom = sc.next();
    System.out.println("apellidos ");
    String ape = sc.next();
    System.out.println("cargo ");
    String carg = sc.next();
    
    
    System.out.println("nif ");
    int nif = sc.nextInt();
    
    
    System.out.println("sueldos ");
    int sue = sc.nextInt();
    
    
    System.out.println(" ");
    e1 = new Empleado(nom, ape, carg, nif, sue);
    System.out.println(" ");
  }

  // con objetos
  public Empresa2(Empleado e1) {
    Scanner sc = new Scanner(System.in);
    System.out.println("nombre ");
    String nom = sc.next();
    System.out.println("apellidos ");
    String ape = sc.next();
    System.out.println("cargo ");
    String carg = sc.next();
    
    
    System.out.println("nif ");
    int nif = sc.nextInt();
    
    
    System.out.println("sueldos ");
    int sue = sc.nextInt();
    
    this.e1 = e1 = new Empleado(nom, ape, carg, nif, sue);
  }

  // con argumentos referenciando usando REFERENCIA e1 de empleados
  public Empresa2(String nom , String ape , String carg , int nif , int sue) {
    Scanner sc = new Scanner(System.in);
    BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    
    System.out.println("nombre ");
    try{
    nom = new String(entrada.readLine());
    }
    catch(IOException e){
      System.err.println("Error de lectura "+e);
      System.exit(1);
    }
  
    System.out.println("apellidos ");
    try{
    ape = new String(entrada.readLine());
    }catch(Exception e){
      System.err.println("Error de lectura "+e);
      e.printStackTrace();
      System.exit(1);
    }

    System.out.println("cargo ");
    try{
    carg = new String(entrada.readLine());
    }catch(IOException e){
      System.out.println("Error de lectura ");
    }
    
    System.out.println("nif ");
    boolean error = false;
    do{
    try{
      error = false;
    nif = Integer.valueOf(entrada.readLine()).intValue();
   }catch(NumberFormatException e1){
     error = true;
     System.out.println("Error el formato ");
    }catch(IOException e){
            System.out.println("Error de E/S");}
            }
    while(error);
  
    System.out.println("sueldos ");
    boolean error1 = false;
    do{
    try{
      error1 = false;
    sue = Integer.valueOf(entrada.readLine()).intValue();
   }catch(NumberFormatException e1){
     error1 = true;
     System.out.println("Error el formato ");
    }catch(IOException e){
            System.out.println("Error de E/S");}
            }
    while(error1);
    
    e1 = new Empleado(nom, ape,carg,nif,sue);
    }
  
  public static void main(String[] args) {
    System.out.println("constr con todo cargado");
    Empresa2 emp1 = new Empresa2();
    emp1.e1.sube_sueldos(100);
    emp1.e1.datos_empleado();

    System.out.println(" const Empresa2 con argumentos referencia Empleado "); 
    Empleado em1 = new Empleado();
    Empresa2 emp2 = new Empresa2(em1);
    emp2.e1.sube_sueldos(200);
    emp2.e1.datos_empleado();
    
    System.out.println(" constr Empresa2 con argumentos por defecto "); 
    Empresa2 emp3 = new Empresa2("","","",0,0);
    emp3.e1.sube_sueldos(300);
    emp3.e1.datos_empleado();
    Empleado.get_total_sueldo();
    Empleado.gastos_sueldos();
  }
}
