/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejercicio_Resuelto_Paco_Notas;

/**
 *
 * @author Trabajar
 */
public class Notas {
  private float nota1,nota2,nota3;

  public Notas(){
    this.nota1 = 0;
    this.nota2 = 0;
    this.nota3 = 0;
  }
  
  Notas(float n1 , float n2 , float n3){
    nota1 = n1;
    nota2 = n2;
    nota3 = n3;
  }
  
  public void set(float n1, float n2 , float n3){
    nota1 = n1;
    nota2 = n2;
    nota3 = n3;
  }
   
  public float get_n1(){
    return nota1;
  }
  
  public float get_n2(){
    return nota2;
  }
  
  public float get_n3(){
    return nota3;
  }
  
  public float nota_media(){
    return (nota1+nota2+nota3)/3;
  }
  
  
  
  
  
  
  
  
}
