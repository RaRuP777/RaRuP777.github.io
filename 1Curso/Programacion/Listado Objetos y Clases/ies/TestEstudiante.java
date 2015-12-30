package ies;
import Utiles.*;

/**
 * Implementa la clase Test Estudiante() para probar la clase Estudiante: Mediante un menú se podrá crear
 * un estudiante, borrarlo, mostrarlo y modificarlo. Tendrás al menos las clases: 
 * a.ies.Estudiante.java,
 * b.test.Estudiante.TestEstudiante.java
 * c.utiles.Menu.java. Deberás crear al menos un menú con las opciones "alta", "baja", "mostrar", 
 * "modificar" y salir, y otro con las opciones "promocionar" o "cambiar de etapa"
 * 
 * @author d14rarup
 *
 */

public class TestEstudiante {

	public static void main(String[] args){
		
		administrarEstudiante();
	}
	
	private static void administrarEstudiante(){
			Menu menu = new Menu("Bienvenido al Menu de Estudiante:", 
				new String[] {
				"Salir",
				"Dar de Alta un Estudiante", 
				"Dar de Baja un Estudiante",
				"Mostrar el Estudiante",
				"Modificar un Estudiante",
				});
		Menu menu2 = new Menu("Que dato quieres modificar:", 
				new String[] {
				"Salir",
				"Nombre", 
				"Primer Apellido",
				"Segundo Apellido",
				"Promocionar",
				"Cambiar de Etapa",
				});
		Estudiante estudiante = new Estudiante();
		int opcion;
		int opcion2;
		do {
			opcion = menu.gestionar();
			switch (opcion){
				case 1:
					estudiante = new Estudiante(Teclado.leerCadena("Introduce el Nombre"),
							Teclado.leerCadena("... el primer apellido"),
							Teclado.leerCadena("... el segundo apellido"),Cursos.PRIMEROESO);
					break;
				case 2:
					estudiante =null;
					break;
				case 3:
					System.out.println(estudiante);
					break;
				case 4:
					do {
						opcion2= menu2.gestionar();
						switch(opcion){
							case 1:
								estudiante.setNombre(Teclado.leerCadena("Introduce el Nombre"));
								break;
							case 2:
								estudiante.setPrimerApellido("Introduce el Primer Apellido");
								break;
							case 3:
								estudiante.setSegundoApellido("Introduce el Segundo Apellido");
								break;
							case 4:
								estudiante.incCurso();
								System.out.println(estudiante);
								break;
							case 5:
								estudiante.incEtapa();
								System.out.println(estudiante);
								break;
						}
					} while (!(opcion2==0));
					break;
			}
		}while (!(opcion==0));
	}
}