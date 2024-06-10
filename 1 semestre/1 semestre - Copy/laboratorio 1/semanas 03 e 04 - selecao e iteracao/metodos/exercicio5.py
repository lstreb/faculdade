class ImprimeLista:
    def imprimir_lista(self, lista):
        for elemento in lista:
            print(elemento)

imprime = ImprimeLista()
lista = input("Insira os elementos da lista separados por espaço: ").split()
imprime.imprimir_lista(lista)