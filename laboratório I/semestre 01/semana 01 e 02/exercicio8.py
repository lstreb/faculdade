print("Insira as notas obtidas nas avaliações.")

pratica = int(input("Nota da atividade prática: "))
teorica = int(input("Nota da atividade teórica: "))
laboratorio = int(input("Nota da prova em laboratório: "))
teste = int(input("Nota do teste teórico: "))
extraclasse = int(input("Nota do trabalho extraclasse: "))

grauA = (pratica * 0.45) + (teorica * 0.55)
grauB = (laboratorio * 0.6) + (teste * 0.2) + (extraclasse * 0.2)

nota_final = round(((grauA * 0.33) + (grauB *0.67)), 2)

print("\nNota grau A:", grauA)
print("Nota grau B:", grauB)
print("Nota final:", nota_final)