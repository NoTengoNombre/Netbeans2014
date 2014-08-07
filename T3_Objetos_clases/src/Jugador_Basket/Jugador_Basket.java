/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jugador_Basket;

/**
 *
 * @author Trabajar
 */
public class Jugador_Basket {

  String nombre;
  String puesto;
  String dorsal;
  int puntos;

  public Jugador_Basket() {
    this.nombre = "sin nombre";
    this.puesto = "sin puesto";
    this.dorsal = "sin dorsal";
    this.puntos = 0;
  }

  public Jugador_Basket(String nombre, String puesto, String dorsal, int puntos) {
    this.nombre = nombre;
    this.puesto = puesto;
    this.dorsal = dorsal;
    this.puntos = puntos;
  }

  public String DatosJugador() {
    String mensaje
            = "\n nombre : \t" + nombre
            + "\n puesto : \t" + puesto
            + "\n dorsal : \t" + dorsal
            + "\n puntos : \t" + puntos;
    return mensaje;
  }

  public void SumaPuntos(int sp) {
   this.puntos = puntos + sp;
  }

  void set_nombre(String nombre) {
    this.nombre = nombre;
  }

  void set_dorsal(String dorsal) {
    this.dorsal = dorsal;
  }

  void set_puesto(String puesto) {
    this.puesto = puesto;
  }

  void set_puntos(int puntos) {
    this.puntos = puntos;
  }

  String get_nombre() {
    return nombre;
  }

  String get_dorsal() {
    return dorsal;
  }

  String get_puesto() {
    return puesto;
  }

  int get_puntos() {
    return puntos;
  }

  public static void main(String[] args) {

    Jugador_Basket j1 = new Jugador_Basket("desconocido", "desconocido", "desconocido", 0);
    Jugador_Basket j2 = new Jugador_Basket("desconocido", "desconocido", "desconocido", 0);
    Jugador_Basket j3 = new Jugador_Basket("desconocido", "desconocido", "desconocido", 0);
    
    System.out.println(j1.DatosJugador());
    System.out.println(j2.DatosJugador());
    System.out.println(j3.DatosJugador());
    
    j1.set_nombre("Pau Gasol");
    j2.set_nombre("Antonio Corbalan");
    j3.set_nombre("Michael Jordan");
    
    j1.set_dorsal("1");
    j2.set_dorsal("2");
    j3.set_dorsal("3");
    
    j1.set_puesto("base"); 
    j2.set_puesto("pivot");
    j3.set_puesto("escolta");
    
    j1.set_puntos(340);
    j2.set_puntos(133);
    j3.set_puntos(50);

    System.out.println("");
    System.out.println("\t----------------- ");
    System.out.println("\t TODOS LOS DATOS ");
    System.out.println("\t----------------- ");
    
    System.out.println(j1.DatosJugador());
    System.out.println(j2.DatosJugador());
    System.out.println(j3.DatosJugador());
    
    Jugador_Basket j11 = new Jugador_Basket();
    j11.DatosJugador();

  }
}
