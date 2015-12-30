package seminario2;

/**
 * Realiza el siguiente seminario y entrega el c&oacute;digo generado.
 * Tratar&aacute;s los siguientes temas:
 * <ol>
 * 	<li>Herencia:</li>
 * 		<ol>
 * 			<li>Superclase o clase padre y subclase o clase hija: Empleado, Jefe, Administrativo.</li>
 * 			<li>Reutilizaci&oacute;n de:</li>
 * 				<ol>
 * 					<li>Atributos y m&eacute;todos: getSalario()</li>
 * 					<li>Constructores no se heredan, se reutilizan</li>
 * 						<ol>
 * 							<li>Uso del constructor del padre: super();</li>
 * 						</ol>
 * 				</ol>
 * 			<li>Redefinici&oacute;n de m&eacute;todos</li>
 * 				<ol>
 * 					<li>Uso de la versi&oacute;n del padre: super.getSalario(), super.toString()</li>
 * 					<li>Igual o mayor visibilidad</li>
 * 				</ol>
 * 			<li>Visibilidad</li>
 * 				<ol>
 * 					<li>protected: accesible en la misma clase, paquete y clase que lo hereda (a trav&eacute;s de la herencia)</li>
 * 				</ol>
 * 			<li>Polimorfismo</li>
 * 				<ol>
 * 					<li>Compatibilidad de tipos</li>
 * 					<li>Tipo est&aacute;tico (el de la referencia)</li>
 * 					<li>Tipo din&aacute;mico (el del objeto al que apunta)</li>
 * 				</ol>
 * 		</ol>
 * </ol>
 * 
 * @author Estela Mu&ntilde;oz Cord&oacute;n
 * @author Pedro J. Ramos Ruiz
 * @version 1.0
 *
 */

public class PruebaEmpleados {

