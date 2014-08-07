/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejercicios_Resueltos;

/**
 *
 * @author Trabajar
 */
public class Alumno {

  String nombre;
  int nº_matricula;
  Notas Calificaciones;

  Alumno(){
    Calificaciones = new Notas();
    Calificaciones.nota1fijar1(nº_matricula);
    Calificaciones.nota1fijar2(nº_matricula);
    Calificaciones.nota1fijar3(nº_matricula);
  }

  Alumno(String nombre1 , int nº_m , double c1 , double c2 , double c3){
    Calificaciones = new Notas(c1, c2, c3);
    this.nombre = nombre1;
    this.nº_matricula = nº_m;
  }
  
  void fijar_nombre(String n){
   this.nombre = n;
  }
  
  void fijar_nº_matricula(int n_m){
    this.nº_matricula = n_m;
  }
  
  void fijar_calificacion(int cn1 , int cn2 , int cn3 ){
   Calificaciones = new Notas(cn1, cn2, cn3);
  }
  
  String nombre(){
    return nombre;
  }
  
  int nº_matricula(){
    return nº_matricula;
  }
  
  double calificaciones1(){
    double n1 = Calificaciones.nota1();
    return n1;
  }
  
  double calificaciones2(){
    double n2 =Calificaciones.nota2();
    return n2;
  }
  
  double calificaciones3(){
    double n3 =Calificaciones.nota3();
    return n3;
  }
  
  public static void main(String[] args) {

    Alumno a1 = new Alumno();
    a1.nombre = "Evaristo";
    a1.nº_matricula = 733;
    a1.Calificaciones.nota1fijar1(8);
    a1.Calificaciones.nota1fijar2(8.6);
    a1.Calificaciones.nota1fijar3(7.55);
    
    System.out.println("-------nombre-------");
    System.out.println(a1.nombre());
    System.out.println("-------matricula----");
    System.out.println(a1.nº_matricula());
    System.out.println("-----------");
    System.out.println(a1.calificaciones1());
    System.out.println(a1.calificaciones2());
    System.out.println(a1.calificaciones3());
    System.out.println("------ media notas -----");
    System.out.println(a1.Calificaciones.nota_media());
    System.out.println("-----------");

    Alumno a2 = new Alumno("Maria", 525, 9, 5.4, 7.44);
    System.out.println("--nombre-------");
    System.out.println(a2.nombre());
    System.out.println("--matricula----");
    System.out.println(a2.nº_matricula());
    System.out.println("--Calificaciones--");
    System.out.println(a2.calificaciones1());
    System.out.println(a2.calificaciones2());
    System.out.println(a2.calificaciones3());
    System.out.println("--media notas -----");
    System.out.println(a2.Calificaciones.nota_media());
    System.out.println("-----------");
    
    
    
  }
}
