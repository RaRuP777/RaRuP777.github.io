/**
 * 
 */
package lindoGatito;

/**
 * Demostración de un sencillo objeto, sin preocuparnos de la privacidad,
 * accesibilidad, documentación javadoc...
 * 
 * @author mlmc
 * 
 */
class Gato {// Clase o molde para crear objetos (lindos gatitos)

	static final int PESO_MAXIMO = 10;
	static final int PESO_MINIMO = 2;
	// estado del objeto (campos o atributos)
	int peso;
	String nombre;
	String raza;

	// Constructor del objeto. Se utilizan para crear un objeto. Inicializan el
	// estado del objeto
	Gato(int peso, String nombre, String raza) {
		this.peso = peso;
		this.nombre = nombre;
		this.raza = raza;
	}

	// Comportamiento del objeto (métodos o mensajes que se le envían al objeto)
	void comer() {
		
		peso++;
		if(peso>PESO_MAXIMO)
			System.out.println("Estoy muerto");
		System.out.println("Rico, rico...");
	}

	void jugar() {
		peso--;
		System.out.println("Qué diver...");
	}

	void dormir() {
		System.out.println("Ronroneo. Zzz");
	}

	void mostrar() {
		System.out.println("Hola, soy " + nombre + " de raza " + raza
				+ ". Peso " + peso / 1000d + " kilos");

	}
}
