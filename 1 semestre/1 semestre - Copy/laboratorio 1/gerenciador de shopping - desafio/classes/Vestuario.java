public class Vestuario extends Loja {
    private boolean produtosImportados;

    //construtor
    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int quantidadeMaximaProdutos, boolean produtosImportados) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeMaximaProdutos);
        this.produtosImportados = produtosImportados;
    }

    public Vestuario(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int quantidadeMaximaProdutos, boolean produtosImportados) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, quantidadeMaximaProdutos);
        this.produtosImportados = produtosImportados;
    }

    //getters
    public boolean getProdutosImportados() {
        return produtosImportados;
    }

    //setters
    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }

    //metodos
    @Override
    public String toString() {
        return super.toString() + ", produtosImportados: " + produtosImportados + '}';
    }
}
