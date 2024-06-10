class SomaNumeros:
    def soma(self, n):
        if n < 0:
            return -1
        else:
            return sum(range(n + 1))

valor = int(input("Insira um numero: "))
soma = SomaNumeros()

print(soma.soma(valor))