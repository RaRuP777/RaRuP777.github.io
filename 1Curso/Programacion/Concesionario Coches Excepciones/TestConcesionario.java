package pgn.examenMarzo.concesionarioCoches;

import pgn.examenMarzo.utiles.Menu;
import pgn.examenMarzo.utiles.Teclado;
import pgn.examenMarzo.concesionarioCoches.Color;
import pgn.examenMarzo.concesionarioCoches.Modelo;

/**
 * Gestiona el concesionario de coches
 * 
 * @author Estela Mu&ntilde;oz
 * @author Pedro J. Ramos
 * @version 1.0
 * 
 */
public class TestConcesionario {
	/**
	 * Men&uacute; para gestionar el concesionario
	 */
	static Menu menu = new Menu("Concesionario de coches", new String[] {
			"Alta Coche", "Baja Coche", "Mostrar Coche",
			"Mostrar concesionario", "Contar coches del concesionario",
			"Mostrar coches de un color", "Salir" });

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

			default:// Salir
				System.out.println("Aaaaaaaaaaaaaaaaaaaaadios");
				return;
			}
		} while (true);
	}

	/**
	 * Muestra el coche si existe o sino informa de que no existe
	 */
	private static void getCoche() {
		Coche coche = null;
		try {
			coche = concesionario.get(Teclado.leerCadena("Introduce la matrícula"));
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
			concesionario.eliminar(Teclado.leerCadena("Introduce la matrícula"));
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
