/*
Es útil un método pintar que pinte tantos caracteres como queramos por pantalla uno detrás de otro.
 E: car => carácter a pintar
num => número de caracteres a pintar
S: muestra por pantalla 'num' caracteres 'car' todos seguidos 

public static void pintar (char car, int num) {

    // recorrer con un un bucle desde 1 hasta num

        imprimir (car);

}

Este método se puede usar tanto para imprimir espacios en blanco, como cualquier otro carácter.

Por ejemplo para el método rectangulo():

public void rectangulo (int base, int altura) {

    // imprimir la primera línea
    pintar (caracter, base);
    // salto de línea
    pintar ('\n', 1);

    // bucle que recorra desde 1 hasta altura -2 veces

        // dentro del bucle

        pintar (caracter,1);
        // pintar espacios en blanco
        pintar (' ', base-2);
        .........

    fin bucle

    // imprimir la última línea

}
*/

package pruebas.Bucles;

import java.util.Scanner;


/**
 *
 * @author Trabajar
 */
public class Dibujar {
  
  static char car;

  public Dibujar() {
    this.car = '*';
  }

  public Dibujar(char car) {
   this.car = car;
  }
  
  public static void setCaracter(char car){
    Dibujar.car = car;
  }
  
  public static char getCaracter(){
    System.out.println(" !! Caracter seleccionado es "+car+" !! ");
    return car;
  }
  
  public static void pintar(char car , int num ){
    for (int i = 0; i < num; i++) {
      System.out.print(Dibujar.car = car);
    }
  }
  
  public void rectangulo(int base , int altura){
      for (int i = 1; i <= base; i++) {
        for (int j = 1 ; j <= altura; j++) {
          pintar(car,1);
          if (j == 1 || j == base || i == 1 || i == altura){
          pintar(car,1);
          }else{
          pintar(car,1);
          }
        }
        System.out.println();
      }
  }
  
      public void triangulo(int num){
//    arriba abajo
    for (int i = 0 ; i < num ; ++i) {
//      izq a derecha
      for (int j = 0 ; j < num - i - 1 ; ++j) {
        System.out.print(" ");
      }
        for (int j = 0 ; j < ( i * 2 + 1 ) ; ++j) {
          if (i == 0 || i == num - 1 || j == 0 || j == 2 * i ) {
            pintar(car, 1);
          }else{
            System.out.print(" ");
        }
      }
      System.out.println("");
    }
  }
      
      public void rombo(int altura){
        System.out.println("introduce mensaje ");
        Scanner sc = new Scanner(System.in);
        String l = sc.nextLine();
    int i=0,j=0,k=0;
    for(i=0;i<= altura;i++){
      if(i%2==1){
        for(k= altura+1;k>=i;k--){
            if(k%2==1){
              System.out.print(" ");
            } 
        }
        for(j=0;j<i;j++){
          pintar(car, 1);
          } 
        System.out.println( );
      }
    }
    System.out.println(" "+l+" ");
    for(i= altura ;i>1;i--){
      if(i%2==1){
        for(k=i;k<= altura+2;k++){
          if((k%2)==1){
        System.out.print(" "); 
          }
        }
        for(j=i-2;j>0;j--){
          pintar(car,1); 
        } 
        System.out.println( ); 
      } 
    } 
 }

      public void rombo1(int altura){
    int i=0,j=0,k=0;
    
    for(i=0;i<=altura;i++){
      if(i%2==1){
        for( k=altura+1 ; k >=i ; k--){
            if(k%2==1){
              System.out.print(" ");
            } 
        }
        for( j=0 ; j<i ; j++ ){
            System.out.print("*");
          } 
        System.out.println( );
      }
    }
        //parte de ab8ajo
    for(i=altura;i>1;i--){
      if(i%2==1){
        for(k=i;k<=altura+2;k++){
          if((k%2)==1){
        System.out.print(" "); 
          }
        }
        for(j=i-2;j>0;j--){
          pintar(car,1); 
        } 
        System.out.println( ); 
      } 
    } 
 }
      public void mensaje(String mensaje){
        int mensaje1 = mensaje.length();
        int m = mensaje1 + 4;
        
        for (int i = 0; i < m; i++) {
          System.out.print(car);
        }
        
        System.out.print("\n# "+mensaje+" #\n");
        
        for (int i = 0; i < m; i++) {
          System.out.print(car);
        }
        System.out.println("");
      }
      
