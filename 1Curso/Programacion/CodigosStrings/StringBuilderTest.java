package codigosStrings;

public class StringBuilderTest {

	public static void main(String[] args) {
		//Creamos la cadena con el constructor, indicando su contenido
		StringBuilder sb=new StringBuilder("0");
		
		//Muestra la longitud de la cadena
		System.out.println(sb.length());
		//Muestra la capacidad de la cadena (máximo de valores que puede contener)
		System.out.println(sb.capacity());
		
		//Vamos añadiendo a la cadena los valores de 1 a 10
		for(int i=1;i<10;i++)
			sb.append(i);
		
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println(sb);
	}

}
