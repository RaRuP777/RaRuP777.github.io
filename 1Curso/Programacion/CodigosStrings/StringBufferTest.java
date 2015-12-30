package codigosStrings;

public class StringBufferTest {

	public static void main(String[] args) {
		//---- PRIMERA CADENA----
		
		//Creamos una cadena con un constructor e indicando su contenido
		StringBuffer sb1=new StringBuffer("abababab");
		
		//Muestra la longitud de la cadena
		System.out.println(sb1.length());
		//Muestra la capacidad de la cadena (valores que puede contener)
		System.out.println(sb1.capacity());
		//Modifica el carácter de la última posición de la cadena por una B
		sb1.setCharAt(sb1.length()-1, 'B');
		//Muestra la cadena
		System.out.println(sb1);
		//Reemplaza lo que hay desde la posición 2 a la 3 con AB
		sb1.replace(2, 3, "AB");
		//Muestra la cadena
		System.out.println(sb1);
		//Añade en la posición 4 CD
		sb1.insert(4, "CD");
		//Muestra la cadena
		System.out.println(sb1);
		//Borra el contenido desde la posición 0 a la 2
		sb1.delete(0, 2);
		//Muestra la cadena
		System.out.println(sb1);
		
		
		//---- SEGUNDA CADENA----
		
		//Creamos una cadena con el constructor indicando el máximo de valores quecontendrá
		StringBuffer sb2=new StringBuffer(2);
		
		//Indica la longitud de la cadena (no contiene nada, así que es 0)
		System.out.println(sb2.length());
		//Indica la capacidad de la cadena, que como indicamos al crearla es 2
		System.out.println(sb2.capacity());
		
		//Va rellenando la cadena con valores de 0 a 10 secuencialmente
		for(int i=0;i<10;i++)
			sb2.append(i);
		
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());
		System.out.println(sb2);
	}

}
