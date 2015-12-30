/**
 * 
 */
package circulos.original;

/**
 * Demostraci�n de un sencillo objeto, sin preocuparnos de la privacidad,
 * accesibilidad, documentaci�n javadoc...
 * 
 * @author mlmc
 * 
 */
public class Circulo {

	int radio;// en mil�metros

	// Constructor del objeto. Se utiliza para crear un objeto de la clase.
	// Inicializan el
	// estado del objeto
	Circulo(int radio) {
		this.radio = radio;
	}

	// Comportamiento del objeto (m�todos o mensajes que se le env�an al objeto)
	void crecer() {
		radio++;
	}

	void menguar() {
		radio--;
	}

	void mostrar() {
		System.out.println("Soy un c�rculo de radio " + radio / 1000d
				+ " metros. Ocupo un �rea de " + area() / 1000000d
				+ " metros cuadrados");
	}

	double area() {
		return Math.PI * radio * radio;
	}
}
