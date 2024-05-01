print("Esse programa irá mostrar o resultado do divisão de A por B.")

A = int(input("Insira o valor A: "))
B = int(input("Insira o valor B: "))

if(B == 0):
    print("Não é possível dividir por zero!")

else:
    divisao = A / B
    print("Resultado da divisão:", divisao)