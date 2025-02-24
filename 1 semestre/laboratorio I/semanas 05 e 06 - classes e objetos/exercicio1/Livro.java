public class Livro {
    private String titulo, autor;
    private int anoPublicacao, numeroPaginas;
    private float preco;

    //construtor
    public Livro(String titulo, String autor, int anoPublicacao, float preco, int numeroPaginas){
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setAnoPublicacao(anoPublicacao);
        this.setPreco(preco);
        this.setNumeroPaginas(numeroPaginas);
    }

    //getters
    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public int getAnoPublicacao(){
        return anoPublicacao;
    }

    public float getPreco(){
        return preco;
    }

    public int getNumeroPaginas(){
        return numeroPaginas;
    }

    //setters
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public void setAnoPublicacao(int anoPublicacao){
        this.anoPublicacao = anoPublicacao;
    }

    public void setPreco(float preco){
        this.preco = preco;
    }

    public void setNumeroPaginas(int numeroPaginas){
        this.numeroPaginas = numeroPaginas;
    }

    //metodos
    private float calcularPrecoPorPagina(){
        return (preco / numeroPaginas);
    }

    @Override
    public String toString(){
        return  "\n" + 
                "Titulo: " + this.titulo + "\n" +
                "Autor: " + this.autor + "\n" +
                "Ano de publicação: " + this.anoPublicacao + "\n" +
                "Preço: " + this.preco + "\n" +
                "Número de páginas: " + this.numeroPaginas + "\n" +
                "Preço por página: " + calcularPrecoPorPagina() + "\n";
    }
}
