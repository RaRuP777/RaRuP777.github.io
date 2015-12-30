/**
 * 
 */
package circulos.original;

/**
 * Clase que prueba el comportamiento de un sencillo círculo
 * 
 * @author mlmc
 * 
 */
public class TestCirculo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//instanciación del objeto
		Circulo circulo = new Circulo(500);
		//Tengo una única instancia de la clase Circulo.
		circulo.crecer();
		circulo.crecer();
		circulo.crecer(); 	
		circulo.crecer();
		circulo.mostrar();
		circulo.menguar();
		circulo.mostrar();
	}

}
