soma = 0
numero = 0
i = 0

print("Digite números pares e positivos. Para obter a soma dos números pares digite um número ímpar ou negativo.")
while i == 0:
    numero = int(input("Número: "))
    if (numero % 2 == 0) and (numero >= 0):
            soma += numero
    else:
          print(soma)
          i = 1