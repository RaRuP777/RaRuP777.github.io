package estructuraPersonasRamosRuizPedroMunnozCordonEstela;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Crea una estructura din&acute;mica de personas.<br>
 * Una persona consta de:
 * <ol>
 * 	<li>Nombre (regex con m&iacute;nimo de tres caracteres v&aacute;lidos seguidos)</li>
 * 	<li>Apellido primero (regex con m&iacute;nimo de tres caracteres v&aacute;lidos seguidos)</li>
 * 	<li>Apellido segundo (regex con m&iacute;nimo de tres caracteres v&aacute;lidos seguidos)</li>
 * 	<li>Fecha de nacimiento (regex con formato dd/mm/aaaa y (opcional) es v&aacute;lida (a&ntilde;o bisiesto)</li>
 * 	<li>C&oacute;digo postal (regex que admita pplll &oacute; pp.lll)</li>
 * 	<li>Edad (opcional)</li>
 * 	<li>Identificador un&iacute;voco, generado mediante un campo static)</li>
 * </ol>
 * Con la estructura podr&aacute;s realizar las siguientes operaciones:
 * <ol>	
 * 	<li>A&ntilde;adir una nueva persona</li>
 * 	<li>Eliminarla (utiliza contains)</li>
 * 	<li>Contar y mostrar los que hay de una provincia (utiliza iteradores)</li>
 * 	<li>Mostrar la estructura al completo(utiliza toString)</li>
 * </ol>
 * 
 * @author Estela Mu&ntilde;oz
 * @author Pedro J. Ramos
 * @version 1.0
 *
 */

public class Persona {
	/**
	 * Nombre
	 */
	private String nombre;
	/**
	 * Primer apellido
	 */
	private String apellido1;
	/**
	 * Segundo apellido
	 */
	private String apellido2;
	/**
	 * Fecha de nacimiento
	 */
	private String fechaNacimiento;
	/**
	 * C&oacute;digo Postal
	 */
	private String codigoPostal;
	/**
	 * Edad (a&ntilde;os)
	 */
	private int edad;
	/**
	 * Identificador &uacute;nico
	 */
	private int id;
	
	/**
	 * Constructor con el que se crea una persona
	 * 
	 * @param nombre Nombre
	 * @param apellido1 Primer apellido
	 * @param apellido2 Segundo apellido
	 * @param fechaNacimiento Fecha de nacimiento
	 * @param codigoPostal C&oacute;digo Postal
	 * @param edad Edad en a&ntilde;os
	 * @param id Identificador &uacute;nico
	 */
	public Persona (String nombre, String apellido1, String apellido2, String fechaNacimiento, 
			String codigoPostal, int edad, int id){
		setNombre(nombre);
		setApellido1(apellido1);
		setApellido2(apellido2);
		setFechaNacimiento(fechaNacimiento);
		setCodigoPostal(codigoPostal);
		setEdad(edad);
		setId(id);
	}

	/**
	 * Devuelve el nombre de la persona
	 * 
	 * @return Nombre
	 */
	private String getNombre() {
		return nombre;
	}

	/**
	 * Modifica el nombre de la persona
	 * 
	 * @param nombre Nombre
	 */
	private void setNombre(String nombre) {
		// Permite nombre compuesto, aunque habría que pulirlo porque acepta: Estela ma, 
		// sólo que se queda sólo con Estela (pero deja escribirlo)
		if(expresionesRegulares("^[A-ZÑ][a-záéíóúñ]{2}[a-záéíóúñ]*(\\s[A-ZÑ][a-záéíóúñ]{2}[a-záéíóúñ]*)?", nombre)) 
			this.nombre = nombre;
		
		else
			System.err.println("El nombre no es válido");
	}

	/**
	 * Devuelve el primer apellido de la persona
	 * 
	 * @return Primer apellido
	 */
	private String getApellido1() {
		return apellido1;
	}

