import math

print("Esse programa acha as raízes de uma função se segundo grau.")
print("Considere: ax^2 + bx + c")
a = float(input("Insira o falor de 'a': "))
b = float(input("Insira o falor de 'b': "))
c = float(input("Insira o falor de 'c': "))

delta = (b**2) - (4*a*c)

x1 = (math.sqrt(delta) + b) / (2 * a)
x2 = (math.sqrt(delta) - b) / (2 * a)

print("\nx1 =", x1)
print("x2 =", x2)