package listadoExcepciones;

/**
 * 8. Analiza la siguiente clase TestLanzaExcepcion. 
 * En el metodo2() se lanza una excepci�n NullPointerException en la l�nea nula.toString();
 * Hay que tratar la excepci�n. Dale distintas soluciones. Implem�ntalas y analiza los distintos escenarios:
 * <ul>
 * c. TestCapturaExcepcion: La excepci�n se captura directamente en metodo2.
 * d. TestLanzaMiExcepcion: Se crea una excepci�n MiExcepcion con el mensaje "Mi primera excepcion. " + e.getMessage() en metodo2() y se captura en metodo1() 
 * e. TestLanzaMiExcepcion2: Se crea una excepci�n MiExcepcion con el mensaje "Mi primera excepcion. " + e.getMessage() en metodo2() y se captura en el main().
 * f. TestCapturaEnElMain: Se captura la excepci�n directamente en el main().
 * </ul>
 * 
 * @author Estela Mu&ntilde;oz
 * @author Pedro J. Ramos
 * @version 1.0
 *
 */

public class TestLanzaException {
	public static void main(String[] args){
		try {
			metodo1();	
		}catch (Exception e){
	}
		
		System.out.println("main: Acabando...");
	}
	
	private static void metodo1(){
		metodo2();
		System.out.println("Metodo1: Acabando...");
	}
	
	private static void metodo2(){
		String nula=null;
		nula.toString();
		System.out.println("Metodo2: Acabando...");
	}
}
