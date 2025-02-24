joioETrigo  =  ["joio",  "trigo",  "trigo",  "joio",  "trigo", "joio",  "joio",  "joio",  "joio",  "trigo",  
                "trigo",  "joio", "joio", "joio", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo",  "trigo", 
                "trigo",  "trigo",  "trigo",  "trigo", "joio",  "joio",  "joio",  "joio",  "joio",  "joio",  
                "joio", "joio",  "trigo",  "trigo",  "joio",  "joio",  "joio",  "joio", "joio",  "joio",  "joio",  
                "joio",  "joio",  "joio",  "joio", "joio",  "joio",  "joio",  "joio",  "joio",  "trigo",  "trigo", 
                "trigo",  "trigo",  "trigo",  "trigo",  "trigo",  "trigo", "trigo",  "trigo",  "trigo",  "trigo",  
                "trigo",  "trigo", "trigo", "trigo", "trigo", "trigo", "joio", "joio", "joio", "joio",  "joio",  
                "joio",  "joio",  "joio",  "joio",  "joio", "trigo",  "trigo",  "trigo",  "trigo",  "trigo",  
                "trigo", "trigo", "trigo", "trigo", "joio", "joio", "joio", "joio", "joio",  "joio",  "trigo",  
                "joio",  "joio",  "joio",  "joio", "joio", "trigo", "trigo", "trigo", "trigo", "joio", "joio", 
                "joio",  "joio",  "joio",  "joio",  "joio",  "trigo",  "trigo", "trigo", "joio", "trigo", "joio", 
                "joio", "joio"]

joio = []
trigo = []

for palavra in joioETrigo:
    if palavra == "joio":
        joio.append(palavra)
    elif palavra == "trigo":
        trigo.append(palavra)

print("Lista de joio:", joio)
print("\nLista de trigo:", trigo)