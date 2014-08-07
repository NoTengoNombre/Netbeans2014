/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package miPackage;

/**
 *
 * @author Trabajar
 */
public class Empleado {
  
  String nombre;
  int edad;
  int sueldo;
  boolean trabaja;
  static int n_empleado;

  public Empleado(String nombre1 , int edad1) {
    nombre = nombre1;
    edad = edad1;
    this.n_empleado++;
  }
  
  public Empleado(String nombre, int edad, int sueldo, boolean trabaja) {
    this.nombre = nombre;
    this.edad = edad;
    this.sueldo = sueldo;
    this.trabaja = trabaja;
    this.n_empleado++;
  }
  
  public static void main(String[] args) {

    Empleado e1 = new Empleado("pepe", 30, 1000, true);
    Empleado e2 = new Empleado("anto", 40, 2000, true);
    Empleado e3 = new Empleado("juan", 50, 3000, false);
    
    Empleado [] Empleado = new Empleado [3];
      Empleado[0] = e1;
      Empleado[1] = e2;
      Empleado[2] = e3;
      
      for (int i = 0; i < Empleado.length; i++) {
        System.out.println(
                Empleado[i].nombre+" "
               +Empleado[i].edad+" "
               +Empleado[i].sueldo+" "
               +Empleado[i].trabaja+" "
               +"numero empleados "+n_empleado);
      }
    }
  }
