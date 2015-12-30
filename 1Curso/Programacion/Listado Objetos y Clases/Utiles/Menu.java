package Utiles;

public class Menu {

	/**
	 * Titulo del menu
	 */
	private String titulo;

	/**
	 * Vector que contiene las opciones del menu
	 */
	private String[] vector;

	/**
	 * Constructor del Objeto Menu
	 * 
	 * @param numOpciones
	 *            Opciones para el menú
	 * @param vector
	 *            Vector que almacena las opciones del menú
	 */
	public Menu(String titulo, String[] vector) {
		setTitulo(titulo);
		setVector(vector);
	}

	/**
	 * Devuelve el valor del estado de Titulo
	 * 
	 * @return titulo
	 */
	private String getTitulo() {
		return titulo;
	}

	/**
	 * Actualiza el estado de titulo
	 * 
	 * @param titulo
	 */
	private void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * Devuelve el valor del estado de vector
	 * 
	 * @return
	 */
	private String[] getVector() {
		return vector;
	}

	/**
	 * Actualiza el estado de vector
	 * 
	 * @param vector
	 */
	private void setVector(String[] vector) {
		this.vector = vector;
	}

	/**
	 * Convierte el vector a una cadena
	 * 
	 * @return cadena con el contenido del vector
	 */
	private String mostrar() {
		String cadena = titulo + "\n";

		for (int i = 0; i < vector.length; i++) {
			cadena += i + ". " + vector[i] + "\n";
		}

		return cadena;
	}

	/**
	 * Recoge del usuario una opcion valida para el menu
	 * 
	 * @return opcion elegida por el usuario
	 */
	public int recogerOpcion() {
		int opcion;
		do {
			opcion = Teclado.leerEntero("Elige una opcion disponible:");
		} while (opcion < 0 || opcion > vector.length);

		return opcion;
	}

	/**
	 * Gestiona el menu invocando a mostrar y a opcion
	 * 
	 * @return opcion elegida del menu
	 */
	public int gestionar() {
		System.out.println(mostrar());
		return recogerOpcion();
	}

	/**
	 * Muestra un mensaje de despedida del menu
	 * 
	 * @return cadena a mostrar al salir del menu
	 */
	public String despedida() {
		return "Hasta luego, gracias por utilizar nuestro menu";
	}
}