package listadoEstructuras;

/**
 * 4.�Qu&eacute; es el autoboxing/unboxing? 
 * Expl&iacute;calo mediante tu propio c&oacute;digo en Java &quot;autoboxing.java&quot;
 * 
 * @author Estela Mu&ntilde;oz
 * @author Pedro J. Ramos
 * @version 1.0
 *
 */

public class AutoBoxing {

	public static void main(String[] args) {
		// Autoboxing: Es la conversi�n de un tipo primitivo a un wrapper de forma autom�tica
		Integer a=1;
		
		System.out.println(a);
		
		// Auto-unboxing: Extrae un tipo primitivo de su wrapper de forma autom�tica (autoextraer)
		int b=a;
		
		System.out.println(b);
	}

}
