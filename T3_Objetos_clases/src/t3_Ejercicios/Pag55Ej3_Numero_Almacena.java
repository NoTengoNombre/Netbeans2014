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
public class Pag55Ej3_Numero_Almacena {

  int num;
  
  public Pag55Ej3_Numero_Almacena() {
    this.num = 0;
  }

  public Pag55Ej3_Numero_Almacena(int num){
    this.num = num;
  }
  
  public void setNum_Interno(int num){
    this.num = num;
    System.out.println("fijar numero "+this.num);
  }
  
  public int getValor(){
    System.out.println("valor fijado "+num);
    return num;
  }

  public int anade( int num1 ){
    int num2 = 0;
    num2 = num1 + num;
    System.out.println("Suma es "+num2);
    return num2 ;
  }

  public int resta( int num1 ){
    int num2 = 0;
    num2 = num - num1;
    System.out.println("resta es "+num2);
    return num2;
  }
  
  public int getDoble(){
    System.out.println("doble es "+(int) Math.pow(num,2));
    return (int) Math.pow(num,2);
  }
  
  public int getDoble2(int num){
    System.out.println("doble es "+(int) Math.pow(num,2));
    return (int) Math.pow(num,2);
  }
  
  public int getTriple(){
    System.out.println("triple es "+num * num * num);
    return num * num * num;
  }
  
  public int getCuatriple(){
    System.out.println("cuatriple es "+(int) Math.pow(num,4));
    return (int) Math.pow(num,4);
  }

  public static void main(String[] args) {

    Pag55Ej3_Numero_Almacena na = new Pag55Ej3_Numero_Almacena();
    Pag55Ej3_Numero_Almacena na1 = new Pag55Ej3_Numero_Almacena(2);
    na.setNum_Interno(3);
    na.getValor();
    na.anade(2);
    System.out.println("-----------");
    na1.getDoble();
    na1.getTriple();
    na1.getCuatriple();
    System.out.println("-----------");
    na1.setNum_Interno(3);
    na1.getDoble();
    na1.getTriple();
    na1.getCuatriple();
    na1.getValor();
    System.out.println("-----------");
    na1.anade(2);
    na1.anade(3);
    na1.getValor();
    na1.resta(5);
    System.out.println("-----------");
    na1.setNum_Interno(8);
    na1.getDoble();
    na1.getTriple();
    na1.getCuatriple();
    na1.getValor();
    System.out.println("-----------");
    na.getValor();
    na.anade(5);
    na.resta(4);
    System.out.println("-----------");
    na.getDoble();
    na.getTriple();
    na.getCuatriple();
    na.setNum_Interno(5);
    System.out.println("-----------");
    na.getDoble();
    na.getTriple();
    na.getCuatriple();
    System.out.println("-----------");
    na.getDoble2(5);
    na.getValor();
  
  }
}
