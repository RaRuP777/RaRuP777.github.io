package codigosStrings;

import org.omg.Messaging.SyncScopeHelper;

public class SystemTest {

	public static void main(String[] args) {
		//Muestra la diferencia entre la hora actual y la medianoche del 1 de enero de 1970 en milisegundos
		System.out.println(System.currentTimeMillis());
		//Muestra la hora actual convertida en nanosegundos
		System.out.println(System.nanoTime());
		//Devuelve el valor de la propiedad del sistema indicada
		System.out.println(System.getProperty("java.runtime.name"));
		//Muestra las propiedades del sistema (devuelve una instancia de java.util.Properties)
		System.out.println(System.getProperties());
		//Termina la ejecución de la JVM (máquina virtual de java)
		System.exit(0);
		System.out.println("Aquí nunca llega.");

	}

}
