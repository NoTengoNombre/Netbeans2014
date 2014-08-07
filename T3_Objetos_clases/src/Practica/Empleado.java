/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Practica;

/**
 *
 * @author Trabajar
 */
public class Empleado {
  
  String nombre;
  String apellidos;
  String cargo;
  
  int nif;
  int sueldo;
 
  static int total_sueldos;

  public Empleado(String nombre, String apellidos, String cargo, int nif, int sueldo) {
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.cargo = cargo;
    this.nif = nif;
    this.sueldo = sueldo;
    Empleado.total_sueldos += this.sueldo;
  }

  public Empleado(){
    this.nombre = "sin nombre";
    this.apellidos = "sin apellidos";
    this.cargo = "sin cargo";
    this.nif = 0;
    this.sueldo = 0;
    Empleado.total_sueldos += sueldo;
  }

  void set_modificar_datos(String nombre, String apellidos, String cargo, int nif, int sueldo){
   this.nombre = nombre;
   this.apellidos = apellidos;
   this.cargo = cargo;
   this.nif = nif;
   this.sueldo = sueldo;
  }
  
  void datos_empleado(){
    System.out.print(
    "\nnombre "+nombre+
    "\napellidos "+apellidos+
    "\ncargo "+cargo+
    "\nnif "+nif+
    "\nsueldo "+sueldo+"\n");
  }
  
  void set_nombre(String nombre){
    this.nombre = nombre;
  }
  
  void set_apellidos(String apellidos){
    this.apellidos = apellidos;
  }
  
  void set_cargo(String cargo){
    this.cargo = cargo;
  }
  
  void set_nif(int nif){
    this.nif = nif;
  }
  
  void set_sueldo(int sueldo){
    this.sueldo = sueldo;
  }
  
  static void set_total_sueldos(int total){
    total_sueldos = total;
  }
  
  String get_nombre(){
    return nombre;
  }
  
  String get_apellidos(){
    return apellidos;
  }
  
  String get_cargo(){
    return cargo;
  }
  
  int get_nif(){
    return nif;
  }
  
  int get_sueldo(){
    return sueldo;
  }
  // de clase devuelve total sueldos
  static int get_total_sueldo(){
    return total_sueldos;
  }
  // instancia devuelve todos los atributos miembro
  String get_todos_los_datos(){
    return "\n nombre "
            +nombre+"\n apellidos "
            +apellidos+"\n cargo "
            +cargo+"\n sueldo "
            +sueldo+"\n nif "
            +nif+"\n";
  }
  // de clase muestra todos los sueldos 
  static void gastos_sueldos(){
    System.out.println("total sueldos = "+total_sueldos);
  }
  
  // instancia 
  // E: entero sueldo desde teclado
  // S: sueldo aumentado 
  //    suma total de sueldos
  int sube_sueldos( int sueldo ){
    Empleado.total_sueldos += sueldo;
    System.out.println("sueldo aumentado a "+sueldo);
    System.out.println("suma total de sueldos "+(Empleado.total_sueldos));
    // otra forma de mostrarlo
    // System.out.println("suma total de sueldos!!! "+(Empleado.get_total_sueldo()));
    return this.sueldo;
  }

  public static void main(String[] args) {

    Empleado e1 = new Empleado("Pep", "Serrat", "empleado",1111,1000);
    Empleado e2 = new Empleado(" Ana ","Rew","secretaria",2222,1000);
    Empleado e3 = new Empleado("Are", "Jeg", "jefe",3333,1000);

    e1.datos_empleado();
    System.out.println("-----------");
    e2.datos_empleado();
    System.out.println("-----------");
    e3.datos_empleado();
    System.out.println("-----------");
  
    System.out.println("");
    gastos_sueldos();
    System.out.println("");
    e1.sube_sueldos(100);
    e2.sube_sueldos(150);
    e3.sube_sueldos(200);

    System.out.println("-----------");
    e1.datos_empleado();
    System.out.println("-----------");
    e2.datos_empleado();
    System.out.println("-----------");
    e3.datos_empleado();
    System.out.println("-----------");
    
    System.out.print("metodo get ver todos los datos ");
    System.out.println(e3.get_todos_los_datos());
     gastos_sueldos();
  }
}
