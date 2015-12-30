'''
Recoge las principales funciones del juego de cartas

@author: Pedro
'''
""" Funcion para determinar aleatorios """
import random

""" Devuelve un valor aleatorio """
def cartaAleatoria(valores):
    return random.randrange(13) + 1

""" Devuelve el mensaje a mostar por pantalla dependiendo de la carta seleccionada """
def mensajeCarta(cartaAleatoria):
    if (cartaAleatoria == 1):
        return "As de"
    if (cartaAleatoria == 2):
        return "Dos de"
    if (cartaAleatoria == 3):
        return "Tres de"
    if (cartaAleatoria == 4):
        return "Cuatro de"
    if (cartaAleatoria == 5):
        return "Cinco de"
    if (cartaAleatoria == 6):
        return "Seis de"
    if (cartaAleatoria == 7):
        return "Siete de"
    if (cartaAleatoria == 8):
        return "Ocho de"
    if (cartaAleatoria == 9):
        return "Nueve de"
    if (cartaAleatoria == 10):
        return "Diez de"
    if (cartaAleatoria == 11):
        return "J de"
    if (cartaAleatoria == 12):
        return "Q de"
    if (cartaAleatoria == 13):
        return "K de"

""" Obtiene un palo aleatorio """
def paloAleatorio(palos):
    return random.choice(palos)

""" Saca una carta aleatoria de la baraja """
def sacarCarta(valores, palos, total):
    carta = cartaAleatoria(valores)
    palo = paloAleatorio(palos)
    print mensajeCarta(carta), palo
    if carta == 1 and total + 11 < 22:
        carta = 11
    if carta > 10:
        carta = 10
    return total + carta

""" Da la oportunidad de seguir pidiendo cartas al jugador """
def pedir():
    while 1:
        print "Desea otra carta? (s/n)"
        opcion = raw_input()
        if opcion == 's' or opcion == 'S':
            return 1
        if opcion == 'n' or opcion == 'N': 
            return 0
        print "Por favor pulse s o n"

""" Muestra los mensajes inciales de la partida """
def nueva(nombre):
        print "-----------------------------------------------"
        print "Bienvenido al Juego del Blackjack,", nombre
        print "Es su turno,", nombre
        print "Sus dos primeras cartas son: "
