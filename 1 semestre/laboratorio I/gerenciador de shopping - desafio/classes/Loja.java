import java.util.Arrays;

public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;
    private Produto[] estoqueProdutos;
    private int quantidadeMaximaProdutos;

    //construtor que recebe todos os parâmetros
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int quantidadeMaximaProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.quantidadeMaximaProdutos = quantidadeMaximaProdutos;
        this.estoqueProdutos = new Produto[quantidadeMaximaProdutos];
    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int quantidadeMaximaProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;  //caso não informado
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.quantidadeMaximaProdutos = quantidadeMaximaProdutos;
        this.estoqueProdutos = new Produto[quantidadeMaximaProdutos];
    }

    //getters
    public String getNome(){
        return nome;
    }

    public int getQuantidadeFuncionarios(){
        return quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario(){
        return salarioBaseFuncionario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Data getDataFundacao() {
        return dataFundacao;
    }

    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }

    //setters
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios){
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public void setSalarioBaseFuncionario(float salarioBaseFuncionario){
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }

    //metodos
    @Override
    public String toString() {
        return "Loja{" +
                "nome: '" + nome + '\'' +
                ", quantidadeFuncionarios: " + quantidadeFuncionarios +
                ", salarioBaseFuncionario: " + salarioBaseFuncionario +
                ", endereco: " + endereco +
                ", dataFundacao: " + dataFundacao +
                ", estoqueProdutos: " + Arrays.toString(estoqueProdutos) +
                '}';
    }

    public double gastosComSalario(){
        if(salarioBaseFuncionario > -1){
            return quantidadeFuncionarios * salarioBaseFuncionario;
        }
        else return -1;
    }

    public char tamanhoDaLoja(){
        if(quantidadeFuncionarios < 10){
            return 'P';    
        }
        else if(quantidadeFuncionarios <= 30){
            return 'M';
        }
        else return 'G';
    }

    public void imprimeProdutos() {
        for (Produto produto : estoqueProdutos) {
            if (produto != null) {
                System.out.println(produto);
            }
        }
    }

    public boolean insereProduto(Produto produto) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] == null) {
                estoqueProdutos[i] = produto;
                return true;
            }
        }
        return false;
    }

    public boolean removeProduto(String nomeProduto) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equals(nomeProduto)) {
                estoqueProdutos[i] = null;
                return true;
            }
        }
        return false;
    }
}
