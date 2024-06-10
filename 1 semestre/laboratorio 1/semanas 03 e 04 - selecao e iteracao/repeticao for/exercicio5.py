lista_de_compras = []
num_produtos = int(input("Quantos produtos você deseja adicionar à lista de compras? "))

for i in range(num_produtos):
    produto = input("Digite o nome do produto {}: ".format(i+1))
    lista_de_compras.append(produto)  

print("\nLista de compras:")
for produto in lista_de_compras:
    print(produto)
