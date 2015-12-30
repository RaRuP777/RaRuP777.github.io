package estructuraPersonasRamosRuizPedroMunnozCordonEstela;

import utiles.Lista;
import utiles.Menu;
import utiles.Teclado;

/**
 * Crea una estructura din&acute;mica de personas.<br>
 * Una persona consta de:
 * <ol>
 * 	<li>Nombre (regex con m&iacute;nimo de tres caracteres v&aacute;lidos seguidos)</li>
 * 	<li>Apellido primero (regex con m&iacute;nimo de tres caracteres v&aacute;lidos seguidos)</li>
 * 	<li>Apellido segundo (regex con m&iacute;nimo de tres caracteres v&aacute;lidos seguidos)</li>
 * 	<li>Fecha de nacimiento (regex con formato dd/mm/aaaa y (opcional) es v&aacute;lida (a&ntilde;o bisiesto)</li>
 * 	<li>C&oacute;digo postal (regex que admita pplll &oacute; pp.lll)</li>
 * 	<li>Edad (opcional)</li>
 * 	<li>Identificador un&iacute;voco, generado mediante un campo static)</li>
 * </ol>
 * Con la estructura podr&aacute;s realizar las siguientes operaciones:
 * <ol>	
 * 	<li>A&ntilde;adir una nueva persona</li>
 * 	<li>Eliminarla (utiliza contains)</li>
 * 	<li>Contar y mostrar los que hay de una provincia (utiliza iteradores)</li>
 * 	<li>Mostrar la estructura al completo(utiliza toString)</li>
 * </ol>
 * 
 * @author Estela Mu&ntilde;oz
 * @author Pedro J. Ramos
 * @version 1.0
 *
 */

public class TestPersona {

	private static Lista listaPersonas = new Lista();
	private static Menu menu = new Menu("Gestión de personas:", new String[]{"Salir.", "Añadir una nueva persona.",
			"Eliminar una persona.", "Contar y mostrar las personas que hay de una provincia.",
			"Mostrar la lista de personas."});
	private static Persona persona = null;
	
	public static void main(String[] args) {
		//Persona persona=new Persona("Estela", "Muñoz", "Cordón", "18/11/1986", "14400", 28, 01);
		//System.out.println(persona.toString());
		administrarMenu();
		
	}
	
	private static void administrarMenu(){
		while(true){
			int opcion=menu.gestionar();
			switch(opcion){
				case 0: // Salir
					System.out.println("Adios...");
					return;
					
				case 1: // Añadir una persona
					listaPersonas.añadirElemento(new Persona(Teclado.leerCadena("Dime tu nombre:"),
							Teclado.leerCadena("Dime tu primer apellido:"), 
							Teclado.leerCadena("Dime tu segundo apellido"), 
							Teclado.leerCadena("Dime tu fecha de nacimiento"),
							Teclado.leerCadena("Dime tu Código Postal:"),
							persona.calcularEdad(), 
							listaPersonas.longitudLista()+1));
					break;
					
				case 2: // Eliminar una persona
					//listaPersonas.eliminarElemento(
						//	Teclado.leerEntero("Dime en qué posición está la persona a eliminar:"));
					listaPersonas.eliminar(Teclado.leerCadena("Dime la persona a eliminar:"));
					break;
					
				case 3: // Contar y mostrar las personas de una provincia
					
					break;
					
				case 4: // Mostrar la lista de personas
					listaPersonas.mostrar();
					break;	
			}//switch
		}//while
	}//administrarmenu()
	
	
}
