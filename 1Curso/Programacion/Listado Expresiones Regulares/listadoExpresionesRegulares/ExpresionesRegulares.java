package ListadoExpresionesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Utiles.Menu;
import Utiles.Teclado;

/**
 * 19. Implementa un programa que permita comprobar cada uno de estos datos
 * mediante expresiones regulares:
 * 
 * <ul>
 * <li>a. Direcci&oacute;n MAC</li>
 * <li>b. Direcci&oacute;n IP</li>
 * <li>c. Correo electr&oacute;nico</li>
 * <li>d. C&oacute;digo postal</li>
 * <li>e. N&uacute;mero de cuenta corriente</li>
 * <li>f. DNI</li>
 * </ul>
 * 
 * Para ello, solicita al usuario tres entradas distintas, dejando claro el
 * patr&oacute;n que vas a utilizar. Por ejemplo:<br>
 * Introduce una direcci&oacute;n MAC (XX:XX:XX:XX:XX:XX)<br>
 * La direcci&oacute;n NO es correcta
 * 
 * @author Estela Mu&ntilde;oz
 * @author Pedro J. Ramos Ruiz
 * @version 1.0
 *
 */

public class ExpresionesRegulares {

	private static Menu menu = new Menu("Elige una opción a buscar:",
			new String[] { "Dirección MAC.", "Dirección IP",
					"Correo electrónico.", "Código postal.",
					"Número de cuenta corriente.", "DNI.", "SALIR" });

	public static void main(String[] args) {

		administrarMenu();
		
	}

	/**
	 * Para buscar coincidencias con un texto introducido
	 */
	private static void expresionesRegulares(int opcion) {
		String cadena = null;
		switch (opcion) {
		case 0: // Dirección MAC 
			cadena = "([0-9A-F]{2}:){5}[0-9A-F]{2}";
			break;

		case 1: // Dirección IP
			cadena = "(\\d.){3}\\d";
			break;

		case 2: // Correo electrónico 
			cadena = ".@.\\..";
			break;

		case 3: // Código postal 
			cadena = "\\d{5}";
			break;

		case 4: // Número de cuenta corriente 
			cadena = "\\d{20}";
			break;

		case 5: // DNI 
			cadena = "(?i)\\d{8}[A-Z]";
			break;
		
		case 6:
			System.out.println("Adios...");
			return;
		}
		
		Pattern pattern = Pattern.compile(cadena);

		Matcher matcher = pattern.matcher(Teclado.leerCadena("Introduce el dato a comprobar: "));

		boolean found = false;
		while (matcher.find()) {
			found = true;
		}
		if (!found)
			System.err.println("El dato no es correcto");
		else
			System.out.println("EL dato introducido es correcto");

	}

	/**
	 * Controla toda la gestión del menu
	 */
	private static void administrarMenu() {
		while (true) {
			int opcion = menu.gestionar();
			if (opcion!=6)
				expresionesRegulares(opcion);
			else {
				System.out.println("Adios...");
				break;
			}
		} 
	}
}
