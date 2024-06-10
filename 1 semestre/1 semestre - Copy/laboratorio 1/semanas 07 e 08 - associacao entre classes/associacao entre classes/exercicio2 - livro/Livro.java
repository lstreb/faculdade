public class Livro {
    private String titulo, autor;
    private int anoPublicacao, quantidadePaginas;
    private double preco;

    //construtor padrão
    public Livro() {
        this.titulo = "";
        this.autor = "";
        this.anoPublicacao = 0;
        this.preco = 0.0;
        this.quantidadePaginas = 0;
    }

    //construtor com parâmetros
    public Livro(String titulo, String autor, int anoPublicacao, double preco, int quantidadePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.preco = preco;
        this.quantidadePaginas = quantidadePaginas;
    }

    //getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public int getQuantidadePaginas() {
        return quantidadePaginas;
    }

    public double getPreco() {
        return preco;
    }

    //setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public void setQuantidadePaginas(int quantidadePaginas) {
        this.quantidadePaginas = quantidadePaginas;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    //métodos
    public double calcularPrecoPorPagina() {
        return preco / quantidadePaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                ", preco=" + preco +
                ", quantidadePaginas=" + quantidadePaginas +
                '}';
    }
}
