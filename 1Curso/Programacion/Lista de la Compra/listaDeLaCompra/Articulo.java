package pgn.temaEstructuras.listadoEstructurasIII.listaDeLaCompra;

import pgn.temaEstructuras.regex.listadoRegex.TestRegexVariado.RegEx;
import utiles.Teclado;

public class Articulo {
	/**
	 * Nombre del artículo
	 */
	private String nombre;
	/**
	 * Cantidad de artículos almacenados
	 */
	private int existencias; // no pueden ser negativas
	/**
	 * Nivel mínimo de stock de artículos que debe existir en el almacén
	 */
	private int minimo;// no puede ser negativo

	/**
	 * @param nombre
	 * @param existencias
	 * @param minimo
	 * @throws NombreNoValidoException
	 *             Cuando el nombre del artículo es inválido
	 * @throws ExistenciasInvalidasException
	 *             Cuando el número de existencias es negativo
	 */
	Articulo(String nombre, int existencias, int minimo)
			throws NombreNoValidoException, ExistenciasInvalidasException {
		setNombre(nombre);
		setExistencias(existencias);
		setMinimo(minimo);
	}

	/**
	 * 
	 * @param nombre
	 * @throws NombreNoValidoException
	 *             Cuando el nombre del artículo es inválido
	 */
	Articulo(String nombre) throws NombreNoValidoException {
		setNombre(nombre);
	}

	/**
	 * Incrementa las existencias del artículo en una cantidad indicada
	 * 
	 * @param incremento
	 *            cantidad a incrementar
	 * @throws IncrementoNegativoException
	 *             Cuando el incremento es negativo
	 */
	void incrementar(int incremento) throws IncrementoNegativoException {
		if (incremento < 0)
			throw new IncrementoNegativoException(
					"El incremento no puede ser negativo");
		try {
			setExistencias(getExistencias() + incremento);
		} catch (ExistenciasInvalidasException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Decrementa las existencias del artículo en una cantidad indicada
	 * 
	 * @param decremento
	 *            cantidad a decrementar
	 * @throws ExistenciasInvalidasException
	 *             Cuando el número de existencias es negativo
	 * @throws DecrementoInvalidoException
	 */
	void decrementar(int decremento) throws ExistenciasInvalidasException,
			DecrementoInvalidoException {
		if (decremento < 0)
			throw new DecrementoInvalidoException(
					"El decremento no puede ser negativo");
		setExistencias(getExistencias() - decremento);

	}

	/**
	 * @return the nombre
	 */
	String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 * @throws NombreNoValidoException
	 */
	private void setNombre(String nombre) throws NombreNoValidoException {
		if (!RegEx.NAME_PATTERN.validar(nombre))
			throw new NombreNoValidoException("El nombre ha de ser válido");
		this.nombre = nombre;
	}

	/**
	 * @return the existencias
	 */
	int getExistencias() {
		return existencias;
	}

	/**
	 * @param existencias
	 *            the existencias to set
	 * @throws ExistenciasInvalidasException
	 *             Cuando el número de existencias es negativo
	 */
	private void setExistencias(int existencias)
			throws ExistenciasInvalidasException {
		if (existencias < 0)
			throw new ExistenciasInvalidasException(
					"Las existencias no pueden ser negativas");
		this.existencias = existencias;
	}

	/**
	 * @return the minimo
	 */
	int getMinimo() {
		return minimo;
	}

	/**
	 * @param minimo
	 *            the minimo to set
	 */
	void setMinimo(int minimo) {
		this.minimo = minimo;
	}

	/**
	 * Muestra un artículo
	 */
	public void mostrar() {
		System.out.print(toString());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */

	@Override
	public String toString() {
		return "\nArticulo ["
				+ (nombre != null ? "nombre=" + nombre + ", " : "")
				+ "\texistencias=" + getExistencias() + ", \tminimo=" + minimo
				+ "]";
	}

	public boolean bajoMinimos() {
		if (getExistencias() < getMinimo())
			return true;
		return false;
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
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	/**
	 * Indica si otro artículo es similar a este. Se fija en el nombre del
	 * artículo, obviando el resto de atributos
	 * 
	 * @param obj
	 *            artículo con el que se compara
	 * @return true si el artículo this es similar al objeto obj. false en otro
	 *         caso
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Articulo other = (Articulo) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

}
