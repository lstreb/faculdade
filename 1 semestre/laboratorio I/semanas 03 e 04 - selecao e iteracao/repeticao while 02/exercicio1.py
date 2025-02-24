conta = 0
numero = 0

while conta < 11:
    numero = int(input("Digite um número: "))

    if(numero < 0):
        print("Número negativo")
    elif(numero > 0):
        print("Número positivo")
    else:
        print("Zero")

    conta += 1