texto = input("Insira um texto: ").lower()
contador = 0

for i in 'aeiouy':
    if i in texto:
        contador += texto.count(i)

print("Quantidade de vogais: ", contador)