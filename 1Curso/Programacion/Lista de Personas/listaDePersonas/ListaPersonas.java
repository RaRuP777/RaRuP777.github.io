package preparacionExamenMarzo.listaDePersonas;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Crea una estructura din�mica de personas.
 * 
 * Una persona consta de:
 * <ol>
 * 
 * <li>Nombre (regex con m�nimo de tres caracteres v�lidos seguidos)
 * 
 * <li>Apellido primero (regex con m�nimo de tres caracteres v�lidos seguidos)
 * 
 * <li>Apellido segundo (regex con m�nimo de tres caracteres v�lidos seguidos)
 * 
 * <li>Fecha de nacimiento (regex con formato dd/mm/aaaa y (opcional) es v�lida
 * (a�o bisiesto)
 * 
 * <li>C�digo postal (regex que admita pplll � pp.lll)
 * 
 * <li>Edad (opcional)
 * 
 * <li>Identificador un�voco, generado mediante un campo static)
 * </ol>
 * Con la estructura podr�s realizar las siguientes operaciones:
 * <ol>
 * 
 * <li>A�adir una nueva persona
 * 
 * <li>Eliminarla (utiliza contains)
 * 
 * <li>Contar y mostrar los que hay de una provincia (utiliza iteradores)
 * 
 * <li>Mostrar la estructura al completo(utiliza toString)
 * </ol>
 * 
 * @author Mar�aLourdes
 * 
 */
public class ListaPersonas {
	/**
	 * colecci�n de Personas. No puede tener null
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
