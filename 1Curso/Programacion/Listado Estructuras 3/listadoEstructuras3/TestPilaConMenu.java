package listadoEstructuras3;

import java.util.ArrayList;
import java.util.Iterator;

import utiles.Menu;
import utiles.Teclado;

/**
 * 4.Repite el ejercicio anterior, pero utiliza la clase Menu para la interacci&oacute;n con el usuario.
 * 
 * @author Estela Mu&ntilde;oz
 * @author Pedro J. Ramos
 * @version 1.0
 *
 */

public class TestPilaConMenu {

	private static Menu menu = new Menu("Menú para probar pila:", 
			new String[]{"Crear pila","Introducir elemento en la pila","Sacar elemento de la pila","Cima de la pila"});
	
	private Pila pila = null;
	
	public static void main(String[] args) {
		administrarPila();
	}
	
	private static void administrarPila (){
		do{
			int opcion=menu.gestionar();
				
			switch(opcion){
						
				case 1: //a. Crear una pila.
					Pila pila = new Pila();
					break; 
					
				case 2: //b. Introducir elemento en la pila (apilar o push)
					pila.push(Teclado.leerCadena("Introduce la cadena a añadir"));
					break;
					
				case 3: //c. Sacar elemento de la pila (extraer o pop)
					pila.pop();
					break;
				
				case 4: // Cima de la pila (devuelve el elemento de la cima de la pila o top
					pila.top();
					break;

			} // switch
		}while(deseaContinuar());
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