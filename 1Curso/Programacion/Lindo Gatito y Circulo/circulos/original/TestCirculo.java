/**
 * 
 */
package circulos.original;

/**
 * Clase que prueba el comportamiento de un sencillo c�rculo
 * 
 * @author mlmc
 * 
 */
public class TestCirculo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//instanciaci�n del objeto
		Circulo circulo = new Circulo(500);
		//Tengo una �nica instancia de la clase Circulo.
		circulo.crecer();
		circulo.crecer();
		circulo.crecer(); 	
		circulo.crecer();
		circulo.mostrar();
		circulo.menguar();
		circulo.mostrar();
	}

}
