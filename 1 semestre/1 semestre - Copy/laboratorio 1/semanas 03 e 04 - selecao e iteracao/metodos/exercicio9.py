class CalculaNotas:
    def calcula_conceito(self, nota1, nota2, nota3):
        notas = [nota1, nota2, nota3]
        
        for nota in notas:
            if nota < 0:
                return "ERRO"

        media = sum(notas) / len(notas)

        if 0.0 <= media <= 4.0:
            return "D"
        elif 4.0 < media <= 7.0:
            return "C"
        elif 7.0 < media <= 9.0:
            return "B"
        elif 9.0 < media <= 10.0:
            return "A"
        else:
            return "Nota inválida"

notas = CalculaNotas()
nota1 = float(input("Insira a primeira nota: "))
nota2 = float(input("Insira a segunda nota: "))
nota3 = float(input("Insira a terceira nota: "))
conceito = notas.calcula_conceito(nota1, nota2, nota3)

print("Conceito:", conceito)