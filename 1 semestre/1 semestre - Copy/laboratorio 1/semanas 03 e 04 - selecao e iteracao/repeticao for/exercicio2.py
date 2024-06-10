numero1 = int(input("Digite um número: ")) + 1
numero2 = int(input("Digite outro número: "))

for i in range(numero1, numero2) or range((numero2 + 1), (numero1 - 1)):
    print(i)