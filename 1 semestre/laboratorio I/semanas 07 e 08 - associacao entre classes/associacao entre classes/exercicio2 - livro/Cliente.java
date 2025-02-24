public class Cliente {
    private String nome, sexo, email, senha;
    private int idade;
    private Livro livro;

    //construtor padrão
    public Cliente() {
        this.nome = "";
        this.idade = 0;
        this.sexo = "";
        this.email = "";
        this.senha = "";
        this.livro = new Livro();
    }

    //construtor com parâmetros exceto o livro
    public Cliente(String nome, int idade, String sexo, String email, String senha) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.email = email;
        this.senha = senha;
        this.livro = new Livro();
    }

    //construtor com todos os parâmetros
    public Cliente(String nome, int idade, String sexo, String email, String senha, Livro livro) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.email = email;
        this.senha = senha;
        this.livro = livro;
    }

    //getters
    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public int getIdade() {
        return idade;
    }

    public Livro getLivro() {
        return livro;
    }

    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }
    
    //métodos
    public void imprimeInformacoes() {
        System.out.println("\nNome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
        System.out.println("Email: " + email);
        System.out.println("Livro: " + livro.toString());
    }
}
