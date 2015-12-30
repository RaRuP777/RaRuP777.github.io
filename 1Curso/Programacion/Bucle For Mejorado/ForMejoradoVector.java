package buclesFor;

/**
 * El bucle for mejorado (for-each) es un mecanismo que facilita el recorrido de una estructura de datos, 
 * por ejemplo, un array. De esta forma se evita el uso del &iacute;ndice y los problemas que estos provocan.
 * Analiza el siguiente c&oacute;digo donde se usan ambos bucles (el &quot;for clásico&quot; en sum1 y el 
 * &quot;for mejorado&quot; en sum2) para la suma de los elementos de un array. 
 * <ul>
 * 	<li>Entrega el c&oacute;digo anterior integrado dentro de un programa.</li>
 * 	<li>Realiza y entrega otra pr&aacute;ctica donde se utilice el bucle for mejorado con matrices. 
 * 		Comenta y documenta el c&oacute;digo generado.</li>
 * </ul>
 * 
 * @author Estela Mu&ntilde;oz
 * @author Pedro J. Ramos
 * @version 1.0
 *
 */

public class ForMejoradoVector {
	
	public static void main(String[] args){
		int[] vector={1, 2, 3, 4, 5};
		
		mostrar(vector);
		
		System.out.println("\nSuma con for clasico: "+sum1(vector)+"\nSuma con for mejorado: "+sum2(vector));
		
	}
	
	/**
	 * Método que calcula la suma de los elementos del array 
	 * Utiliza para ello el <b>for clásico</b> con índices
	 * 
	 * @param a array de enteros
	 * @return suma de los elementos del array
	 */
	private static int sum1(int[] vector){
		int result=0;
		for(int i=0;i<vector.length;i++)
			result += vector[i];
		return result;
	}
	
	/**
	 * Método que calcula la suma de los elementos del array
	 * Utiliza para ello el <b>for mejorado</b>
	 * 
	 * @param a array de enteros
	 * @return suma de los elementos del array
	 */
	private static int sum2(int[] vector){
		int result = 0;
		for(int i : vector)
			result += i;
		return result;
	}
	
	/**
	 * Método que muestra los elementos del array
	 * Utiliza para ello el <b>for clásico</b>
	 * 
	 * @param a array de enteros
	 */
	private static void mostrar(int[] vector){
		System.out.print("Para el vector a = {");
		for(int i=0;i<vector.length;i++)
			System.out.print("\t"+vector[i]);
		System.out.print("\t}");
	}
}
