MAX_TENTATIVAS = 6

print("Defina sua senha (deve conter apenas dígitos e ter entre 5 e 10 caracteres):")

for _ in range(MAX_TENTATIVAS):
    senha = input("Digite a senha: ")

    if senha.isdigit() and 5 <= len(senha) <= 10:
        print("Senha definida com sucesso!")
        break
    else:
        print("Senha inválida! A senha deve conter apenas dígitos e ter entre 5 e 10 caracteres.")

else:
    print("Número máximo de tentativas. Tente novamente mais tarde.")
