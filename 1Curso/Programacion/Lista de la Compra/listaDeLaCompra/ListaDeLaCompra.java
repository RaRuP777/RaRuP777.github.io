package pgn.temaEstructuras.listadoEstructurasIII.listaDeLaCompra;

import java.util.ArrayList;
import java.util.Iterator;

import utiles.Lista;
//import utiles.Lista;
import utiles.Teclado;

/**
 * <li>Aï¿½adir un producto nuevo a la lista.</li>
 * 
 * <li>Eliminar un elemento de la lista.</li>
 * 
 * <li>Incrementar las existencias de un artï¿½culo.</li>
 * 
 * <li>Decrementar las existencias de un artï¿½culo.</li>
 * 
 * <li>Modificar la cantidad mï¿½nima del artï¿½culo.</li>
 * 
 * <li>Mostrar la lista de todos los artï¿½culos.</li>
 * 
 * <li>Mostrar la lista de la compra.</li>
 * 
 * @author mlmc
 * 
 */
public class ListaDeLaCompra {
	/**
	 * Lista de todos los artículos de los que disponemos
	 */
	private ArrayList<Articulo> listaDeArticulos = null;

	/**
	 * Se crea una lista de artículos vacía
	 */
	ListaDeLaCompra() {
		listaDeArticulos = new ArrayList<Articulo>();
	}

	/**
	 * Añade un artículo a la lista
	 * 
	 * @param articulo
	 *            artículo a añadir.
	 * @return true si el artículo se añade. false en otro caso (otro artículo
	 *         semejante ya está en la lista)
	 */
	boolean annadir(Articulo articulo) {
		if (listaDeArticulos.contains(articulo))
			return false;
		listaDeArticulos.add(articulo);
		return true;
	}

	/**
	 * Elimina un artículo a la lista
	 * 
	 * @param articulo
	 *            artículo a eliminar.
	 * @return true si el artículo se elimina. false en otro caso (el artículo
	 *         no está en la lista)
	 */
	boolean eliminar(Articulo articulo) {
		return listaDeArticulos.remove(articulo);
	}

	/**
	 * Modifica la cantidad mínima de un artículo en la lista
	 * 
	 * @param articulo
	 *            Artículo a modificar
	 * @param cantidad
	 *            Nueva cantidad mínima
	 * @return true si se ha realizado la modificación. false en otro caso (el
	 *         artículo no está en la lista)
	 */
	boolean setCantidadMinima(Articulo articulo, int cantidad) {
		if (!listaDeArticulos.contains(articulo))
			return false;
		articulo = listaDeArticulos.get(listaDeArticulos.indexOf(articulo));
		articulo.setMinimo(cantidad);
		return true;
	}

	/**
	 * Incrementa las existencias de un artículo en la lista
	 * 
	 * @param articulo
	 *            Artículo a modificar
	 * @param incremento
	 *            Incremento de las existencias
	 * @return true si se ha realizado la modificación. false en otro caso (el
	 *         artículo no está en la lista)
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
	 * Decrementa las existencias de un artículo en la lista
	 * 
	 * @param articulo
	 *            Artículo a modificar
	 * @param decremento
	 *            Decremento de las existencias
	 * @return true si se ha realizado la modificación. false en otro caso (el
	 *         artículo no está en la lista)
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
	 * Genera los artículos que hay que comprar en función de las existencias y el mínimo
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
