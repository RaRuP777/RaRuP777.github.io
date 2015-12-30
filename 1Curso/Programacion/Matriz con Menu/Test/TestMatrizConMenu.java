package Test;

import utiles.Teclado;
import Matriz.Matriz;
import Menu.Menu;

/**
 * Implementa la clase Menu que sirva para gestionar un men&uacute;.
 * Un ejemplo de men&uacute; es:</br></br>
 *
 * **Plantilla de la empresa</br>
 * (1) A&ntilde;adir Becario</br>
 * (2) A&ntilde;adir Empleado</br>
 * (3) Listar plantilla</br>
 * (4) Listar becarios</br>
 * (5) Listar empleados</br>
 * (6) Contar becarios</br>
 * (7) Contar empleados</br>
 * (8) Salir</br></br>
 * B&aacute;sicamente, un men&uacute; ha de:</br>
 * <ul>
 * 	<li>Mostrar unas opciones
 * 	<li>Recoger y devolver las opciones indicadas
 * </ul></br></br>
 * A continuaci&oacute;n se indican los miembros de la clase Menu:
 * <ul>
 * 	<li>T&iacute;tulo del men&uacute;. Se mostrar&aacute; al principio del men&uacute;.
 * 	<li>Opciones del men&uacute;. Cada una de estas opciones es una cadena que se mostrar&aacute; 
 * 		en una línea aparte.
 * 	<li>N&uacute;mero de opciones del men&uacute;.
 * 	<li>Un m&eacute;todo mostrar() que muestre el men&uacute;, 
 * 		añadiéndole a cada elemento del men&uacute; un n&uacute;mero, comenzando por 1.
 * 	<li>Un m&eacute;todo recogeOpcionValida() que recoja una de las opciones v&aacute;lidas 
 * 		(entre 1 y n&uacute;mero de opciones del men&uacute;)
 * 	<li>Un m&eacute;todo gestionar() que gestione el men&uacute;. 
 * 	Gestionar un men&acute; consiste en mostrarlo y recoger la opción v&aacute;lida del men&uacute;.
 * 	<li>Recuerda el constructor, al que se le pasar&acute;n como argumento tanto el t&iacute;tulo como 
 * 		las opciones del men&uacute;.
 * </ul>
 * </br></br>
 * Una vez implementada la clase men&uacute;, util&iacute;zala para gestionar la clase Matriz.
 * 
 * @author Estela Mu&ntilde;oz
 * @author Pedro J. Ramos
 * @version 1.0
 *
 */
public class TestMatrizConMenu {

	public static void main(String[] args) {
		
		String titulo = "Bienvenido al Menu de Matrices:";
		String [] opciones = new String []{"0. Salir","1. Trasponer la Matriz1","2. Trasponer la Matriz2","3. Sumar la Matriz1 a la Matriz2","4. Restar la Matriz1 a la Matriz2","5. Multiplicar la Matriz1 por la Matriz2"};
		
		Menu menuGeneral = new Menu (titulo,opciones);
		
		Matriz matriz = new Matriz(Teclado.leerEntero("Introduce filas"),Teclado.leerEntero("Introduce Columnas"),Teclado.leerEntero("valor minimo"),Teclado.leerEntero("valor maximo"));
		matriz.mostrar("Esta es tu matriz");			
		Matriz matriz2 = new Matriz(Teclado.leerEntero("Introduce filas"),Teclado.leerEntero("Introduce Columnas"),Teclado.leerEntero("valor minimo"),Teclado.leerEntero("valor maximo"));
		matriz2.mostrar("Y esta es la otra");
		
		int opcion;
		do {
			opcion=menuGeneral.gestionar();
			switch (opcion) {
			case 1:
				matriz.trasponer(matriz.getMatriz());
				break;
			case 2:
				matriz2.trasponer(matriz.getMatriz());
				break;
			case 3:
				matriz.sumar(matriz2.getMatriz());
				break;
			case 4:
				matriz.restar(matriz2.getMatriz());
				break;
			case 5:
				Matriz resultado3 = new Matriz(matriz.multiplicar(matriz2.getMatriz()));
				resultado3.mostrar("matrices restadas");
			}		
		} while (opcion!=0);
		System.out.println(menuGeneral.despedida());
	}
}