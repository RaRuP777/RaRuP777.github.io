/**
 * Paquete que contiene los archivos del programa
 */
package concesionario;
/**
 * Enum que contiene los posibles modelos de los coches
 * @author Rafael Navarro Prieto
 * @version 1.0
 *
 */
public enum Modelo {
	/**
	 * Modelo serie1
	 */
	SERIE1(Marca.BMW),
	/**
	 * Modelo serie2
	 */
	SERIE2(Marca.BMW),
	/**
	 * Modelo serie3
	 */
	SERIE3(Marca.BMW),
	/**
	 * Modelo serie5
	 */
	SERIE5(Marca.BMW),
	/**
	 * Modelo Cordoba
	 */
	CORDOBA(Marca.SEAT),
	/**
	 * Ibiza
	 */
	IBIZA(Marca.SEAT),
	/**
	 * Modelo Toledo
	 */
	TOLEDO(Marca.SEAT);
	/**
	 * Marca del modelo
	 */
	private Marca marca;
	/**
	 * contructor de la enumeraci�n
	 * @param marca marca correspondiente del modelo de coche
	 */
	private Modelo(Marca marca) {
		this.marca = marca;
	}
	/**
	 * Metodo get de la marca
	 * @return devuelve la marca correspondiente a un modelo de coche
	 */
	public Marca getMarca() {
		return marca;
	}
	/**
	 * Metodo toString sobreescrito
	 */
	public String toString() {
		return name();

	}

	/**
	 * Array de modelos que contiene las opciones para un menu
	 */
	private static final Modelo[] VALUES = Modelo.values();
	/**
	 * Metodo que genera las opciones de un menu de modelos de coches
	 * @return devuelve un array de cadenas con los modelos posibles 
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
	 * Metodo get del campo values
	 * @return devuelve un array de modelo con todas las opciones de modelos de coches
	 */
	public static Modelo[] getValues() {
		return VALUES;
	}

}
