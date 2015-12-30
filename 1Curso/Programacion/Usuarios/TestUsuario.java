package Objetos.usuarios;

import utiles.Teclado;

/**
 * Recuerda enviar los ficheros fuentes en sus paquetes. Utiliza los modificadores de visibilidad (private en la medida de lo posible para fomentar el encapsulamiento) y documenta correctamente (clases, atributos, constructores y métodos)

1. Define la clase Usuario que contenga:

Campos (almacenen los siguientes atributos del usuario):
dni
nombre
apellidos
dirección
Constructores
Uno sin argumentos
Otro con cuatro argumentos (uno por cada campo)
Métodos (por cada campo)
getCampo1
setCampo1
2. Entrega la clase TestUsuario que compruebe el funcionamiento de la clase Usuario:
Creará tres usuarios con las siguientes características:
(123) Nombre1 Apellidos1 Mikasa1
(456) Nombre4 Apellidos4 Mikasa4
(789) Nombre7 Apellidos7 Mikasa7
Los almacenará en un VECTOR (de usuarios, almacenará los tres usuarios)
Pedirá por teclado el dni de un usuario y mostrará el resto de los atributos del usuario. Lo hará tantas veces como el usuario quiera.

 * @author ESTELA
 *
 */

public class TestUsuario {

	public static void main(String[] args) {
		
		Usuario[] vector=new Usuario[3];
				
		for(int i=0;i<3;i++){
			try {
				vector[i]= new Usuario(Teclado.leerEntero("Dime tu DNI"), Teclado.leerCadena("Dime tu Nombre:"), Teclado.leerCadena("Dime tus Apellidos:"), Teclado.leerCadena("Dime tu Direccion:"));
			}catch (cadenaErroneaException e) {
				System.out.println(e.getMessage());
			}
		}
		mostrarVector(vector);
		
		Usuario usuarioVacio = new Usuario();
		System.out.println(usuarioVacio);
	}
/**
 * Muestra el contenido del vector
 * @param vector
 */
	private static void mostrarVector(Usuario[] vector) {
		for(int i=0;i<3;i++){
			System.out.println(vector[i]);
		}
	}
}
