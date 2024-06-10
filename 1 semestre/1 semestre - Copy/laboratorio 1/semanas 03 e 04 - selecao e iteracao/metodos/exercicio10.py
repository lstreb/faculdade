class EhPrimo:
    def eh_primo(self, numero):
        if numero <= 1:
            return False
        elif numero == 2:
            return True
        elif numero % 2 == 0:
            return False
        elif numero < 0:
            return False
        else:
            for i in range(3, int(numero ** 0.5) + 1, 2):
                if numero % i == 0:
                    return False
            return True

primo = EhPrimo()
numero = int(input("Insira um número inteiro: "))

retorno = primo.eh_primo(numero)
print(retorno)