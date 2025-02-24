public class Cliente {
    private String nome, sexo, email, senha;
    private int idade;

    //construtor
    public Cliente(String nome, int idade, String sexo, String email, String senha){
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
        this.setEmail(email);
        this.setSexo(sexo);
    }

    //getters
    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public String getSexo(){
        return sexo;
    }

    public String getEmail(){
        return email;
    }

    public String getSenha(){
        return senha;
    }

    //setters
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }

    //metodos
    public String imprimeInformacoes(){
        return "\n" + 
               "Nome: " + this.nome + "\n" +
               "Idade: " + this.idade + "\n" +
               "Sexo: " + this.sexo + "\n" +
               "Email: " + this.email + "\n" +
               "Senha: " + this.senha + "\n";
    }
}
