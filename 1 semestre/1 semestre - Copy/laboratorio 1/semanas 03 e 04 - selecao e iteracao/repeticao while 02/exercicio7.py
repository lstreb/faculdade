user = 'USER10'
senha = 'PASSWORD1234'

input_user = ' '
input_senha = ' '

i = 0
while i == 0:
    input_user = input("Usuário: ")
    input_senha = input("Senha: ")

    if(input_user == user) and (input_senha == senha):
        print("LOGIN EFETUADO COM SUCESSO!")
        i = 1
    else:
        print("LOGIN OU SENHA INCORRETOS. TENTE NOVAMENTE.")