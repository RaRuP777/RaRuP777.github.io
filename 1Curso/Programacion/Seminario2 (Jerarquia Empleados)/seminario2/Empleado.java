package seminario2;

import java.util.Date;

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

public class Empleado {
	
	/**
	 * A&ntilde;o de inicio en la empresa
	 */
	private static final int INICIO_EMPRESA = 1980;
	/**
	 * Nombre del empleado
	 */
	private String nombre;
	/**
	 * Salario del empleado
	 */
	private float salario;
	/**
	 * A&ntilde;o de alta del empleado
	 */
	private int anyoAlta;
	
	/**
	 * Constructor que crea a un empleado
	 * 
	 * @param nombre Nombre del empleado
	 * @param salario Salario del empleado
	 * @param anyoAlta A&ntilde;o de alta del empleado
	 */
	public Empleado(String nombre, float salario, int anyoAlta) {
		this.nombre = nombre;
		this.salario = salario;
		this.anyoAlta = anyoAlta;
	}
	
	/**
	 * Devuelve el nombre del empleado
	 * 
	 * @return Nombre del empleado
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Devuelve el salario del empleado
	 * 
	 * @return Salario del empleado
	 */
	public float getSalario() {
		return salario;
	}
	
	/**
	 * Devuelve el a&ntilde;o de alta del empleado
	 * 
	 * @return A&ntilde;o de alta
	 */
	public int getAnyoAlta() {
		return anyoAlta;
	}
	
	/**
	 * Modifica el a&ntilde;o de alta del empleado
	 * 
	 * @param anyoAlta A&ntilde;o de alta del empleado
	 */
	protected void setAnyoAlta(int anyoAlta) {
		int anyoActual = 1900 + new Date().getYear();
		if(anyoAlta >= INICIO_EMPRESA && anyoAlta <= anyoActual)
			this.anyoAlta = anyoAlta;
		else // Ante un error, se establece el año actual
			this.anyoAlta = anyoActual;
	}
	
	/**
	 * Incrementa el salario del empleado
	 * 
	 * @param subida Incremento de salario
	 */
	public void incSalario(float subida){
		salario += subida;
	}

	/**
	 * Muestra el empleado
	 */
	@Override
	public String toString() {
		// Pone el nombre de la clase y ahorramos poner el toString en los hijos
		return getClass().getName() + " [nombre=" + nombre + ", salario=" + salario
				+ ", anyoAlta=" + anyoAlta + "]";
	}
	
	/**
	 * Compara dos objetos (compara si son de tipo Empleado)
	 * 
	 * @return true si son iguales y false sino o si es nulo (o si no coinciden los campos)
	 */
	public boolean equals(Object obj){
		// 1. Si la referencia es nula, entonces no son iguales
		if (obj == null) return false;
		
		// 2. Si son el mismo objeto, entonces son iguales
		if (this == obj) return true;
		
		// 3. Si el tipo dinámico de las referencias es distinto, entonces no son iguales
		if (this.getClass() != obj.getClass()) return false;
		
		// Se hace un casting al tipo actual
		// El casting no falla, ya que el tipo dinámico es el mismo
		Empleado empleado = (Empleado) obj;
		
		return this.nombre.equals(empleado.nombre) &&
				this.salario == empleado.salario &&
				this.anyoAlta == empleado.anyoAlta;
	}
	
	/**
	 * Clona un empleado
	 * 
	 * @return Empleado clonado
	 */
	public Empleado clone () {
		// Si queremos hacer una copia superficial,
		// la mejor opción es usar la versión heredada
		Object obj = null;
		
		// Hay que atrapar la excepción, ya que la versión
		// heredada tiene declarada la excepción
		try{
			obj = super.clone();
		}catch(CloneNotSupportedException e){
			assert false: "El objeto no puede ser clonado";
		}
		return (Empleado) obj;
	}
}
