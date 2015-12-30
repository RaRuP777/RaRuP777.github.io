package ListadoExpresionesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Utiles.Teclado;

/**
 * 20. Diseña una aplicación en Java que reconozca una contraseña robusta (tantas veces como el usuario quiera). 
 * Según las directivas de nivel de dominio de Microsoft, para que una contraseña sea considerada segura, 
 * ha de cumplir una serie de instrucciones:
 * <ul>
 * 	<li>a. La contraseña tendrá una longitud de al menos seis caracteres.</li> 
 * 	<li>b. La contraseña contendrá caracteres de tres de las cuatro categorías siguientes:</li> 
 * 		<ul>
 * 	 		<li>i. Caracteres en mayúsculas (A–Z)</li>
 * 	 		<li>ii. Caracteres en minúsculas (a–z)</li>
 * 	 		<li>iii. Base de 10 dígitos (0–9)</li>
 * 	 		<li>iv. Caracteres no alfanuméricos (por ejemplo: !, $, #, o %)</li>
 * 		</ul>
 * </ul> 
 * 
 * @author Estela Mu&ntilde;oz
 * @author Pedro J. Ramos
 * @version 1.0
 *
 */

public class ExpresionesRegulares2 {
		
	public static void main(String[] args) {
		String password=null;
		do {
			password = Teclado.leerCadena("Escribe la contraseña:");
			if (password.length()>5)
				expresionesRegulares(password);
			else
				System.err.println("La contraseña debe tener un minimo de 6 caracteres");
		}while (deseaContinuar());
		
	}
	
	private static boolean deseaContinuar () {
		char caracter = Teclado.leerCaracter("Desa continuar? (s/S)");
		if ((caracter=='s')||(caracter=='S'))
			return true;
		else
			return false;
	}

	/**
	 * Para buscar coincidencias con un texto introducido por teclado
	 */
	private static void expresionesRegulares(String password) {
		String cadena = null;
			
			Pattern pattern = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]){3,20})");
			
			Matcher matcher = pattern.matcher(password);
			
			boolean found = false;
			if (found)
				System.out.println("La contraseña es segura porque cumple las condiciones de seguridad");
			else
				System.err.println("La contraseña no es segura");
	}
}