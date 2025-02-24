estado_civil = {
    "solteiras": [],
    "casadas": [],
    "divorciadas": [],
    "viúvas": []
}

for i in range(4):
    nome = input("Digite o nome da pessoa: ")
    estado = input("Digite o estado civil da pessoa (solteira/casada/divorciada/viúva): ").lower()

    if estado == "solteira" or estado == "solteiro":
        estado_civil["solteiras"].append(nome)

    elif estado == "casada" or estado == "casada":
        estado_civil["casadas"].append(nome)

    elif estado == "divorciada" or estado == "divorciado":
        estado_civil["divorciadas"].append(nome)

    elif estado == "viúva" or estado == "viúvo":
        estado_civil["viúvas"].append(nome)

    else:
        print("Estado civil inválido!")

print("\nLista de pessoas por estado civil:")

for estado, pessoas in estado_civil.items():
    print(estado.capitalize() + ":")
    for pessoa in pessoas:
        print("- " + pessoa)
