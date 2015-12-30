/**
 * 
 */
package circulos.modificado;

/**
 * Demostración de un sencillo objeto, preocupándonos del encapsulamiento,
 * documentación javadoc...
 * 
 * @author mlmc
 * 
 */
public class Circulo {

	/**
	 * Radio del círculo
	 */
	private int radio;

	/**
	 * Devuelve el radio del círculo
	 * 
	 * @return radio del círculo
	 */
	private int getRadio() {
		return radio;
	}

	/**
	 * Modifica el radio del círculo
	 * 
	 * @param radio
	 *            Nuevo radio del círculo
	 * @throws RadioInvalidoException
	 *             si el radio no es válido
	 */
	private void setRadio(int radio) throws RadioInvalidoException {
		if (radio <= 0)
			throw new RadioInvalidoException("El radio ha de ser positivo");
		this.radio = radio;
	}

	/**
	 * Construye un nuevo círculo de radio especificado
	 * 
	 * @param radio
	 *            radio del nuevo círculo
	 * @throws RadioInvalidoException
	 *             si el radio no es válido
	 */
	Circulo(int radio) throws RadioInvalidoException {
		// this.radio = radio;
		setRadio(radio);
	}

	/**
	 * El círculo aumenta su radio en una unidad
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
	 * El círculo disminuye su radio en una unidad
	 * 
	 * @throws RadioInvalidoException
	 *             si el nuevo radio es inválido
	 */
	void menguar() throws RadioInvalidoException {
		// radio--;
		setRadio(getRadio() - 1);
	}

	/**
	 * Muestra por consola el estado del círculo
	 */
	void mostrar() {
		System.out.println("Soy un círculo de radio " + radio / 1000d
				+ " metros. Ocupo un área de " + area() / 1000000d
				+ " metros cuadrados");
	}

	/**
	 * Devuelve el área del círculo
	 * 
	 * @return Área del círculo
	 */
	double area() {
		return Math.PI * radio * radio;
	}

	@Override
	public String toString() {

		return "Soy un círculo de radio " + radio / 1000d
				+ " metros. Ocupo un área de " + area() / 1000000d
				+ " metros cuadrados";
	}
}
