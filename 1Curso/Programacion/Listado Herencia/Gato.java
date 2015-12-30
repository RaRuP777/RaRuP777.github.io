package ListadoHerencia1;

/**
 * 
 * @author Estela Mu&ntildeoz
 * @author Pedro J. Ramos
 *
 */
public class Gato extends Mamifero {

	private boolean maulla;

	public Gato(String nombre) {
		super(4, nombre);
		this.maulla = maulla;
	}

	/**
	 * Hace que el gato deje de maullar
	 * @return cadena el estado del gato
	 */
	public String callar() {
		this.maulla = false;
		return nombre + " ha dejado de maullar";
	}

	/**
	 * Hace que el gato maulle
	 * @return cadena con el estado del gato
	 */
	public String maullar() {
		this.maulla = true;
		return nombre + " esta maullando";
	}

	/**
	 * Muestra el estado del campo maulla
	 */
	public boolean getMaulla() {
		return maulla;
	}

	/**
	 * Sustituye la lo que se muestra cuando el objeto es mostrado
	 */
	@Override
	public String toString() {
		return "Gato [maulla=" + maulla + "]";
	}
}