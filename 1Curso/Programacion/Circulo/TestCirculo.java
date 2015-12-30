package Objetos;
import utiles.Teclado;

/**
 * Implementa las siguientes Clases:

    Punto:
        Campos: Las coordenadas enteras x e y
        Contructor: Con dos par�metros x e y
        M�todo: toString() 
    Circulo:
        Campos: El centro del circulo y su radio
        Contructor: Con dos par�metros: Punto y radio
        M�todo: toString() 
    TestCirculo:
        M�todo: main que cree tantos c�rculos como indique el usuario. Los datos ser�n introducidos tambi�n por el usuario. Una vez creados todos, se mostrar� el estado de cada uno de ellos. 
 * @author d14rarup
 * @version 1.0
 *
 */

public class TestCirculo {

	public static void main(String[] args) {
		//Circulo circulo = new Circulo (Teclado.leerEntero("Introduce el valor para el radio"),centro);
		int total=Teclado.leerEntero("�Cuantos circulos quieres crear?");
		Circulo [] vector = new Circulo [total];
		for (int i=0;i<total;i++){
			Punto centro = new Punto (Teclado.leerEntero("Dame el valor de x"),Teclado.leerEntero("Dame el valor de y"));
			try {
				vector [i] = new Circulo (Teclado.leerEntero("Introduce el valor para el radio"),centro);
			}catch (RadioInvalidoException e) {
				System.out.println(e.getMessage());
			}
		}
		for (int i=0;i<total;i++){
			System.out.println(vector [i]);
		}
	}
}
//Contesta a las siguientes preguntas:

//�Cu�ntos objetos se han creado? 
//Un Vector, y un numeros de objetos centro y circulo igual al numero deseado por el usuario; adem�s las candenas tambi�n son objetos

//�Has tenido que crear alguna clase adem�s de las indicadas? Si es as�, explica por qu�.
//La clase RadioInvalidoException para recoger las excepciones de errores que puedan ocurrir