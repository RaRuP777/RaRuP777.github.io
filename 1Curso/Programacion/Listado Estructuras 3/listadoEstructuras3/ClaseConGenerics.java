package listadoEstructuras3;

import java.util.ArrayList;

/**
 * 2.Reproduce una clase con Generics. Ll&aacute;mala ClaseConGenerics. Entrega su esqueleto
 * donde:
 * 
 * <ul>
 * 	<li>a. Definas una variable de objeto. Ha de ser una colecci&oacute;n homog&eacute;nea (del tipo
 * 		parametrizado de la clase)</li>
 * 	<li>b. Definas un constructor donde instancies el atributo anterior</li>
 * 	<li>c. Definas un m&eacute;todo metodo1 cuyo par&aacute;metro sea del tipo parametrizado</li>
 * 	<li>d. Definas un m&eacute;todo metodo2 cuyo valor devuelto sea del tipo parametrizado</li>
 * </ul>
 * 
 * @author Estela Mu&ntilde;oz
 * @author Pedro J. Ramos
 * @version 1.0
 *
 */

public class ClaseConGenerics {
	// --- a.Definir una variable de objeto: colección homogénea(del tipo parametrizado de la clase)--- \\
	
	/**
	 * Lista de objetos gen&eacute;rica	
	 */
	private ArrayList<String> listaString;
			
	
	// --- b.Definir un constructor donde se instancie el atributo anterior --- \\
	
		/**
		 * Crea el objeto
		 * 
		 * @param listaString Lista de objetos gen&eacute;rica
		 */
		public ClaseConGenerics(ArrayList<String> listaString){
			setListaString(listaString);
		}	


	// --- c.Definir un metodo1 cuyo parámetro sea del tipo parametrizado --- \\
		
	/**
	 * Modifica la lista de objetos gen&eacute;rica
	 * 
	 * @param listaString Lista de objetos
	 */
	private void setListaString(ArrayList<String> listaString) {
		this.listaString = listaString;
	}
	
	
	// --- d.Definir un metodo2 cuyo valor devuelto sea del tipo parametrizado --- \\
	
	/**
	 * Devuelve la lista de objetos
	 * 
	 * @return Lista de objetos gen&eacute;rica
	 */
	private ArrayList<String> getListaString() {
		return listaString;
	}

	/**
	 * Muestra la lista de objetos gen&eacute;rica
	 */
	@Override
	public String toString() {
		return "ClaseConGenerics: " + listaString + "]";
	}
	

}
