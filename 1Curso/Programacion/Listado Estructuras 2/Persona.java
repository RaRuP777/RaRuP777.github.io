package listadoEstructuras2;

/**
 * 1. Entrega la clase TestListaPersonas que haga lo siguiente:
 * 
 * <ol>
 * 	<li>a. Cree una lista (ArrayList) de personas.
 * 		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();//Generics</li>
 * 	<li>b. A&ntilde;ada tres personas a la lista (3 elementos).</li>
 * 	<li>c. Muestre la lista. (implementa toString() en Persona)</li>
 * 	<li>d. Elimine el &uacute;ltimo elemento.</li>
 * 	<li>e. Muestre la lista.</li>
 * 	<li>f. Elimine el primer elemento.</li>
 * 	<li>g. Muestre la lista.</li>
 * </ol>
 * 
 * La persona tiene al menos nombre y apellidos.
 *  
 * @author Estela Mu&ntilde;oz
 * @author Pedro J. Ramos
 * @version 1.0
 *
 */

public class Persona {
	/**
	 * Nombre de la persona
	 */
	private String nombre;
	
	/**
	 * Primer apellido de la persona
	 */
	private String apellido1;
	
	/**
	 * Segundo apellido de la persona
	 */
	private String apellido2;

	/**
	 * Se crea una persona (el objeto en cuestión)
	 * 
	 * @param nombre Nombre de la persona
	 * @param apellido1 Primer apellido de la persona
	 * @param apellido2 Segundo apellido de la persona
	 */
	public Persona(String nombre, String apellido1, String apellido2) {
		setNombre(nombre);
		setApellido1(apellido1);
		setApellido2 (apellido2);
	}

	/**
	 * Muestra a la persona
	 */
	@Override
	public String toString() {
		return nombre + " " + apellido1 + " " + apellido2;
	}

	/**
	 * Devuelve el nombre de la persona
	 * 
	 * @return Nombre de la persona
	 */
	private String getNombre() {
		return nombre;
	}

	/**
	 * Modifica el nombre de la persona
	 * 
	 * @param nombre Nombre de la persona
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Devuelve el primer apellido de la persona
	 * 
	 * @return Primer apellido de la persona
	 */
	private String getApellido1() {
		return apellido1;
	}

	/**
	 * Modifica el primer apellido de la persona
	 * 
	 * @param apellido1 Primer apellido de la persona
	 */
	private void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	/**
	 * Devuelve el segundo apellido de la persona
	 * 
	 * @return Segundo apellido de la persona
	 */
	private String getApellido2() {
		return apellido2;
	}

	/**
	 * Modifica el segundo apellido de la persona
	 * 
	 * @param apellido2 Segundo apellido de la persona
	 */
	private void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	
}
