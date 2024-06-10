public class Mercado {
    private Prateleira prateleira1;
    private Prateleira prateleira2;

    public Mercado(Prateleira prateleira1, Prateleira prateleira2) {
        this.prateleira1 = prateleira1;
        this.prateleira2 = prateleira2;
    }

    //getters
    public Prateleira getPrateleira1() {
        return prateleira1;
    }

    public Prateleira getPrateleira2() {
        return prateleira2;
    }

    //metodos
    public double mediaValorProdutos() {
        double somaPrecos = 0;
        int quantidadeProdutos = 0;

        Produto[] produtos = {
            prateleira1.getProduto1(), prateleira1.getProduto2(), prateleira1.getProduto3(),
            prateleira2.getProduto1(), prateleira2.getProduto2(), prateleira2.getProduto3()
        };

        for (Produto produto : produtos) {
            if (produto != null) {
                somaPrecos += produto.getPreco();
                quantidadeProdutos++;
            }
        }

        if (quantidadeProdutos == 0) return 0;
        else return somaPrecos / quantidadeProdutos;
    }
}
