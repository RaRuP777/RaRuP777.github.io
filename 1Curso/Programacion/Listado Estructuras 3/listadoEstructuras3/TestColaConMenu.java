package listadoEstructuras3;

import utiles.Menu;
import utiles.Teclado;

/**
 * 6. Repite el ejercicio anterior, pero utiliza la clase Menu para la interacci&oacute;n con el usuario. 
 * 
 * @author Estela Mu&ntilde;oz
 * @author Pedro J. Ramos
 * @version 1.0
 *
 */

public class TestColaConMenu {

	private static Menu menu = new Menu("Menú para cola de cine:", 
			new String[]{"Crear cola","Introducir elemento en la cola","Sacar elemento de la cola","Cima de la cola"});
	
	private Cola cola = null;
	
	public static void main(String[] args) {
		administrarCola();
	}
	
	private static void administrarCola (){
		do{
			int opcion=menu.gestionar();
				
			switch(opcion){
						
				case 1: //a. Crear una cola.
					Cola cola = new Cola();
					break; 
					
				case 2: //b. Introducir elemento en la cola (apilar o push)
					cola.push(new Persona(Teclado.leerCadena("Introduce el nombre"), Teclado.leerCadena("Introduce el primer apellido"), Teclado.leerCadena("Introduce el segundo apellido")));
					break;
					
				case 3: //c. Sacar elemento de la cola (extraer o pop)
					cola.pop();
					break;
				
				case 4: // Cima de la cola (devuelve el elemento de la cima de la cola o top
					cola.top();
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