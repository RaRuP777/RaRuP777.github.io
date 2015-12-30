package codigosStrings;
/**
 * Implementa los c&oacute;digos de String, Wrappers, Autoboxing/Auto-unboxing, instanceof y entrega el documento 
 * &quot;codigosStringsApellido1Apellido2Nombre.zip&quot; donde aparecer&aacute;n empaquetados:
 * C&oacute;digos fuentes (*.java) de la presentaci&oacute;n
 * 
 * @author Estela Mu&ntilde;oz
 * @author Pedro J. Ramos Ruiz
 * @version 1.0
 *
 */
public class StringTest {
	public static void main(String[] args){
		//Se crea un cadena con el constructor, sin indicar ning�n valor, que por defecto ser� null
		String s1=new String();
		//Se crea una cadena con el constructor, indicando su valor
		String s2=new String(" ababABAB "); //Tiene espacions en blanco
		//Se crea una cadena sin constructor, indicando su valor directamente
		String s3="Ejemplo";
		//Comprueba si en la cadena s1 hay un espacio, como no es el caso devolver� un -1
		System.out.println(s1.compareTo(" ")); //"" es un espacio en blanco
		//A�ade a la cadena s2 la cadena s3 a continuaci�n
		System.out.println(s2.concat((s3)));
		//Indica en qu� lugar de la cadena hay una h por primera vez, en este caso ninguna, por lo que devovler� un -1
		System.out.println(s1.indexOf('h'));
		//Quita los espacios que haya delante y detr�s de la cadena s2
		System.out.println(s2.trim());
		//Convierte en min�sculas la cadena s2
		System.out.println(s2.toLowerCase());
		//Convierte en may�sculas la cadena s3
		System.out.println(s3.toUpperCase());
		//Indica en qu� lugar de la cadena s2 hay una b por primera vez
		System.out.println(s2.indexOf('b'));
		//Indica en qu� lugar de la cadena s2 aparece la b por �ltima vez
		System.out.println(s2.lastIndexOf('b'));
		//Muestra la longitud de la cadena s3
		System.out.println(s3.length());
		//Muestra el car�cter que se encuentra en la posici�n 1 de la cadena s3
		System.out.println(s3.charAt(1));
		//Reemplaza el caracter A por la x
		System.out.println(s2.replace('A','x'));
	}
}
