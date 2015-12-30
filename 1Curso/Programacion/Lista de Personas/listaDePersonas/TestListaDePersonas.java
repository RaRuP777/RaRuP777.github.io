package preparacionExamenMarzo.listaDePersonas;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;

import utiles.Menu;
import utiles.Teclado;

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
public class TestListaDePersonas {
	static Menu menu = new Menu("Lista de Personas", new String[] { "Añadir",
			"Eliminar", "De una provincia", "Mostrar lista", "Salir" });
	static ListaPersonas listaPersonas = new ListaPersonas();

	public static void main(String[] args) {
		/////////////////////////////////////////////////////////
		listaPersonas.annadir("Ana", "Gómez", "De la Serna", "31/01/2000",
				"51002");
		listaPersonas.annadir("Pepe", "Tómez", "De la Serna", "31/01/2000",
				"51003");
		listaPersonas.annadir("Anacleta", "Francia", "De los Ríos", "31/01/2000",
				"14002");
		listaPersonas.annadir("Rigoberto", "Fernández", "Del Río", "31/01/2000",
				"14003");
		
		System.out.println("Inicialmente, la lista contiene: \n"+listaPersonas);
		////////////////////////////////////////////////////////77
		do {
			switch (menu.gestionar()) {
			case 1:// "Añadir
				annadirPersona();
				break;
			case 2:// Eliminar
				eliminarPersona();
				break;
			case 3:// De una provincia
				getDeProvincia();
				break;
			case 4:// Mostrar lista
				System.out.println(listaPersonas);
				break;
			default:// Salir
				System.out.println("Aaaaaaaaaaaaaaaaaaaaadios");
				return;
			}
		} while (true);
	}

	/**
	 * 
	 */
	private static void getDeProvincia() {
		int provincia = Teclado.leerEntero("Introduce una provincia");
		ArrayList<Persona> listaDeProvincia = listaPersonas.get(provincia);
		
		if (listaDeProvincia.size() == 0)
			System.out.println("No existen personas de esa provincia.");
		else
			System.out.println("Número de personas en la provincia "
					+ provincia + ": " + listaDeProvincia.size() + "\n"
					+ listaDeProvincia);
	}

	/**
	 * 
	 */
	private static void eliminarPersona() {
		if (listaPersonas.eliminar(Teclado
				.leerEntero("Introduce el identificador")))
			System.out.println("Persona eliminada");
		else
			System.out.println("No se ha podido eliminar");
	}

	/**
	 * 
	 */
	private static void annadirPersona() {
		if (listaPersonas.annadir(Teclado.leerCadena("Introduce nombre"),
				Teclado.leerCadena("Introduce primer apellido"),
				Teclado.leerCadena("Introduce segundo apellido"),
				Teclado.leerCadena("Introduce fecha de nacimiento"),
				Teclado.leerCadena("Introduce código postal")))
			System.out.println("Persona añadido con éxito");
		else
			System.out.println("No se ha podido añadir");
	}

}
