//Lo que contenga este archivo estará en el paquete sistemaAscensor
package sistemaAscensor;

/**
 * La clase Ascensor simula el comportamiento de un ascensor
 * 
 * @author Lourdes
 * @version 2.0
 */
public class CopyOfAscensor {
	// Campos de la clase Ascensor
	// todos privados: sólo accesibles dentro de esta clase
	/**
	 * Planta en la que se encuentra el ascensor
	 * */
	private int plantaActual = 1;
	/**
	 * Total de plantas del ascensor
	 * 
	 * */
	private int numPlantas = 2;
	/**
	 * Puerta del ascensor
	 * */
	private CopyOfPuerta puerta; // referencia a un objeto de la clase Puerta todavía
							// no creado

	/**
	 * Construye un nuevo objeto Ascensor con el número de plantas que tendrá el
	 * ascensor
	 * 
	 * @param numPlantas
	 *            total de plantas del ascensor
	 */
	public CopyOfAscensor(int numPlantas) {// constructor visible fuera del paquete
										// para que TestAscensor pueda usarlo
		setNumPlantas(numPlantas);
		puerta = new CopyOfPuerta(); // creo objeto de la clase puerta
	}

	/**
	 * Simula la bajada de una planta. Cada vez que el ascensor baja, decrementa
	 * el campo plantaActual (privado a la clase) y muestra un mensaje
	 * indicándolo.
	 */
	private void bajar() {// sólo visible en la clase
		plantaActual--;
		System.out.println("Bajando. Planta " + getPlantaActual() + ".");
	}

	/**
	 * Simula la bajada hasta su destino.
	 * 
	 * @param plantaDestino
	 */
	private void bajar(int plantaDestino) {// sólo visible en la clase
		int numVeces = (plantaActual - plantaDestino);
		for (int i = 0; i < numVeces; i++)
			bajar();
	}

	/**
	 * 
	 * Muestra mensaje indicando el destino conseguido
	 * */
	private void destinoConseguido() {
		puerta.abrir();
		System.out.println("Estás en la planta " + getPlantaActual()
				+ ". Destino conseguido");
		puerta.cerrar();
	}

	/**
	 * Devuelve si el destino es correcto o no
	 * 
	 * @param destino
	 *            planta destino
	 * @return verdadero si el destino es correcto
	 * 
	 */
	public boolean destinoCorrecto(int destino) {
		if ((destino < 1) || (destino > numPlantas))
			return false;
		return true;

	}

	/**
	 * Devuelve el valor de la planta actual donde se encuentra el ascensor
	 * 
	 * @return la planta actual
	 */
	public int getPlantaActual() {// sólo visible en la clase
		return plantaActual;
	}

	/**
	 * @param numPlantas
	 *            el numero de plantas a asignar
	 */
	private void setNumPlantas(int numPlantas) {
		this.numPlantas = numPlantas;
	}

	/**
	 * Simula la subida de una única planta. Cada vez que el ascensor sube,
	 * incrementa el campo plantaActual y muestra un mensaje indicándolo.
	 */
	private void subir() {// sólo visible en la clase
		plantaActual++; // no accesible desde fuera. Sólo accesible en la clase
		System.out.println("Subiendo. Planta " + getPlantaActual() + ".");
	}

	/**
	 * Simula la subida hasta su destino.
	 * 
	 * @param plantaDestino
	 */
	private void subir(int plantaDestino) {
		for (int i = plantaActual; i < plantaDestino; i++)// desde plantaActual a plantaDestino
			subir();
	}

	/**
	 * Simula cuando un usuario le da a un botón indicando el número de planta a
	 * la que va
	 * 
	 * @param destinoPlanta
	 *            planta a la que quiere ir el usuario
	 * */
	public void viajar(int destinoPlanta) {// visible fuera del paquete
		puerta.abrir();
		puerta.cerrar();

		if (!(destinoCorrecto(destinoPlanta)))
			return;

		if (destinoPlanta > plantaActual)
			subir(destinoPlanta);
		else
			bajar(destinoPlanta);

		destinoConseguido();
	}

}
