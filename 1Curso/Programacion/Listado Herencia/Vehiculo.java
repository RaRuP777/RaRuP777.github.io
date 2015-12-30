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

public class Vehiculo {
	/**
	 * Cu&aacute;ntas ruedas tiene el coche
	 */
	private int ruedas;
	
	/**
	 * Velocidad que tiene el coche
	 */
	protected double velocidad=0;
	
	/**
	 * Nombre del coche
	 */
	protected String nombre;
	
	/**
	 * Constructor que crea el veh&iacute;culo
	 * 
	 * @param v Velocidad
	 */
	protected Vehiculo(double v){
		velocidad=v;
	}
	
	/**
	 * Constructor vac&iacute;o
	 */
	protected Vehiculo(){
		
	}
	
	/**
	 * Aumenta la velocidad
	 * 
	 * @param kmh Kil&oacute;metros/hora
	 */
	protected void acelerar(double kmh){
		velocidad += kmh;
	}
	
	/**
	 * M&eacute;metodo abstracto para acelerar
	 */
	//abstract public void acelera();
	
	
	/**
	 * Disminuye la velocidad
	 */
	protected void frenar(double kmh){
		velocidad -= kmh;
	}
	
	/**
	 * Para al veh&iacute;culo
	 */
	protected void parar(){
		velocidad = 0;
	}
	
	/**
	 * Devuelve la velocidad del coche
	 * 
	 * @return Velocidad
	 */
	protected double obtenerVelocidad(){
		return velocidad;
	}
	
}
