package ies;


public enum Cursos {
	
	//Constructores de cada curso
	/**
	 * Primero de eso
	 */
	PRIMEROESO("1 ESO"),
	/**
	 * Segundo de eso
	 */
	SEGUNDOESO("2 ESO"),
	/**
	 * Tercero de eso
	 */
	TERCEROESO("3 ESO"),
	/**
	 * Cuarto de eso
	 */
	CUARTOESO("4 ESO"),
	/**
	 * Primero de bachillerato
	 */
	PRIMEROBACH("1 BACH"),
	/**
	 * Segundo de bachillerato
	 */
	SEGUNDOBACH("2 BACH"),
	/**
	 * Primero de daw
	 */
	PRIMERODAW("1 DAW"),
	/**
	 * Segundo de daw
	 */
	SEGUNDODAW("2 DAW");

	private String comentario;//Declaración de constructores
	
	private Cursos(String comentario){
		this.comentario = comentario;
	}
	
	public String toString() {
		return comentario;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
}

