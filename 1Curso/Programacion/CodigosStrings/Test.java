package codigosStrings;

public class Test {

	public static void main(String[] args) {
		Test.test(new String("Probando instanceof"));
	}
	/**
	 * Muestra si el objeto se corresponde con alguno de los tipos indicados
	 * (en este caso es de tipo String, por lo que en el resto de casos
	 * mostrar&aacute; un false)
	 * 
	 * @param o Objeto
	 */
	public static void test(Object o){
		System.out.println(o instanceof String); //Mostrará un true
		System.out.println(o instanceof Object);
		System.out.println(o instanceof Integer);
		System.out.println(o instanceof java.util.Calendar);
	}

}
