class Imprime:
    def imprimir_string(self, n, s):
        for _ in range(n):
            print(s)

impressor = Imprime()
n = int(input("Insira o número de vezes que deseja imprimir a string: "))
s = input("Insira a string que deseja imprimir: ")
impressor.imprimir_string(n, s)