package utiles;

/**
 * Crea la clase Menu. M&eacute;telo en el paquete utiles. 
 * Implementa al menos los siguientes m&eacute;todos y atributos:
 * <ul>
 * 	<li>a. titulo</li>
 * 	<li>b. opciones</li>
 * 	<li>c. numOpciones</li>
 * 	<li>d. gestionar()</li>
 * 	<li>e. mostrar()</li>
 * 	<li>f. recogerOpcion()</li>
 * </ul>
 * 
 * @author Estela Mu&ntilde;oz
 * @version 1.0
 *
 */

public class Menu {
	
	/**
	 * Titulo del men&uacute;
	 */
	private String titulo;
	
	/**
	 * Opciones del men&uacute;
	 */
	private String[] opciones;
	
	/**
	 * Constructor que crea el objeto Menu
	 * 
	 * @param titulo del men&uacue;
	 * @param opciones del men&uacute;
	 * @param numOpciones Cantidad de opciones que tiene el men&uacute;
	 */
	public Menu(String titulo, String[] opciones){
		setTitulo(titulo);
		setOpciones(opciones);
	//	setNumOpciones(opciones.length);
	}
	
	/**
	 * Muestra el men&uacute; con su t&iacute;tulo tambi&eacute;n
	 * 
	 * @param opciones del men&uacute;
	 */
	private void mostrar(String[] opciones){
		System.out.println(titulo);
		
		for(int i=0;i<opciones.length;i++){
			System.out.println(i+". "+opciones[i]);
		}
	}
	
	/**
	 * Recoge la opci&oacute;n elegida del men&uacute; 
	 * 
	 * @return Opci&oacute;n escogida
	 */
	private int recogerOpcion(){
		int opcion;
		
		do{
			opcion=Teclado.leerEntero("Escoge una opcion:");
		}while(opcion<0 || opcion>opciones.length);
		
		return opcion;
	}
	
	/**
	 * Hace funcionar el men&uacute;. 
	 * Muestra el men&uacute; y recoge la opci&oacute;n escogida
	 * 
	 * @return Opci&oacute;n elegida
	 */
	public int gestionar(){
		mostrar(opciones);
		return recogerOpcion();		
	}

	/**
	 * Devuelve el t&iacute;tulo del men&uacute;
	 * 
	 * @return t&iacute;tulo del men&uacute;
	 */
	private String getTitulo() {
		return titulo;
	}

	/**
	 * Modifica el t&iacute;tulo del men&uacute;
	 * 
	 * @param titulo del men&uacute;
	 */
	private void setTitulo(String titulo) {
		this.titulo=titulo;
	}

	/**
	 * Devuelve las opciones que contiene el men&uacute;
	 * 
	 * @return Opciones del men&uacute;
	 */
	private String[] getOpciones() {
		return opciones;
	}

	/**
	 * Modifica las opciones que tiene el men&uacute;
	 * 
	 * @param opciones del men&uacute;
	 */
	private void setOpciones(String[] opciones) {
		this.opciones = opciones;
	}

}