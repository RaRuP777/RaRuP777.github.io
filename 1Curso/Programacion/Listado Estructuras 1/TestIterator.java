package listadoEstructuras;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * 5.Un iterador es un objeto que se implementa en la interfaz Iterator o ListIterator. 
 * Se utiliza para el recorrido, obtenci&oacute;n o modificaci&oacute,n de los elementos de una 
 * colecci&oacute;n. Bas&aacute;ndote en el siguiente c&oacute;digo y analizando el interfaz Iterator 
 * indica la descripci&oacute;n y signatura de los siguientes m&eacute;todos: hasNext() y next()
 * <br></br>
 * 
 * 6.Continuando con la clase anterior &quot;TestIterator&quot;, analiza el siguiente c&oacute;digo y contesta:
 * <ul>
 * 	<li>a. Analiza el interfaz ListIterator e indica la descripci&oacute;n y signatura de los
 * 		siguientes m&eacute;todos: hasNext(), hasPrevious(), next() y previous()</li> 
 * 	<li>b. Analiza el interfaz ListIterator e indica la descripci&oacute;n y signatura del m&eacute;todo
 * 		set(). Identifica los requisitos para su uso.</li> 	
 * </ul>
 * <br></br>
 * 
 * 7.Continuando con la clase anterior &quot;TestIterator&quot;, analiza el siguiente c&oacute;digo y contesta:
 * <ul>
 * 	<li>a. Indica los m&eacute;todos implicados en el recorrido hacia delante.</li>
 * 	<li>b. Indica los m&eacute;todos implicados en el recorrido hacia atr&aacute;s.</li>
 * 	<li>c. �Qu&eacute; suceder&iacute;a en el siguiente c&oacute;digo si el listIterator no partiera del final de la
 * 		colecci&oacute;n en el recorrido hacia atr&aacute;s?</li>
 * 	<li>d. Averigua la forma de posicionar el iterador al final de la colecci&oacute;n.</li>
 * </ul>
 * 
 * @author Estela Mu&ntilde;oz
 * @author Pedro J. Ramos
 * @version 1.0
 *
 */

public class TestIterator {
	public static void main(String[] args) {
		// ------ EJERCICIO 5 ------ \\
		
		// Creaci�n de un ArrayList: Constructor de la lista que puede contener objetos de diferentes tipos
		ArrayList arrayList = new ArrayList();
		
		//Se a�aden elementos
		arrayList.add("A");
		arrayList.add("N");
		arrayList.add("I");
		arrayList.add("M");
		arrayList.add("A");
		arrayList.add("L");
		
		// Recorrido  hacia adelante
		System.out.print("Contenido original: \t\t");
		// 1. Obtenci�n del iterador (al principio de la colecci�n) mediante el m�todo iterator() de la colecci�n
		// Por defecto empieza en la primera posici�n
		Iterator iterator = arrayList.iterator(); // La estructura iterator extrae los valores de la lista de objetos
	
		// 2. Bucle con hasNext(): Comprueba si la siguiente posici�n donde est� el iterator est� llena o vacia
		while (iterator.hasNext()){ //mientras no est� vac�o sigue repiti�ndose:
			// 3. Dentro del bucle, obtenci�n del elemento mediante next(): 
			/* 
			 * Objet es un objeto gen�rico (para cualquier tipo). 
			 * Se usa para guardar los elementos de la lista y mostrarlos luego 
			 * (Hereda de Object y no hace falta un new)
			 */
			Object element = iterator.next(); //Va recorriendo la lista de objetos desde la primera posici�n
			System.out.println(element + "\t");
		}
		System.out.println();
		
		
		// ------- EJERCICIO 6 ------- \\
		
		// Modificaci�n de los objetos:
		
		// 4. Obtenci�n del iterador al principio del arrayList (listIterator(0))
		ListIterator listIterator = arrayList.listIterator(); 
		
		// 5. Bucle con hastNext()
		while (listIterator.hasNext()){ 
			// 6. Dentro del bucle, obtenci�n del elemento siguiente
			Object element = listIterator.next();
			// 7. Sustituye el �ltimo elemento devuelto por next() o previous()
			/* 
			 * Modifica el atributo del objeto (lista de objetos), 
			 * que en este caso es cada objeto que contiene la lista de objetos
			 */
			listIterator.set(element + "*"); 
		}
		// 8. el listIterator est� al final de la colecci�n
		
		// Recorrido hacia adelante
		System.out.println("Lista modificada: \t\t");
		iterator = arrayList.iterator();
		while (iterator.hasNext()){
			Object element = iterator.next();
			System.out.print(element + "\t");
		}
		System.out.println();
		
		
		// ------- EJERCICIO 7 ------- \\
		
		//Recorrido hacia atr�s:
		
		// 9. el listIterator parte del final de la colecci�n
		System.out.println("Lista modificada (hacia atr�s): "); 
		
		// 10. Bucle con hasPrevious()
		while(listIterator.hasPrevious()){ 
		// 11. Dentro del bucle, obtenci�n del elemento mediante previous()
			Object element = listIterator.previous();
			System.out.println(element + "\t");
		}
		System.out.println();
	}
}
