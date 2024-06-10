fatorial = 1
i = 1

numero = int(input("Insira o número para calcular o fatorial: "))

while i <= numero:
    fatorial = fatorial * i
    i += 1

print(fatorial)