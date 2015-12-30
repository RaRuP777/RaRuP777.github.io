package pgn.temaEstructuras.listadoEstructurasIII.listaDeLaCompra;

import utiles.Menu;
import utiles.Teclado;

/**
 * 
 <p>
 * Implementa un programa que gestione una lista de la compra de forma
 * automï¿½tica. <br />
 * </p>
 * <p>
 * Se dispondrï¿½ de una lista de artï¿½culos y de sus existencias. En el
 * momento en el que la cantidad de artï¿½culos llegue a un lï¿½mite mï¿½nimo,
 * dicho artï¿½culo aparecerï¿½ en la lista de la compra. Cada vez que el
 * usuario utilice uno de los artï¿½culos se decrementarï¿½n las existencias de
 * dicho artï¿½culo. De igual forma, cada vez que el usuario compre el
 * artï¿½culo, se incrementarï¿½n las existencias de dicho artï¿½culo.<br />
 * </p>
 * <p>
 * A modo de ejemplo, supongamos que del artï¿½culo &quot;latas de cerveza&quot;
 * se establece a un mï¿½nimo de 10 cervezas. Actualmente hay 14 y se consumen
 * de golpe 5 cervezas.
 * </p>
 * <ol>
 * <li>Artï¿½culo: [nombre = latas de cerveza, cantidad mï¿½nima= 10,
 * existencias = 14]</li>
 * <li>articulo.consumir(5)</li>
 * <li>Artï¿½culo: [nombre = latas de cerveza, cantidad mï¿½nima= 10,
 * existencias = 9]</li>
 * <li>Como (articulo.getExistencias() &lt;= articulo.getCantidadMin()) hay que
 * comprar latas de cerveza.<br />
 * </li>
 * </ol>
 * Quizï¿½s sea interesante aï¿½adir un campo cï¿½digo del artï¿½culo para
 * facilitar la gestiï¿½n de la lista. Este cï¿½digo ha de ser ï¿½nico
 * (static...)<br />
 * <br />
 * Para ello, genera un interfaz con el usuario que permita entre otras
 * acciones:<br />
 * <ul>
 * <li>Aï¿½adir un producto nuevo a la lista.</li>
 * <li>Eliminar un elemento de la lista.</li>
 * <li>Incrementar las existencias de un artï¿½culo.</li>
 * <li>Decrementar las existencias de un artï¿½culo.</li>
 * <li>Modificar la cantidad mï¿½nima del artï¿½culo.<br />
 * </li>
 * <li>Mostrar la lista de todos los artï¿½culos.</li>
 * <li>Mostrar la lista de la compra.</li>
 * </ul>
 * Comienza analizando el diseï¿½o. Piensa en el total de clases que vas a
 * utilizar y aprovecha aquellas clases que puedas.<br />
 * <br />
 * 
 * @author mlmc
 * 
 */
public class TestListaDeLaCompra {
	static ListaDeLaCompra listaDeLaCompra = new ListaDeLaCompra();
	static Menu menuPrincipal = new Menu("\nLista de la compra", new String[] {
			"AÃ±adir producto nuevo a la lista",
			"Eliminar un elemento de la lista",
			"Incrementar las existencias de un artï¿½culo",
			"Decrementar las existencias de un artï¿½culo",
			"Modificar la cantidad mï¿½nima del artï¿½culo",
			"Mostrar la lista de todos los artÃ­culos",
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
			case 5:// modificar cantidad mínima
				modificarCantidadMinima();
				break;
			case 6:// mostrar todos los artï¿½culos
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
	 * Comunicación con el usuario para la modificación de la cantidad mínima
	 */
	private static void modificarCantidadMinima() {
		try {
			Articulo articulo = new Articulo(
					Teclado.leerCadena("Introduce nombre del artículo: "));
			if (!listaDeLaCompra.setCantidadMinima(articulo,
					Teclado.leerEntero("Introduce la nueva cantidad: "))) {
				System.err
						.println("No se pudo modificar la cantidad mínima porque el artículo no existe");
			}
			;
		} catch (NombreNoValidoException e) {
			System.err.println("Introduce un nombre válido");
		}
	}

	/**
	 * Comunicación con el usuario para el incremento de las existencias
	 */
	private static void incrementarExistencias() {
		try {
			if (!listaDeLaCompra.incrementarExistencias(
					new Articulo(Teclado
							.leerCadena("Introduce nombre del artículo: ")),
					Teclado.leerEntero("Introduce el incremento: "))) {
				System.err
						.println("No se pudo incrementar existencias porque el artículo no existe");
			}
			;
		} catch (IncrementoNegativoException | NombreNoValidoException e1) {
			System.err.println("No se pudo incrementar las existencias. "
					+ e1.getMessage());
		}
	}

	/**
	 * Comunicación con el usuario para el eliminar un artículo de la lista
	 */
	private static void eliminarArticulo() {
		try {
			if (!listaDeLaCompra.eliminar(new Articulo(Teclado
					.leerCadena("Introduce nombre del artículo: ")))) {
				System.err
						.println("No puede eliminarse. El artículo no existe.");
			}
		} catch (NombreNoValidoException e1) {
			System.err
					.println("no pudo eliminarse el artículo de la lista de la compra. "
							+ e1.getMessage());
		}
		;
	}

	/**
	 * Comunicación con el usuario para añadir un artículo a la lista
	 * 
	 * 
	 * @throws NombreNoValidoException
	 * @throws ExistenciasInvalidasException
	 */
	private static void annadirArticulo() {
		try {
			if (!listaDeLaCompra
					.annadir(new Articulo(
							Teclado.leerCadena("Introduce nombre del artículo: "),
							Teclado.leerEntero("Introduce existencias del artículo: "),
							Teclado.leerEntero("Introduce cantidad mínima del artículo: ")))) {
				System.err
						.println("No se pudo añadir el artículo porque ya existe");

			}

		} catch (NombreNoValidoException | ExistenciasInvalidasException e) {
			System.err.println("No se pudo añadir el artículo a la lista. "
					+ e.getMessage());
		}
	}

	/**
	 * Comunicación con el usuario para decrementar las existencias de un
	 * artículo de la lista
	 * 
	 * @param listaDeLaCompra
	 */
	private static void decrementarExistencias() {

		try {
			Articulo articulo = new Articulo(
					Teclado.leerCadena("Introduce nombre del artículo: "));
			if (!listaDeLaCompra.decrementarExistencias(articulo,
					Teclado.leerEntero("Introduce el decremento: "))) {
				System.err
						.println("No se pudo decrementar existencias porque el artículo no existe");

			}

		} catch (ExistenciasInvalidasException | DecrementoInvalidoException
				| NombreNoValidoException e) {
			System.err.println("No se pudo decrementar las existencias. "
					+ e.getMessage());
		}

	}
}// class
