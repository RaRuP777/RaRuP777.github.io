package listadoExcepciones;

/**
 * 9. Ejecuta el siguiente código y responde:
 * 
 * a. A  continuación  aparecen  dos  pilas  de  ejecución  de  métodos,  es  decir,  dos
 *    instantáneas de la ejecución. Indica en qué instante se encuentra cada pila:
 *    		i. El metodo3 se está ejecutando,
 *    		ii. El método 3 ha finalizado y devuelve el control al metodo2
 * b. Realiza una captura del error. Indica qué tipo de excepción es: verificada o no verificada.
 * c. Indica dónde se lanza la excepción
 * d. Indica dónde se captura la excepción
 * e. Modifica   el   código   para   que   la excepción   sea   capturada   en   metodo3 mostrando 
 *    el mensaje “División por cero”. Utiliza  el  menú "Código fuente..." de Eclipse. Entrégalo en
 *    TestPropagaExcepcion2.
 * f. Modifica el código para que la excepción sea capturada de la misma forma en metodo2. Entrégalo en
 * 	  TestPropagaExcepcion3.
 * g. Modifica el código para que la excepción sea capturada de la misma forma en el main. Entrégalo en
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
