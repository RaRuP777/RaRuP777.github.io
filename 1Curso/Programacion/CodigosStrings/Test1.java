package codigosStrings;

public class Test1 {

	public static void main(String[] args) {
		int a=1;
		int b=2;
		System.out.println("A: "+a+" y B: "+b);
		cambiar(a,b); 
		/* No cambia los valores de a y b porque los atributos a y b del método son copias de a y b, 
		 * de modo que se mantienen los valores originales de éstos*/
		System.out.println("A: "+a+" y B: "+b);

	}

	/**
	 * Intercambia los valores de a y b (a y b son copias de los a y b del main)
	 * 
	 * @param a Primer entero
	 * @param b Segundo entero
	 */
	private static void cambiar(int a, int b) {
		int tmp=a;
		a=b;
		b=tmp;
	}

}
