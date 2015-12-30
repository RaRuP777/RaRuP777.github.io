package enumsemana;

public enum Semana {
	
	/**
	 * Constantes de la enumeraci&oacute;n y sus atributos
	 */
	LUNES("Primer d�a de la semana."),
	MARTES("Ni te cases ni te embarques."),
	MIERCOLES("Sin comentarios."),
	JUEVES("Siempre en medio"),
	VIERNES("�ltimo d�a de trabajo."),
	SABADO("Empieza el fin de semana"),
	DOMINGO("Ma�ana de nuevo a trabajar.");
	
	/**
	 * Cadena que almacena todos los elementos de la enumeraci&oacute;n
	 */
	private String comentario;
	
	//Constructor acceso de paquete o private.
	Semana(String comentario){
		this.comentario=comentario;
	}
	
	/**
	 * Devuelve el contenido de los atributos de las constantes de la enumeraci&oacute;n
	 * 
	 * @return enumaraci&oacute;n contenida en comentario
	 */
	public String getComentario(){
		return comentario;
	}
	
	
}
