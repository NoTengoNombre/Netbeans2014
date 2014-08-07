/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package t3_Ejercicios;


public class Habitacion {
    private int numHabitacion;
    private int numCamas;

    // Constructor basico, inicializa todos los datos miembros
    public Habitacion() {
        habitacion( 0 );
        camas( 2 );
        }

    // Constructor de conveniencia, inicializa la habitacion con
    // un numero determinado
    public Habitacion( int numeroHab ) {
        habitacion( numeroHab );
        camas( 2 );
        }

    // Constructor de conveniencia, inicializa la habitacion con
    // un numero determinado y con una cantidad de camas dada
    public Habitacion( int numeroHab , int camas ) {
        habitacion( numeroHab );
        camas( camas );
        }

    // Este metodo devuelve el numero de la habitacion
    public synchronized int habitacion() {
        return( numHabitacion );
        }

    // Este metodo le asigna a la habitacion un numero
    public synchronized void habitacion( int numeroHab ) {
        numHabitacion = numeroHab;
        }

    // Este metodo devuelve el numero de camas de una habitacion
    public synchronized int camas() {
        return( numCamas );
        }

    // Este metodo asigna un numero de camas determinado a una habitacion
    public synchronized void camas( int camas ) {
        numCamas = camas;
        }

    // Este metodo imprime los datos de una habitacion, numero y camas
    public synchronized void printData() {
        System.out.println( "Habitacion #"+numHabitacion+": "+
            numCamas+" camas" );
        }
    }
 