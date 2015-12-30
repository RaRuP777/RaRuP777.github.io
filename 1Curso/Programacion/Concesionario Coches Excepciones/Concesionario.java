package pgn.examenMarzo.concesionarioCoches;

import java.util.ArrayList;

/**
 * Crea otra versión de Concesionario de coches, ahora mediante excepciones. Las excepciones que 
 * has de lanzar serán:
 * 		En coche:
 * 			MatriculaNoValidaException
 * 			ColorNoValidoException
 * 			ModeloNoValidoException
 * 		En Concesionario:
 * 			CocheNoExisteException
 *			CocheYaExisteException
 *
 * @author Estela Mu&ntilde;oz
 * @author Pedro J. Ramos
 * @version 1.0
 *
 */

public class Concesionario {
	/**
	 * Lista de coches almacenados en el concesionario (almac&eacute;n)
	 */
	private ArrayList<Coche> almacen = new ArrayList<Coche>();
	/**
	 * Nombre del concesionario
	 */
	private final String nombre = "IES Gran Capitán";

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
	boolean annadir(String matricula, Color color, Modelo modelo)throws MatriculaNoValidaException, ColorNoValidoException, ModeloNoValidoException, CocheYaExisteException {
		Coche coche = new Coche(matricula, color, modelo);
		if (almacen.contains(coche))
			throw new CocheYaExisteException("El coche ya existe en el concesionario");
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
	boolean eliminar(String matricula) throws MatriculaNoValidaException {
		Coche coche = new Coche(matricula);
		return almacen.remove(coche);
	}

	/**
	 * Cantidad de coches que hay en el almac&eacute;n del concesionario
	 * 
	 * @return Cantidad de coches del almac&eacute;n
	 */
	int size() {
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
	Coche get(String matricula) throws CocheNoExisteException, MatriculaNoValidaException {
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
		return "Concesionario " + nombre + "[almacen=" + almacen + "]";
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
			if (coche.getColor() == color)
				arrCochesColor.add(coche);
		}
		return arrCochesColor;
	}

}
