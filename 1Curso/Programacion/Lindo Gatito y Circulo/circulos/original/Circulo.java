/**
 * 
 */
package circulos.original;

/**
 * Demostración de un sencillo objeto, sin preocuparnos de la privacidad,
 * accesibilidad, documentación javadoc...
 * 
 * @author mlmc
 * 
 */
public class Circulo {

	int radio;// en milímetros

	// Constructor del objeto. Se utiliza para crear un objeto de la clase.
	// Inicializan el
	// estado del objeto
	Circulo(int radio) {
		this.radio = radio;
	}

	// Comportamiento del objeto (métodos o mensajes que se le envían al objeto)
	void crecer() {
		radio++;
	}

	void menguar() {
		radio--;
	}

	void mostrar() {
		System.out.println("Soy un círculo de radio " + radio / 1000d
				+ " metros. Ocupo un área de " + area() / 1000000d
				+ " metros cuadrados");
	}

	double area() {
		return Math.PI * radio * radio;
	}
}
