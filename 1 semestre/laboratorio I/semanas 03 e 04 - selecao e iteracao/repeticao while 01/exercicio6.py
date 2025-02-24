numeros_digitados = ""
contador = 0

print("Digite 20 números com ponto flutuante:")

while contador < 20:
    numero = input("Digite o {}º número: ".format(contador+1))
    numeros_digitados += numero + " "
    contador += 1

print("\nNúmeros digitados:")
print(numeros_digitados)