  public static int menu(){
    System.out.println(" Menu del programa");
       System.out.println(" 1 - fijar caracter ");
       System.out.println(" 2 - ver caracter ");    
       System.out.println(" 3 - rectangulo ");    
       System.out.println(" 4 - piramide ");
       System.out.println(" 5 - rombo ");
       System.out.println(" 6 - mensaje ");
       System.out.println(" 7 - rombo magico ");
       System.out.println(" 8 - salir ");
    return 0;
  }
    /*
  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
  Probando con Scanner 
  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    System.out.println("");
    Scanner sc = new Scanner(System.in);
    Dibujar d = new Dibujar();
    int op = sc.nextInt();
    int elige = sc.nextInt();
    do{
    switch(op){
     case 1 : 
      do{
            switch(elige){
         case 1 : d.setCaracter('*');break;
         case 2 : d.setCaracter('#');break;
         case 3 : d.setCaracter('-');break;
            } // fin switch 2
            }while(1!=op || 2!=op || 3!=op);
       
     case 2 : System.out.println(d.getCaracter());break;
     case 3 : d.rectangulo(elige, elige);break;
     case 4 : d.triangulo(elige);break;
    } // fin switch 1
    }while(5!=op);
  } 
*/
      
   
  public static void main(String[] args) {

    Dibujar basico = new Dibujar();
/*
    Recuerda:
    !!!!Si dejas los constructores con argumentos 
    !!!!Y el metodo pintar hace referencia al static char de los 
    !!!!atributos miembros 
    !!!!Cogera el ultimo constructor creado para usar el caracter
    Dibujar almohadilla = new Dibujar('#');
    Dibujar raya = new Dibujar('-');

       System.out.println(" Menu del programa");
       System.out.println(" Elige opcion ");
       System.out.println(" 1 - fijar caracter ");
       System.out.println(" 2 - ver caracter");    
       System.out.println(" 3 - rectangulo ");    
       System.out.println(" 4 - piramide ");
       System.out.println(" 5 - salir ");
 */
    
   int op = menu();
   int op1;
    do{
       op = teclado.leer_entero("\n Elija una opcion \n ");
  switch(op){
    case 1 :        
      System.out.println(" 1 - fijar caracter para dibujar ");
         do{
          op1 = teclado.leer_entero(" 1 asterisco \n 2 almohadilla \n 3 raya \n ");
          switch(op1){
        
            case 1 : System.out.println(" Ha seleccionado asterisco ");
          basico.pintar('*',1);
        break;
        
            case 2 : System.out.println(" Ha seleccionado almohadilla ");
          pintar('#',1);
        break;
        
            case 3 : System.out.println(" Ha seleccionado raya");
          pintar('-',1);
        break;
         }
        break; // fin switch 2
       }while(1!=op1 && 2!=op1 && 3!=op1);
        break; // break para salir de las opciones de seleccion de caracter 
     
    case 2 :              
       System.out.println(" 2 - ver caracter seleccionado ");    
       getCaracter();
     break;

    
    case 3 :        
       Scanner sc0 = new Scanner(System.in);
       System.out.println(" 3 - rectangulo ");    
       System.out.println("introduce base  ");
       int nn2 = sc0.nextInt();
       System.out.println("introduce altura  ");
       int nn22 = sc0.nextInt();
       basico.rectangulo(nn2,nn22);
     break;
     
    
    case 4 : 
       Scanner sc11 = new Scanner(System.in);
       System.out.println(" 4 - triangulo ");   
       int nn1 = sc11.nextInt();
       basico.triangulo(nn1);
     break;
    
    case 5 :
      System.out.println("introduce la longitud del rombo < 2 ");
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      basico.rombo1(n);
      break;

    case 6 :
      System.out.println(" 6 - mensaje ");
      basico.mensaje(teclado.leer_cadena2(" introduce mensaje "));
      break;

    case 7 :
      System.out.println("introduce la longitud del rombo < 2 ");
      Scanner sc1 = new Scanner(System.in);
      int n1 = sc1.nextInt();
      basico.rombo(n1);
      break;
      
    case 8 :
      System.out.println(" Has salido el programa ");
      break;
      
    }// fin switch  1
    } // fin do1
    while(8!=op);
    } // fin menu
  }



