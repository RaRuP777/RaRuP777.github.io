package Casino;

public class Jugador {
	private String nombre;
	private int jugadas;
	private int ganadas;
	private int puntos;
			

	//constructor
	public Jugador(String nombre) {
		setNombre(nombre);
		setJugadas(0);
		setGanadas(0);
		setPuntos(0);
	}

	/**
	 * Devuelve el valor del atributo
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Modifica el valor del atributo
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve el valor del atributo
	 * @return
	 */
	public int getJugadas() {
		return jugadas;
	}

	/**
	 * Modifica el valor del atributo
	 * @param nombre
	 */
	public void setJugadas(int jugadas) {
		this.jugadas = jugadas;
	}

	/**
	 * Devuelve el valor del atributo
	 * @return
	 */
	public int getGanadas() {
		return ganadas;
	}

	/**
	 * Modifica el valor del atributo
	 * @param nombre
	 */
	public void setGanadas(int ganadas) {
		this.ganadas = ganadas;
	}

	/**
	 * Devuelve el valor del atributo
	 * @return
	 */
	public int getPuntos() {
		return puntos;
	}

	/**
	 * Modifica el valor del atributo
	 * @param nombre
	 */
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	/**
	 * String a mostrar cuando se imprime el objeto
	 */
	@Override
	public String toString() {
		return "Jugador: " + nombre + ", ha jugado " + jugadas
				+ " partidas y ha ganado " + ganadas;
	}
}
