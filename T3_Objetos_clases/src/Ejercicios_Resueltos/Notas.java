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
public class Notas {

private double nota1;
private double nota2;
private double nota3;

  public Notas() {
    nota1 = 0;
    nota2 = 0;
    nota3 = 0;
  }

  public Notas(double nota1, double nota2, double nota3) {
    this.nota1 = nota1;
    this.nota2 = nota2;
    this.nota3 = nota3;
  }
   
  void nota1fijar1(double nota){
     nota1 = nota;
  }
   
  void nota1fijar2(double nota){
     nota2 = nota;
  }
    
  void nota1fijar3(double nota){
     nota3 = nota;
  }
    
   double nota1(){
     return nota1;
   }
   double nota2(){
     return nota2;
   }
   double nota3(){
     return nota3;
   }

   double nota_media(){
   double s =  (nota1 + nota2 + nota3)/3;
   return s;
   }
   
   public static void main(String[] args) {
    
     Notas n = new Notas(0, 0, 0);
     System.out.println(n.nota1());
     System.out.println(n.nota2());
     System.out.println(n.nota3());
     System.out.println("--------");
     n.nota1fijar1(10);
     n.nota1fijar2(10);
     n.nota1fijar3(10);
     System.out.println("--------");
     System.out.println(n.nota1());
     System.out.println(n.nota2());
     System.out.println(n.nota3());
     System.out.println("media");
     System.out.println(n.nota_media());
     
     Notas n1 = new Notas(5,4.6,7.8);
     System.out.println(" 2º constructor ");
     System.out.println(n1.nota1());
     System.out.println(n1.nota2());
     System.out.println(n1.nota3());

     System.out.println("valor nota media");
     System.out.println(n1.nota_media());
     
   }
}









