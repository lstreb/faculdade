import math

numeros = [0, 0]

def pedeNumeros():
    numeros[0] = float(input("Insira o primeiro número: "))
    numeros[1] = float(input("Insira o segundo número: "))

print("Digite 1 para somar dois valores")
print("Digite 2 para subtrair dois valores")
print("Digite 3 para para multiplicar dois valores")
print("Digite 4 para dividir dois valores")
print("Digite 5 para realizar uma potência entre dois valores")
print("Digite 6 para realizar uma radiciação entre dois valores")
print("Digite qualquer outro número para sair")

opcao = int(input("\nOpção escolhida: "))

match opcao:
    case 1:
        pedeNumeros()
        soma = numeros[0] + numeros[1]
        print("Soma =", soma)

    case 2:
        pedeNumeros()
        subtracao = numeros[0] - numeros[1]
        print("Subtração =", subtracao)

    case 3:
        pedeNumeros()
        mult = numeros[0] * numeros[1]
        print("Multiplicação =", mult)

    case 4:
        pedeNumeros()
        divisao = numeros[0]/numeros[1]
        print("Divisão =", divisao)

    case 5:
        pedeNumeros()
        pot = numeros[0]**numeros[1]
        print("Potência =", pot)

    case 6:
        pedeNumeros()
        num2 = 1/numeros[1]
        rad = numeros[0]**(numeros[1])
        print("Radiciação =", rad)
    
    case other:
        print("Finalizando!")