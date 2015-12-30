//Lo que contenga este archivo estar� en el paquete sistemaAscensor
package sistemaAscensor;

/**
 * La clase Puerta simula el comportamiento de una puerta
 * 
 * @author Lourdes
 * @version 2.0
 */
class CopyOfPuerta {
	/**
	 * Indica si la puerta est� abierta o cerrada
	 * */
	private boolean abierta = true;// Campo de la clase Puerta. S�lo accesible
									// dentro de esta clase

	/**
	 * Simula la apertura de la puerta. Modifica su estado a abierta
	 */
	void abrir() {// friendly: s�lo accesible dentro del paquete
		abierta = true;
		System.out.println("Abriendo puerta");
	}

	/**
	 * Simula el cierre de la puerta Modifica su estado a cerrada
	 */
	void cerrar() {// friendly: s�lo accesible dentro del paquete
		abierta = false;
		System.out.println("Cerrando puerta");
	}

	/**
	 * Devuelve el estado de la puerta
	 * */
	boolean estaAbierta() {// friendly: s�lo accesible dentro del paquete
		return abierta;
	}

}
