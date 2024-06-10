import java.util.Arrays;
import java.util.Locale;
import java.text.Collator;

public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    //construtor
    public Shopping(String nome, Endereco endereco, int quantidadeMaximaLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantidadeMaximaLojas];
    }

    //getters
    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    //metodos
    @Override
    public String toString() {
        return "Shopping{" +
                "nome: '" + nome + '\'' +
                ", endereco: " + endereco +
                ", lojas: " + Arrays.toString(lojas) +
                '}';
    }

    public boolean insereLoja(Loja loja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = loja;
                return true;
            }
        }
        return false;
    }

    public boolean removeLoja(String nomeLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i].getNome().equals(nomeLoja)) {
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    public int quantidadeLojasPorTipo(String tipo) {
        int count = 0;
        Collator collator = Collator.getInstance(new Locale("pt", "BR"));
        
        for (Loja loja : lojas) {
            if (loja != null) {
                if (collator.compare(loja, tipo) == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public Informatica lojaSeguroMaisCaro() {
        Informatica lojaMaisCaro = null;
        for (Loja loja : lojas) {
            if (loja instanceof Informatica) {
                Informatica informatica = (Informatica) loja;
                if (lojaMaisCaro == null || informatica.getSeguroEletronicos() > lojaMaisCaro.getSeguroEletronicos()) {
                    lojaMaisCaro = informatica;
                }
            }
        }
        return lojaMaisCaro;
    }
}
