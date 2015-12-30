package testAscensor;

import sistemaAscensor.Ascensor;
import sistemaAscensor.DestinoIncorrectoException;
import utiles.Teclado;

/**
 * @author Lourdes
 * 
 */
public class TestAscensor {
	public static void main(String args[]) {
		int destino = 0;
		char c;

		Ascensor ascensor = Ascensor.crearAscensor();
		do {
			do {

				try {
					destino = Teclado.leerEntero(ascensor
							+ "\nElige un destino: ");

					System.out.println(ascensor.viajar(destino));
				} catch (DestinoIncorrectoException e) {
					System.out.println(e.getMessage());
				}
			} while (!ascensor.destinoCorrecto(destino));

			c = Teclado.leerCaracter("Quieres dejar el ascensor ya? ");
		} while ((c == 'n') || (c == 'N'));
	}
}
