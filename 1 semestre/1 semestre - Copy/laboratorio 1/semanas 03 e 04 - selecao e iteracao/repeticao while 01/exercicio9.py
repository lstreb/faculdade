val1 = int(input("Digite o primeiro valor: "))
val2 = int(input("Digite o segundo valor: "))

menor = min(val1, val2)
maior = max(val1, val2)

if val1 >= 0 and val2 >= 0:
    print(f"Números pares entre {menor} e {maior}:")
    for num in range(menor, maior + 1):
        if num % 2 == 0:
            print(num)
else:
    print("Algum valor é negativo!") 