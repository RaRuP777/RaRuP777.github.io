package pgn.temaEstructuras.listadoEstructurasIII.listaDeLaCompra;

import utiles.Menu;
import utiles.Teclado;

/**
 * 
 <p>
 * Implementa un programa que gestione una lista de la compra de forma
 * autom�tica. <br />
 * </p>
 * <p>
 * Se dispondr� de una lista de art�culos y de sus existencias. En el
 * momento en el que la cantidad de art�culos llegue a un l�mite m�nimo,
 * dicho art�culo aparecer� en la lista de la compra. Cada vez que el
 * usuario utilice uno de los art�culos se decrementar�n las existencias de
 * dicho art�culo. De igual forma, cada vez que el usuario compre el
 * art�culo, se incrementar�n las existencias de dicho art�culo.<br />
 * </p>
 * <p>
 * A modo de ejemplo, supongamos que del art�culo &quot;latas de cerveza&quot;
 * se establece a un m�nimo de 10 cervezas. Actualmente hay 14 y se consumen
 * de golpe 5 cervezas.
 * </p>
 * <ol>
 * <li>Art�culo: [nombre = latas de cerveza, cantidad m�nima= 10,
 * existencias = 14]</li>
 * <li>articulo.consumir(5)</li>
 * <li>Art�culo: [nombre = latas de cerveza, cantidad m�nima= 10,
 * existencias = 9]</li>
 * <li>Como (articulo.getExistencias() &lt;= articulo.getCantidadMin()) hay que
 * comprar latas de cerveza.<br />
 * </li>
 * </ol>
 * Quiz�s sea interesante a�adir un campo c�digo del art�culo para
 * facilitar la gesti�n de la lista. Este c�digo ha de ser �nico
 * (static...)<br />
 * <br />
 * Para ello, genera un interfaz con el usuario que permita entre otras
 * acciones:<br />
 * <ul>
 * <li>A�adir un producto nuevo a la lista.</li>
 * <li>Eliminar un elemento de la lista.</li>
 * <li>Incrementar las existencias de un art�culo.</li>
 * <li>Decrementar las existencias de un art�culo.</li>
 * <li>Modificar la cantidad m�nima del art�culo.<br />
 * </li>
 * <li>Mostrar la lista de todos los art�culos.</li>
 * <li>Mostrar la lista de la compra.</li>
 * </ul>
 * Comienza analizando el dise�o. Piensa en el total de clases que vas a
 * utilizar y aprovecha aquellas clases que puedas.<br />
 * <br />
 * 
 * @author mlmc
 * 
 */
public class TestListaDeLaCompra {
	static ListaDeLaCompra listaDeLaCompra = new ListaDeLaCompra();
	static Menu menuPrincipal = new Menu("\nLista de la compra", new String[] {
			"Añadir producto nuevo a la lista",
			"Eliminar un elemento de la lista",
			"Incrementar las existencias de un art�culo",
			"Decrementar las existencias de un art�culo",
			"Modificar la cantidad m�nima del art�culo",
			"Mostrar la lista de todos los artículos",
			"Mostrar la lista de la compra", "Salir" });

	/**
	 * Arranque del programa
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		do {
			switch (menuPrincipal.gestionar()) {
			case 1:// anadir
				annadirArticulo();
				break;
			case 2:// eliminar
				eliminarArticulo();
				break;
			case 3:// incrementar
				incrementarExistencias();
				break;
			case 4:// decrementar
				decrementarExistencias();
				break;
			case 5:// modificar cantidad m�nima
				modificarCantidadMinima();
				break;
			case 6:// mostrar todos los art�culos
				System.out.println(listaDeLaCompra);
				break;
			case 7:// mostrar lista de la compra
				System.out.println(listaDeLaCompra.generarListaDeLaCompra());
				break;
			case 8:
				return;

			}// switch

		} while (true);
	}// main

	/**
	 * Comunicaci�n con el usuario para la modificaci�n de la cantidad m�nima
	 */
	private static void modificarCantidadMinima() {
		try {
			Articulo articulo = new Articulo(
					Teclado.leerCadena("Introduce nombre del art�culo: "));
			if (!listaDeLaCompra.setCantidadMinima(articulo,
					Teclado.leerEntero("Introduce la nueva cantidad: "))) {
				System.err
						.println("No se pudo modificar la cantidad m�nima porque el art�culo no existe");
			}
			;
		} catch (NombreNoValidoException e) {
			System.err.println("Introduce un nombre v�lido");
		}
	}

	/**
	 * Comunicaci�n con el usuario para el incremento de las existencias
	 */
	private static void incrementarExistencias() {
		try {
			if (!listaDeLaCompra.incrementarExistencias(
					new Articulo(Teclado
							.leerCadena("Introduce nombre del art�culo: ")),
					Teclado.leerEntero("Introduce el incremento: "))) {
				System.err
						.println("No se pudo incrementar existencias porque el art�culo no existe");
			}
			;
		} catch (IncrementoNegativoException | NombreNoValidoException e1) {
			System.err.println("No se pudo incrementar las existencias. "
					+ e1.getMessage());
		}
	}

	/**
	 * Comunicaci�n con el usuario para el eliminar un art�culo de la lista
	 */
	private static void eliminarArticulo() {
		try {
			if (!listaDeLaCompra.eliminar(new Articulo(Teclado
					.leerCadena("Introduce nombre del art�culo: ")))) {
				System.err
						.println("No puede eliminarse. El art�culo no existe.");
			}
		} catch (NombreNoValidoException e1) {
			System.err
					.println("no pudo eliminarse el art�culo de la lista de la compra. "
							+ e1.getMessage());
		}
		;
	}

	/**
	 * Comunicaci�n con el usuario para a�adir un art�culo a la lista
	 * 
	 * 
	 * @throws NombreNoValidoException
	 * @throws ExistenciasInvalidasException
	 */
	private static void annadirArticulo() {
		try {
			if (!listaDeLaCompra
					.annadir(new Articulo(
							Teclado.leerCadena("Introduce nombre del art�culo: "),
							Teclado.leerEntero("Introduce existencias del art�culo: "),
							Teclado.leerEntero("Introduce cantidad m�nima del art�culo: ")))) {
				System.err
						.println("No se pudo a�adir el art�culo porque ya existe");

			}

		} catch (NombreNoValidoException | ExistenciasInvalidasException e) {
			System.err.println("No se pudo a�adir el art�culo a la lista. "
					+ e.getMessage());
		}
	}

	/**
	 * Comunicaci�n con el usuario para decrementar las existencias de un
	 * art�culo de la lista
	 * 
	 * @param listaDeLaCompra
	 */
	private static void decrementarExistencias() {

		try {
			Articulo articulo = new Articulo(
					Teclado.leerCadena("Introduce nombre del art�culo: "));
			if (!listaDeLaCompra.decrementarExistencias(articulo,
					Teclado.leerEntero("Introduce el decremento: "))) {
				System.err
						.println("No se pudo decrementar existencias porque el art�culo no existe");

			}

		} catch (ExistenciasInvalidasException | DecrementoInvalidoException
				| NombreNoValidoException e) {
			System.err.println("No se pudo decrementar las existencias. "
					+ e.getMessage());
		}

	}
}// class
