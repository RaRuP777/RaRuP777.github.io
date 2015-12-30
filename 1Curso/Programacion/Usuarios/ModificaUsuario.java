package Objetos.usuarios;


/**
 * 3. Entrega la clase ModificaUsuario que compruebe el funcionamiento de la clase Usuario:

Crear� un objeto usu1 con las siguientes caracter�sticas:
(123) Rompetechos Apellidos1 Mikasa1
Utilizar� el constructor vac�o.
Como el usuario se ha mudado, cambiar� de direcci�n:
(123) Rompetechos Apellidos1 Num. 13 de la Rue del Percebe
Cada vez que se modifique el estado del objeto, se mostrar�n todos los atributos. Para ello sobreescribe el m�todo toString() en la clase Usuario
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
