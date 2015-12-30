package AccediendoCampos;

/**
 * Basándote en las clases anteriores, crea otra clase AccediendoCampos que:

    Instancie un objeto de cada clase
    Acceda y visualice cada campo de los objetos 

Para ello:

    Procura escribir todo el código (no copies y pegues)
    Inicialmente, no te preocupes de los modificadores de acceso (sólo public class por cada fichero.java. El resto, friendly) 

Al finalizar el ejercicio, indica:

    ¿Has tenido algún impedimento para acceder a los campos?¿Por qué? 

Recuerda los campos de Clase1 y Clase2
Clase1.
Contiene los campos
* campo1 tipo int;
* campo2 tipo String;
* campo3 tipo Clase2
Clase2.
Contiene los campos
* campo1 tipo int[][];
* campo2 tipo char;
AccediendoCampos
Con método main que
* cree una instancia de cada objeto Clase1 y Clase2.
* Acceda y muestre cada uno de los campos de los objetos
Si todo va bien, el resultado debería ser algo parecido a esto:

Acceciendo a los campos de o1: 

o1.campo1(9),
o1.campo2( Campo2 del objeto de la Clase1),
o1.campo3.campo2 (d)

0 0 0
0 0 0

Acceciendo a los campos de o2: 

o2.campo2(Y)
0 0 0
0 0 0 
 * 
 * @author Estela
 * @version 1.0
 */

public class AccediendoClases {

	public static void main(String[] args) {
		int [][] matriz = new int [2][3];
		Clase2 clase2 = new Clase2 (matriz,'s');
		Clase1 clase1 = new Clase1 (4, "hola", clase2);
       
		System.out.println("Accediendo a los campos de o1:");
		System.out.println("\t" + clase1.getCampo1()+
				"\n\t"+
				clase1.getCampo2()+
				"\n\t"+
				clase1.getCampo3()+
				"\nAccediendo a los campos de o2:"+
				"\n\t"+
				clase2.getCampo2());
		mostrarMatriz(clase2.getCampo1());
				
				
	}

	/**
	 * Muestra la matriz
	 * 
	 * @param matriz Array bidimensional, propiedad del objeto Clase2
	 */
	private static void mostrarMatriz(int[][] matriz) {
		System.out.println("\t");
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz[i].length;j++){
				System.out.print(matriz[i][j]+" ");
			}
		System.out.println("\t");
		}		
	}
	
	
}
