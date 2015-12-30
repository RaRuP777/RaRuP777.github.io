package concesionarioCoches;

public class MatriculaNoValidaException extends Exception {

	/**
	 * Variable de Indentificacion para Serializable
	 */
	private static final long serialVersionUID = 1L;

	public MatriculaNoValidaException(String mensaje) {
		super(mensaje);
	}

}
