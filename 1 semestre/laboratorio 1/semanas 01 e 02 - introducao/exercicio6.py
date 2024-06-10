import math

print("Insira 5 números inteiros")

A = int(input("Primeiro número: "))
B = int(input("Segundo número: "))
C = int(input("Terceiro número: "))
D = int(input("Quarto número: "))
E = int(input("Quinto número: "))

area_triangulo = (B * C) / 2
perimetro_retangulo = A + B + C + D
area_circulo = math.pi * (E**2)

print("\nÁrea do triângulo:", area_triangulo)
print("Perímetro do retângulo:", perimetro_retangulo)
print("Área do círculo:", area_circulo)