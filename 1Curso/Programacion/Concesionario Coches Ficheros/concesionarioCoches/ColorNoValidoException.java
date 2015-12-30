package concesionarioCoches;

public class ColorNoValidoException extends Exception {

	/**
	 * Variable de Indentificacion para Serializable
	 */
	private static final long serialVersionUID = 1L;

	public ColorNoValidoException(String mensaje) {
		super(mensaje);
	}

}
