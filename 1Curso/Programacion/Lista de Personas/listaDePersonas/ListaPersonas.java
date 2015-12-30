package preparacionExamenMarzo.listaDePersonas;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Crea una estructura dinámica de personas.
 * 
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
 * Con la estructura podrás realizar las siguientes operaciones:
 * <ol>
 * 
 * <li>Añadir una nueva persona
 * 
 * <li>Eliminarla (utiliza contains)
 * 
 * <li>Contar y mostrar los que hay de una provincia (utiliza iteradores)
 * 
 * <li>Mostrar la estructura al completo(utiliza toString)
 * </ol>
 * 
 * @author MaríaLourdes
 * 
 */
public class ListaPersonas {
	/**
	 * colección de Personas. No puede tener null
	 */
	private ArrayList<Persona> arrPersonas = new ArrayList<Persona>();

	boolean annadir(String nombre, String primerApellido,
			String segundoApellido, String fechaDeNacimiento,
			String codigoPostal) {
		Persona persona = Persona.instanciarPersona(nombre, primerApellido,
				segundoApellido, fechaDeNacimiento, codigoPostal);
		if (persona == null || arrPersonas.contains(persona))
			return false;
		return arrPersonas.add(persona);

	}

	boolean eliminar(int id) {
		return arrPersonas.remove(Persona.instanciarPersona(id));
	}

	ArrayList<Persona> get(int provincia) {
		ArrayList<Persona> arrayProvincia = new ArrayList<Persona>();
		for (Iterator<Persona> iterator = arrPersonas.iterator(); iterator
				.hasNext();) {
			Persona persona = (Persona) iterator.next();
			if (persona.getProvincia() == provincia)
				arrayProvincia.add(persona);
		}

		return arrayProvincia;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Concesionario [Lista de personas =" + arrPersonas + "]";
	}

}
