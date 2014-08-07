/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package t3_Ejercicios;

/**
 *
 * @author Trabajar
 */
public class Hotel1 {
 
  public static void main(String[] args) {
    Habitacion llaveHab1;
    Habitacion llaveHab2;
    
    llaveHab1 = new Habitacion(222);
    llaveHab2 = new Habitacion(1144,3);

    llaveHab1.printData();
    llaveHab2.printData();
    
    Habitacion llaveHab3;
    Habitacion llaveHab4;
    
    llaveHab3 = llaveHab1;
    llaveHab4 = llaveHab2;
    
    llaveHab1.printData();
    llaveHab2.printData();
    llaveHab3.printData();
    llaveHab4.printData();
    
    llaveHab3 = llaveHab2;
    
    llaveHab1.printData();
    llaveHab2.printData();
    llaveHab3.printData();
    llaveHab4.printData();
    
    llaveHab2.camas(2);
    
    llaveHab1.printData();
    llaveHab2.printData();
    llaveHab3.printData();
    llaveHab4.printData();
    
    

  
  
  }
}
 











