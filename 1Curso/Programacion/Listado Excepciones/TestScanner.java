package listadoExcepciones;

import java.util.Scanner;

/**
 * 
 * 10. El siguiente código utiliza la clase Scanner para la lectura desde el teclado:
 * 		a.	Indica la excepción que se lanza al introducir una letra en vez de un entero
 * 		b.	Captura la excepción para que el usuario sólo pueda introducir un valor válido. Muestra 
 * 			el mensaje de error mediante System.err.println(""); El programa no finalizará hasta que 
 * 			el usuario introduzca un valor válido. Quizás tengas que utilizar la sentencia 
 * 			scanner.nextLine();
 * 
 * @author Estela Mu&ntilde;oz
 * @author Pedro J. Ramos
 * @version 1.0
 * 
 */
public class TestScanner {
	
	/**
	 * Probando la clase Scanner
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce un entero: ");
		System.out.println(scanner.nextInt());
	}
}