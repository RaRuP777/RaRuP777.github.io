package listadoHerencia;

/**
 * 2.Crea la clase TestCastingVehiculo donde se demuestren 
 * las limitaciones de los castings entre clases
 * 
 * @author Estela Mu&ntilde;oz
 * @author Pedro J. Ramos
 * @version 1.0
 *
 */

public class TestCastingVehiculo {
	
	public static void main(String[] args) {
		Vehiculo vehiculo5=new Vehiculo();
		Coche cocheDePepe=new Coche("BMW");
		vehiculo5=cocheDePepe; //Esto sí se permite
		cocheDePepe=vehiculo5; //Tipos incompatibles. Un subtipo no puede igualarse a un supertipo. No se hereda de hijos a padres.
		cocheDePepe=(Coche)vehiculo5; //Ahora sí se permite. Convertimos el subtipo a supertipo. Se puede hacer Casting de padres a hijos(de más a menos)
		
		Vehiculo v1 = new Vehiculo();
		Coche c = new Coche();
		v1=c; // No hace falta el casting. Se puede igualar (heredar) de superclase a subclase, pero no al revés (se hereda de padres a hijos)
		v1.repostar(5); //¡¡¡Error!!! Repostar es de Coche no de Vehiculo. Es un método extendido de Coche (no se hereda de hijos a padres)
		
	}
}
