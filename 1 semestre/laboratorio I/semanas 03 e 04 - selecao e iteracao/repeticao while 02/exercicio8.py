user = 'USER10'
senha = 'PASSWORD1234'

input_user = ' '
input_senha = ' '

i = 0
while i < 3:
    i += 1
    input_user = input("Usuário: ")
    input_senha = input("Senha: ")

    if(input_user == user) and (input_senha == senha):
        print("LOGIN EFETUADO COM SUCESSO!")
        break

    else:
        print("LOGIN OU SENHA INCORRETOS. TENTE NOVAMENTE.")

print("Número de tentativas excedido!")