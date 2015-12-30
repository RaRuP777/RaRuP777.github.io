package concesionarioCoches;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import java.util.Calendar;

import utiles.Menu;
import utiles.Teclado;

/**
 * Crea otra versi&oacute;n de Concesionario de coches, 
 * ahora almacenar&aacute; el concesionario completo en 
 * el sistema de ficheros, del que se podr&aacute; 
 * recuperar en cualquier momento. <br></br>
 * Para ello:
 * <ul>
 * 	<li>A&ntilde;ade una opci&oacute;n Ficheros al men&uacute; principal</li>
 * 	<li>Crea un men&uacute; para gestionar los ficheros.</li>
 * 	<li>Tendr&aacute; las opciones t&iacute;picas: nuevo, abrir, guardar, guardar como...</li>
 * 	<li>El concesionario podr&aacute; guardarse en un fichero (guardar y guardar como...)</li>
 * 	<li>El concesionario podr&aacute; leerse de un fichero (abrir)</li>
 * 	<li>Podr&aacute; crearse un concesionario nuevo (nuevo)</li>
 * 	<li>En caso de que se pueda perder informaci&oacute;n del concesionario, 
 * 	se le preguntar&aacute; al usuario (nuevo, abrir, guardar como...)</li>
 * 	<li>Se le a&ntilde;adir&aacute; la extensi&oacute;n &quot;.obj&quot;. 
 * 	Deber&aacute;s utilizar la clase File, que es una representaci&oacute;n
 * 	abstracta de los nombres de los ficheros y directorios. 
 * 	Podr&aacute;s usar los m&eacute;todos:</li>
 *		<ul>
 * 			<li>File file = new File(String pathname)</li>
 * 			<li>file.getPath();</li>
 *		 	<li>file.exists();</li>
 * 		</ul>
 * </ul>
 *
 * @author Estela Mu&ntilde;oz
 * @author Pedro J. Ramos
 * @version 1.0
 *
 */

public class TestConcesionario implements Serializable {

	/**
	 * Variable de Indentificacion para Serializable
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Men&uacute; para gestionar el concesionario
	 */
	static Menu menu = new Menu("Concesionario de coches", new String[] {
			"Alta Coche", "Baja Coche", "Mostrar Coche",
			"Mostrar concesionario", "Contar coches del concesionario",
			"Mostrar coches de un color", "Ficheros", "Salir" });

	/**
	 * Men&uacute; para gestionar el concesionario mediante ficheros
	 */
	static Menu menuFicheros = new Menu("Ficheros", new String[] { "Nuevo",
			"Abrir", "Guardar", "Guardar como...", "Salir" });

	/**
	 * Men&uacute; que muestra los colores disponibles
	 */
	private static Menu menuColores = new Menu("Colores de los coches",
			Color.generarOpcionesMenu());

	/**
	 * Men&uacute; que muestra los modelos disponibles
	 */
	private static Menu menuModelos = new Menu("Modelos de los coches",
			Modelo.generarOpcionesMenu());

	/**
	 * Concesionario de coches
	 */
	static Concesionario concesionario = new Concesionario();

	/**
	 * Gestiona el men&uacute; para realizar acciones con el concesionario
	 * 
	 * @param args
	 *            Argumentos utilizados en la ejecuci&oacute;n del programa
	 */
	public static void main(String[] args) {
		do {
			switch (menu.gestionar()) {
			case 1:// "Añadir Coche
				annadirCoche();
				break;
			case 2:// Eliminar Coche
				eliminarCoche();
				break;
			case 3:// Obtener Coche
				getCoche();
				break;
			case 4:// Mostrar lista
				System.out.println(concesionario);
				break;
			case 5:// Contar coches
				System.out.println("Número de coches en el concesionario: "
						+ concesionario.size());
				break;
			case 6:// Mostrar coches de un color
				System.out.println(concesionario.getCochesColor(pedirColor()));
				break;
			case 7:// Ficheros
				gestionarFicheros();
				break;
			default:// Salir
				System.out.println("Aaaaaaaaaaaaaaaaaaaaadios");
				return;
			}
		} while (true);
	}

