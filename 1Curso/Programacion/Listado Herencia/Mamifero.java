package ListadoHerencia1;

/**
 * 
 * @author Estela Mu&ntildeoz
 * @author Pedro J. Ramos
 *
 */
public class Mamifero {

	protected int patas;
	protected String nombre;

	public Mamifero(int patas, String nombre) {
		super();
		this.patas = patas;
		this.nombre = nombre;
	}

	protected int getPatas() {
		return patas;
	}

	private void setPatas(int patas) {
		this.patas = patas;
	}

	protected String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Sustituye la lo que se muestra cuando el objeto es mostrado
	 */
	@Override
	public String toString() {
		return "Mamifero [patas=" + patas + ", nombre=" + nombre + "]";
	}
}
