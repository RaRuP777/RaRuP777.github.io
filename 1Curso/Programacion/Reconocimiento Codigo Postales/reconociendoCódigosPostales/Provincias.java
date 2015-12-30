package reconociendoC�digosPostales;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Crea un programa en Java que reconozca los c&oacute;digos postales. Para ello:
 *
 * Valida el c&oacute;digo postal mediante una expresi&oacute;n regular
 *      52001 (v&aacute;lido)
 *      14014 (v&aacute;lido)
 *      53001 (inv&aacute;lido)
 *      14000 (inv&aacute;lido)
 *  Extrae mediante grupos de expresiones regulares la provincia (dos primeros d&iacute;gitos)
 *  Muestra la provincia en cuesti&oacute;n y a la comunidad aut&oacute;noma a la que pertenece 
 *  (ha de reconocer al menos 10 provincias) Utiliza enumeraciones con al menos dos atributos y 
 *  un m&eacute;todo.
 * 
 * @author Pedro J. Ramos
 * @author Estela Mu&ntilde;oz
 * @version 1.0
 *
 */

public enum Provincias {
	/**
	 * Todas las Provincias de Espa&ntilde;a con su respectiva
	 *  Comunidad Aut&oacute;noma y su C&oacute;digo Postal.
	 */
	ALABA("Pais Vasco", "01", "�laba"), 
	ALBACETE("Albacete", "02", "�lbacete"), 
	ALICANTE("Comunidad Valenciana", "03", "Alicante"), 
	ALMERIA("Andaluc�a", "04", "Almeria"), 
	AVILA("Catilla y Le�n", "05", "�vila"), 
	BADAJOZ("Extremadura", "06", "Badajoz"), 
	BALEARES("Islas Baleares", "07", "Baleares"), 
	BARCELONA("Catalu�a", "08", "Barcelona"), 
	BURGOS("Castilla y Le�n", "09", "Burgos"), 
	CACERES("Extremadura", "10", "C�ceres"), 
	CADIZ("Andaluc�a", "11", "C�diz"), 
	CASTELL�N("Comunidad Valenciana", "12", "Castell�n"), 
	CIUDADREAL("Castilla La Mancha", "13", "Ciudad Real"), 
	CORDOBA("Andaluc�a", "14", "C�rdoba"), 
	CORU�A("Galicia", "15", "Coru�a"), 
	CUENCA("Castilla La Mancha", "16", "Cuenca"), 
	GIRONA("Catalu�a", "17", "Girona"), 
	GRANADA("Andaluc�a", "18", "Granada"), 
	GUADALAJARA("Castilla y Le�n", "19", "Guadalajara"), 
	GIPUZKOA("Pa�s Vasco", "20", "Gipuzkoa"), 
	HUELVA("Andaluc�a", "21", "Huelva"), 
	HUESCA("Arag�n", "22", "Huesca"), 
	JAEN("Andaluc�a", "23", "Ja�n"), 
	LEON("Castilla y Le�n", "24", "Le�n"), 
	LLEIDA("Catalu�a", "25", "Lleida"), 
	LARIOJA("La Rioja", "26", "La Rioja"), 
	LUGO("Galicia", "27", "Lugo"), 
	MADRID("Madrid", "28", "Madrid"), 
	MALAGA("Andaluc�a", "29", "M�laga"), 
	MURCIA("Murcia", "30", "Murcia"), 
	NAVARRA("Navarra", "31", "Navarra"), 
	OURENSE("Galicia", "32", "Ourense"),
	OVIEDO("Asturias", "33", "Oviedo"), 
	PALENCIA("Castilla y Le�n", "34", "Palencia"), 
	LASPALMAS("Islas Canarias", "35", "Las Palmas"), 
	PONTEVEDRA("Galicia", "36", "Pontevedra"), 
	SALAMANCA("Castilla y Le�n", "37", "Salamanca"), 
	SCTENERIFE("Islas Canarias", "38", "Santa Cruz de Tenerife"), 
	SANTANDER("Cantabria", "39", "Santander"), 
	SEGOVIA("Castilla y Le�n", "40", "Segovia"),
	SEVILLA("Andaluc�a", "41", "Sevilla"),
	SORIA("Castilla y Le�n", "42", "Soria"), 
	TARRAGONA("Catalu�a", "43", "Tarragona"), 
	TERUEL("Arag�n", "44", "Teruel"), 
	TOLEDO("Castilla La Mancha", "45", "Toledo"), 
	VALENCIA("Comunidad Valenciana", "46", "Valencia"), 
	VALLADOLIZ("Castilla y Le�n", "47", "Valladoliz"), 
	VIZKAIA("Pais Vasco", "48", "Vizkaia"), 
	ZAMORA("Castilla y Le�n", "49", "Zamora"), 
	ZARAGOZA("Arag�n", "50", "Zaragoza"), 
	CEUTA("Ceuta", "51", "Ceuta"), 
	MELILLA("Melilla", "52", "Melilla");

	/**
	 * Comunidad Aut&oacute;noma
	 */
	private String comunidadAutonoma;
	
	/**
	 * C&oacute;digo Postal
	 */
	private String codigoPostal;
	
	/**
	 * Provincia
	 */
	private String provincia;

	/**
	 * Constructor que crea la Provincia
	 * 
	 * @param comunidadAutonoma Comunidad Aut&oacute;noma a la que pertenece la Provincia
	 * @param codigoPostal C&oacute;digo Postal de la Provincia
	 * @param provincia Nombre de la Provincia
	 */
	Provincias(String comunidadAutonoma, String codigoPostal, String provincia) {
		this.comunidadAutonoma = comunidadAutonoma;
		this.codigoPostal = codigoPostal;
		this.provincia = provincia;
	}

	/**
	 * Devuelve la Comunidad Aut&oacute;noma
	 * 
	 * @return Comunidad Aut&oacute;noma
	 */
	public String getComunidadAutonoma() {
		return comunidadAutonoma;
	}
	
	/**
	 * Devuelve el C&oacute;digo Postal
	 * 
	 * @return C&oacute;digo Postal
	 */
	public String getCodigoPostal() {
		return codigoPostal;
	}
	
	/**
	 * Devuelve la provincia
	 *  
	 * @return Provincia
	 */
	public String getProvincia() {
		return provincia;
	}
	
	/**
     * Busca coincidencias con el texto introducido por teclado
     */
   public static void expresionesRegulares(String codigoPostal) {
            
        Pattern pattern = Pattern.compile("^((0[1-9])|([1-4][0-9])|(5[0-2]))");   
    	
        Matcher matches = pattern.matcher(codigoPostal);
    	
        boolean found = false;
		while (matches.find()){
			found = true;
			String codigoEncontrado=matches.group();
			System.out.println(provincia(codigoEncontrado));
		}
		if(!found){
			System.err.println("El C�digo Postal introducido no es v�lido");
		}
    }
    
   /**
    * Devuelve la provincia que coincide con el c&oacute;digo encontrado
    * 
    * @param codigoEncontrado C&oacute;digo encontrado
    * @return Provincia 
    */
   static String provincia (String codigoEncontrado){
	   for (Provincias provincia : values()) {
			if (codigoEncontrado.equals(provincia.getCodigoPostal()))
				return "El C�digo Postal pertenece a la provincia de "+provincia.getProvincia()+
						", perteneciente a la Comunidad Aut�noma de "+provincia.getComunidadAutonoma();
	   }
	   return null;
   }
}// enum