num1 = int(input("Digite o primeiro número: "))
num2 = int(input("Digite o segundo número: "))

if(num2 > num1):
    while num1 <= num2:
        print(num1)
        num1 += 1

elif(num1 > num2):
    while num2 <= num1:
        print(num2)
        num2 += 1

else:
    print("Os dois números são iguais! Inválido!")