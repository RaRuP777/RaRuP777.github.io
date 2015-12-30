/**
 * 
 */
package circulos.modificado;

/**
 * Demostraci�n de un sencillo objeto, preocup�ndonos del encapsulamiento,
 * documentaci�n javadoc...
 * 
 * @author mlmc
 * 
 */
public class Circulo {

	/**
	 * Radio del c�rculo
	 */
	private int radio;

	/**
	 * Devuelve el radio del c�rculo
	 * 
	 * @return radio del c�rculo
	 */
	private int getRadio() {
		return radio;
	}

	/**
	 * Modifica el radio del c�rculo
	 * 
	 * @param radio
	 *            Nuevo radio del c�rculo
	 * @throws RadioInvalidoException
	 *             si el radio no es v�lido
	 */
	private void setRadio(int radio) throws RadioInvalidoException {
		if (radio <= 0)
			throw new RadioInvalidoException("El radio ha de ser positivo");
		this.radio = radio;
	}

	/**
	 * Construye un nuevo c�rculo de radio especificado
	 * 
	 * @param radio
	 *            radio del nuevo c�rculo
	 * @throws RadioInvalidoException
	 *             si el radio no es v�lido
	 */
	Circulo(int radio) throws RadioInvalidoException {
		// this.radio = radio;
		setRadio(radio);
	}

	/**
	 * El c�rculo aumenta su radio en una unidad
	 * 
	 */
	void crecer() {
		// radio++;
		try {
			setRadio(getRadio() + 1);
		} catch (RadioInvalidoException e) {
			e.printStackTrace();
		}
	}

	/**
	 * El c�rculo disminuye su radio en una unidad
	 * 
	 * @throws RadioInvalidoException
	 *             si el nuevo radio es inv�lido
	 */
	void menguar() throws RadioInvalidoException {
		// radio--;
		setRadio(getRadio() - 1);
	}

	/**
	 * Muestra por consola el estado del c�rculo
	 */
	void mostrar() {
		System.out.println("Soy un c�rculo de radio " + radio / 1000d
				+ " metros. Ocupo un �rea de " + area() / 1000000d
				+ " metros cuadrados");
	}

	/**
	 * Devuelve el �rea del c�rculo
	 * 
	 * @return �rea del c�rculo
	 */
	double area() {
		return Math.PI * radio * radio;
	}

	@Override
	public String toString() {

		return "Soy un c�rculo de radio " + radio / 1000d
				+ " metros. Ocupo un �rea de " + area() / 1000000d
				+ " metros cuadrados";
	}
}
