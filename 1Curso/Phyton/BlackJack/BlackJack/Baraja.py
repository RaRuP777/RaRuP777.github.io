'''
Crea barajas para el juego de cartas

@author: Pedro J. Ramos
'''

""" Rellena una lista con los valores numericos de las cartas para el juego """
def valores():
    valores = []
    for i in range(12):
        if i < 9:
            valores.append(i + 1)
        else:
            valores.append(10)
    return valores

"""Crea una Tupla con los valores de los palos """
def palos(palo1, palo2, palo3, palo4):
    return (palo1, palo2, palo3, palo4)
