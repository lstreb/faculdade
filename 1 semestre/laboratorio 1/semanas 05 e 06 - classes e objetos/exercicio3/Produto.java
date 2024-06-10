package exercicio3;

public class Produto {
    private float valor;
    private String descricao;
    private int quantEstoque;
    
    public Produto(float valor, String descricao, int quantEstoque) {
        this.valor = valor;
        this.descricao = descricao;
        this.quantEstoque = quantEstoque;
    }

    //getters
    public float getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQuantEstoque() {
        return quantEstoque;
    }

    //setters
    public void setValor(float valor) {
        this.valor = valor;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setQuantEstoque(int quantEstoque) {
        this.quantEstoque = quantEstoque;
    }
}
