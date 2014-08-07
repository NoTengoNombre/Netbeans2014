
// Esta es la forma indicada para leer desde consola a partir de la versión Java 1.5
// importar la clase Scanner
import java.util.Scanner;
import java.io.*; // funciones de E/S 

public class teclado {

	// ************* LEER CADENAS  **********
	/* E: mensaje => mensaje a mostrar por pantalla
	 * S: lee una cadena de caracteres por teclado con System.console().readLine()
	 *    y la devuelve
	 * Nota: Este método no funciona en el NetBeans, pero si en Geany */
	public static String leer_cadena (String mensaje) {		
		System.out.print (mensaje);
		String cadena = System.console().readLine();		
		return (cadena);	
	}		
	
		
	// ************* LEER CADENAS 2 **********
	/* E: mensaje => mensaje a mostrar por pantalla
	 * S: lee una cadena de caracteres por teclado con nextLine de Scanner
	 *    y la devuelve 
	 * Nota: Este método funciona en NetBeans y Geany */	
	public static String leer_cadena2 (String mensaje) {		
		// ************* LEER CADENAS DE CARACTERES con nextLine de Scanner, FALLA a veces **********
		// OjO!!! puede que te falle la lectura de texto,
		// al leer muchas veces (si el buffer de entrada se llena)
		
		// crea objeto entrada de la clase Scanner para obtener la entrada de la terminal de comandos
		Scanner entrada = new Scanner (System.in);		
		
		String texto="";
		
		System.out.print (mensaje);
		// nos aseguramos de controlar posibles errores en la lectura
		try {
			texto = entrada.nextLine();
		}		
		// mostramos mensaje de error en caso de lectura incorrecta 
		catch (Exception e){
			System.err.println ("Error de lectura de String. Código de error = " + e);
			e.printStackTrace();
			System.exit(1);
		}			
		
		return texto;
	
	}// fin leer_cadena2
	
	
	// ************* LEER CADENAS 3 **********
	/* E: mensaje => mensaje a mostrar por pantalla
	 * S: lee una cadena de caracteres por teclado con nextLine de Scanner
	 *    y la devuelve */
	public static String leer_cadena3 (String mensaje) {
		// Ojo => este método no funciona en el NetBeans, pero si en Geany
		System.out.print (mensaje);
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader (isr);
		String cadena = "";

		try {
			cadena = br.readLine();
		}
		// mostramos mensaje de error en caso de lectura incorrecta 
		catch (Exception e){
			System.err.println ("Error de lectura de String. Código de error = " + e);
			e.printStackTrace();
			System.exit(1);
		}	
		
		return (cadena);
			
	} // fin leer cadena3
	
	
	// ************* LEER CARACTERES **********
	/* E: mensaje => mensaje a mostrar por pantalla
	 * S: lee un caracter por teclado con System.in.read();		
	 *    y lo devuelve
	 * Nota: Puede dar problemas si lees más de un caracter para 
	 *       la siguiente lectura */	
	public static char leer_caracter (String mensaje) {		
			
		char car='$';
		
		System.out.print (mensaje);
		
		// nos aseguramos de controlar posibles errores en la lectura
		try {
			car = (char) System.in.read();
		}
		// mostramos mensaje de error en caso de lectura incorrecta 
		catch (Exception e){
			System.err.println ("Error de lectura del carácter. Código de error = " + e);
			e.printStackTrace();
			System.exit(1);
		}					
		
		return car;
	}
	
	
	// ************* LEER ENTEROS **********
	/* E: mensaje => mensaje a mostrar por pantalla
	 * S: lee un número entero por teclado con new Scanner (System.in)		
	 *    y lo devuelve */	 
	public static int leer_entero (String mensaje) {
		
		// crea objeto entrada de la clase Scanner para obtener la entrada de la terminal de comandos
		Scanner entrada = new Scanner (System.in);		
				
		int num1 = 0;		
		
		System.out.print (mensaje);

		// nos aseguramos de controlar posibles errores en la lectura
		try {
			num1 = entrada.nextInt();
		}
		// mostramos mensaje de error en caso de lectura incorrecta (p.e leer una letra en vez de un número) 
		catch (Exception e){
			System.err.println ("Error de lectura del número. Código de error = " + e);
			e.printStackTrace();
			System.exit(1);
		}			
		
 		return num1;
	} // fin leer entero
	
	
	// *********** LEER REALES DOBLE PRECISION ***********
	/* E: mensaje => mensaje a mostrar por pantalla
	 * S: lee un número real  por teclado con new Scanner (System.in)		
	 *    y lo devuelve 
	 * Nota:  OjO hay que poner la coma como separador decimal */	
	public static double leer_double (String mensaje) {		
		
		// crea objeto entrada de la clase Scanner para obtener la entrada de la terminal de comandos
		Scanner entrada = new Scanner (System.in);		
		
		// leer un real de doble precisión desde la consola 
		double real =0;
		System.out.print (mensaje);
		
		// nos aseguramos de controlar posibles errores en la lectura
		try {
			real = entrada.nextDouble(); // OjO hay que poner la coma como separador decimal
		}
		// mostramos mensaje de error en caso de lectura incorrecta (p.e leer una letra en vez de un número) 
		catch (Exception e){
			System.err.println ("Error de lectura del número real double. Código de error = " + e);
			e.printStackTrace();
			System.exit(1);
		}	
		
		return real;	
	
	} // fin leer_double
	
	
	// *********** LEER REALES SIMPLE PRECISION ***********
	/* E: mensaje => mensaje a mostrar por pantalla
	 * S: lee un número real  por teclado con new Scanner (System.in)		
	 *    y lo devuelve 
	 * Nota:  OjO hay que poner la coma como separador decimal */	
	public static float leer_float (String mensaje) {		
		
		// crea objeto entrada de la clase Scanner para obtener la entrada de la terminal de comandos
		Scanner entrada = new Scanner (System.in);		
		
		// leer un real de doble precisión desde la consola 
		float real =0;
		System.out.print (mensaje);
		
		// nos aseguramos de controlar posibles errores en la lectura
		try {
			real = entrada.nextFloat(); // OjO hay que poner la coma como separador decimal
		}
		// mostramos mensaje de error en caso de lectura incorrecta (p.e leer una letra en vez de un número) 
		catch (Exception e){
			System.err.println ("Error de lectura del número real float. Código de error = " + e);
			e.printStackTrace();
			System.exit(1);
		}	
		
		return real;	
	
	} // fin leer_float		
	

	public static void main (String args[]) {	
	
		String palabras = leer_cadena ("Introduce una cadena: ");		
		System.out.println ("La cadena leída es: " + palabras);			
		
		String cadena = leer_cadena2 ("Introduce una cadena2: ");		
		System.out.println ("La cadena leída es: " + cadena);
		
		String cadena3 = leer_cadena3 ("Introduce una cadena3: ");		
		System.out.println ("La cadena leída es: " + cadena3);		
		
		char car = leer_caracter ("Introduce un carácter: ");
		System.out.println ("El carácter leído es: " + car);		
		
		int numero = leer_entero ("Introduce un número entero: ");
		System.out.println ("El número entero leído es: " + numero);
		
		double real = leer_double ("Introduce un número real (4,25 p.e): ");
		System.out.println ("El número real de doble precisión leído es: " + real);
		
		float real2 = leer_float ("Introduce un número real (4,25 p.e): ");
		System.out.println ("El número real de simple precisión leído es: " + real2);				
			
	} // fin método main
	
	
} // fin clase teclado


