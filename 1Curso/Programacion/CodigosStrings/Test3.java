package codigosStrings;

public class Test3 {

	public static void main(String[] args) {
		//Creamos dos objetos de tipo MiClase
		MiClase a=new MiClase(1);
		MiClase b=new MiClase(2);
		
		System.out.println("A: "+a+" y B: "+b);
		cambiar(a,b); 
		/* Aquí no se cambian los objetos, sino el valor de sus atributos, 
		 * que es lo que se muestra*/
		System.out.println("A: "+a+" y B: "+b);

	}

	/**
	 * Intercambia los valores de a y b (a y b son copias de los objetos a y b del main)
	 * 
	 * @param a Primer objeto
	 * @param b Segundo objeto
	 */
	private static void cambiar(MiClase a, MiClase b) {
		int tmp=a.getValor(); //tmp contiene el valor del objeto a
		a.setValor(b.getValor()); //Se modifica el valor de a con el valor de b
		b.setValor(tmp); //Se modifica el valor de b con el valor de tmp
	}

}
