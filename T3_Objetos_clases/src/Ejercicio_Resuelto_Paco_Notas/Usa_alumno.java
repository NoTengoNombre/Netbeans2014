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
public class Usa_alumno {

  public static void main(String[] args) {
    
    Notas notas1 = new Notas(8f, 8.6f, 7.55f);
    Alumno alumno1 = new Alumno();
    alumno1.set_Nombre("Evaristo");
    alumno1.set_Edad(14);
    alumno1.set_matricula(733);
    alumno1.set_calificaciones(notas1);
    System.out.println("1º trimestre");
    alumno1.get_calificaciones();
    System.out.println(alumno1.get_todos_datos());
    
    System.out.printf("media 1º trimestre %,.2f \n",alumno1.calificaciones.nota_media());
    
    alumno1.calificaciones.set(5, 4, 2);
    System.out.println("\n 2º trimestre");
    alumno1.get_calificaciones();
    System.out.println(alumno1.get_todos_datos());

    System.out.printf("media 2º trimestre %,.2f \n",alumno1.calificaciones.nota_media());


    alumno1.calificaciones.set(6, 5, 7);
    System.out.println("\n 3º trimestre");
    alumno1.get_calificaciones();
    System.out.println(alumno1.get_todos_datos());

        System.out.println("media 3º trimestre "+alumno1.calificaciones.nota_media());

        Alumno alumno2 = new Alumno();
        System.out.println(alumno2.get_todos_datos());
        alumno2.set_Nombre("Maria");
        alumno2.set_Edad(14);
        alumno2.set_matricula(552);
        alumno2.calificaciones.set(9f,5.4f,7.4f);
        System.out.println("\n Nuevo alumno ");
        System.out.println(" nombre : "+alumno2.get_Nombre());
        System.out.println(" edad : "+alumno2.get_edad());
        System.out.println(" nota 1 : "+alumno2.calificaciones.get_n1());
        System.out.println(" nota 2 : "+alumno2.calificaciones.get_n2());
        System.out.println(" nota 3 : "+alumno2.calificaciones.get_n3());
// esta forma tambien funciona para ver
// los datos de la matricula " BASICO " 
// System.out.println(alumno2.matricula);
        System.out.println("matricula "+alumno2.get_matricula());
        System.out.println(alumno2.get_calificaciones_cadena_gets());
        System.out.printf("nota media es %,.2f ",alumno2.calificaciones.nota_media());
  
  }
}
