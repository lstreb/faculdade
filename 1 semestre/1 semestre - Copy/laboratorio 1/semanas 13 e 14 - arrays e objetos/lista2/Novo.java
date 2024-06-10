public class Novo extends Livro {
    private double valorDeDesconto;

    public Novo(String titulo, String autor, double preco, int anoDeCriacao, double valorDeDesconto) {
        super(titulo, autor, preco, anoDeCriacao);
        this.valorDeDesconto = valorDeDesconto;
    }

    public double getValorDeDesconto() {
        return valorDeDesconto;
    }

    public void setValorDeDesconto(double valorDeDesconto) {
        this.valorDeDesconto = valorDeDesconto;
    }

    @Override
    public String toString() {
        double precoComDesconto = getPreco() - valorDeDesconto;
        return super.toString() + ", Preço com Desconto: R$" + String.format("%.2f", precoComDesconto) + ", Desconto: R$" + String.format("%.2f", valorDeDesconto);
    }
}
