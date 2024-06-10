num = 2
primos = []
soma = 0

while num <= 200:
    divisor = 2
    eh_primo = True

    while divisor * divisor <= num:
        if num % divisor == 0:
            eh_primo = False
            break
        divisor += 1

    if eh_primo:
        primos.append(num)
        soma += num
        
    num += 1

print("Números primos entre 0 e 200:", primos)
print("Soma dos números primos:", soma)
