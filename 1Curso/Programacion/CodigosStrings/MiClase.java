package codigosStrings;

public class MiClase {
	/**
	 * Valor del objeto
	 */
	private int valor=0;
	
	/**
	 * Constructor que crea el objeto
	 * 
	 * @param param Par&aacute;metro del objeto
	 */
	public MiClase(int param){
		this.valor=param;
	}
	
	/**
	 * Modifica el valor del atributo 
	 * 
	 * @param param Par&aacute;metro del objeto
	 */
	public void setValor(int param){
		this.valor=param;
	}
	
	/**
	 * Devuelve el valor del atributo
	 * 
	 * @return valor del atributo
	 */
	public int getValor(){
		return this.valor;
	}
	
	/**
	 * Muestra el atributo valor de tipo entero convertido a tipo String
	 */
	public String toString(){
		return Integer.toString(valor);
	}
}
