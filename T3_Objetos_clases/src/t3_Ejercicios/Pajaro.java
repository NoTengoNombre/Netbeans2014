/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package t3_Ejercicios;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.System;
import java.util.*;
/**
 * @author Trabajar
 */
public class Pajaro {

  private char color;
  private int edad;
  private boolean domestico;
  private static int num_pajaros;
    
  
  public Pajaro() {
  num_pajaro();
  }
  
  public Pajaro(char color, int edad, boolean domestico) {
    this.color = color;
    this.edad = edad;
    this.domestico = domestico;
    num_pajaro();
  }
  
  public static void num_pajaro(){
    Pajaro.num_pajaros++;
  }

  public void color(char color){
    this.color = color;
  }
  
  public void edad (int edad){
    this.edad = edad;
  }
  
  public void domestico (boolean domes){
    this.domestico = domes;
  }
  
  public char color(){
    return color;
  }
  
  public int edad(){
    return edad;
  }
  
  public boolean domestico(){
    return domestico;
  }
  
  public void mostrar(){
    System.out.println(" color "+color+" edad "+edad+" domestico "+domestico);
  }
  
   static Frame fr = new Frame("Panel ejemplo");
   static Pajaro p0 = new Pajaro('h', 33, false);
   
   public static void main(String[] args) {

    Frame fr = new Frame("Panel ejemplo");
    fr.setTitle("mi programa");
    fr.setBackground(java.awt.Color.blue);
    fr.setSize(200,250);
    fr.setVisible(true);
    fr.addWindowListener(new WindowAdapter(){
      public void windowClosing(WindowEvent e)
      {System.exit(0);}});
    
    
    Pajaro p1 = new Pajaro('a',3,true);
    Pajaro p2 = new Pajaro('b',3,true);
    Pajaro p22 = new Pajaro('c',3,true);

    
     System.out.println(Pajaro.p0.color());
     System.out.println(Pajaro.p0.edad);
     System.out.println(Pajaro.p0.domestico);
    
    p2.color='a';
    p2.edad=5;
    p2.domestico=false;
    System.out.println("numero pajaros "
            +p2.num_pajaros+" color "
            +p2.color+" domestico "
            +p2.domestico);
    p1.mostrar();
    p2.mostrar();
    p22.mostrar();
  }
}
