package listadoEstructuras;

/**
 * 
 * 1.Entrega el siguiente c&oacute;digo comentado con los resultados a la derecha de cada System.out.println() y contesta:
 * <ol>
 * 	<li>¿C&oacute;mo se comparan dos cadenas? 
 * 	<li>¿Para qu&eacute; se utiliza el operador de comparaci&oacute;n == entre objetos? 
 * 	<li>Una cadena puede crearse mediante new o directamente con su literal. ¿Se crean de igual manera?			
 *  	¿Se aprovecha la memoria de alguna manera?
 * <ol>
 * 
 * @author Pedro J. Ramos
 * @author Estela Mu&ntilde;oz
 * @version 1.0
 *
 */

public class TestComparaCadenas {
	public static void main(String[] args) {
		String string1 = new String ("Hola");
		String string2 = new String ("Hola");
		
		//Compara si ambas referencias apuntan al mismo objeto 
		System.out.println("string1 == string2: " + (string1 == string2)); // false
		//Compara el contenido de dos objetos
		System.out.println("string1.equals(string2): "+(string1.equals(string2))); // true
		
		//Sólo hay un objeto y dos referencias --> En memoria sólo hay una cadena llamada "Hola" a la que ambos apuntan
		String string3 = "Hola";
		String string4 = "Hola";
		
		// Las referencias apuntan al mismo objeto
		System.out.println("\n string3 == string4: " + (string3 == string4)); // true
		// Contienen lo mismo
		System.out.println("string3.equals(string4): " + (string3.equals(string4))); // true
		
		// Aquí sin embargo, hay dos cadenas distintas
		String stringMay = "Hola";
		String stringMin = "hola";
		
		// Las referencias no apuntan al mismo objeto
		System.out.println("\n stringMay == stringMin: " + (stringMay == stringMin)); // false
		// No contienen lo mismo
		System.out.println("stringMay.equals(stringMin): " + (stringMay.equals(stringMin))); // false
		// Ignorando las mayúsculas, sí contienen lo mismo
		System.out.println("stringMay.equals(stringMin): " + (stringMay.equalsIgnoreCase(stringMin))); // true
	}

}
