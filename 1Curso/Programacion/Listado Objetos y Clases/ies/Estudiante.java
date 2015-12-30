package ies;

/**
 * Crea la Clase Estudiante. Mételo en el paquete ies. Implementa al menos los siguientes métodos y 
 * atributos. 
 * a.nombre
 * b.apellido primero
 * c.apellido segundo
 * d.curso (sólo se admitirán los valores 1ESO, 2ESO, 3ESO, 4ESO, 1BACH, 2BACH,1DAW, 2DAW)
 * e.setCurso()
 * f.incCurso(), que hará la promoción del alumno dentro de la etapa, que es:
 * 		i.1ESO->2ESO->3ESO->4ESO
 * 		ii.1BACH->2BACH,
 * 		iii.1DAW->2DAW
 * 
 * @author d14rarup
 *
 */

public class Estudiante {

	String nombre;
	String primerApellido;
	String segundoApellido;
	Cursos curso;

	//Constructor
	Estudiante (String nombre, String primerApellido, String segundoApellido, Cursos curso){
		setNombre(nombre);
		setPrimerApellido(primerApellido);
		setSegundoApellido(segundoApellido);
		setCurso(curso);
	}
	
	//Constructor Vacio
	Estudiante(){
	}
	
	/**
	 * Devuelve el valor del atributo
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve el valor del atributo
	 * @return
	 */
	public String getPrimerApellido() {
		return primerApellido;
	}

	/**
	 * Modifica el valor del atributo
	 * @param nombre
	 */
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	/**
	 * Devuelve el valor del atributo
	 * @return
	 */
	public String getSegundoApellido() {
		return segundoApellido;
	}

	/**
	 * Modifica el valor del atributo
	 * @param nombre
	 */
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	/**
	 * Devuelve el valor del atributo
	 * @return
	 */
	public Cursos getCurso() {
		return curso;
	}

	/**
	 * Modifica el valor del atributo
	 * @param nombre
	 */
	public void setCurso(Cursos curso) {
		this.curso = curso;
	}

	/**
	 * Incrementa el valor curso
	 */
	public void incCurso(){
		switch (curso){
			case PRIMEROESO:
				setCurso(curso.SEGUNDOESO);
				break;
			case SEGUNDOESO:
				setCurso(curso.TERCEROESO);
				break;
			case TERCEROESO:
				setCurso(curso.CUARTOESO);
				break;
			case CUARTOESO:
				System.out.println("No Puedes promocionar estar en "+curso.getComentario());
				break;
			case PRIMEROBACH:
				setCurso(curso.SEGUNDOBACH);
				break;
			case SEGUNDOBACH:
				System.out.println("No Puedes promocionar estar en "+curso.getComentario());
				break;
			case PRIMERODAW:
				setCurso(curso.SEGUNDODAW);
				break;
			case SEGUNDODAW:
				System.out.println("No Puedes promocionar estar en "+curso.getComentario());
				break;
		}
	}
		
	/**
	 * Incrementa la etapa educacional
	 */
		public void incEtapa(){
			switch (curso){
				case PRIMEROESO:
					System.out.println("No Puedes promocionar estar en "+curso.getComentario());
					break;
				case SEGUNDOESO:
					System.out.println("No Puedes promocionar estar en "+curso.getComentario());
					break;
				case TERCEROESO:
					System.out.println("No Puedes promocionar estar en "+curso.getComentario());
					break;
				case CUARTOESO:
					setCurso(curso.PRIMEROBACH);
					break;
				case PRIMEROBACH:
					System.out.println("No Puedes promocionar estar en "+curso.getComentario());
					break;
				case SEGUNDOBACH:
					setCurso(curso.SEGUNDODAW);
					break;
				case PRIMERODAW:
					System.out.println("No Puedes promocionar estar en "+curso.getComentario());
					break;
				case SEGUNDODAW:
					System.out.println("No Puedes promocionar estar en "+curso.getComentario());
					break;
			}
	
	}
	@Override
	public String toString() {
		return "El estudiante: " + nombre + ", "
				+ primerApellido + " " + segundoApellido
				+ " y esta en el curso " + curso.getComentario();
	}
}
