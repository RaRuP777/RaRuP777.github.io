package lindoGatito;
/**
 * Clase que prueba el comportamiento de un sencillo gato
 * 
 * @author mlmc
 *
 */
public class TestGato {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//instanciaci�n del objeto
		Gato miGato = new Gato(4597, "Gardfield", "Persa");
		
		//Tengo una �nica instancia de la clase Gato.
		miGato.comer();
		miGato.jugar();
		miGato.dormir();
		miGato.mostrar();
	}

}
