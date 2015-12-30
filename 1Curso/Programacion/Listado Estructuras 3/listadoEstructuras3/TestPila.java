package listadoEstructuras3;

/**
 * 3.Crea una clase gen&eacute;rica Pila (debe de aceptar cualquier tipo de objeto concreto, utiliza generics). 
 * Recuerda que has de evitar la interacci&oacute;n con el usuario dentro de Pila.
 * Implementa las operaciones b&aacute;sicas de una estructura de datos pila. 
 * Una pila es una estructura LIFO donde el &uacute;ltimo elemento en entrar es el primero en salir. 
 * Un ejemplo b&aacute;sico de pila es la forma de almacenamiento de procesos en la memoria. 
 * Las operaciones a implementar son:
 * <ul>
 * 	<li>a. Crear una pila.</li>
 * 	<li>b. Introducir elemento en la pila (apilar o push)</li>
 * 	<li>c. Sacar elemento de la pila (extraer o pop)</li>
 * 	<li>d. Cima de la pila (devuelve el elemento de la cima de la pila o top)</li>
 * </ul>
 * Implementa los m&eacute;todos necesarios, y recuerda hacer las pruebas precisas.
 * Para ello, crea una clase TestPila donde se a&ntilde;adan muchos elementos de una clase creada en el mismo
 * fichero (Persona, Paciente, Cartas...) y se invoquen a todos los m&eacute;todos. 
 * Al final, vac&iacute;a la pila con un bucle de este estilo:
 * while (!pila.IsEmpty())
 * 		System.out.println("Desapilo de la pila: " + p.pop());
 * 
 * @author Estela Mu&ntilde;oz
 * @author Pedro J. Ramos
 * @version 1.0
 *
 */

public class TestPila {

	public static void main(String[] args) {
		//a. Crear una pila.
		Pila pila = new Pila();
		
		//b. Introducir elemento en la pila (apilar o push)
		pila.push("Cadena1");
		
		//c. Sacar elemento de la pila (extraer o pop)
		pila.pop();
		
		//d. Cima de la pila (devuelve el elemento de la cima de la pila o top)
		pila.top();
		

	}

}
