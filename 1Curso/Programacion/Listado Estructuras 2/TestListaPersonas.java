package listadoEstructuras2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;


/**
 * 1. Entrega la clase TestListaPersonas que haga lo siguiente:
 * 
 * <ol>
 * 	<li>a. Cree una lista (ArrayList) de personas.
 * 		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();//Generics</li>
 * 	<li>b. A&ntilde;ada tres personas a la lista (3 elementos).</li>
 * 	<li>c. Muestre la lista. (implementa toString() en Persona)</li>
 * 	<li>d. Elimine el &uacute;ltimo elemento.</li>
 * 	<li>e. Muestre la lista.</li>
 * 	<li>f. Elimine el primer elemento.</li>
 * 	<li>g. Muestre la lista.</li>
 * </ol>
 *
 * La persona tiene al menos nombre y apellidos.
 *  
 * @author Estela Mu&ntilde;oz
 * @author Pedro J. Ramos
 * @version 1.0
 *
 */

public class TestListaPersonas {

	// a.Crear lista 
	static ArrayList<Persona> listaPersonas = new ArrayList();
	
	public static void main(String[] args) {
		// b.Añadir 3 personas a la lista
		listaPersonas.add(new Persona("Estela", "Muñoz", "Cordón")); // intentar usar con addAll
		listaPersonas.add(new Persona("Pedro", "Ramos", "Ruiz"));
		listaPersonas.add(new Persona("Jose", "Segura", "Palomares"));
		
		// c.Mostrar la lista
		mostrar("Listado de objetos:");
		
		// d.Eliminar un elemento de la lista
		listaPersonas.remove(2);
		
		// e.Muestra la lista	
		mostrar("\n\nListado de objetos borrando el último elemento:");
		
		// f.Eliminar el primer elemento de la lista
		listaPersonas.remove(0);
		
		// g.Muestra la lista
		mostrar("\n\nListado de objetos borrando el primer elemento:");
	}
	
	/**
	 * Muestra la lista de objetos
	 * 
	 * @param mensaje Texto que se desea mostrar
	 */
	private static void mostrar(String mensaje){
		Iterator it = listaPersonas.iterator();
		System.out.println(mensaje);
		while(it.hasNext())
			System.out.print(it.next() + "\t");
	}

}
