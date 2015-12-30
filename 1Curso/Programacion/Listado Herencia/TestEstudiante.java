package ListadoHerencia1;

/**
 * Diseña, implementa y prueba las clases Persona, Estudiante y TestEstudiante.
 * Para ello, supongamos que: a.Una personatiene nombre, apellidos y nif. b.Un
 * estudiante está cursando un curso dentro de un nivel(PRIMARIA,
 * ESO,BACHILLERARO, UNIVERSIDAD) c.Implementa los métodos getters, setters y
 * toString d.En la clase TestEstudiante: i.Cree dos personas ii.Cree dos
 * estudiantes iii.Muestre los cuatro objetos iv.Asigne un estudiante a una
 * referencia de persona.¿Qué métodospueden usarse? v.Asigne una persona a un
 * estudiante.¿Qué métodos pueden usarse?
 * 
 * @author Estela Mu&nilde
 * @author Pedro J. Ramos
 *
 */

public class TestEstudiante {
	private static Menu menu = new Menu("Elige el nivel", new String[] {
			"Primaria", "ESO", "Bachillerato", "Universidad" });

	public static void main(String[] args) {
		
		Persona persona1 = new Persona("Pedro", "Ramos", "11111111A");
		Persona persona2 = new Persona("Estela", "Muñoz", "22222222B");
		Estudiante estudiante1 = new Estudiante ("Pedro", "Ramos", "11111111A",Nivel.pedirNivel(menu.gestionar()));
		Estudiante estudiante2 = new Estudiante ("Estela", "Muñoz", "2222222B", Nivel.pedirNivel(menu.gestionar()));
		System.out.println(persona1);
		System.out.println(persona2);
		System.out.println(estudiante1);
		System.out.println(estudiante2);
	}
}
