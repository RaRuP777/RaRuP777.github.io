package pgn.examenMarzo.concesionarioCoches;

public class CocheNoExisteException extends Exception {

	public CocheNoExisteException(String mensaje) {
		super(mensaje);
	}
}
