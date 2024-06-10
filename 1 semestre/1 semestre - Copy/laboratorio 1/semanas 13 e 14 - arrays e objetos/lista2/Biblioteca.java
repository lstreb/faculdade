import java.util.Arrays;
import java.util.Comparator;

public class Biblioteca {
    private Livro[] livros;

    public Biblioteca(int tamanho) {
        this.livros = new Livro[tamanho];
    }

    public Livro[] getLivros() {
        return livros;
    }

    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }

    public boolean insereLivro(Livro livro) {
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] == null) {
                livros[i] = livro;
                return true;
            }
        }
        return false;
    }

    public Livro procuraLivroPorTitulo(String titulo) {
        for (Livro livro : livros) {
            if (livro != null && livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }

    public double verificaDesconto(String titulo) {
        Livro livro = procuraLivroPorTitulo(titulo);
        if (livro instanceof Novo) {
            return ((Novo) livro).getValorDeDesconto();
        }
        return -1;
    }

    public void imprimeEdicoes() {
        for (Livro livro : livros) {
            if (livro instanceof Antigo) System.out.println(livro);
        }
    }

    public void imprimeLivroPorAno() {
        Arrays.sort(livros, new Comparator<Livro>() {
            @Override
            public int compare(Livro l1, Livro l2) {
                if (l1 == null && l2 == null) return 0;
                if (l1 == null) return 1;
                if (l2 == null) return -1;
                
                return Integer.compare(l2.getAnoDeCriacao(), l1.getAnoDeCriacao());
            }
        });
        for (Livro livro : livros) {
            if (livro != null) System.out.println(livro);
        }
    }

    public double calculaMediaPreco() {
        double soma = 0;
        int count = 0;
        for (Livro livro : livros) {
            if (livro != null) {
                soma += livro.getPreco();
                count++;
            }
        }
        return count == 0 ? 0 : soma / count;
    }

    public Livro livroComMaiorTitulo() {
        Livro livroMaiorTitulo = null;
        for (Livro livro : livros) {
            if (livro != null) {
                if (livroMaiorTitulo == null || livro.getTitulo().length() > livroMaiorTitulo.getTitulo().length()) {
                    livroMaiorTitulo = livro;
                }
            }
        }
        return livroMaiorTitulo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Livro livro : livros) {
            if (livro != null) sb.append(livro.toString()).append("\n");
        }
        return sb.toString();
    }
}
