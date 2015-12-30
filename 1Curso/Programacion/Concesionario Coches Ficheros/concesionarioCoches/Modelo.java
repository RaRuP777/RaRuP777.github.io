package concesionarioCoches;

/**
 *
 * @author Estela Mu&ntilde;oz
 * @author Pedro J. Ramos
 * @version 1.0
 *
 */
public enum Modelo {

	/**
	 * Modelo Serie 1 de la Marca BMW
	 */
	SERIE1(Marca.BMW),
	/**
	 * Modelo Serie 2 de la Marca BMW
	 */
	SERIE2(Marca.BMW),
	/**
	 * Modelo Serie 3 de la Marca BMW
	 */
	SERIE3(Marca.BMW),
	/**
	 * Modelo Serie 5 de la Marca BMW
	 */
	SERIE5(Marca.BMW),
	/**
	 * Modelo CORDOBA de la Marca SEAT
	 */
	CORDOBA(Marca.SEAT),
	/**
	 * Modelo IBIZA de la Marca SEAT
	 */
	IBIZA(Marca.SEAT),
	/**
	 * Modelo TOLEDO de la Marca SEAT
	 */
	TOLEDO(Marca.SEAT);

	/**
	 * Marca del coche
	 */
	private Marca marca;

	/**
	 * Constructor que crea el modelo del coche
	 * 
	 * @param marca
	 *            Marca del coche
	 */
	private Modelo(Marca marca) {
		this.marca = marca;
	}

	/**
	 * Devuelve la marca del coche
	 * 
	 * @return Marca del coche
	 */
	public Marca getMarca() {
		return marca;
	}

	/**
	 * Muestra el modelo del coche
	 * 
	 * return El modelo del coche con su marca
	 */
	public String toString() {
		return name() + ", " + getMarca();

	}

	// Para el menú-------------------------------------------------
	/**
	 * Array que contiene los modelos del coche
	 */
	private static final Modelo[] VALUES = Modelo.values();

	/**
	 * Devuelve las opciones del men&uacute;, que contienen los modelos
	 * disponibles para un coche
	 * 
	 * @return Opciones del men&uacute;
	 */
	static String[] generarOpcionesMenu() {
		String[] opcionesMenu = new String[VALUES.length + 1];
		int i = 0;
		for (Modelo modelo : VALUES) {
			opcionesMenu[i++] = modelo.name();
		}
		opcionesMenu[i] = "Salir";
		return opcionesMenu;
	}

	/**
	 * Devuelve un array que contiene los modelos del coche
	 * 
	 * @return Modelos del coche
	 */
	public static Modelo[] getValues() {
		return VALUES;
	}
	// -------------------------------------------------

}
