/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Practica;

/**
 *
 * @author Trabajar
 */
// Esta es la forma indicada para leer desde consola a partir de la versión Java 1.5

// importar la clase Scanner => para leer desde teclado
import java.util.Scanner;

public class lectura {

		public static void main (String args[]) {
			// crea objeto entrada de la clase Scanner para obtener la entrada de la terminal de comandos
			Scanner entrada = new Scanner (System.in);
			
			
			//************** LEER ENTEROS *************

			// variables locales
			int num1, num2, suma;

			// leer un entero desde la consola
			System.out.print ("Introduce un número: ");
			// nos aseguramos de controlar posibles errores en la lectura
			try {
				num1 = entrada.nextInt();			
			}
			// mostramos mensaje de error en caso de lectura incorrecta (p.e leer una letra en vez de un nº) 
			catch (Exception e){
				System.err.println ("Error de lectura del número. Código de error = " + e);
				e.printStackTrace();
				return;
			}			
			
			// leer otro entero desde la consola
			System.out.print ("Introduce otro número: ");
			try {
				num2 = entrada.nextInt();
			}
			catch (Exception e){
				System.err.println ("Error de lectura del número. Código de error = " + e);
				e.printStackTrace();
				return;
			}
			
			// calcular y mostrar la suma
			suma = num1 + num2;
			System.out.println ("La suma de " + num1 + " + " + num2 + " es: " + suma);
			
						
			// *********** LEER REALES ***********
			
			// leer un real de doble precisión desde la consola 
			double real1;
			System.out.print ("Introduce un nº REAL: ");
			// nos aseguramos de controlar posibles errores en la lectura
			try {
				real1 = entrada.nextDouble(); // OjO hay que poner la coma como separador decimal
			}
			// mostramos mensaje de error en caso de lectura incorrecta (p.e leer una letra en vez de un nº) 
			catch (Exception e){
				System.err.println ("Error de lectura del número. Código de error = " + e);
				e.printStackTrace();
				return;
			}	
			
			System.out.println ("El real de doble precisión leído es: " + real1);
					
			
			// leer un real de simple precisión desde la consola 
			float real2;
			System.out.print ("Introduce un nº REAL: ");
			// nos aseguramos de controlar posibles errores en la lectura
			try {
				real2 = entrada.nextFloat(); // OjO hay que poner la coma como separador decimal
			}
			// mostramos mensaje de error en caso de lectura incorrecta (p.e leer una letra en vez de un nº) 
			catch (Exception e){
				System.err.println ("Error de lectura del número. Código de error = " + e);
				e.printStackTrace();
				return;
			}	
			
			System.out.println ("El real de simple precisión leído es: " + real2);
			
			
			// ************* LEER CARACTERES **********
			
			char car;
			// leer un carácter desde la consola
			System.out.print ("Introduce un caracter: ");
			// nos aseguramos de controlar posibles errores en la lectura
			try {
				car = (char) System.in.read();
			}
			// mostramos mensaje de error en caso de lectura incorrecta 
			catch (Exception e){
				System.err.println ("Error de lectura del número. Código de error = " + e);
				e.printStackTrace();
				return;
			}			
			
			System.out.println ("El carácter leído es: " + car); 
			
			// forzar la llamada al recolector de basura
			System.runFinalization ();
			System.gc();			
			
			// evitar que se llene el buffer de entrada => no siempre se consigue
			// crea objeto entrada2 de la clase Scanner para obtener la entrada de la terminal de comandos
			//Scanner entrada2 = new Scanner (System.in);
			
			
			// LEER CADENAS con readLine() => MEJOR FORMA en Geany => no funciona en NetBeans
			System.out.print ("Introduce la cadena a leer: ");
			String cadena = System.console().readLine();
			System.out.println ("La cadena leída es: " + cadena);
			
			/* Esto falla
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader (isr);

			String cadena = br.readLine();	*/				
			

			// ************* LEER CADENAS DE CARACTERES con nextLine de Scanner, FALLA a veces **********
			// OjO!!! puede que te falle la lectura de texto,
			// al leer muchas veces (si el buffer de entrada se llena)
			String texto;
			// leer un carácter desde la consola
			System.out.print ("Introduce una palabra: ");
			// nos aseguramos de controlar posibles errores en la lectura
			try {
				texto = entrada.nextLine();
			}
			// mostramos mensaje de error en caso de lectura incorrecta 
			catch (Exception e){
				System.err.println ("Error de lectura del número. Código de error = " + e);
				e.printStackTrace();
				return;
			}			
			
			System.out.println ("El texto leído es: " + texto);		
			
		} // fin método main
		
} // fin clase lectura
