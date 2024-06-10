i = 0
contador = 0

while i < 11:
    time = input("Qual time: ").lower()
    if(time == 'grêmio'):
        contador += 1

    i += 1

print("Quantidade que torce pro grêmio:", contador)