val1 = int(input("Digite o primeiro valor: "))
val2 = int(input("Digite o segundo valor: "))

menor = min(val1, val2)
maior = max(val1, val2)

soma_pares = 0
soma_impares = 0

if val1 >= 0 and val2 >= 0:
    for num in range(menor, maior + 1):
        if num % 2 == 0:
            soma_pares += num
        else:
            soma_impares += num

    print(f"Soma dos números pares entre entre {menor} e {maior}:", soma_pares)
    print(f"Soma dos números impares entre entre {menor} e {maior}:", soma_impares)

else:
    print("Algum valor é negativo!") 