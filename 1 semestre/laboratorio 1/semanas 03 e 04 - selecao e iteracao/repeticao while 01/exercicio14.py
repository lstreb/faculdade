numero = int(input("Digite um número: "))

for i in range(2, int(numero ** 0.5) + 1):
    if numero % i == 0:
        print(numero, "Não é primo!")
        break
else:
    print(numero, "É primo!")
