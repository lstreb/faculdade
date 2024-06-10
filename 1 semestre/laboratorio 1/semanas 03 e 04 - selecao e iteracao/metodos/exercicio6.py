class Lista:
    def menor_string(self, lista):
        if not lista:
            return None
        
        menor = lista[0]

        for elemento in lista:
            if len(elemento) < len(menor):
                menor = elemento
        return menor

menor_elemento = Lista()
lista = input("Insira os elementos da lista de strings separados por espaço: ").split()
menor = menor_elemento.menor_string(lista)
print("Menor string:", menor)