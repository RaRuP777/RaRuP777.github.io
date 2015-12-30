package listadoEstructuras2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 3.Entrega la clase Lista que:
 * <ul>
 * 	<li>a. A&ntilde;ada al final de la lista</li>
 * 	<li>b. Inserte un elemento en una determinada posici&oacute;n</li>
 * 	<li>c. Modifique un elemento reemplaz&aacute;ndolo por otro</li>
 * 	<li>d. Conozca el tama&ntilde;o de la lista</li>
 * 	<li>e. Elimine elementos de la lista</li>
 * 	<li>f. Busque elementos en la lista</li>
 * 	<li>g. Copie la lista</li>
 * </ul>
 * Util&iacute;zala en un ejemplo TestLista (por ejemplo, la alineaci&oacute;n de un equipo de f&uacute;tbol,
 * con titulares y reservas)y entr&eacute;galo correctamente identificado y documentado, incluyendo JavaDoc. 
 * Deber&acute;s implementar un men&uacute; con las opciones posibles para que el usuario lo utilice f&aacute;cilmente
 * 
 * @author Estela Mu&ntilde;oz
 * @author Pedro J. Ramos
 * @version 1.0
 *
 */

public class Lista {

	static ArrayList lista = new ArrayList();
	
	public static void main(String[] args) {
		// Rellene la lista
		lista.add("Gato");
		lista.add("Perro");
		lista.add("Conejo");
		lista.add("Ardilla");
		
		mostrar("Muestra la lista de objetos:");
		
		// a. Añadir un elemento al final de la lista
		lista.add(4, "Elefante");
		mostrar("\n\nMuestra la lista de objetos añadido un elemento al final:");
		
		// b.Inserte un elemento en una determinada posición
		lista.add(1, "Zorro");
		mostrar("\n\nMuestra la lista de objetos añadido un elemento en la segunda posición:");
		
		// c. Modifique un elemento reemplazándolo por otro
		lista.set(1, "Chacal");
		mostrar("\n\nMuestra la lista de objetos modificado el segundo elemento:");
		
		// d. Conozca el tamaño de la lista
		System.out.println("\n\nMuestra el tamaño de la lista de objetos: " + lista.size());
		
		// e. Elimine elementos de la lista</li>
		lista.remove(1);
		mostrar("\nMuestra la lista de objetos borrado el segundo elemento:");
		
		// f. Busque elementos en la lista ---- Recordar que una lista de objetos comienza en la posición 0 
		System.out.println("\n\nMuestra la posición en la que se encuentra el elemento Ardilla: "
				+ lista.indexOf("Ardilla"));
		
		// g. Copie la lista</li>
		ArrayList lista2 = (ArrayList) lista.clone();
		System.out.println("\nMuestra una copia de la lista de objetos con clone():\n" +lista2);
	}
	
	/**
	 * Muestra la lista de objetos
	 * 
	 * @param mensaje Texto que se desea mostrar
	 */
	private static void mostrar(String mensaje){
		Iterator it = lista.iterator();
		System.out.println(mensaje);
		while(it.hasNext())
			System.out.print(it.next() + "\t");
	}

}