	/**
	 * Modifica el primer apellido
	 * 
	 * @param apellido1 Primer apellido
	 */
	private void setApellido1(String apellido1) {
		if(expresionesRegulares("^[A-ZÑ][a-záéíóúñ]{2}[a-záéíóúñ]*", apellido1))
			this.apellido1 = apellido1;
		
		else
			System.err.println("El primer apellido no es válido");
	}

	/**
	 * Devuelve el segundo apellido
	 * 
	 * @return Segundo Apellido
	 */
	private String getApellido2() {
		return apellido2;
	}

	/**
	 * Modifica el segundo apellido
	 * 
	 * @param apellido2 Segundo apellido
	 */
	private void setApellido2(String apellido2) {
		if(expresionesRegulares("[A-ZÑ][a-záéíóúñ]{2}[a-záéíóúñ]*", apellido2))
			this.apellido2 = apellido2;
		
		else
			System.err.println("El segundo apellido no es válido");
	}

	/**
	 * Devuelve la fecha de nacimiento
	 * 
	 * @return Fecha de nacimiento
	 */
	private String getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * Modifica la fecha de nacimiento
	 * 
	 * @param fechaNacimiento Fecha de nacimiento
	 */
	private void setFechaNacimiento(String fechaNacimiento) {
		if(expresionesRegulares("(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/(19|20)\\d{2}", 
				fechaNacimiento))
			this.fechaNacimiento = fechaNacimiento;
		else
			System.err.println("La fecha no es válida.");
	}

	/**
	 * Devuelve el C&oacute;digo Postal
	 * 
	 * @return C&oacute;digo Postal
	 */
	private String getCodigoPostal() {
		return codigoPostal;
	}

	/**
	 * Modifica el C&oacute;digo Postal
	 * 
	 * @param codigoPostal C&oacute;digo Postal
	 */
	private void setCodigoPostal(String codigoPostal) {
		if(expresionesRegulares("^((0[1-9])|([1-4][0-9])|(5[0-2]))[\\.]?[0-9]{3}$", codigoPostal))
			this.codigoPostal = codigoPostal;
		else
			System.err.println("El Código Postal introducido no es válido");
	}

	/**
	 * Devuelve la edad
	 * 
	 * @return Edad
	 */
	private int getEdad() {
		return edad;
	}

	/**
	 * Modifica la edad
	 * 
	 * @param edad Edad en a&ntilde;os
	 */
	private void setEdad(int edad) {
			this.edad = edad;
	}

	/**
	 * Devuelve el identificador &uacute;nico
	 * 
	 * @return Identificador
	 */
	private int getId() {
		return id;
	}

	/**
	 * Modifica el identificador &uacute;nico
	 * 
	 * @param id Identificador
	 */
	private void setId(int id) {
			this.id = id;
	}

	/**
	 * Muestra a la persona
	 */
	@Override
	public String toString() {
		return "id: " + id + "\nNombre y apellidos: " + nombre + " " + apellido1 + " " + apellido2 + 
				"\nFecha de nacimiento: " + fechaNacimiento + "\nEdad: " + edad + "\nCP: " + codigoPostal;	
	}
	
	/**
	 * Comprueba si existe una cadena al compararla con una expresi&oacute;n regular
	 * 
	 * @return true si coincide o false, sino
	 */
	private boolean expresionesRegulares(String patron, String cadena){		
		Pattern pattern = Pattern.compile(patron);
		Matcher matcher = pattern.matcher(cadena);
		
		while (matcher.find()){
			return true;
		}
		return false;
	}
	
	/**
	 * Calcula la edad actual de la persona
	 * 
	 * @return Edad actual
	 */
	public int calcularEdad(){
		Pattern pattern = Pattern.compile("[0-9]{4}$");
		Matcher matcher = pattern.matcher(fechaNacimiento);
		
		while (matcher.find()){
			return 2015-Integer.parseInt(matcher.group());
		}
		return 0;
	}
	
}
