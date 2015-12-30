package utiles;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Crea una estructura din&acute;mica de personas.<br>
 * Una persona consta de:
 * <ol>
 * 	<li>Nombre (regex con m&iacute;nimo de tres caracteres v&aacute;lidos seguidos)</li>
 * 	<li>Apellido primero (regex con m&iacute;nimo de tres caracteres v&aacute;lidos seguidos)</li>
 * 	<li>Apellido segundo (regex con m&iacute;nimo de tres caracteres v&aacute;lidos seguidos)</li>
 * 	<li>Fecha de nacimiento (regex con formato dd/mm/aaaa y (opcional) es v&aacute;lida (a&ntilde;o bisiesto)</li>
 * 	<li>C&oacute;digo postal (regex que admita pplll &oacute; pp.lll)</li>
 * 	<li>Edad (opcional)</li>
 * 	<li>Identificador un&iacute;voco, generado mediante un campo static)</li>
 * </ol>
 * Con la estructura podr&aacute;s realizar las siguientes operaciones:
 * <ol>	
 * 	<li>A&ntilde;adir una nueva persona</li>
 * 	<li>Eliminarla (utiliza contains)</li>
 * 	<li>Contar y mostrar los que hay de una provincia (utiliza iteradores)</li>
 * 	<li>Mostrar la estructura al completo(utiliza toString)</li>
 * </ol>
 * 
 * @author Estela Mu&ntilde;oz
 * @author Pedro J. Ramos
 * @version 1.0
 *
 */

public class Lista {
	/**
	 * Lista de objetos
	 */
	public ArrayList lista = new ArrayList();
	
	/**
	 * Constructor que crea la lista
	 */
	public Lista (){
		this.lista=lista;
	}
		
	/**
	 * A&ntilde;ade un elemento a la lista
	 * 
	 * @param object Elemento a a&ntilde;adir
	 */
	public void añadirElemento(Object object) {
		lista.add(object);	
	}
	
	/**
	 * A&ntilde;ade un elemento en una posición de la lista
	 * 
	 * @param pos Posici&oacute;n en la que se a&ntilde;ade el elemento
	 * @param object Elemento a a&ntilde;adir
	 */
	public void añadirElementoPosicion (int pos, Object object){
		lista.add(pos,object);
	}
	
	/**
	 * Modifica un elemento de la lista
	 * 
	 * @param pos Posici&oacute;n del elemento
	 * @param object Elemento de la lista
	 */
	public void modificaElemento(int pos, Object object){
		lista.set(pos,object);
	}
	
	/**
	 * Tama&ntilde;o de la lista
	 * 
	 * @return Tama&ntilde;o de la lista
	 */
	public int longitudLista (){
		return lista.size();
	}
	
	/**
	 * Elimina un elemento de la lista usando su posici&oacute;n
	 * 
	 * @param pos Posici&oacute;n del elemento
	 */
	public void eliminarElemento (int pos){
		lista.remove(pos);
	}
	
	/**
	 * Borrar un elemento de la lista usando contains()
	 * 
	 * @param objeto Elemento de la lista
	 */
	public void eliminar(Object objeto) {
		if (lista.contains(objeto))
			lista.remove(objeto);
		
		else
			System.err.println("El elemento no existe y no puede ser borrado.");
	}
	
	/**
	 * Busca la posici&oacute;n en la que se encuentra un elemento de la lista
	 * 
	 * @param object Elemento de la lista
	 */
	public void buscarElemento (Object object){
		System.out.println("\n\n La posición en la que se encuentra el elemento "+object+" es " + lista.indexOf(object));
	}
	
	/**
	 * Copia la lista de objetos
	 */
	public void copiarLista (){
		ArrayList lista2 = (ArrayList) lista.clone();
	}
	
	/**
	 * Muestra la lista de objetos
	 * 
	 * @param mensaje Texto que se desea mostrar
	 */
	public void mostrar(){
		Iterator it = lista.iterator();
		while(it.hasNext())
			System.out.print(it.next() + "\t");
	}
}