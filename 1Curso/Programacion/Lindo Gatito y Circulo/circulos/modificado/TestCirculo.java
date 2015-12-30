/**
 * 
 */
package circulos.modificado;

import utiles.Teclado;

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
		Circulo circulo;
		try {
			circulo = new Circulo(Teclado.leerEntero("Dame el radio del círculo"));
			//Tengo una única instancia de la clase Circulo.
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
