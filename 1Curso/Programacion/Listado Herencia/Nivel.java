package ListadoHerencia1;

/**
 * @author Estela Mu&ntilde
 * @author Pedro J. Ramos
 *
 */
public enum Nivel {

	PRIMARIA, ESO, BACHILLERARO, UNIVERSIDAD;

	/**
	 * Para seleccionar un nivel
	 */
	public static Nivel pedirNivel(int opcion) {
		switch (opcion) {
		case 1:
			return Nivel.PRIMARIA;
		case 2:
			return Nivel.ESO;
		case 3:
			return Nivel.BACHILLERARO;
		case 4:
			return Nivel.UNIVERSIDAD;
		default:
			return null;

		}
	}
}
