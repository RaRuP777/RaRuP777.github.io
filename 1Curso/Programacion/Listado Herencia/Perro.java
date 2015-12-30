package ListadoHerencia1;

/**
 * 
 * @author Estela Mu&ntildeoz
 * @author Pedro J. Ramos
 *
 */
public class Perro extends Mamifero {

	private Boolean ladra;

	public Perro(String nombre) {
		super(4, nombre);
		this.ladra = false;
	}

	/**
	 * Hace que el perro deje de ladrar
	 * 
	 * @return cadena el estado del perro
	 */
	public String callar() {
		this.ladra = false;
		return nombre + " ha dejado de ladrar";
	}

	/**
	 * Hace que el perro ladre
	 * 
	 * @return cadena con el estado del perro
	 */
	public Boolean getLadra() {
		return ladra;
	}

	/**
	 * Muestra el estado del campo ladrar
	 */
	public String ladrar() {
		this.ladra = true;
		return nombre + " esta ladrando";
	}

	/**
	 * Sustituye la lo que se muestra cuando el objeto es mostrado
	 */
	@Override
	public String toString() {
		return "Perro [ladra=" + ladra + "]";
	}

}
