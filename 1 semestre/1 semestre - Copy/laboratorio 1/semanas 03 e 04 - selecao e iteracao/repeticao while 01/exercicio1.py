nomes = []
contador = 0
while contador < 13:
    nome = input("Digite o nome da pessoa {}: ".format(contador+1))
    nomes.append(nome)
    contador += 1

print("\nLista de nomes digitados:")
for nome in nomes:
    print(nome)
