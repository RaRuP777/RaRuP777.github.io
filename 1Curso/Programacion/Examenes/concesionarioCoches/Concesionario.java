package pgn.examenMarzo.concesionarioCoches;

import java.util.ArrayList;

/*
 * No pueden existir dos coches con la misma matr�cula en el almac�n del concesinario
 * no puede a�adirse un coche al concecionario con alguno de sus atributos inv�lidos. Han de conocerse todas sus caracter�sticas 
 * Ninguno de los valores puede ser por defecto
 */
/**
 * El nombre del concesionario es "IES Gran Capit�n".
 * 
 * L�gicamente, no podr� a�adirse un coche inv�lido glmac�n del concesinario)
 * 
 * Han de conocerse todas sus caracter�sticas Ninguno de los valores puede ser
 * por defecto
 * 
 * @author Mar�aLourdes
 * 
 */
public class Concesionario {
	/**
	 * colecci�n de coches. No puede tener null
	 */
	private ArrayList<Coche> almacen = new ArrayList<Coche>();
	private final String nombre = "IES Gran Capit�n";

	boolean annadir(String matricula, Color color, Modelo modelo) {
		Coche coche = Coche.instanciarCoche(matricula, color, modelo);
		if (coche == null || almacen.contains(coche))
			return false;
		return almacen.add(coche);
	}

	boolean eliminar(String matricula) {
		return almacen.remove(Coche.instanciarCoche(matricula));
	}

	
	int size() {
		return almacen.size();
	}

	/**
	 * Devuelve el Coche del almac�n indicado por la matr�cula
	 * 
	 * @param matricula
	 *            Matr�cula a buscar
	 * @return Coche contenido en el almac�n. null si no existe
	 */
	Coche get(String matricula) {
		Coche coche = Coche.instanciarCoche(matricula);
		int index = almacen.indexOf(coche);
		if (index != -1) {
			return almacen.get(index);
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Concesionario " + nombre + "[almacen=" + almacen + "]";
	}

	public ArrayList<Coche> getCochesColor(Color color) {
		ArrayList<Coche> arrCochesColor = new ArrayList<Coche>();
		for (Coche coche : almacen) {
			if(coche.getColor()== color)
				arrCochesColor.add(coche);
		}
		return arrCochesColor;
	}

}
