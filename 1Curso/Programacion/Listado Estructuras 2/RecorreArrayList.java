package listadoEstructuras2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * 2.A continuaci&oacute;n se muestra parte de una clase denominada RecorreArrayList: 
 * <ul>
 * 	<li>a. Compila y entrega el c&oacute;digo donde se invoquen cada uno de los m&eacute;todos anteriores. 
 * 		Utiliza una lista de String.</li>
 * 	<li>b. Implementa c&oacute;mo recorrer una lista al rev&eacute;s en la misma clase</li>
 * </ul> 
 * 
 * @author Estela Mu&ntilde;oz
 * @author Pedro J. Ramos
 * @version 1.0
 *
 */

public class RecorreArrayList {
	static ArrayList<String> arrayList = new ArrayList();
	
	public static void main(String[] args) {
		// ------ a. Diferentes métodos para mostrar una lista ------ \\
		
		arrayList.add("Elefante azul");
		arrayList.add("Elefante rojo");
		arrayList.add("Elefante verde");
		arrayList.add("Elefante rosa");
		
		System.out.println("Muestra la lista de objetos:");
		show();
		
		System.out.println("\nMuestra la lista de objetos mediante un iterador con el bucle while:");
		showWithIterator();
		
		System.out.println("\nMuestra la lista de objetos mediante un iterador con el bucle for:");
		showWithIterator2();
		
		System.out.println("\nMuestra la lista de objetos mediante un for clásico, con la posición (índices):");
		showWithGet();
		
		System.out.println("\nMuestra la lista de objetos mediante un for mejorado:");
		showWithForEach();
		
	
		// ------ b. Recorrer una lista al revés ------ \\
		System.out.println("\nMuestra la lista de objetos al revés mediante un for clásico:");
		showInverse();
		
		System.out.println("\nMuestra la lista de objetos al revés mediante un iterador con el bucle while:");
		showWithIteratorReverse();
		
		System.out.println("\nMuestra la lista de objetos al revés mediante un iterador con el bucle for:");
		showWithIterator2Reverse();
		
	}
	
	/**
	 * Muestra el ArrayList
	 */
	private static void show(){
		System.out.println(arrayList);
	}
	
	/**
	 * Muestra el ArrayList mediante un iterador con el bucle while
	 */
	private static void showWithIterator(){
		Iterator<String> it = arrayList.iterator();
		
		while (it.hasNext()){
			System.out.println("\t" + it.next());
		}
	}
	
	/**
	 * Muestra el ArrayList mediante un iterador con el bucle for
	 */
	private static void showWithIterator2(){
		for(Iterator<String> it = arrayList.iterator(); it.hasNext();)
			System.out.println("\t" + it.next());
	}
	
	/**
	 * Muestra el ArrayList mediante un for clásico, accediendo mediante la posición (índices)
	 */
	private static void showWithGet(){
		for(int i = 0; i < arrayList.size(); i++)
			System.out.println("\t" + arrayList.get(i));
	}
	
	/**
	 * Muestra el ArrayList mediante un for mejorado
	 */
	 private static void showWithForEach(){
		 for(String elemento : arrayList)
			 System.out.println("\t" + elemento);
	 }
	 
	 /**
	  * Muestra el ArrayList al revés mediante un for clásico, accediendo mediante la posición (índices)
	  */
	 private static void showInverse(){
		 for(int i = arrayList.size()-1; i > -1; i--)
				System.out.println("\t" + arrayList.get(i));
	 }
	 
	 /**
	  * Muestra el ArrayList al revés mediante un iterador con el bucle while
	  */
	 private static void showWithIteratorReverse(){
		 	ListIterator<String> it = arrayList.listIterator(arrayList.size());
		 	while (it.hasPrevious())
		 		System.out.println("\t" + it.previous());
			}
		
	/**
	 * Muestra el ArrayList al revés mediante un iterador con el bucle for
	 */
	private static void showWithIterator2Reverse(){
		for(ListIterator<String> it = arrayList.listIterator(arrayList.size()); it.hasPrevious();)
			System.out.println("\t" + it.previous());
	}
	 
}
