numeros = [0, 0, 0]

numeros[0] = int(input("Primeiro número: "))
numeros[1] = int(input("Segundo número: "))
numeros[2] = int(input("Terceiro número: "))

for j in range(2):
    for i in range(2):
        if numeros[i] > numeros[i + 1]:
            numeros[i], numeros[i + 1] = numeros[i + 1], numeros[i]

print(numeros)