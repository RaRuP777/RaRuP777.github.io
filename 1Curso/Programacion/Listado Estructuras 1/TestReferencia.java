package listadoEstructuras;

/**
 * 2.Crea el siguiente c&oacute;digo. Contesta a las siguientes preguntas:
 * <ol>
 * 		<li>�Cu&aacute;ndo la comparaci&oacute;n de dos referencias es true?
 * 		<li>Siempre se inicializa una referencia a null?
 * 		<li>�Por qu&eacute; vector1 y vector2 han de ser static? �Cu&aacute;l ser&iacute;a otra soluci&oacute;n?
 * <ol>
 * 
 * @author Estela Mu&ntilde;oz
 * @author Pedro J. Ramos
 *
 */

public class TestReferencia {
	
	static char [] vector1; //referencia(puntero a memoria din�mica)
	static char [] vector2; //referencia(puntero a memoria din�mica)
	
	/**
	 * Gesti&oacute;n de referencias y reserva de memoria din&amica
	 * 
	 */
	
	public static void main(String[] args) {
		
		if (vector1 == null)
			System.out.println("vector vale null: "+vector1+". Todav�a no "+ "apunta a la memoria din�mica");
			
		vector1 = new char[5]; //reserva de memoria y asignaci�n
		vector2 = vector1; //ASIGNACI�N: ambas apuntan al mismo trozo de memoria
		
		if (vector1 == vector2)//COMPARACI�N
			System.out.println("Ambas apuntan al mismo troz de memoria");
		
		vector2 = new char[5];//reserva de memoria y asignaci�n
		
		if (vector1 != vector2)//COMPARACI�N
			System.out.println("No apuntan al mismo trozo de memoria");
		
		//se comprueba que ambos vectores contienen lo mismo
		for (char caracter : vector1) {
			System.out.println(caracter+"-");
		}
		
		System.out.println();
		for (char caracter : vector2) {
			System.out.println(caracter+"-");
		}

	}

}
