package Casino;

public class Dado {
	
	/**
	 * Atributos del objeto
	 */
	private int numCaras;
	private int valores;

	//Constructor
	public Dado(int numCaras, int valores) {
		setNumCaras(numCaras);
		setValores(valores);
	}

	/**
	 * Devuelve el valor del atributo
	 * @return
	 */
	private int getNumCaras() {
		return numCaras;
	}

	/**
	 * Modifica el valor del atributo
	 * @param nombre
	 */
	private void setNumCaras(int numCaras) {
		this.numCaras = numCaras;
	}

	/**
	 * Devuelve el valor del atributo
	 * @return
	 */
	int getValores() {
		return valores;
	}

	/**
	 * Modifica el valor del atributo
	 * @param nombre
	 */
	void setValores(int valores) {
		this.valores = valores;
	}

	/**
	 * Laza el dado y selecciona una cara aleatoria
	 */
	public void lanzar(){
		valores = (int) Math.rint((Math.random()*(numCaras-1))+1);
	}
	
	/**
	 * String a mostrar cuando el objeto es mostrado
	 */
	@Override
	public String toString() {
		return "Has sacado un " + valores + " en el dado de " + numCaras + " caras";
	}
}
