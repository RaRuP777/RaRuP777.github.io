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

public class Administrativo extends Empleado {
	
	/**
	 * Porcentaje que se aplica al salario del administrativo
	 */
	private static final float FACTOR = 0.1f;
	/**
	 * Jefe para el que trabaja el administrativo
	 */
	private Jefe jefe;
	
	/**
	 * Constructor que crea un administrativo
	 * 
	 * @param nombre Nombre del administrativo
	 * @param salario Salario del administrativo
	 * @param anyoAlta A&ntilde;o de alta del administrativo
	 * @param jefe Jefe para el que trabaja el administrativo
	 */
	public Administrativo(String nombre, float salario, int anyoAlta, Jefe jefe) {
		// Inicializa los atributos del Padre
		super(nombre, salario, anyoAlta);

		// Inicializa los atributos propios
		this.jefe = jefe;
	}
	
	/**
	 * Devuelve el jefe para el que trabaja el administrativo
	 * 
	 * @return Jefe del administrativo
	 */
	public Jefe getJefe() {
		return jefe;
	}
	
	/**
	 * Modifica el jefe para el que trabaja el administrativo
	 * 
	 * @param jefe Jefe del administrativo
	 */
	public void setJefe(Jefe jefe) {
		this.jefe = jefe;
	}
	
	/**
	 * Devuelve el salario del administrativo. 
	 * 
	 * @return Salario del administrativo
	 */
	public float getSalario(){
		// Redefine el método getSalario del Padre. 
		// Se le suma un tanto por ciento de la bonificación de su jefe.
		return super.getSalario() + super.getSalario() * jefe.getBonificacion() * FACTOR;
	}
	
	/**
	 * Hace una copia de un administrativo
	 */
	public Administrativo clone(){
		Empleado empleado = super.clone();
		Administrativo admin = (Administrativo)empleado;
		
		//admin.jefe = (Jefe)this.jefe.clone();
		
		return admin;
	}
	
}
