package Objetos;
import utiles.Teclado;
/**
 * Diseña la clase Posicion que represente un punto (x,y) en el eje de coordenadas. Cada posición viene definida por dos valores enteros x e y. Constará de los siguietes métodos:

    Constructor por defecto. Se corresponde con la posición (0,0).
    Constructor al que se le pasa como argumento los valores inciales de las coordenadas x e y.
    Constructor de copia. Se le pasa como argumento un objeto de la misma clase. Se inicializan los campos del nuevo objeto con los mismos valores de los campos del objeto que se pasa como parámetro.
    Métodos para modificación y consulta (set/get) de los atributos de la clase.
    Métodos para incrementar y decrementar los valores de cada una de las coordenadas de la posición (incX, incY, decX, decY).
    Un método para establecer los valores de las coordenadas (setXY). 


Para su comprobación, crea la clase TestPosición
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
