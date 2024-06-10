class Imprime:
    def imprime_ate_x(self, x):
        for i in range(1, x + 1):
            print(i)

impressor = Imprime()
X = int(input("Insira um inteiro X: "))
impressor.imprime_ate_x(X)