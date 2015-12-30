/**
 * 
 */
package circulos.modificado;

import utiles.Teclado;

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
		Circulo circulo;
		try {
			circulo = new Circulo(Teclado.leerEntero("Dame el radio del c�rculo"));
			//Tengo una �nica instancia de la clase Circulo.
			circulo.crecer();
			circulo.crecer();
			circulo.crecer(); 	
			circulo.crecer();
			circulo.mostrar();
			circulo.menguar();
			circulo.mostrar();
		} catch (RadioInvalidoException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
