package Casino;

import Utiles.Menu;
import Utiles.Teclado;

public class JuegoDado {

	private Dado dado = new Dado(Teclado.leerEntero("Cuantas caras tendrá tu dado?"), 1);
	private final Menu menu = new Menu("Elige una opcion: ",new String[]{ "Salir", "Jugar Partida" } );
	private Jugador jugador1 = new Jugador(Teclado.leerCadena("Introduce el nombre del jugador 1"));
	private Jugador jugador2 = new Jugador(Teclado.leerCadena("Introduce el nombre del jugador 2"));
		
	public JuegoDado(){
			this.dado=dado;
			this.jugador1=jugador1;
			this.jugador2=jugador2;
	}
	public void jugar(){
	int opcion;
		do {
			opcion = menu.gestionar();
			switch (opcion) {
			case 1:
				int cantidad = Teclado.leerEntero("¿Con cuantos dados jugaremos?");
				jugador1.setJugadas(jugador1.getJugadas() + 1);
				jugador2.setJugadas(jugador2.getJugadas() + 1);
				for (int i = 0; i < cantidad; i++) {
					dado.lanzar();
					jugador1.setPuntos(jugador1.getPuntos() + dado.getValores());
					System.out.println(jugador1.getNombre() + " ha sacado "
							+ dado.getValores());
					dado.lanzar();
					jugador2.setPuntos(jugador2.getPuntos() + dado.getValores());
					System.out.println(jugador2.getNombre() + " ha sacado "
							+ dado.getValores());
				}
				System.out.println("El jugador " + jugador1.getNombre()
						+ " tiene : " + jugador1.getPuntos() + "puntos");
				System.out.println("El jugador " + jugador2.getNombre()
						+ " tiene : " + jugador2.getPuntos() + "puntos");
				if (jugador1.getPuntos() == jugador2.getPuntos())
					System.out.println("Ambos jugadores han empatado");
				else if (jugador1.getPuntos() < jugador1.getPuntos()) {
					System.out.println("El ganador es el "
							+ jugador2.getNombre());
					jugador2.setGanadas(jugador2.getGanadas() + 1);
				} else {
					System.out.println("El ganador es el "
							+ jugador1.getNombre());
					jugador1.setGanadas(jugador1.getGanadas() + 1);
				}
			}
		} while (!(opcion == 0));
		System.out.println(jugador1);
		System.out.println(jugador2);
	}
}