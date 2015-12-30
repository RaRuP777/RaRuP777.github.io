package TestArgumentosMain;

/**
 * Sube el c&oacute;digo fuente &quot;TestArgumentosMain.java&quot; que:
 * <ol>
 * <li>Muestre el n&uacute;mero de argumentos enviados al main</li>
 * <li>Muestre los argumentos al rev&eacute;s y en may&uacute;sculas.</li>
 * </ol>
 * Por ejemplo, si los argumentos son &quot;hola adios&quot;, debe mostrarse
 * &quot;N&uacute;mero de argumentos 2. ADIOS HOLA&quot;
 * 
 * @author Pedro J. Ramos
 * @author Estela Mu&ntilde;oz
 *
 */
public class TestArgumentosMain {

	public static void main(String[] args) {
		String cadena = "";
		for (int i = args.length - 1; i >= 0; i--) {
			cadena +=args[i]+"\t";
		}
		System.out.println("El número de argumentos enviados al main son " + args.length + ". "+cadena.toUpperCase());
	}
}