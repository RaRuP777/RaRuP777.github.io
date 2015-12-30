package codigosStrings;

public class WrapperTest {

	public static void main(String[] args) {
		//Creamos la cadena texto e indicamos su contenido
		String texto=new String("3");
		
		//Convierte la cadena  texto de tipo String a tipo byte
		byte b=Byte.parseByte(texto);
		//Convierte a tipo String el byte b
		System.out.println(Byte.toString(b));
		//Convierte la cadena texto al tipo short
		short s=Short.parseShort(texto);
		//Convierte a tipo String el short s
		System.out.println(Short.toString(s));
		//Convierte la cadena texto al tipo int(entero)
		int i=Integer.parseInt(texto);
		//Convierte a tipo String el entero i
		System.out.println(Integer.toString(i));
		//Convierte la cadena texto al tipo long
		long l=Long.parseLong(texto);
		//Convierte a tipo String el long l
		System.out.println(Long.toString(l));
		//Convierte la cadena texto al tipo float
		float f=Float.parseFloat(texto);
		//Convierte a tipo String el float f
		System.out.println(Float.toString(f));
		//Convierte la cadena texto al tipo double
		double d=Double.parseDouble(texto);
		//Convierte a tipo String el double d
		System.out.println(Double.toString(d));
		
		

	}

}
