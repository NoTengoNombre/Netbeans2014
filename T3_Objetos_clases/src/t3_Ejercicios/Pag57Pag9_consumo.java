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
public class Pag57Pag9_consumo {

  //Atributos 
  double km = 100;  
  double litros = 18.86; //km
  double h = 60;
  double vmed = km / h;  
  double pgas = 1.489;  
  //Atributos
  private float rkms;
  private float rlitros;
  private float rvmed;
  private float rpgas;

  ////////////////////////////////////////////
  public Pag57Pag9_consumo(float rkms, float rlitros, float rvmed, float rpgas) {
    this.rkms = rkms;
    this.rlitros = rlitros;
    this.rvmed = rvmed;
    this.rpgas = rpgas;
  }
  
  public Pag57Pag9_consumo() {
//    km = 0;
  //  litros = 0;
    //vmed = 0;
    // pgas = 0;
  }

  public Pag57Pag9_consumo(double km , double l ) {
    this.km = km;
    this.litros = l;
  }
 
  ///////////////////////////////////////////////
  public float RgetTiempo(){
    return rkms/rvmed;
  }
  
  double getTiempo(double h){
    double tiempo = h;
   System.out.printf("tiempo %,.2f \n en horas "+tiempo);
    return tiempo;
  }
  
///////////////////////////////////////////
  public float Rconsumo(){
    return 100 * rlitros / rkms;
  }
  
// 5,3 litros a los 100
  double consumoMedio(double l){
    double li;
    li = l * 18.86;
    System.out.println("5.3 litro son 100 km ");
    System.out.println(""+l+" litro son "+li+" km ");
    return li;
  }
  
  /////////////////////////////////
  public float RconsumoEuros(){
    return 100 * rlitros / rkms * rpgas; 
  }
  
  public double consumoEuros(int km){
    double valor = ((km * litros  * pgas ) / km) ; 
    System.out.println("1 litro son 1.489 euros y 18.86 km ");
    System.out.print(""+km+" km son ");
    System.out.printf("%,.2f euros\n",valor);
    return valor;
  }

  void setKms(double km){
    this.km = km;
  }
  
  void setLitros(double l){
    this.litros = l;
  }
  
  void setVmed(double vm){
    this.vmed = vm;
  }
  
  void setPgas(double pg){
    this.pgas = pg;
  }
  ///////////////////////////////////////////////
  void RsetKms(double km){
    this.rkms = (float) km;
  }
  
  void RsetLitros(double l){
    this.rlitros = (float) l;
  }
  
  void RsetVmed(double vm){
    this.rvmed = (float) vm;
  }
  
  void RsetPgas(double pg){
    this.rpgas = (float) pg;
  }
  
  public static void main(String[] args) {
 
    System.out.println("-------------");
    Pag57Pag9_consumo c = new Pag57Pag9_consumo();
    c.consumoMedio(1);
    c.consumoEuros(100);
    Pag57Pag9_consumo c1 = new Pag57Pag9_consumo(100,1);
    System.out.println("-------------");
    System.out.println("------Libro-------");
    System.out.println("-------------");
    Pag57Pag9_consumo gasto = new Pag57Pag9_consumo(225f, 3f, 100f, 1.28f);
    System.out.println("");
    System.out.println(" "+gasto.RgetTiempo()+" horas");
    System.out.println(" "+gasto.Rconsumo()+"litros");
    System.out.println(" "+gasto.RconsumoEuros()+" euros");
  
    gasto.setPgas(1.489);
    System.out.println("------------");
    gasto.RsetLitros(1);
    gasto.RsetKms(100);
    System.out.println("------------");
    System.out.println(" "+gasto.RgetTiempo()+" horas");
    System.out.println(" "+gasto.Rconsumo()+"litros");
    System.out.println(" "+gasto.RconsumoEuros()+" euros");
  
  
  }
}