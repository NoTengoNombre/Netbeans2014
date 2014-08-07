/*
HEMOS APRENDIDO 
QUE PARA PODER UTILIZAR UNA VARIABLE
QUE VAYA MODIFICANDO SOLO 1 VEZ SU VALOR
SE TIENE QUE CREAR OTRA QUE LA CONTENGA
SIN QUE SE ENLACE CON EL ATRIBUTO MIEMBRO 
DE LA CLASE Y ASÍ SE GENERARA UNA VARIABLE 
QUE SOLO SE MODIFICARA 1 VEZ
*/

package t3_Ejercicios;

/**
 *
 * @author Trabajar
 */
public class Pag54Ej2_Mi_numero {
 
  private int num;

  public Pag54Ej2_Mi_numero() {
  }

  public Pag54Ej2_Mi_numero(int num) {
    this.num = num;
  }
  
  public int d_doble(){
  return num * num ;
  }
 
  public int d_triple(){
    return num * num * num;
  }
  
  public int d_cuatriple(){
    return num * num * num * num;
  }
  
  public int doble(){
    int num1 = (int) Math.pow(num,2);
    System.out.println("doble "+num);
    return num1;
  }
  
  public int triple(){
    int num1 = (int) Math.pow(num,3);
    System.out.println("triple "+num);
    return num1;
  }

  public int cuatriple(){
    int num1 = (int) Math.pow(num,4);
    System.out.println("cuatriple "+num);
    return num1;
  }


  public static void main(String[] args) {
   Pag54Ej2_Mi_numero n = new Pag54Ej2_Mi_numero(2);
   System.out.println(n.d_doble());
   System.out.println(n.d_triple());
   System.out.println(n.d_cuatriple());
    System.out.println("-------------");
   System.out.println(n.doble());
   System.out.println(n.triple());
   System.out.println(n.cuatriple());
    System.out.println("-------------");
 
/*
  public void fijar_doble(){
    num = num * num;
  }
  
   
  public void fijar_triple(){
    num = num * num * num;
  }
  
  public int triple(){
    //this.num = (int) Math.pow(num,3);
    System.out.println("triple "+num);
    return num;
  }
  
  public void fijar_cuatriple(){
    num = num * num * num;
  }

  public int cuatriple(){
    //this.num = (int) Math.pow(num,4);
    System.out.println(" cuatriple "+num);
    return num;
  }
  
  public static void main(String[] args) {
    Pag54Ej2_Mi_numero n = new Pag54Ej2_Mi_numero(2);
    n.fijar_doble();
    n.doble();
    n.fijar_triple();
    n.triple();
  */
      
      
  }
}
