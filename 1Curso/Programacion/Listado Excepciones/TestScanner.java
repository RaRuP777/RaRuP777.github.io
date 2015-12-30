package listadoExcepciones;

import java.util.Scanner;

/**
 * 
 * 10. El siguiente c�digo utiliza la clase Scanner para la lectura desde el teclado:
 * 		a.	Indica la excepci�n que se lanza al introducir una letra en vez de un entero
 * 		b.	Captura la excepci�n para que el usuario s�lo pueda introducir un valor v�lido. Muestra 
 * 			el mensaje de error mediante System.err.println(""); El programa no finalizar� hasta que 
 * 			el usuario introduzca un valor v�lido. Quiz�s tengas que utilizar la sentencia 
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