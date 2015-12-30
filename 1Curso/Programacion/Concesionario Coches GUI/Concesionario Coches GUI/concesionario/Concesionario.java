package concesionario;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Estela Mu&ntilde;oz
 * @author Pedro J. Ramos
 * @version 1.0
 *
 */

public class Concesionario implements Serializable {
	
	public void setAlmacen(ArrayList<Coche> almacen) {
		this.almacen = almacen;
	}

	/**
	 * Variable que controla si el concesionario esta modificado o no
	 */
	private boolean esModificado=false;
	
	/**
	 * Devuelve el estado de este campo
	 * @return true/false si esta modificado
	 */
	public boolean getEsModificado() {
		return esModificado;
	}

	/**
	 * Modifica el estado del campo modificado
	 * @param esModificado
	 */
	public void setEsModificado(boolean esModificado) {
		this.esModificado = esModificado;
	}

	/**
	 * Variable de Indentificacion para Serializable
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Lista de coches almacenados en el concesionario (almac&eacute;n)
	 */
	private ArrayList<Coche> almacen = new ArrayList<Coche>();

	/**
	 * A&ntilde;ade un coche al almac&eacute;n del concesionario
	 * 
	 * @param matricula
	 *            Matr&iacute;cula del coche
	 * @param color
	 *            Color del coche
	 * @param modelo
	 *            Modelo del coche
	 * 
	 * @return True si a&ntilde;ade el coche o false si es nulo o ya existe
	 * @throws ModeloNoValidoException
	 * @throws ColorNoValidoException
	 * @throws CocheYaExisteException
	 */
	public boolean annadir(String matricula, Color color, Modelo modelo)throws MatriculaNoValidaException, ColorNoValidoException, ModeloNoValidoException, CocheYaExisteException {
		Coche coche = new Coche(matricula, color, modelo);
		if (almacen.contains(coche))
			throw new CocheYaExisteException("El coche ya existe en el concesionario");
		setEsModificado(true);
		return almacen.add(coche);
	}

	/**
	 * Elimina un coche del almac&eacute;n del concesionario
	 * 
	 * @param matricula
	 *            Matr&iacute;cula del coche
	 * 
	 * @return true si lo elimina y false sino
	 */
	public boolean eliminar(String matricula) throws MatriculaNoValidaException, CocheNoExisteException {
		Coche coche = new Coche(matricula);
		setEsModificado(true);
		return almacen.remove(coche);
	}

	/**
	 * Cantidad de coches que hay en el almac&eacute;n del concesionario
	 * 
	 * @return Cantidad de coches del almac&eacute;n
	 */
	public int size() {
		return almacen.size();
	}

	/**
	 * Devuelve un coche del almac&eacute;n busc&aacute;ndolo por su
	 * matr&iacute;cula
	 * 
	 * @param matricula
	 *            Matr&iacute;cula del coche a buscar
	 * 
	 * @return Coche encontrado o null si no existe
	 * @throws CocheNoExisteException 
	 * @throws MatriculaNoValidaException 
	 */
	public Coche get(String matricula) throws CocheNoExisteException, MatriculaNoValidaException {
		Coche coche = new Coche(matricula);
		int index = almacen.indexOf(coche);
		if (index != -1) {
			return almacen.get(index);
		}
		else
			throw new CocheNoExisteException("El coche no existe en el concesionario");
	}

	/**
	 * Muestra el concesionario de coches
	 * 
	 * @return El concesionario de coches
	 */
	@Override
	public String toString() {
		return almacen.toString();
	}

	/**
	 * Devuelve los coches de un solo color
	 * 
	 * @param color
	 *            Color del coche
	 * 
	 * @return Coches del mismo color
	 */
	public ArrayList<Coche> getCochesColor(Color color) {
		ArrayList<Coche> arrCochesColor = new ArrayList<Coche>();
		for (Coche coche : almacen) {
			if(coche.getColor()== color)
				arrCochesColor.add(coche);
		}
		return arrCochesColor;
	}
	
	/**
	 * Devuelve el coche de la posición pasada por parámetro
	 * 
	 * @param index &Iacute;ndice del Coche en el arrayList
	 * @return Coche de esa posici&oacute,n
	 */
	public Coche get(int index) {
		if(almacen.isEmpty())
			return null;
		if(index < 0 | index > almacen.size()-1)
			return null;
		return almacen.get(index);
	}
}