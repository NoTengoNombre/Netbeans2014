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
public class MiNumero {

  private int num;
  private int num1;

  public MiNumero() {
   num = 0;
  }

  public MiNumero(int num) {
    this.num = num;
  }
  
  public void aniade(int n1){
    this.num = num + n1;
    this.num += n1;
  }

  public void resta(int n1){
    this.num = num - n1;
    this.num -= num;
  }
  
  public void multi(int n1){
    this.num = num * n1;
    this.num *= n1;
  }
  
  public void divi(int n1){
    this.num = num / n1;
    this.num /= n1;
  }
  
  public int get_valor(){
    return num;
  }
  
  public int get_valor2(){
    return num * 2;
  }

  public int get_valor3(){
    return num * 3;
  }

  public void set_num(int n1){
    num = n1;
    num1 = n1;
  }
  
  public static void main(String[] args) {

    MiNumero m = new MiNumero();
    m.aniade(4);
    System.out.println(m.get_valor());
    m.set_num(5);
    System.out.println(m.get_valor());
    m.resta(100);
    m.set_num(1);
    m.multi(100);
    System.out.println(m.get_valor3());
    
    System.out.println("................");
    MiNumero m2 = new MiNumero(4);
    m2.aniade(2);
    System.out.println(m2.get_valor());
    m2.divi(2);
    System.out.println(m2.get_valor());
    System.out.println(m2.get_valor3());
  
  
  
  
  
  
  
  }
}












