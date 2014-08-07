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
public class Empresa {

    Empleado enlace;
    Empleado e;

    Empresa(){
      Scanner sc = new Scanner(System.in);
      String nombre = sc.nextLine();
      this.enlace.nombre = nombre ;
    }
    
    /*
      Empresa(String nombre,String apellido,String cargo,int nif,int sueldo){
    Empleado n1 = new Empleado(nombre,apellido,cargo,nif,sueldo);
    n1.nombre = nombre;
    n1.apellidos = apellido;
    n1.cargo = cargo;
    n1.nif = nif;
    n1.sueldo = sueldo;
    n1.datos_empleado();
    }
    */

  /* Forma Incorrecta 
    el objeto de la otra clase Empleado 
  tiene que ponerse a la izquierda 
  NO A LA DERECHA PARA QUE FUNCIONE
  Empresa(String nombre,String apellido,String cargo,int nif,int sueldo){
    Empleado n1 = new Empleado(nombre,apellido,cargo,nif,sueldo);
    nombre = n1.nombre;
    apellido = n1.apellidos;
    cargo = n1.cargo;
    nif = n1.nif;
    sueldo = n1.sueldo;
    }
  */
/*
  public Empresa(){
    Empleado e00;
    Empleado e01;
    Empleado e1;
    Empleado e2;
    Empleado e3;

    e1 = new Empleado("Pep", "Serrat", "empleado",1111,1000);
    e2 = new Empleado(" Ana ","Rew","secretaria",2222,1200);
    e3 = new Empleado("Are", "Jeg", "jefe",3333,2000);

    e00 = new Empleado("Anto", "Edew", "empleado 2", 4444, 1200);
    e01 = new Empleado("Efed", "kera", "empleado 3", 5555, 1250);
  
    e1.datos_empleado();
    e2.datos_empleado();
    e3.datos_empleado();
    
    System.out.println("");
    System.out.println("sin aumento");
    e00.datos_empleado();
    e01.datos_empleado();
    System.out.println("");
    
    System.out.println("-----gastos de sueldo------");
    Empleado.gastos_sueldos();
    System.out.println("---- incremento de sueldos ---- ");
    e00.sube_sueldos(150);
    e01.sube_sueldos(250); 
    System.out.println("---- mostrar datos empleados con aumento de sueldo ----");
    e00.datos_empleado();
    e01.datos_empleado();
    Empleado.gastos_sueldos();
  }
    */
  
  void cambiar_datos(){
    Scanner sc = new Scanner(System.in);
    Empleado n = new Empleado();
    String nombre = sc.nextLine();
    String apellido = sc.nextLine();
    String cargo = sc.nextLine();
    int nif = sc.nextInt();
    int sueldo = sc.nextInt();
    System.out.println("cambiar datos ");
    n.set_nombre(nombre);
    n.set_apellidos(apellido);
    n.set_cargo(cargo);
    n.set_nif(nif);
    n.set_sueldo(sueldo);
    /*
    System.out.println("datos cambiados ");
    System.out.println("nombre "+n.get_nombre());
    System.out.println("apellidos "+n.get_apellidos());
    System.out.println("cargo "+n.get_cargo());
    System.out.println("nif "+n.get_nif());
    System.out.println("sueldo "+n.get_sueldo());
    */
  }

  /*
  void cambiar_datos2(String no , String ap , String ca , int ni , int su){
    Empleado n = new Emplea  do();
    System.out.println("cambiar datos ");
    n.set_nombre(no);
    n.set_apellidos(ap);
    n.set_cargo(ca);
    n.set_nif(ni);
    n.set_sueldo(su);
  }
  */
  
  String ver_datos_empresa(){
    Empleado n = new Empleado();
    return n.get_nombre();
  }
  
    String datos_cambiado_empresa(){
      Empleado n = new Empleado("", "", "", 1, 1);
    System.out.println("datos cambiados ");
    System.out.println("nombre "+n.get_nombre());
    System.out.println("apellidos "+n.get_apellidos());
    System.out.println("cargo "+n.get_cargo());
    System.out.println("nif "+n.get_nif());
    System.out.println("sueldo "+n.get_sueldo());
      return n.get_nombre()+n.get_apellidos()+n.get_cargo()+n.get_nif()+n.get_sueldo();
  }

  public static void main(String[] args) {

    System.out.println("----------- PRUEBA ------------");

    Scanner sc = new Scanner(System.in);
    String nombre = sc.nextLine();
    String apellido = sc.nextLine();
    String cargo = sc.nextLine();
    int nif = sc.nextInt();
    int sueldo = sc.nextInt();

    /*
    Empresa p1 = new Empresa(nombre,apellido,cargo,nif,sueldo);

    p1.datos_cambiado_empresa();
    System.out.println("ver cambio ");
    System.out.println(p1.ver_datos_empresa());
    */
  }
}
