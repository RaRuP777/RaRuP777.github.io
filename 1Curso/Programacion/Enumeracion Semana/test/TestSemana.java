package test;

import enumsemana.Semana;

/**
 * Realiza la lectura del documento Enumeraciones.<br>
 * Implementa el ejemplo del apartado:
 * <ul>
 * 	<li>&quot;3.5. Enumeraciones&quot;</li>
 * </ul><br>
 * del documento:<br>
 * <ul>
 * 	<li>Desarrollo de proyectos inform&aacute;ticos con tecnolog&iacute;a java.</li>
 * </ul>
 * <br>
 * Util&iacute;zalo en un main y responde a las siguientes preguntas:
 * <ol>
 * 	<li>M&eacute;todos aplicables a una enumeraci&oacute;n y significado</li>
 * 	<li>Modificadores de visibilidad aplicables a una enumeraci&oacute;n</li>
 * 	<li>Comprueba si las afirmaciones son verdaderas o falsas:</li>
 * </ol>
 * 		<ul>
 * 			<li>Una enumeraci&oacute;n puede declararse dentro de una clase.</li>
 * 			<li>Una enumeraci&oacute;n puede declararse dentro de un m&eacute;todo.</li>
 * 			<li>Una enumeraci&oacute;n puede declararse fuera de una clase, en una unidad de compilaci&oacute;n sola.</li>
 * 			<li>Cada uno de los elementos de la enumeraci&oacute;n (constantes) son instancias de la enumeraci&oacute;n.</li>
 * 			<li>El constructor de una enumeraci&oacute;n puede invocarse directamente en el c&oacute;digo.</li>
 * 			<li>El constructor de una enumeraci&oacute;n se invoca autom&aacute;ticamente cuando se inicializa la enumeraci&oacute;n.</li>
 * 		</ul>
 * 
 * @author Estela Mu&ntilde;oz
 * @author Pedro J. Ramos
 *
 * @version 1.0
 *
 */

public class TestSemana {
	public static void main(String[] args){
			
		for(Semana dia : Semana.values()){
			// Muestra el nombre de la constante:
			System.out.println("nombre: "+dia.name());
			// Muestra la posición que ocupa la constante en la enumeración:
			System.out.println("posición: "+dia.ordinal());
			// Muestra el contenido del atributo comentario de cada constante de la enumeración:
			System.out.println("su campo contiene: "+dia.getComentario());
		}
	}
}