package ListadoHerencia1;

/**
 * 
 * @author Estela Mu&nilde
 * @author Pedro J. Ramos
 *
 */
public class Estudiante extends Persona {

	private Nivel nivel;

	public Estudiante(String nombre, String apellido, String nIF, Nivel nivel) {
		super(nombre, apellido, nIF);
		this.nivel = nivel;
	}

	public Nivel getNivel() {
		return nivel;
	}

	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}

	@Override
	public String toString() {
		return "Estudiante [nivel=" + nivel + "]";
	}

}
