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

public class Camion extends Vehiculo{
	
	/**
	 * Ruedas que tiene un cami&oacute;n
	 */
	private int ruedas=6;
	
	/**
	 * Gasolina disponible
	 */
	private double gasolina;
	
	/**
	 * Constructor que crea el cami&oacute;n
	 * 
	 * @param v Velocidad
	 * @param g Gasolina
	 */
	public Camion(double v, double g){
		super(v); //Llama al constructor de la clase veh&iacute;culo
		gasolina=g;
	}
	
	/**
	 * Constructor vac&iacute;o
	 */
	public Camion(){
		
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
