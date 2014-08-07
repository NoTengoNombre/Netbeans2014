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
public class Enteros {

  int num1;
  int num2;

  public void setNum1(int num1) {
    this.num1 = num1;
  }

  public void setNum2(int num2) {
    this.num2 = num2;
  }

  public int getNum1() {
    return num1;
  }

  public int getNum2() {
    return num2;
  }

  public Enteros() {
    num1 = 0;
    num2 = 0;
  }

  public Enteros(int num11 , int num22) {
    num1 = num11;
    num2 = num22;
  }
  
  int suma (int n , int n2){
    int s = num1 + num2;
    return s;
  }

  int multi (int n , int n2){
    int s = num1 * num2;
    return s;
  }
  
  public static void main(String[] args) {

    Enteros e = new Enteros();
    e.num1 = 23;
    e.num2 = 100;
    e.setNum1(23);
    e.setNum2(100);
    System.out.println(e.getNum1());
    System.out.println(e.getNum2());
    
    int x = e.suma(e.num1,e.num2);
    System.out.println(x);
    int xx = e.multi(e.num1,e.num2);
    System.out.println(xx);
 
    Enteros e2 = new Enteros(6,-7);
  
  
  
  
  }
}
