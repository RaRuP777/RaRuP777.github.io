package pgn.temaEstructuras.listadoEstructurasIII.listaDeLaCompra;

import java.util.ArrayList;
import java.util.Iterator;

import utiles.Lista;
//import utiles.Lista;
import utiles.Teclado;

/**
 * <li>A�adir un producto nuevo a la lista.</li>
 * 
 * <li>Eliminar un elemento de la lista.</li>
 * 
 * <li>Incrementar las existencias de un art�culo.</li>
 * 
 * <li>Decrementar las existencias de un art�culo.</li>
 * 
 * <li>Modificar la cantidad m�nima del art�culo.</li>
 * 
 * <li>Mostrar la lista de todos los art�culos.</li>
 * 
 * <li>Mostrar la lista de la compra.</li>
 * 
 * @author mlmc
 * 
 */
public class ListaDeLaCompra {
	/**
	 * Lista de todos los art�culos de los que disponemos
	 */
	private ArrayList<Articulo> listaDeArticulos = null;

	/**
	 * Se crea una lista de art�culos vac�a
	 */
	ListaDeLaCompra() {
		listaDeArticulos = new ArrayList<Articulo>();
	}

	/**
	 * A�ade un art�culo a la lista
	 * 
	 * @param articulo
	 *            art�culo a a�adir.
	 * @return true si el art�culo se a�ade. false en otro caso (otro art�culo
	 *         semejante ya est� en la lista)
	 */
	boolean annadir(Articulo articulo) {
		if (listaDeArticulos.contains(articulo))
			return false;
		listaDeArticulos.add(articulo);
		return true;
	}

	/**
	 * Elimina un art�culo a la lista
	 * 
	 * @param articulo
	 *            art�culo a eliminar.
	 * @return true si el art�culo se elimina. false en otro caso (el art�culo
	 *         no est� en la lista)
	 */
	boolean eliminar(Articulo articulo) {
		return listaDeArticulos.remove(articulo);
	}

	/**
	 * Modifica la cantidad m�nima de un art�culo en la lista
	 * 
	 * @param articulo
	 *            Art�culo a modificar
	 * @param cantidad
	 *            Nueva cantidad m�nima
	 * @return true si se ha realizado la modificaci�n. false en otro caso (el
	 *         art�culo no est� en la lista)
	 */
	boolean setCantidadMinima(Articulo articulo, int cantidad) {
		if (!listaDeArticulos.contains(articulo))
			return false;
		articulo = listaDeArticulos.get(listaDeArticulos.indexOf(articulo));
		articulo.setMinimo(cantidad);
		return true;
	}

	/**
	 * Incrementa las existencias de un art�culo en la lista
	 * 
	 * @param articulo
	 *            Art�culo a modificar
	 * @param incremento
	 *            Incremento de las existencias
	 * @return true si se ha realizado la modificaci�n. false en otro caso (el
	 *         art�culo no est� en la lista)
	 */
	boolean incrementarExistencias(Articulo articulo, int incremento)
			throws IncrementoNegativoException {
		if (!listaDeArticulos.contains(articulo))
			return false;
		articulo = listaDeArticulos.get(listaDeArticulos.indexOf(articulo));
		articulo.incrementar(incremento);
		return true;
	}

	/**
	 * Decrementa las existencias de un art�culo en la lista
	 * 
	 * @param articulo
	 *            Art�culo a modificar
	 * @param decremento
	 *            Decremento de las existencias
	 * @return true si se ha realizado la modificaci�n. false en otro caso (el
	 *         art�culo no est� en la lista)
	 */
	boolean decrementarExistencias(Articulo articulo, int decremento)
			throws ExistenciasInvalidasException, DecrementoInvalidoException {
		if (!listaDeArticulos.contains(articulo))
			return false;
		articulo = listaDeArticulos.get(listaDeArticulos.indexOf(articulo));
		articulo.decrementar(decremento);
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return listaDeArticulos.toString();
	}

	/**
	 * Genera los art�culos que hay que comprar en funci�n de las existencias y el m�nimo
	 * 
	 * @return La lista de la compra
	 */
	StringBuffer generarListaDeLaCompra() {
		StringBuffer stringBuffer = new StringBuffer();
		Iterator<Articulo> iterator = listaDeArticulos.iterator();
		while (iterator.hasNext()) {
			Articulo articulo = (Articulo) iterator.next();
			if (articulo.bajoMinimos())
				stringBuffer.append("\n-("
						+ Integer.valueOf(articulo.getExistencias()
								- articulo.getMinimo())

						+ ")-" + articulo.getNombre());
		}
		return stringBuffer;
	}

}
