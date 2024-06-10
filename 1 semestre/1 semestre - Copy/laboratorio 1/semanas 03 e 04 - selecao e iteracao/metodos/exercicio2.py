class MaiorValor:
    def maior_valor(self, val1, val2, val3):
        return max(val1, val2, val3)

val1 = int(input("Valor 1: "))
val2 = int(input("Valor 2: "))
val3 = int(input("Valor 3: "))
acha_maior = MaiorValor()

print("Maior numero: ", acha_maior.maior_valor(val1, val2, val3))