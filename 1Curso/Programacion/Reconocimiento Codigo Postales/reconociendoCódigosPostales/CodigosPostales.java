package reconociendoCódigosPostales;

import utiles.Teclado;
 
/**
 * Crea un programa en Java que reconozca los c&oacute;digos postales. Para ello:
 *
 * Valida el c&oacute;digo postal mediante una expresi&oacute;n regular
 *      52001 (v&aacute;lido)
 *      14014 (v&aacute;lido)
 *      53001 (inv&aacute;lido)
 *      14000 (inv&aacute;lido)
 *  Extrae mediante grupos de expresiones regulares la provincia (dos primeros d&iacute;gitos)
 *  Muestra la provincia en cuesti&oacute;n y a la comunidad aut&oacute;noma a la que pertenece 
 *  (ha de reconocer al menos 10 provincias) Utiliza enumeraciones con al menos dos atributos y 
 *  un m&eacute;todo.
 * 
 * @author Pedro J. Ramos
 * @author Estela Mu&ntilde;oz
 * @version 1.0
 *
 */

public class CodigosPostales {
	
	public static void main(String[] args) {
	        String codigoPostal=null;
	        do {
	            codigoPostal = Teclado.leerCadena("Escribe el Código Postal:");
	            if (codigoPostal.length()==5)
	                Provincias.expresionesRegulares(codigoPostal);
	            else
	                System.err.println("El Código Postal introducido no es válido");
	        }while (deseaContinuar());
	         
	    }
	     
	    /**
	     * Pregunta al usuario si desea continuar con la ejecuci&oacute;n del programa
	     */
	    private static boolean deseaContinuar () {
	        char caracter = Teclado.leerCaracter("Desa continuar? (s/S)");
	        if ((caracter=='s')||(caracter=='S'))
	            return true;
	        else
	            return false;
	    }
}
