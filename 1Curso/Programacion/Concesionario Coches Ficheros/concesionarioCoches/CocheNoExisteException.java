package concesionarioCoches;

public class CocheNoExisteException extends Exception {

	/**
	 * Variable de Indentificacion para Serializable
	 */
	private static final long serialVersionUID = 1L;

	public CocheNoExisteException(String mensaje) {
		super(mensaje);
	}
}
