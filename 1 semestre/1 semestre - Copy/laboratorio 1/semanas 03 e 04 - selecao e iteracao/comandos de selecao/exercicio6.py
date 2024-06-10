print("Insira o valor do produto para calcular a taxa de juros!")
valor = float(input("Valor: "))

if(valor < 100):
    valor += valor/10
    print("Juros de 10%! Valor total =", valor)

elif(valor < 300):
    valor += valor/5
    print("Juros de 20%! Valor total =", valor)

elif(valor < 1000):
    valor += valor/2
    print("Juros de 50%! Valor total =", valor)

else:
    print("Valor inválido!")