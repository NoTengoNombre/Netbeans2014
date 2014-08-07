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
public class Empresa {
  String nombre;
  Empleado [] listaEmpleados;
  int totalEmpleados = 0;

//  public Empresa(String nombre) {
//    this.nombre = nombre;
//  }
  
  Empresa(String n , int maxEmp){
    nombre = n;
  listaEmpleados = new Empleado[maxEmp];
  }

  public void nuevoEmpleado(String nombre , int sueldo)
          throws CapacidadEmpresaExcedida{
  if (totalEmpleados < listaEmpleados.length)
    {
    listaEmpleados[totalEmpleados++] = new Empleado(nombre,sueldo);
    }
  else throw new CapacidadEmpresaExcedida(nombre);
  }

  /*
  public static void main(String[] args)
          throws CapacidadEmpresaExcedida{
    Empresa em = new Empresa("la mundial");
    try { 
      em.nuevoEmpleado("adan primero", 500);
    } 
    catch(CapacidadEmpresaExcedida exc){
      System.out.println(exc.toString());
      System.exit(1);
    }
  }
  */
}
