package lindoGatito.modificado;

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
		try {
			// instanciación del objeto
			//Gato miGato = new Gato(9990, "Gardfield", "Persa");// Tengo una única instancia de la clase Gato.
			Gato miGato = new Gato(5432, "Gardfield", "Persa");// Tengo una única instancia de la clase Gato.
			System.out.println(miGato);

			int contador = 10;
			
			do {
				System.out.println(miGato.comer());
			} while (--contador > 0);
			
			System.out.println(miGato);
			System.out.println(miGato.jugar());
			System.out.println(miGato);
			System.out.println(miGato.dormir());
			System.out.println(miGato);
			// miGato.mostrar();
		} catch (PesoInvalidoException e) {
			System.out.println(e.getMessage());
		}
	}

}
