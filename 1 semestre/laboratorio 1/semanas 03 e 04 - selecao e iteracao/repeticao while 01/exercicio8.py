numero = 0
i = 0

quant = int(input("Quanto números deseja inserir: "))

while i < quant:
    numero = int(input("\nInsira o número: "))

    if numero < 0:
        print("Número negativo!")
    elif numero == 0:
        print("É zero!")
    else:
        print("Número positivo!")
    
    i = i + 1