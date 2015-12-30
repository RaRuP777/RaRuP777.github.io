package ListadoHerencia1;

/**
 * 
 * @author Estela Mu&nilde
 * @author Pedro J. Ramos
 *
 */
public class Persona {

	private String nombre;
	private String apellido;
	private String NIF;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNIF() {
		return NIF;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido
				+ ", NIF=" + NIF + "]";
	}

	public void setNIF(String nIF) {
		NIF = nIF;
	}

	public Persona(String nombre, String apellido, String nIF) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		NIF = nIF;
	}
}
