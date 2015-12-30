package concesionarioCoches;

public class CocheYaExisteException extends Exception {

	/**
	 * Variable de Indentificacion para Serializable
	 */
	private static final long serialVersionUID = 1L;

	public CocheYaExisteException(String mensaje) {
		super(mensaje);
	}
}
