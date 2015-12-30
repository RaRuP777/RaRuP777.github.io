package listadoEstructuras2;

import java.util.ArrayList;
import java.util.Iterator;

import utiles.Menu;
import utiles.Teclado;

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

public class TextLista {
	// --- Hemos hecho una lista de animales, en vez de un equipo de futbol --- \\
	
	private static Menu menu = new Menu("Menú para crear una lista de animales:", 
			new String[]{"Añadir un animal.","Insertar un animal en la posición deseada.", 
			"Modificar un animal.", "Tamaño de la lista.", "Eliminar un animal.", "Buscar un animal.", 
			"Mostrar la lista.", "Copiar la lista."});
	
	private static ArrayList lista = new ArrayList();
	
	public static void main(String[] args) {
		administrarLista();	
	}

	/**
	 * Controla toda la gestión de la lista
	 */
	private static void administrarLista(){		
		do{
			int opcion=menu.gestionar();
				
			switch(opcion){
				case 0: // Salir
					System.out.println("Adios...");
					
					break;
					
				case 1: // Añadir un animal.
					lista.add(Teclado.leerCadena("Dame el nombre de un animal:"));
					
					break; 
					
				case 2: // Insertar un animal en la posición deseada. 
					lista.add(Teclado.leerEntero("Dime en qué posición quieres añadir un animal:"), 
							Teclado.leerCadena("Dame el nombre de un animal:"));
					
					break;
					
				case 3: // Modificar un animal.
					lista.set(Teclado.leerEntero("Dime en que posición está el animal a modificar:"), 
							Teclado.leerCadena("Dame un nuevo animal:"));
					
					break;
				
				case 4: // Tamaño de la lista
					System.out.println("\n\nMuestra el tamaño de la lista de objetos: " + lista.size());
					
					break;
					
				case 5: // Eliminar un animal.
					lista.remove(Teclado.leerEntero("Dime la posición del animal a eliminar:"));
					break;
					
				case 6: // Buscar un animal. 
					System.out.println("\n\nEl animal se encuentra en la posición: "
							+ lista.indexOf(Teclado.leerCadena("Dime el animal que quieres buscar:")));
		
					break;
				
				case 7: // Mostrar la lista.
					mostrar("Lista de animales:");
					
					break;
				
				case 8: // Copiar la lista.
					ArrayList lista2 = (ArrayList) lista.clone();
					System.out.println("\nCopia de la lista:\n" +lista2);
					
					break;
			} // switch
		}while(deseaContinuar());
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

	/**
	 * Comprueba si se desea continuar 
	 * 
	 * @return 
	 */
	private static boolean deseaContinuar() {
		char opcion=Teclado.leerCaracter("\nDeseas continuar? (s/S para continuar)");
		
		if(opcion=='s' || opcion=='S')
			return true;
		else{
			System.out.println("Lista completada. Adios...");
			return false;	
		} // else
	}
}
