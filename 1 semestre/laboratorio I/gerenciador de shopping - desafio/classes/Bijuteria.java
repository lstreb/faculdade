public class Bijuteria extends Loja {
    private double metaVendas;

    //construtor
    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int quantidadeMaximaProdutos, double metaVendas) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeMaximaProdutos);
        this.metaVendas = metaVendas;
    }

    public Bijuteria(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int quantidadeMaximaProdutos, double metaVendas) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, quantidadeMaximaProdutos);
        this.metaVendas = metaVendas;
    }

    //getters
    public double getMetaVendas() {
        return metaVendas;
    }

    //setters
    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }

    //metodos
    @Override
    public String toString() {
        return super.toString() + ", metaVendas: " + metaVendas + '}';
    }
}
