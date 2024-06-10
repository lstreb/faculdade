class ContadorCaracteres: 
    def contar_caracteres(self, texto):
        contador = 0
        for caractere in texto:
            if caractere != ' ':
                contador += 1
        return contador

contador = ContadorCaracteres()
frase = input("Insira uma frase ou um texto: ")

print("Caracteres: ", contador.contar_caracteres(frase))