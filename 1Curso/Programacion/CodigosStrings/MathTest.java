package codigosStrings;

public class MathTest {

	public static void main(String[] args) {
		//Muestra el valor absoluto de -1
		System.out.println(Math.abs(-1));
		//Indica el valor m�ximo entre -1 y 5
		System.out.println(Math.max(-1, 5));
		//Indica el valor m�nimo entre -1 y 5
		System.out.println(Math.min(-1, 5));
		//Muestra la potencia de base 4 elevada a 2
		System.out.println(Math.pow(4, 2));
		//Muestra la ra�z cuadrada de 4
		System.out.println(Math.sqrt(4));
		System.out.println("Numero entero aleatorio entre 0 y 100:");
		System.out.println((int)Math.round(Math.random()*100)); 
		//round redondea al entero m�s cercano el n�mero aleatorio obtenido

	}

}