	/**
	 * Gestiona el concesionario a trav&eacute;s de ficheros
	 */
	private static void gestionarFicheros() {
		do {
			switch (menu.gestionar()) {
			case 1:// Nuevo
				nuevoConcesionario();
				calendario("Concesionario creado: ");
				break;
			case 2:// Abrir
				try {
					abrirFichero();
					calendario("Fichero abierto: ");
				} catch (ClassNotFoundException | IOException e1) {
					e1.printStackTrace();
				}
				break;
			case 3:// Guardar
				try {
					guardarFichero();
					calendario("Fichero guardado: ");
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;
			case 4:// Guardar como...
				try {
					guardarComoFichero();
					calendario("Fichero guardado: ");
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;
			default:// Salir
				System.out.println("Volviendo al menú principal... Adios!");
				return;
			}
		} while (true);
	}

	/**
	 * Muestra un mensaje más la hora en que se realiza la opción elegida
	 * 
	 * @param mensaje Mensaje a mostrar
	 */
	private static void calendario(String mensaje) {
		System.out.println(mensaje+Calendar.getInstance());	
	}

	/**
	 * Guarda en un fichero el Concesionario con un nombre elegido por el
	 * usuario
	 * 
	 * @throws FileNotFoundException
	 * 
	 @throws FileNotFound
	 *             Exception Excepción cuando no existe un fichero con ese
	 *             nombre
	 * @throws IOException
	 *             Excepción cuando se produce un error mientras se lee o
	 *             escribe
	 */
	private static void guardarComoFichero() throws FileNotFoundException,
			IOException {
		String nombre = Teclado
				.leerCadena("Introduce el nombre para el fichero");
		try (ObjectOutputStream on = new ObjectOutputStream(
				new FileOutputStream(Teclado.leerCadena(nombre)))) {
			on.writeObject(concesionario);
		}
	}

	/**
	 * Guarda en un fichero el Concesionario
	 * 
	 * @throws FileNotFound
	 *             Exception Excepción cuando no existe un fichero con ese
	 *             nombre
	 * @throws IOException
	 *             Excepción cuando se produce un error mientras se lee o
	 *             escribe
	 */
	private static void guardarFichero() throws FileNotFoundException,
			IOException {
		try (ObjectOutputStream on = new ObjectOutputStream(
				new FileOutputStream(Teclado.leerCadena("Concesionario")))) {
			on.writeObject(concesionario);
		}
	}

	/**
	 * Abre un fichero de concesanario
	 * 
	 * @throws FileNotFound
	 *             Exception Excepción cuando no existe un fichero con ese
	 *             nombre
	 * @throws IOException
	 *             Excepción cuando se produce un error mientras se lee o
	 *             escribe
	 * @throws ClassNotFoundException
	 *             Excepción cuando el objeto encontrado no es el esperado
	 */
	private static void abrirFichero() throws FileNotFoundException,
			IOException, ClassNotFoundException {
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(
				Teclado.leerCadena("Introduce el nombre del archivo")))) {
			in.readObject();
		}
	}

	/**
	 * Crea un nuevo concesioario
	 * 
	 */
	private static void nuevoConcesionario() {
		concesionario = new Concesionario();
	}

	/**
	 * Muestra el coche si existe o sino informa de que no existe
	 */
	private static void getCoche() {
		Coche coche = null;
		try {
			coche = concesionario.get(Teclado
					.leerCadena("Introduce la matrícula"));
		} catch (CocheNoExisteException | MatriculaNoValidaException e) {
			e.printStackTrace();
		}
		System.out.println(coche);
	}

	/**
	 * Muestra si el coche se ha eliminado o no
	 */
	private static void eliminarCoche() {
		try {
			concesionario
					.eliminar(Teclado.leerCadena("Introduce la matrícula"));
		} catch (MatriculaNoValidaException e) {
			e.printStackTrace();
		}
		System.out.println("Coche eliminado");
	}

	/**
	 * Muestra si el coche se ha a&ntilde;adido o no
	 */
	private static void annadirCoche() {
		try {
			concesionario.annadir(Teclado.leerCadena("Introduce la matrícula"),
					pedirColor(), pedirModelo());
		} catch (MatriculaNoValidaException | ColorNoValidoException
				| ModeloNoValidoException | CocheYaExisteException e) {
			e.printStackTrace();
		}

		System.out.println("Coche añadido con éxito");

	}

	/**
	 * Pide el modelo del coche
	 * 
	 * @return Modelo del coche
	 */
	private static Modelo pedirModelo() {
		int opcion = menuModelos.gestionar();
		Modelo[] arrModelos = Modelo.getValues();
		if (opcion == arrModelos.length + 1)
			return null;
		return arrModelos[opcion - 1];
	}

	/**
	 * Pide el color del coche
	 * 
	 * @return Color del coche
	 */
	private static Color pedirColor() {
		int opcion = menuColores.gestionar();
		Color[] arrColores = Color.getValues();
		if (opcion == arrColores.length + 1)
			return null;
		return arrColores[opcion - 1];
	}
}
