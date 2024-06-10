public class Antigo extends Livro {
    private int numeroDeEdicao;

    public Antigo(String titulo, String autor, double preco, int anoDeCriacao, int numeroDeEdicao) {
        super(titulo, autor, preco, anoDeCriacao);
        this.numeroDeEdicao = numeroDeEdicao;
    }

    public int getNumeroDeEdicao() {
        return numeroDeEdicao;
    }

    public void setNumeroDeEdicao(int numeroDeEdicao) {
        this.numeroDeEdicao = numeroDeEdicao;
    }

    @Override
    public String toString() {
        return super.toString() + ", Número de Edição: " + numeroDeEdicao;
    }
}
