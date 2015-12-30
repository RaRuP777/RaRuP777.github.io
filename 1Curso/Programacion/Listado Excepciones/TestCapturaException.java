package listadoExcepciones;

/**
 * 7. El siguiente c&oacute;digo lanza una excepci&oacute;n. Capt&uacute;rala (try/catch) 
 * y haz un System.out.println() de los siguientes m&eacute;todos de la excepci&oacute;n capturada: 
 * getMessage(), getCause(), getLocalizedMessage(), toString().
 * 
 * @author Estela Mu&ntilde;oz
 * @author Pedro J. Ramos
 * @version 1.0
 *
 */

public class TestCapturaException {

	public static void main(String[] args) {
		int dividendo=7;
		int divisor=0;
		try {		
			int cociente=dividendo/divisor;
		} catch (Exception e) {
			e.printStackTrace(); //mensaje típico de excepción en rojo
			System.out.println("Mensaje: " + e.getMessage()); // devuelve un mensaje sobre los detalles de la excepción
			System.out.println("Causa: " + e.getCause()); // devuelve la causa de la excepción
			System.out.println("Se localiza en: " +e.getLocalizedMessage()); // devuelve la localización del mensaje
			System.out.println("Lo que se muestra: "+ e); // muestra la excepción
		}
		System.out.println("Aaaaaaaadios");

		
	}

}
