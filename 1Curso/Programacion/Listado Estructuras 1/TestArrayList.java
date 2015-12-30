package listadoEstructuras;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

/**
 * 8.Implementa el siguiente trozo de c&oacute;digo y contesta:
 * <ul>
 * 	<li>a. ¿Qu&eacute; estructura de datos se instancia en este c&oacute;digo?</li>
 * 	<li>b. ¿En qué paquete se encuentra?</li>
 * 	<li>c. Localiza el interfaz java.util.Collection que implementa e indica al menos tres
 * 		métodos implementados por la clase (signatura y descripción)</li>
 * 	<li>d. ¿Se permiten elementos duplicados?</li> r: si
 * 	<li>e. ¿Hay que saber su tamaño en su creación?</li> r: no es necesario, crece conforme añades objetos
 * 	<li>f. ¿Es una estructura dinámica o estática?</li> r: dinámico
 * 	<li>g. ¿Es una estructura homogénea o heterogénea?</li> r: heterogénea
 * 	<li>h. ¿Se utiliza el autoboxing?</li>	r: si, cada vez que introduces un dato primitivo se introduce como wrapper
 * 	<li>i. ¿Existe algún Wrapper?</li> r: si, un Double
 * </ul>
 * <br></br>
 * 
 * 9.Continuando con la clase anterior “TestArrayList”, analiza el siguiente código y contesta:
 * <ul>
 * 	<li>a. La palabra reservada “instanceof” es un operador especial que compara un objeto con un tipo. 
 * 		Se puede utilizar para comprobar si un objeto es una instancia de una clase, una instancia de 
 * 		una subclase, o una instancia de una clase que implementa una interfaz concreta. 
 * 		En el código, ¿dónde se utiliza? ¿de qué tipo es el objeto? 
 * 		¿Cómo se introdujo el elemento en la estructura? </li>
 * 	<li>b. El método iterator(), ¿para qué se utiliza? ¿Existe otra manera de hacerlo?</li> 
 * 	<li>c. Indica la signatura de los métodos utilizados para: </li>
 * 		<ul>	
 * 			<li>i. Añadir</li>
 * 			<li>ii. Eliminar</li> 
 * 			<li>iii. Obtener</li> 
 * 			<li>iv. Convertir a estructura estática</li>
 * 			<li>v. Averiguar:</li>
 * 				<ul>
 * 					<li>1. Tamaño</li> 
 * 					<li>2. Si la estructura está vacía</li> 
 * 					<li>3. Si un elemento está en la estructura</li> 
 * 					<li>4. Posición de un elemento</li> 
 * 				</ul>
 *		</ul>
 * </ul> 
 * 
 * @author Estela Mu&ntilde;os
 * @author Pedro J. Pedros Ramos
 * @version 1.0
 *
 */

public class TestArrayList {

	public static void main(String[] args) {
		// ------- EJERCICIO 8 -------- \\
		
		// creación de una lista vacía
		ArrayList arrayList = new ArrayList();
		System.out.println("arrayList.isEmpty(): " + arrayList.isEmpty());
		
		// Se añaden distintos elementos, de distintos tipos
		arrayList.add(1);
		arrayList.add(new String("hola"));
		arrayList.add(new String("hola"));
		arrayList.add(new Double(0));
		arrayList.add(new Date());
		
		// ------- EJERCICIO 9 -------- \\
		
		System.out.println("Tamaño del ArrayList: " + arrayList.size());
		System.out.println("arrayList.isEmpty(): " + arrayList.isEmpty());
		System.out.println("arrayList.contains(\"hola\"): " 
				+ arrayList.contains("hola"));
		System.out.println("arrayList.contains(\"adios\"): " 
				+ arrayList.contains("adios"));
		System.out.println("arrayList.contains(1): " + arrayList.contains(1));
		
		/*
		 * System.out.println("arrayList.get(arrayList.size()): "+
		 * arrayList.get(arrayList.size())); //
		 * java.lang.IndexOutOfBoundsException
		 */
		
		// último elemento
		System.out.println("arrayList.get(arrayList.size()-1): "
			+ arrayList.get(arrayList.size()-1));
		
		// primer elemnto
		System.out.println("arrayList.get(0): " + arrayList.get(0));
		System.out.println("arrayList.get(0) instanceof Integer: " 
				+ (arrayList.get(0) instanceof Integer));
		
		// recorrido con Iterator
		for (Iterator iterator = arrayList.iterator(); iterator.hasNext();){
			Object object = iterator.next();
			System.out.println(object + " - ");
		}
		System.out.println("\narrayList.indexOf(\"hola\"): "
				+ arrayList.indexOf("hola"));
		
		// conversión a array
		Object[] array = arrayList.toArray();
		for(Object object : array){
			System.out.println(object + " - ");
		}
		
		// borrado de elementos
		System.out.println("\narrayList.remove(0) " + arrayList.remove(0));
		System.out.println("arrayList.remove(\"hola\"): "
				+ arrayList.remove("hola"));
		
		// se borran todos los los elementos de la lista
		arrayList.clear();
		System.out.println("arrayList.isEmpty(): " + arrayList.isEmpty());
	}

}
