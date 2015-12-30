package Objetos;
import utiles.Teclado;
/**
 * Dise�a la clase Posicion que represente un punto (x,y) en el eje de coordenadas. Cada posici�n viene definida por dos valores enteros x e y. Constar� de los siguietes m�todos:

    Constructor por defecto. Se corresponde con la posici�n (0,0).
    Constructor al que se le pasa como argumento los valores inciales de las coordenadas x e y.
    Constructor de copia. Se le pasa como argumento un objeto de la misma clase. Se inicializan los campos del nuevo objeto con los mismos valores de los campos del objeto que se pasa como par�metro.
    M�todos para modificaci�n y consulta (set/get) de los atributos de la clase.
    M�todos para incrementar y decrementar los valores de cada una de las coordenadas de la posici�n (incX, incY, decX, decY).
    Un m�todo para establecer los valores de las coordenadas (setXY). 


Para su comprobaci�n, crea la clase TestPosici�n
 * @author d14rarup
 * @version 1.0
 *
 */
public class TestPosicion {

	public static void main(String[] args) {
		Posicion posicion=new Posicion(Teclado.leerEntero("Dame la coordenada x"), Teclado.leerEntero("Dame la coordenada y"));
		posicion.decrementoX();
		posicion.decrementoY();
		posicion.incrementoX();
		posicion.incrementoY();
		System.out.println(posicion.copiarObjeto());
		posicion.setXY(Teclado.leerEntero("Dame la coordenada x"), Teclado.leerEntero("Dame la coordenada y"));
		System.out.println(posicion);
	}

}
