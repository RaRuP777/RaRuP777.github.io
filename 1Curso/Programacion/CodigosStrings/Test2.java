package codigosStrings;

public class Test2 {

	public static void main(String[] args) {
		//Creamos dos objetos de tipo MiClase
		MiClase a=new MiClase(1);
		MiClase b=new MiClase(2);
		
		System.out.println("A: "+a+" y B: "+b);
		cambiar(a,b); 
		/* No cambia los valores de a y b porque los atributos a y b del método son copias de a y b, 
		 * de modo que se mantienen los valores originales de éstos*/
		System.out.println("A: "+a+" y B: "+b);

	}

	/**
	 * Intercambia los valores de a y b (a y b son copias de los objetos a y b del main)
	 * 
	 * @param a Primer objeto
	 * @param b Segundo objeto
	 */
	private static void cambiar(MiClase a, MiClase b) {
		MiClase tmp=a;
		a=b;
		b=tmp;
	}

}
