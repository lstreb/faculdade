public class Informatica extends Loja {
    private double seguroEletronicos;

    //construtor
    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int quantidadeMaximaProdutos, double seguroEletronicos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeMaximaProdutos);
        this.seguroEletronicos = seguroEletronicos;
    }

    public Informatica(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int quantidadeMaximaProdutos, double seguroEletronicos) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, quantidadeMaximaProdutos);
        this.seguroEletronicos = seguroEletronicos;
    }

    //getters
    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }

    //setters
    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    //metodos
    @Override
    public String toString() {
        return super.toString() + ", seguroEletronicos: " + seguroEletronicos + '}';
    }
}