	public static void main(String[] args) {
		
		//****** USANDO MÉTODOS DE LAS CLASES PADRE E HIJAS *****\\
		
		Empleado empleado = new Empleado("Juan", 1000, 2001);
		System.out.println("Empleado: " + empleado.getNombre());
		System.out.println("Gana: " + empleado.getSalario());
		
		/* Si fuera protected el atributo "nombre" de empleado, sería posible modificarlo directamente, 
		 * ya que estaría accesible al estar en el mismo paquete: 
		 * 
		 * empleado.nombre = "Enrique";
		 * 
		 * Pero no es el caso (está private).
		 */
		
		Jefe jefe = new Jefe("Pedro", 1200, 1999, 0.5f);		
		System.out.println("Salario del Jefe: " + jefe.getSalario());
		System.out.println(jefe.getDescripcion());
		
		Administrativo admin = new Administrativo("Pedro", 900, 2003, jefe);
		System.out.println("Administrativo: " + admin.getNombre());
		System.out.println("Gana: " + admin.getSalario());
		
		
		//***** COMPARANDO CON CLASS Y HACIENDO CASTING *****\\
		
		// Compara si empleado es compatible con el tipo Jefe. 
		// Si lo es, lo convierte a tipo Jefe.
		if(empleado.getClass() == Jefe.class){ // mira que tipo de objeto es, aqui compara si son del mismo tipo de objeto
			Jefe jefe2 = (Jefe) empleado;	
			jefe.setBonificacion(0.7f);
			System.out.println("Jefe: " + jefe2.getNombre());	
		} else
			System.out.println("El empleado no es un jefe");
	
		
		//****** CREAMOS UN VECTOR DE EMPLEADOS ******\\
		
		// Creamos un vector que contendrá 3 empleados
		Empleado[] empleados = new Empleado[3];
		
		// En la posición 0 del vector almacenamos un empleado
		empleados[0] = new Empleado("Juan", 1000, 2001);
		
		// Para saber de que tipo exacto es empleados usamos el getClass: System.out.println(empleado.getClass());
		
		// Almacenamos jefe en la posición 1 del vector
		empleados[1] = jefe;
		
		// Almacenamos en la posición 2 del vector un administrativo
		empleados[2] = new Administrativo("Enrique", 900, 2003, jefe);
		
		
		//****** LIGADURA DINÁMICA ******\\
		
		// Usamos la "LIGADURA DINÁMICA" para usar los métodos redefinidos en las subclases
		// Recorremos el vector y nos muestra el nombre y salario de los empleados
		for (Empleado empleadoA : empleados)
			System.out.println("Soy " + empleadoA.getNombre() +
					" y gano " + empleadoA.getSalario());
		
		
		//****** INSTANCEOF ******\\
		
		// Usamos "instanceof" para comparar las compatibilidades entre clases
		// Comprobamos que las conversiones son posibles
		// Recorremos el vector para mostrar los nombres y salarios de los empleados
		for(Empleado empleadoB : empleados){ 
			if(empleadoB instanceof Jefe){
				// Uso de Casting o narrowing: Convertimos un empleado a un jefe --> Se usa el método del jefe
				Jefe jefe2 = (Jefe) empleadoB;
				System.out.println("Soy " + jefe2.getNombre() +
						" y gano " + jefe2.getSalario());
			} else if(empleadoB instanceof Administrativo){
				// Uso de Casting o narrowing: Convertimos un empleado a un administrativo --> Se usa el método del administrativo
				Administrativo admin2 = (Administrativo) empleadoB; 
				System.out.println("Soy " + admin2.getNombre() +
						" y gano " + admin2.getSalario());
			} else{//se aplica el método de la clase Empleado
				System.out.println("Soy " + empleadoB.getNombre() + 
						" y gano " + empleadoB.getSalario());
			}
		}
		
		
		//****** INSTANCEOF VS CLASS ******\\
		
		// Muestra el nombre de todos aquellos que son del tipo exacto Empleado (sin tener en cuenta subtipos)
		for(Empleado empleadoC : empleados){
			if(empleadoC.getClass() == Empleado.class) // Compara si son del mismo tipo de objeto exacto
				System.out.println("Soy " + empleadoC.getNombre());
		}
		
		// Muestra el nombre de todos los empleados que sean de tipos compatibles entre sí (de tipo Empleado y sus subtipos)
		for(Empleado empleadoD : empleados){
			if(empleadoD instanceof Empleado)
				System.out.println("Soy " + empleadoD.getNombre());
		}		

		
		//**** PREGUNTAR POR EL TIPO DE UNA REFERENCIA *****\\
		// Pocas veces está justificado. Éste es un ejemplo
		for(Empleado empleadoE : empleados){
			if(empleadoE instanceof Jefe){
				// Se podría hacer un casting al mismo tipo
				Jefe jefe2 = (Jefe)jefe;
				jefe2.setBonificacion(0.8f);
				System.out.println("Bonificación para: " +jefe2.getNombre());
			}
		}
		
		
		//***** OBJECT *****\\
		
		// HERENCIA TRANSITIVA: una clase siempre hereda directa o indirectamente de Object
		Object obj = new Empleado("Juan", 1000, 2001); // No tiene los métodos de empleado porque se ha creado como Object y tiene los métodos de éste
		// obj.getNombre() no está definido para el tipo Object
		//Pero si le hacemos un Casting al objeto y lo convertimos a tipo Empleado  sí tiee acceso a sus métodos
		Empleado empleado2 = (Empleado) obj;
		empleado2.getNombre();
		
		
		//***** TIPOS PRIMITIVOS - AUTOBOXING *****\\
		
		// Los tipos primitivos no son objetos pero tienen una clase contenedora
		int entero = 5;
		int entero2;
		Object obj2 = entero;
		entero2 = (Integer) obj2;
		System.out.println("Valor: " + entero2);
		
		
		//***** MÉTODOS DE LA CLASE OBJECT *****\\
		
		// Se aplica el método toString --> Muestra el nombre de la clase y la dirección de memoria
		System.out.println("Objeto: " + obj); 
		
		// Método sobreescrito de Jefe --> LIGADURA DINÁMICA (usa el método del tipo dinámico)
		Object obj3 = new Jefe("Pedro", 1200, 1999, 0.5f); // No tiene los métodos de empleado porque se ha creado como Object y tiene los métodos de éste
		System.out.println("Objeto: " + obj3);
		
		// Método equals --> Comprueba que dos referencias apuntan al mismo objeto
		// Tipos igualdad: Superficial --> las referencias apuntan a los mismos objetos,
		// En profundidad --> las referencias son iguales (equals)
		// Mixto --> depende de la referencia	
		Empleado empleado3 = new Empleado("Juan",1000, 2001);
		Empleado empleado4 = new Empleado("Juan",1000, 2002);
		Empleado empleado5 = new Empleado("Juan",1000, 2001);
		
		System.out.println("¿Son iguales?: " + empleado3.equals(null));
		System.out.println("¿Son iguales?: " + empleado3.equals(empleado3));
		System.out.println("¿Son iguales?: " + empleado3.equals(empleado4));
		System.out.println("¿Son iguales?: " + empleado3.equals(empleado5));
		System.out.println("¿Son iguales?: " + empleado3.equals(jefe));
		
		Jefe jefe2 = new Jefe("Juan",1000, 2001, 0.8f);
		Jefe jefe3 = new Jefe("Pedro",1000, 2001, 0.8f);
		Jefe jefe4 = new Jefe("Juan",1000, 2001, 0.7f);
		Jefe jefe5 = new Jefe("Juan",1000, 2001, 0.8f);
		
		System.out.println("\n¿Son iguales?: " + jefe2.equals(null));
		System.out.println("¿Son iguales?: " + jefe2.equals(jefe2));
		System.out.println("¿Son iguales?: " + jefe2.equals(jefe3));
		System.out.println("¿Son iguales?: " + jefe2.equals(jefe4));
		System.out.println("¿Son iguales?: " + jefe2.equals(empleado3));
		System.out.println("¿Son iguales?: " + jefe2.equals(jefe5));
		
		// Método Clone
		Empleado copia = empleado.clone();
		System.out.println(copia);
		// No sirve: Jefe copia2 = jefe.clone(); --> El return es Empleado no Jefe
		Jefe copia2 = (Jefe)jefe.clone();
		System.out.println(copia2);
		
		/*
		 * Se usa el método clone reescrito de Administrativo.
		 */
		  
		System.out.println(admin);
		Administrativo copia3 = (Administrativo)admin.clone();
		  
		System.out.println(copia3);
		System.out.println("¿Es el mismo Jefe? " + (admin.getJefe()== copia3.getJefe()));
		System.out.println("¿Iguales? " + admin.equals(copia3));
	}
}
