/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase_frame;

/**
 *
 * @author Trabajar
 */

import java.lang.*;
import java.awt.*;
import java.awt.event.*;


public class Clase_Frame {

  /**
   * @param args the command line arguments
   */
  
  
  static Frame ventana = new Frame();
  
  public static void main(String[] args) {

    ventana.setTitle("mi programa");
    ventana.setBackground(java.awt.Color.DARK_GRAY);
    ventana.setSize(200,250);
    ventana.setVisible(true);
    
    ventana.addWindowListener(new WindowAdapter(){
      public void windowClosing(WindowEvent e){System.exit(0);}});
  }
}







