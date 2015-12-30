package Objetos.usuarios;


/**
 * 3. Entrega la clase ModificaUsuario que compruebe el funcionamiento de la clase Usuario:

Creará un objeto usu1 con las siguientes características:
(123) Rompetechos Apellidos1 Mikasa1
Utilizará el constructor vacío.
Como el usuario se ha mudado, cambiará de dirección:
(123) Rompetechos Apellidos1 Num. 13 de la Rue del Percebe
Cada vez que se modifique el estado del objeto, se mostrarán todos los atributos. Para ello sobreescribe el método toString() en la clase Usuario
 * @author ESTELA
 *
 */

public class ModificaUsuario {

	public static void main(String[] args) throws cadenaErroneaException {
		Usuario usu1=new Usuario(123, "Rompetechos", "Apellidos1", "Mikasa1");
		try {
			usu1.setDireccion("Num. 13 de la Rue del Percebe");
		}catch (cadenaErroneaException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(usu1);
	}

}
