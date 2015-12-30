package Matriz;

import utiles.Teclado;

public class Matriz {
	
	/**
	 * Atributo matriz de enteros
	 */
	private int[][] matriz;
	
	/**
	 * Crea una matriz con todos sus valores a 0
	 * 
	 */
	public Matriz (int [][] matriz){
	}
	
	/**
	 * Crea una matriz con filas y columnas definidas por parametro
	 * @param filas de la matriz
	 * @param columnas de la matriz
	 */
	public Matriz(int filas, int columnas){
		matriz = new int[filas][columnas];
	}
	
	/**
	 * Crea una matriz con valores aleatorios
	 * 
	 * @param filas n&uacute;mero de filas
	 * @param columnas n&uacute;mero de columnas
	 * @param min valor m&iacute;nimo aleatorio
	 * @param max valor m&aacute;ximo aleatorio
	 */
	public Matriz(int filas, int columnas, int min, int max){
		matriz = new int[filas][columnas];
		for(int i=0;i<filas;i++)
			for(int j=0;j<columnas;j++)
				matriz[i][j]=(int)(Math.random()*(max-min+1))+min;
	}
	
	/**
	 * Muestra el contenido de la matriz
	 * @param matriz a mostrar
	 * @param mensaje mensaje que se muestra antes de mostrar la matriz
	 */
	public static void mostrar(int[][] matriz, String mensaje){
    	System.out.println("\n"+mensaje);
        for(int i=0;i<matriz.length;i++){
        	for (int j = 0; j < matriz[i].length; j++) {
        		System.out.print("\t"+matriz[i][j]);
    		}
        	System.out.println("");
    	}
	}
	
	/**
	 * Devuelve el atributo matriz del objeto
	 * @return
	 */
	public int[][] getMatriz() {
		return matriz;
	}

	/**
	 * Actualiza el estado del atributo matriz del objeto
	 * @param matriz
	 */
	public void setMatriz(int[][] matriz) {
		this.matriz = matriz;
	}

	/**
	 * Muestra el atributo matriz del objeto de forma traspuesta
	 * @param matriz a trasponer
	 */
	public void trasponer(int[][] matriz){
		for (int i = matriz.length-1; i > -1; i--) {
			for (int j = matriz.length-1; j >-1; j--)
				System.out.print("\t"+matriz[i][j]);
			System.out.print("\n");
		}
	}
	
	/**
	 * Suma el atributo matriz del objeto a otra matriz pasada por parametro
	 * @param matriz2 matriz a sumar con la matriz atributo del objeto
	 */
	public void sumar(int [][] matriz2){
		if (mismasDimensiones(matriz2)); {
			for(int i=0;i<matriz.length;i++){
				for (int j = 0; j < matriz[i].length; j++) {
					matriz[i][j]=matriz[i][j]+matriz2[i][j];
				}
			}
			mostrar(matriz, "Esta es la Matriz Sumada");
		}
		System.out.println("Las Matrices no son compatibles para ser sumadas");
	}	
	
	/**
	 * Resta el atributo matriz del objeto a otra matriz pasada por parametro
	 * @param matriz2 matriz a restar con la matriz atributo del objeto 
	 */
	public void restar(int [][] matriz2){
		if (mismasDimensiones(matriz2)); {
			for(int i=0;i<matriz.length;i++){
				for (int j = 0; j < matriz[i].length; j++) {
					matriz[i][j]=matriz[i][j]-matriz2[i][j];
				}
			}
			mostrar(matriz, "Esta es la Matriz Restada");
		}
		System.out.println("Las Matrices no son compatibles para ser sumadas");
	}
	
	/**
	 * Multiplica el atributo matriz del objeto a otra matriz pasada por parametro
	 * @param matriz2 matriz a multiplicar con la matriz atributo del objeto
	 * @return nueva matriz resultante de la multiplicacion 
	 */
	public int[][] multiplicar(int[][] matriz2) {
		int[][]resultado=new int[matriz.length][matriz2[0].length];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz2[0].length; j++) {
				for (int k = 0; k < matriz[0].length; k++) {
					resultado[i][j]+=matriz[i][k]*matriz2[k][j];
				}
			}
		}
		return resultado;
	}
	
	/**
	 * Coprueba las dimensiones de la matriz atributo del objeto con la matriz pasada por parametro
	 * @param matriz2 matriz a comparar con la matriz del atributo del objeto
	 * @return true/false de la comparación
	 */
	private boolean mismasDimensiones(int [][] matriz2){
			if (matriz.length == matriz2.length && matriz[0].length == matriz2[0].length)
				return true;
			else
				return false;
	}
	
	/**
	 * Muestra el contenido de la matriz atributo del objeto
	 * @param string mensaje pasado por parametro
	 */
	public void mostrar(String string) {
		System.out.println(string);
		 for(int i=0;i<matriz.length;i++){
	        	for (int j = 0; j < matriz[i].length; j++) {
	        		System.out.print("\t"+matriz[i][j]);
	    		}
	        	System.out.println("");
	    	}
	}

	/**
	 * Comprueba que la matriz atributo del objeto o la pasada por parámetro no esta a null
	 * @param matriz2 matriz a comprobar que no esta a null
	 * @return true/false si esta o no a null la matriz
	 */
	public boolean noNull (int [][] matriz2){
		if (matriz==null||matriz==null)
			return true;
		return true;
	}
}