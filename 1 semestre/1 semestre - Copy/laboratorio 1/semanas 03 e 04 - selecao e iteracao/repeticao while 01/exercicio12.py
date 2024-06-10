media = 0
contador = 0

while 1:
    numero = int(input("Digite um número: "))

    if numero < 0:
        media = media / contador
        break

    media += numero
    contador += 1

print(media)