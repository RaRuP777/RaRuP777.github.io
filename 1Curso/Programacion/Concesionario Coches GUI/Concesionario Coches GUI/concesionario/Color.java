package concesionario;

/**
 *
 * @author Estela Mu&ntilde;oz
 * @author Pedro J. Ramos
 * @version 1.0
 *
 */
public enum Color {
	/**
	 * Color plateado
	 */
	PLATA,
	/**
	 * Color rojo
	 */
	ROJO,
	/**
	 * Color azul
	 */
	AZUL;
	/**
	 * Array que contiene todos los colores
	 */
	private static final Color[] VALUES = Color.values();

	/**
	 * Devuelve las opciones del men&uacute;, que contienen los colores
	 * disponibles para un coche
	 * 
	 * @return Opciones del men&uacute;
	 */
	public static String[] generarOpcionesMenu() {
		String[] opcionesMenu = new String[getValues().length + 1];
		int i = 0;
		for (Color color : getValues()) {
			opcionesMenu[i++] = color.name();
		}
		opcionesMenu[i] = "Salir";
		return opcionesMenu;
	}

	/**
	 * Devuelve un array que contiene los colores
	 * 
	 * @return Array de los colores
	 */
	public static Color[] getValues() {
		return VALUES;
	}

}
