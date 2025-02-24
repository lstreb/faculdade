public class Livro {
    private String titulo, autor;
    private double preco;
    private int anoDeCriacao;

    public Livro(String titulo, String autor, double preco, int anoDeCriacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
        this.anoDeCriacao = anoDeCriacao;
    }

    //getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPreco() {
        return preco;
    }

    public int getAnoDeCriacao() {
        return anoDeCriacao;
    }

    //setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setAnoDeCriacao(int anoDeCriacao) {
        this.anoDeCriacao = anoDeCriacao;
    }

    //toString
    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Preço: R$" + String.format("%.2f", preco) + ", Ano de Criação: " + anoDeCriacao;
    }
}
