/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package razonamientos.Objetos;

/**
 *
 * @author Trabajar
 */
public class Uso_Pajaros {

  private static int numeroPajaros = 0;
  private static int nuevo = 500;
  
  private char color;
  private int edad;
  
  static void nuevo_pajaro(){
    numeroPajaros++;
  }
  // constructor basico sin argumentos
  // define un pajaro
  // cuando cree un objeto pajaro 
  // y le de a mostrar sus atributos 
  // NO ESTATICOS saldran estos valores
  // por defecto
  public Uso_Pajaros() {
    color = 'V';
    edad = 11;
    numeroPajaros++;
  }
  // constructor con argumentos para cambiar 
  // sus atributos 
  public Uso_Pajaros(char color, int edad) {
    this.color = color;
    this.edad = edad;
    nuevo_pajaro();
  }
  
  public void mostrar_pajaros(){
    System.out.println(color);
    System.out.println(edad);
  }

  public void mostrar_pajaros_con_objetos_sin_argumentos(){
    Uso_Pajaros p = new Uso_Pajaros();
    System.out.println(color);
    System.out.println(edad);
  }
  
  // Con este metodo puedo mostrar por pantalla 
  // los objeto por defecto   
  public void mostrar_pajaros_con_objetos_por_defecto(){
    Uso_Pajaros pp = new Uso_Pajaros(color,edad);
    System.out.println(color);
    System.out.println(edad);
  }
  
  // Con este metodo puedo mostrar por pantalla 
  // los objetos modificados
  public void mostrar_pajaros_con_objetos_con_modificador(){
    Uso_Pajaros ppp = new Uso_Pajaros('K',1000);
    System.out.println(color);
    System.out.println(edad);
  }

  public static void main(String[] args) {
    System.out.println("---------");
    // crea un objeto y le pone los valores por defecto
    Uso_Pajaros p = new Uso_Pajaros();
    System.out.println(p.color);
    System.out.println(p.edad);
    System.out.println("---------");
    
    // crea un objeto y le pone los valores que tiene por argumento
    Uso_Pajaros p1 = new Uso_Pajaros('z',3);
    System.out.println(p1.color);
    System.out.println(p1.edad);
    System.out.println("---------");
    p1.mostrar_pajaros();
    
    // muestra los argumentos introducidos
    System.out.println("----pajaros con objetos -----");
    p1.mostrar_pajaros_con_objetos_por_defecto();
    System.out.println("---------");
    // muestra los argumentos por defecto
    p.mostrar_pajaros_con_objetos_por_defecto();
    System.out.println("---------");

    Uso_Pajaros p3 = new Uso_Pajaros();
    // muestra los argumentos por defecto
    p3.mostrar_pajaros_con_objetos_por_defecto();
    Uso_Pajaros p4 = new Uso_Pajaros('N', 873);
    // muestra el objeto que tiene argumentos introducidos
    p4.mostrar_pajaros_con_objetos_con_modificador();
    System.out.println("---------");
    // muestra los objetos que tiene argumentos por defecto
    p3.mostrar_pajaros_con_objetos_con_modificador();
    
/*    Uso_Pajaros p2 = new Uso_Pajaros();
    p2.mostrar_pajaros_con_objetos_con_modificador();
    System.out.println("---------");
    
    Uso_Pajaros p3 = new Uso_Pajaros();
    p3.mostrar_pajaros_con_objetos_sin_argumentos();
    System.out.println("---------");
 */  
    
    
    
    
  } 
}








