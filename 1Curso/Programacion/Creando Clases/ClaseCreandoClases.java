package AccediendoCampos;
/**
 * Crea tres clases con las siguientes caracter&iacute;sticas. Para ello:
 * <ul> 
 * 	<li>Procura escribir todo el c&oacute;digo (no copies y pegues).
 * 	<li>Inicialmente, no te preocupes de los modificadores de acceso 
 * 	(s&oacute;lo public class por cada fichero.java. El resto, friendly).
 * 	<li>Al finalizar el ejercicio, indica:
 * 		<ol>
 * 			<li>¿Cu&aacute;ntos objetos en total se han creado?
 * 			<li>¿Cu&aacute;ntos paquetes en total se han creado?
 * 			<li>¿Utilizas alg&uacute;n paquete externo? 
 * 			¿Has tenido que utilizar alg&uacute;n import? ¿Por qu&eacute;?
 * 		</ol>
 * 	<li>Clase1.
 * 		<ul>
 * 			<li>Contiene los campos 
 * 				<ul>
 * 					<li>campo1 tipo int; 
 * 					<li>campo2 tipo String;
 * 					<li>campo3 tipo Clase2
 * 				</ul>
 * 			<li>Constructores
 * 				<ul>
 * 					<li>Clase1() que inicializa los tres campos anteriores.
 * 				</ul>
 * 			<li>Contiene los métodos
 * 				<ul>
 * 					<li>metodo1 muestra &quot;En ObjetoDeClase1.metodo1&quot; 
 * 					<li>metodo2 muestra &quot;En ObjetoDeClase1.metodo2&quot;
 * 					<li>metodo3 muestra &quot;En ObjetoDeClase1.metodo3&quot;
 * 				</ul>
 * 		</ul>
 * 	<li>Clase2.
 * 		<ul>
 * 			<li>Contiene los campos
 * 				<ul>
 * 					<li>campo1 tipo int[][]; 
 * 					<li>campo2 tipo char;
 * 				</ul>
 * 			<li>Constructores
 * 				<ul>
 * 					<li>Clase2() que inicializa los dos campos anteriores.
 * 				</ul>					
 * 			<li>Contiene los m&eacute;todos
 * 				<ul>
 * 					<li>metodo1 muestra &quot;En ObjetoDeClase2.metodo1&quot;
 * 					<li>metodo2 muestra &quot;En ObjetoDeClase2.metodo2&quot;
 * 					<li>metodo3 muestra &quot;En ObjetoDeClase2.metodo3&quot;
 * 				</ul>
 * 		</ul>
 * 	<li>ClaseCreandoClases
 * 		<ul>
 * 			<li>Con m&eacute;todo main que
 * 				<ul>
 * 					<li>cree una instancia de cada objeto Clase1 y Clase2.
 * 					<li>invoque a todos los m&eacute;todos definidos.
 * 				</ul>
 * 		</ul>
 * </ul>
 * </br>Si todo va bien, el resultado deber&iacute;a ser algo parecido a esto: 
 * </br>En ObjetoDeClase1.metodo1 
 * </br>En ObjetoDeClase1.metodo2
 * </br>En ObjetoDeClase1.metodo3
 * </br>En ObjetoDeClase2.metodo1
 * </br>En ObjetoDeClase2.metodo2
 * </br>En ObjetoDeClase2.metodo3
 * 
 * @author Estela
 * @version 1.0
 */

public class ClaseCreandoClases {

	public static void main(String[] args) {
		int [][] matriz = new int [2][2];
		Clase2 clase2 = new Clase2 (matriz,'s');
		Clase1 clase1 = new Clase1 (4, "hola", clase2);
       
		clase1.getCampo1();
        clase1.getCampo2();
        clase1.getCampo3();
        
        clase2.getCampo1();
        clase2.getCampo2();
	}
	
}
