package listadoExcepciones;

/**
 * 5. El siguiente c&oacute;digo lanza una excepci&oacute;n. 
 * Modifica el c&oacute;digo para capturarla (try/catch). 
 * Muestra el resultado de los siguientes m&eacute;todos:
 * <ul>
 * 	<li>getMessage(),</li>
 * 	<li>getCause(),</li>
 * 	<li>getLocalizedMessage(),</li>
 * 	<li>toString().</li>
 * </ul>
 * Aseg&uacute;rate de que se muestre el mensaje &quot;Despu&eacute,s 
 * del lanzamiento de la excepci&oacute;n&quot;
 * 
 * @author Estela Mu&ntilde;oz
 * @author Pedro J. Ramos
 * @version 1.0
 *
 */

public class HolaMundoExcepcion {

	public static void main(String[] args) {
		String[] mensaje = new String[2];
		mensaje[0] = "Hola ";
		mensaje[1]= "mundo!";
		
		// este bucle accederá a un índice fuera de rango
		// y lanzará una excepción
		try {
			for(int i=0; i<3; i++)
				System.out.println(mensaje[i]);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Mensaje: " +e.getMessage());
			System.out.println("Causa: " +e.getCause());
			System.out.println("Localización mensaje: " +e.getLocalizedMessage());
			System.out.println("Mostrar con toString(): " +e);
		}
		
		System.out.println("Después del lanzamiento de la excepción");

	}

}
