package ListadoExpresionesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Utiles.Teclado;


/**
 * 18.Copia el siguiente c&oacute;digo y comprueba su funcionamiento.
 * Entrega TestValidatorOnline y compru&eacute;balo con las expresiones regulares:
 * 
 * <ul>
 * 	<li>a. hola</li>
 * 	<li> b. \sHola</li>
 * 	<li> c. hola{3}</li>
 * 	<li> d. (hola){3}</li>
 * 	<li> e. [hola]{3}</li>
 * 	<li> f. .bat</li>
 * 	<li> g. \.bat</li>
 * 	<li> h. \\.bat</li>
 * 	<li> i. \\hola</li>
 * 	<li> j. \whola</li>
 * 	<li> k. \Whola</li>
 * 	<li> l. ([A-Z][a-zA-Z]*)\s\1</li>
 * 	<li> m. \d\d</li>
 * 	<li> n. \b</li>
 * 	<li> o. \\b</li>
 * </ul>
 * 
 * Env&iacute;a el resultado de la ejecuci&oacute;n con dos entradas para cada expresi&oacute;n: una que
 * coincida y otra que no.
 * 
 * @author Estela Mu&ntilde;oz
 * @author Pedro J. Ramos Ruiz
 *
 */

public class TestValidatosOnline {

	public static void main(String[] args) {
		while(true){
			Pattern pattern = Pattern.compile(Teclado.leerCadena("Introduce la expresión regular: "));
			
			Matcher matcher = pattern.matcher(Teclado.leerCadena("Introduce la cadena donde buscar: "));
			
			boolean found = false;
			while (matcher.find()){
				System.out.println("Se encontró el texto " + matcher.group()
						+ "que comienza en el índice " + matcher.start()
						+ " y finaliza en " + matcher.end());
				found = true;
			}
			if(!found){
				System.out.println("No se encuentra coincidencia.");
			}
		}
	}
}
