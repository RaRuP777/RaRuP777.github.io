package listadoEstructuras3;

import java.util.ArrayList;

/**
 * 5.Crea una clase gen&eacute;rica Cola (debe de aceptar cualquier tipo de objeto concreto,
 * utiliza generics). Recuerda que has de evitar la interacci&oacute;n con el usuario dentro de
 * Cola. Utilizando generics, implementa las operaciones b&aacute;sicas de una estructura de 
 * datos cola. Recuerda que una cola es una estructura FIFO donde el primer elemento en
 * entrar es el primero en salir. Un ejemplo b&aacute;sico de cola es la de la taquilla de un cine.
 * <br>
 * 
 * Las operaciones a implementar son:
 * <ul>
 * 	<li>a. Crear una cola.</li>
 * 	<li>b. Introducir elemento en la cola (a&ntilde;adir/enqueue)</li>
 * 	<li>c. Sacar elemento de la cola (extraer/dequeue)</li>
 * 	<li>d. Cabeza de la cola. (devuelve el primer elemento de la cola, cabeza o front)</li>
 * 	<li>Implementa los m&eacute;todos necesarios, y recuerda hacer las pruebas precisas.
 * 		Para ello, crea una clase TestCola donde se a&ntilde;adan muchos elementos de una clase
 * 		creada en el mismo fichero (Persona, Paciente, Cartas...) y se invoquen a todos los
 * 		m&eacute;todos. Al final, vac&iacute;a la cola con un bucle while que extraiga de la 
 * 		cola hasta que se vac&iacute;e</li>
 * </ul>
 * 
 * @author Estela Mu&ntilde;oz
 * @author Pedro J. Ramos
 * @version 1.0
 *
 */

public class Cola {

		private ArrayList<Persona> cola = null;
		
		Cola(){
			cola = new ArrayList<Persona>();
		}
		
		void push (Persona persona){
			cola.add(persona);
		}
		
		Persona pop(){
			if (cola.size()==0)
				return null;
			return cola.remove(cola.size()-1);
		}
			
		Persona top(){
			if (cola.size()==0)
				return null;
			return cola.get(cola.size()-1);
		}

		@Override
		public String toString() {
			return "Cola [cola=" + cola + "]";
		}
}