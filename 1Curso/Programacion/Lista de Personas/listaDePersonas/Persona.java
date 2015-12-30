/**
 * 
 */
package preparacionExamenMarzo.listaDePersonas;

/*
 *No entregues métodos que no utilizas
 *Encapsula
 *Realiza la búsqueda mediante identificador
 *No puede haber dos personas en la lista con el mismo identificador
 *Codifica toString para visualizar los resultados
 *En la lista sólo pueden instanciarse personas con nombre y apellidos válidos, fechas y cp también válidos
 * 
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Una persona consta de:
 * <ol>
 * 
 * <li>Nombre (regex con mínimo de tres caracteres válidos seguidos)
 * 
 * <li>Apellido primero (regex con mínimo de tres caracteres válidos seguidos)
 * 
 * <li>Apellido segundo (regex con mínimo de tres caracteres válidos seguidos)
 * 
 * <li>Fecha de nacimiento (regex con formato dd/mm/aaaa y (opcional) es válida
 * (año bisiesto)
 * 
 * <li>Código postal (regex que admita pplll ó pp.lll)
 * 
 * <li>Edad (opcional)
 * 
 * <li>Identificador unívoco, generado mediante un campo static)
 * </ol>
 * 
 * @author MaríaLourdes
 * 
 */
public class Persona {
	/**
	 * Patrón para un nombre válido
	 */
	static final private Pattern patternNombre = Pattern
			.compile("(?i)^[a-záéíóúÁÉÍÓÚñÑ]{2,}"// 3 caracteres válidos
													// seguidos
					+ "(\\s+[a-záéíóúÁÉÍÓÚñÑ]{2,})*"

					+ "$");
	/**
	 * Patrón para una fecha válida
	 */
	static final private Pattern patternFecha = Pattern
			.compile("^(0[1-9]|[12][0-9]|3[0-1])/"// días, del 01 al 31
					+ "(0[1-9]|1[0-2])/"// mes, del 01 al 12
					+ "[0-9]{4}$");// 4 números
	/**
	 * Patrón para un código postal válido
	 */
	static final private Pattern patternCodigoPostal = Pattern
			.compile("^(52|51|50|[1-4]\\d|0[1-9])(?=.*[1-9])\\d{3}$");
	/**
	 * Contador para identificar al objeto Persona
	 */
	private static int idContador;

	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private String fechaDeNacimiento;
	private String codigoPostal;
	private int id;

	private Persona(int id) {
		this.id = id;
	}

	private Persona(String nombre, String primerApellido,
			String segundoApellido, String fechaDeNacimiento,
			String codigoPostal) {
		super();
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.codigoPostal = codigoPostal;
		this.id = ++Persona.idContador;
	}

	static Persona instanciarPersona(int id) {
		if (id > 0 && id < Persona.idContador)
			return new Persona(id);
		return null;
	}

	static Persona instanciarPersona(String nombre, String primerApellido,
			String segundoApellido, String fechaDeNacimiento,
			String codigoPostal) {
		if (esValidoNombre(nombre) && esValidoNombre(primerApellido)
				&& esValidoNombre(segundoApellido)
				&& esValidaFecha(fechaDeNacimiento) && esValidoCP(codigoPostal))
			return new Persona(nombre, primerApellido, segundoApellido,
					fechaDeNacimiento, codigoPostal);
		return null;
	}

	private static boolean esValidoCP(String codigoPostal) {
		return patternCodigoPostal.matcher(codigoPostal).matches();
	}

	private static boolean esValidaFecha(String fechaDeNacimiento) {
		return patternFecha.matcher(fechaDeNacimiento).matches();
	}

	private static boolean esValidoNombre(String nombre) {
		return patternNombre.matcher(nombre).matches();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "\nPersona [nombre=" + nombre + ", primerApellido="
				+ primerApellido + ", segundoApellido=" + segundoApellido
				+ ", fechaDeNacimiento=" + fechaDeNacimiento
				+ ", codigoPostal=" + codigoPostal + ", id=" + id + "]";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public int getProvincia() {
		Matcher matcher = patternCodigoPostal.matcher(getCodigoPostal());
		matcher.matches();
		return Integer.parseInt(matcher.group(1));
	}

	/**
	 * @return the codigoPostal
	 */
	public String getCodigoPostal() {
		return codigoPostal;
	}

}
