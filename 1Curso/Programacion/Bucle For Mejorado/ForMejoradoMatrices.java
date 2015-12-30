package buclesFor;

public class ForMejoradoMatrices {

	public static void main(String[] args) {
		int[][] matriz = { { 1, 2, 3 }, { 4, 5, 6 } };
		mostrar(matriz);
		System.out.println("\nSuma con for clasico: " + sum1(matriz)+ "\nSuma con for mejorado: " + sum2(matriz));
	}

	/**
	 * Método que calcula la suma de los elementos del array Utiliza para ello
	 * el <b>for clásico</b> con índices
	 * 
	 * @param a
	 *            array de enteros
	 * @return suma de los elementos del array
	 */
	private static int sum1(int[][] matriz) {
		int result = 0;
		for(int i=0;i<matriz.length;i++){
        	for (int j = 0; j < matriz[i].length; j++)
				result += matriz[i][j];
		}
		return result;
	}
	
	/**
	 * Método que calcula la suma de los elementos del array Utiliza para ello
	 * el <b>for mejorado</b>
	 * 
	 * @param a
	 *            array de enteros
	 * @return suma de los elementos del array
	 */
	private static int sum2(int[][] matriz) {
		int result = 0;
		for (int i[] : matriz){
			for (int j : i)
				result += j;
		}
		return result;
	}

	/**
	 * Método que muestra los elementos del array Utiliza para ello el <b>for
	 * clásico</b>
	 * 
	 * @param a
	 *            array de enteros
	 */
	private static void mostrar(int[][] matriz){
    	System.out.println("\n La matriz es: ");
        for(int i=0;i<matriz.length;i++){
        	for (int j = 0; j < matriz[i].length; j++) {
        		System.out.print("\t"+matriz[i][j]);
    		}
        	System.out.println("");
    	}
	}
}