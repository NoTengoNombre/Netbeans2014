/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejercicio_Resuelto_Paco_Notas;

/**
 *
 * @author Trabajar
 */
public class Alumno {

  String nombre;
  int edad;
  int matricula;
  Notas calificaciones;
  
  Alumno(){
    // carga por defecto una referencia con las calificaciones a 0
    this.nombre = "desconocido";
    this.edad = 0;
    this.matricula = 0;
    // es mejor ponerlo asi para poder editar un alumno por defecto
    this.calificaciones = new Notas(0, 0, 0);
    // si pones esta referencia nos dara error porque no tiene notas asignadas
  //  this.calificaciones = calificaciones;
  }
  
  Alumno(String nombre1 , int edad1 , int matricula1 , Notas calificaciones){
    nombre = nombre1;
    edad = edad1;
    matricula = matricula1;
    this.calificaciones = calificaciones;
  }
  
  void set_Nombre(String nom ){
    nombre = nom;
  }
  
  void set_Edad(int edad1){
    edad = edad1;
  }

  void set_matricula(int matricula1){
    matricula = matricula1;
  }
 
  void set_calificaciones( Notas calificaciones1){
    this.calificaciones = calificaciones1;
  }
  
  String get_Nombre(){
    return nombre;
  }
    
 int get_matricula(){
   return matricula;
 }

  int get_edad(){
    return edad;
  }

  // con este metodo de Clase puedo invocar 
  // una REFERENCIA que utilice los metodos de la CLASE
  // puedo añadirle mas metodos de la misma clase , formando una cadena.
  Notas get_calificaciones(){
    return calificaciones;
  }
  
  String get_calificaciones_cadena_gets(){
    return "notas 1 : "+calificaciones.get_n1()+" notas 2 : "+calificaciones.get_n2()+" notas 3 : "+calificaciones.get_n3();
  }
  
  String get_todos_datos(){
    return "\n nombre "+ this.nombre +"\n matricula "+ matricula +"\n edad "+ edad +"\n calificaciones 1 "+calificaciones.get_n1()+"\n calificaciones 2 "+calificaciones.get_n2()+"\n calificaciones 3 "+calificaciones.get_n3();
  }

  
}
  