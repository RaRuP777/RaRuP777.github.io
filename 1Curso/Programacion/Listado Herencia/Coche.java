package listadoHerencia;

/**
 * 1.Implementa la superclase Vehiculo y las subclases Coche y Camion.
 * B&aacute;sate para ello en la documentaci&oacute;n aportada en el 
 * documento de Jorge S&aacute;nchez
 * 
 * @author Estela Mu&ntilde;oz
 * @author Pedro J. Ramos
 * @version 1.0
 * 
 */

public class Coche extends Vehiculo{
	/**
	 * Ruedas que tiene un coche
	 */
	private int ruedas=4;
	
	/**
	 * Gasolina disponible
	 */
	private double gasolina;
	
	/**
	 * Constructor que crea el coche
	 * 
	 * @param v Velocidad
	 * @param g Gasolina
	 */
	public Coche(double v, double g){
		super(v); //Llama al constructor de la clase veh&iacute;culo
		gasolina=g;
	}
	
	/**
	 * Constructor vac&iacute;o
	 */
	public Coche(){
		
	}
	
	/**
	 * Constructor con el modelo
	 * 
	 * @param modelo Nombre del coche
	 */
	public Coche(String modelo){
		super.nombre=modelo;
	}
	
	/**
	 * Mueve el coche
	 * 
	 * @param kmh Kil&oacute;metros/hora
	 */
	public void acelerar(double kmh){
		super.acelerar(kmh);
		gasolina*=0.9;
	}
	
	/**
	 * Llenar la gasolina
	 * 
	 * @param litros Cantidad de gasolina
	 */
	public void repostar(int litros){
		gasolina+=litros;
	}
	
	/**
	 * Abre el cap&oacute; del coche
	 */
	private static void abrirCapo(){
		
	}
	
	/**
	 * Cambia la rueda del coche
	 */
	private static void cambiarRueda(){
		
	}
}
