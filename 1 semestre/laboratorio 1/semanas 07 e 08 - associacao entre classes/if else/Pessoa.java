public class Pessoa {
    private String nome, endereco, sexo;
    private int idade, quantidadeIrmãos;
    private double altura;
    
    public Pessoa(String nome, String sexo, String endereco, int idade, int quantidadeIrmãos, double altura) {
        this.nome = nome;
        this.sexo = sexo;
        this.endereco = endereco;
        this.idade = idade;
        this.quantidadeIrmãos = quantidadeIrmãos;
        this.altura = altura;
    }

    //getters
    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getIdade() {
        return idade;
    }

    public int getQuantidadeIrmãos() {
        return quantidadeIrmãos;
    }

    public double getAltura() {
        return altura;
    }

    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setQuantidadeIrmãos(int quantidadeIrmãos) {
        this.quantidadeIrmãos = quantidadeIrmãos;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    } 

    //metodos
    public String imprimeInformacoes(){
        return "Nome: " + nome + "\n" +
                "Idade: " + idade + "\n" +
                "Altura: " + altura + "\n"+
                "Sexo: " + sexo + "\n" +
                "Endereco: " + endereco + "\n" +
                "Quantidade de irmaos: " + quantidadeIrmãos + "\n";
    }

    public boolean isFilhoUnico(){
        if(quantidadeIrmãos > 0){
            return false;
        }
        return true;
    }
}
