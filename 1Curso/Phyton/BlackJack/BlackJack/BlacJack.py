'''
Programa para jugar contra la CPU varios jugadores al BlackJack

@author: Pedro J. Ramos
'''
   
""" Contiene las funciones para la creacion de una baraja """
import Baraja
""" Contiene las funciones para el desarrollo de la partida """
import Partida

class BlackJack:

    """Variable que recoge el nombre de los jugadores"""
    nombre = ""
    """Variable que recoge la puntucion del jugador que va ganando"""
    totalGanador = 0
    """Lista de jugadores que jugaran contra la banca"""
    jugadores = []
    """Valores de las diferentes cartas de la baraja"""        
    valores = Baraja.valores()
    """Palos de la bajara"""
    palos = Baraja.palos("Diamantes", "Treboles", "Rombos", "Corazones")
    """Cantidad de jugador que jugaran contra la banca"""
    cantidad=0
        
    #####     Desarrollo del juego para jugadores     #####
    
    while cantidad>6 or cantidad<1:
        print "Cuantos jugadores jugaran contra la banca? (introducir el numero)"
        cantidad = input()
    for i in range(cantidad):
        print "Introduce el nombre del jugador", i + 1
        nombre = raw_input()
        jugadores.append(nombre)
    for i in jugadores:
        total = 0
        opcion = 1
        Partida.nueva(i)
        total = Partida.sacarCarta(valores, palos, total)
        while (opcion == 1):
            total = Partida.sacarCarta(valores, palos, total)
            print "Su total de puntos es: ", total
            if total < 22:
                opcion = Partida.pedir()
                if totalGanador < total:
                    totalGanador = total
                    jugadorGanador = i
            else:
                print "Se ha pasado de 21, ha perdido", i
                opcion = 0
    
    #####     Desarrollo del juego para la banca     #####
    
    total = 0
    Partida.nueva("Banca")
    total = Partida.sacarCarta(valores, palos, total)
    while (total < 17):
        total = Partida.sacarCarta(valores, palos, total)
        print "El total de puntos de la banca es: ", total
        if total < 22:
            if totalGanador < total:
                totalGanador = total
                jugadorGanador = i
        else:
            print "La banca se ha pasado de 21"
            
    ###     Desenlance del juego     #####
    
    print "El ganador de este juego es", jugadorGanador, " con una cantiad de puntos de ", totalGanador, " puntos"
