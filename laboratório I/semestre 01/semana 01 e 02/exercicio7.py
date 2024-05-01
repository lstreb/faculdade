print("Insira as notas que você tirou")
trabalho = int(input("Nota do trabalho: "))
prova = int(input("Nota da prova: "))
teste = int(input("Nota do teste: "))

nota = round(((trabalho * 0.1) + (prova * 0.6) + (teste * 0.3)), 2)

print("\nNota final:", nota)