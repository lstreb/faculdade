num1 = int(input("Digite o primeiro número: "))
num2 = int(input("Digite o segundo número: "))

if(num2 > num1):
    while num1 <= num2:
        print(num1)
        num1 += 1

elif(num1 > num2):
    print("O primeiro número é maior! Inválido!")

else:
    print("Os dois números são iguais! Inválido!")