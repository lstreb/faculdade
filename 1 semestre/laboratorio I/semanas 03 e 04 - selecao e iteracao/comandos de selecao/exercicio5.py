preco = float(input("Insira o preço do produto: "))

if(preco <= 0):
    print("Preço inválido!")

elif(preco <= 30):
    print("Preço baixo!")

elif(preco <= 50):
    print("Preço médio!")

else:
    print("Preço alto!")