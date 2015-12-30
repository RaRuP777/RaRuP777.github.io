package listadoExcepciones;

/**
 * 9. Ejecuta el siguiente c�digo y responde:
 * 
 * a. A  continuaci�n  aparecen  dos  pilas  de  ejecuci�n  de  m�todos,  es  decir,  dos
 *    instant�neas de la ejecuci�n. Indica en qu� instante se encuentra cada pila:
 *    		i. El metodo3 se est� ejecutando,
 *    		ii. El m�todo 3 ha finalizado y devuelve el control al metodo2
 * b. Realiza una captura del error. Indica qu� tipo de excepci�n es: verificada o no verificada.
 * c. Indica d�nde se lanza la excepci�n
 * d. Indica d�nde se captura la excepci�n
 * e. Modifica   el   c�digo   para   que   la excepci�n   sea   capturada   en   metodo3 mostrando 
 *    el mensaje �Divisi�n por cero�. Utiliza  el  men� "C�digo fuente..." de Eclipse. Entr�galo en
 *    TestPropagaExcepcion2.
 * f. Modifica el c�digo para que la excepci�n sea capturada de la misma forma en metodo2. Entr�galo en
 * 	  TestPropagaExcepcion3.
 * g. Modifica el c�digo para que la excepci�n sea capturada de la misma forma en el main. Entr�galo en
 *    TestPropagaExcepcion4.
 *    
 * @author Estela Mu&ntilde;oz
 * @author Pedro J. Ramos
 * @version 1.0
 * 
 */

public class TestPropagaExcepcion {
	public static void main(String[] args) {
		metodo1();
	}

	private static void metodo1() {
		metodo2();
	}

	private static void metodo2() {
		metodo3();
	}

	private static void metodo3() {
		int a = 7 / 0;
	}
}
