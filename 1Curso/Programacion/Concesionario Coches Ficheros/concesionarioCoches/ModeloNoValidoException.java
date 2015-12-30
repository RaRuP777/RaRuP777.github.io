package concesionarioCoches;

public class ModeloNoValidoException extends Exception {

	/**
	 * Variable de Indentificacion para Serializable
	 */
	private static final long serialVersionUID = 1L;

	public ModeloNoValidoException(String mensaje) {
		super(mensaje);
	}

}
