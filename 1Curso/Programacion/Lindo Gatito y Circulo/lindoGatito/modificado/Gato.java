/**
 * 
 */
package lindoGatito.modificado;

/**
 * Demostración de un sencillo objeto, sin preocuparnos de la privacidad,
 * accesibilidad, documentación javadoc... -Añadimos encapsulamiento y
 * excepciones para controlar estados indeseados
 * 
 * @author mlmc
 * 
 */
class Gato {// Clase o molde para crear objetos (lindos gatitos)

	static final int PESO_MAXIMO = 10000;
	static final int PESO_MINIMO = 2000;
	// estado del objeto (campos o atributos)
	private int peso;
	private String nombre;
	private String raza;

	// Constructor del objeto. Se utilizan para crear un objeto. Inicializan el
	// estado del objeto
	Gato(int peso, String nombre, String raza) throws PesoInvalidoException {
		setPeso(peso);
		this.nombre = nombre;
		this.raza = raza;
	}

	private void setPeso(int peso) throws PesoInvalidoException {
		if (!esValido(peso))
			throw new PesoInvalidoException("El peso "+peso+" no es válido ["
					+ PESO_MINIMO + "," + PESO_MAXIMO + "]");
		this.peso = peso;
	}

	private boolean esValido(int peso) {
		if (peso >= PESO_MINIMO && peso <= PESO_MAXIMO)
			return true;
		return false;
	}

	// Comportamiento del objeto (métodos o mensajes que se le envían al objeto)
	String comer() throws PesoInvalidoException {
		if (!esValido(getPeso() + 1))
			throw new PesoInvalidoException(
					"No puedo comer tanto. Estoy muerto");
		setPeso(getPeso() + 1);
		return "Rico, rico...";
	}

	private int getPeso() {
		return peso;
	}

	String jugar() throws PesoInvalidoException {
		if(!esValido(getPeso()-1))
			throw new PesoInvalidoException("No puedo jugar tanto. Estoy exhausto");
		setPeso(getPeso()-1);
		return "Qué diver...";
	}

	String dormir() {
		return "Ronroneo. Zzz";
	}

	void mostrar() {
		System.out.println("Hola, soy " + nombre + " de raza " + raza
				+ ". Peso " + peso / 1000d + " kilos");

	}
	public String toString(){
		return "Hola, soy " + nombre + " de raza " + raza
				+ ". Peso " + peso / 1000d + " kilos";

	}
}
