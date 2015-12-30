package listadoEstructuras3;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 7.Crea una clase gen&eacute;rica Lista. Has de implementar los siguientes m&eacute;todos:
 * <ul>
 *  <li>a. Añada al final de la lista</li>
 *  <li>b. Inserte un elemento en una determinada posición</li>
 *  <li>c. Modifique un elemento reemplazándolo por otro</li>
 *  <li>d. Conozca el tamaño de la lista</li>
 *  <li>e. Elimine elementos de la lista</li>
 *  <li>f. Busque elementos en la lista</li>
 *  <li>g. Copie la lista</li>
 * </ul>
 * 
 * Util&iacute;zala en un ejemplo (por ejemplo, la alineaci&oacute;n de un equipo de f&uacute;tbol, con
 * titulares y reservas) y entr&eacute;galo correctamente identificado y documentado, incluyendo JavaDoc.
 * Deber&aacute;s implementar un men&uacute; con las opciones posibles para que el usuario lo utilice 
 * f&aacute;cilmente.
 * 
 * @author Estela Mu&ntilde;oz
 * @author Pedro J. Ramos
 * @version 1.0
 *
 */

public class Lista {

	private ArrayList lista = new ArrayList();
	
	public Lista (){
		this.lista=lista;
	}
		
	public void añadirElemento(Object object) {
		lista.add(object);	
	}
	
	public void añadirElementoPosicion (int pos, Object object){
		lista.add(pos,object);
	}
	
	public void modificaElemento(int pos, Object object){
		lista.set(pos,object);
	}
	
	public void mostrarTamañoLista (){
		System.out.println("\n\nMuestra el tamaño de la lista de objetos: " + lista.size());
	}
	
	public void eliminarElemento (int pos){
		lista.remove(pos);
	}
	
	public void buscarElemento (Object object){
		System.out.println("\n\n La posición en la que se encuentra el elemento "+object+" es " + lista.indexOf(object));
	}
		
	public void copiarLista (){
		ArrayList lista2 = (ArrayList) lista.clone();
	}
	
	/**
	 * Muestra la lista de objetos
	 * 
	 * @param mensaje Texto que se desea mostrar
	 */
	public void mostrar(String mensaje){
		Iterator it = lista.iterator();
		System.out.println(mensaje);
		while(it.hasNext())
			System.out.print(it.next() + "\t");
	}
}