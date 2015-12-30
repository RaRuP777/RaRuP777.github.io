/**
 * 
 */
package pgn.temaEstructuras.regex;

import java.util.regex.Pattern;

/**
 * @author María Lourdes Magarín Corvillo
 * 
 */
public enum RegEx {

	NAME_PATTERN(
			"(?i)"// inddiferente mayúsculas/minúsculas
					+ "^[a-záéíóú ,.'-]+$",// al menos un carácter
			"\tContener letras, guión alto, espacio, coma y punto. \nP.ej: Martin Luther King, Jr, "),

	MAC_ADDRESS_PATTERN(
			"(?i)"// inddiferente mayúsculas/minúsculas
					+ "^(([0-9a-f]{2}:){5}"// dos caracteres hexadecimales
											// seguidos de dos puntos
					+ "[0-9a-f]{2})$",// el último grupo sin separador al final
			"XX:XX:XX:XX:XX:XX (X=números hexadecimales, que contienen números y letras de a A a la F)"),

	MAC_ADDRESS_PATTERN2(
			"^[0-9a-fA-F]{2}:" + "[0-9a-fA-F]{2}:" + "[0-9a-fA-F]{2}:"
					+ "[0-9a-fA-F]{2}:" + "[0-9a-fA-F]{2}:" + "[0-9a-fA-F]{2}$",
			"XX:XX:XX:XX:XX:XX (X=números hexadecimales, que contienen números y letras de a A a la F)");

	private String regEx;
	private String detalle;
	private Pattern pattern;

	CopyOfRegEx(String regEx, String detalle) {
		this.setRegEx(regEx);
		this.setDetalle(detalle);
		this.pattern = Pattern.compile(regEx);
	}

	private void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public String getRegEx() {
		return regEx;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setRegEx(String regEx) {
		this.regEx = regEx;
	}

	public boolean validar(String string) {
		return pattern.matcher(string).matches();
	}
}