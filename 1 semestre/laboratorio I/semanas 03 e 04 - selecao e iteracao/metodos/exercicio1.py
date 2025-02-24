class EhDivisivel:
    def __init__(self, val1, val2):
        self.val1 = val1
        self.val2 = val2
    
    def eh_divisivel(self):
        if self.val2 != 0:
            return self.val1 % self.val2 == 0
        else:
            return False

val1 = int(input("Valor 1: "))
val2 = int(input("Valor 2: "))
teste_divisao = EhDivisivel(val1, val2)

print(teste_divisao.eh_divisivel())