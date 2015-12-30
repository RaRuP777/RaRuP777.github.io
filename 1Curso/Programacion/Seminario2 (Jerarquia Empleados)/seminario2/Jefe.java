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

public class Jefe extends Empleado {
	/**
	 * Bonifiaci&oacute;n del salario del jefe
	 */
	private float bonificacion;
	
	/**
	 * Constructor que crea un jefe
	 * 
	 * @param nombre Nombre del jefe
	 * @param salario Salario del jefe
	 * @param anyoAlta A&ntilde;o de alta del jefe
	 * @param bonificacion Bonificaci&oacute;n de salario del jefe
	 */
	public Jefe(String nombre, float salario, int anyoAlta, float bonificacion) {
		// Inicializa los atributos del Padre
		super(nombre, salario, anyoAlta);
		
		// Inicializa los atributos propios
		this.bonificacion = bonificacion;
	}
	
	/**
	 * Modifica el a&ntilde;o de alta del jefe
	 * 
	 * @param anyoAlta A&ntilde;o de alta del jefe
	 */
	public void setAnyoAlta(int anyoAlta){
		// La redefinición sólo pretende el cambio de visibilidad
		// Por tanto, se reutiliza la versión heredada
		super.setAnyoAlta(anyoAlta);
	}
	
	/**
	 * Devuelve una descripci&oacute;n que contiene el nombre y el salario del jefe
	 * 
	 * @return Texto informativo con el nombre y salario del jefe
	 */
	public String getDescripcion(){
		return "Soy " + getNombre() + " y gano " + getSalario();
	}
	
	/**
	 * Devuelve el salario del jefe
	 * 
	 * @return Salario del jefe
	 */
	public float getSalario(){
		return super.getSalario() + super.getSalario()* bonificacion;
	}

	/**
	 * Devuelve la Bonificaci&oacute;n salarial del jefe
	 * 
	 * @return Bonificaci&oacute;n salarial del jefe
	 */
	public float getBonificacion() {
		return bonificacion;
	}

	/**
	 * Modifica la bonificaci&oacute;n salarial del jefe
	 * 
	 * @param bonificacion Bonificaci&oacute;n salarial del jefe
	 */
	public void setBonificacion(float bonificacion) {
		this.bonificacion = bonificacion;
	}

	/**
	 * Muestra el jefe
	 */
	@Override
	public String toString() {
		// Con super usamos la parte que se hereda del padre y le añadimos lo nuevo
		return super.toString() + " [bonificacion=" + bonificacion + "]";
	}
	
	/**
	 * Compara que dos objetos son iguales (de tipo Jefe)
	 */
	public boolean equals (Object obj){
		if(super.equals(obj) == false) return false;
		
		// El casting funciona, ya que la llamada a la versión del 
		// padre asegura que los tipos dinámicos son iguales
		Jefe jefe = (Jefe) obj;
		
		return this.bonificacion == jefe.bonificacion;
	}
	
}
