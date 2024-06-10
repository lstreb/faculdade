package exercicio3;

public class Computador {
    private String marca;
    private int velocidade, anoFabricacao;
    private boolean ehNovo;
    
    public Computador(String marca, int velocidade, int anoFabricacao, boolean ehNovo) {
        this.marca = marca;
        this.velocidade = velocidade;
        this.anoFabricacao = anoFabricacao;
        this.ehNovo = ehNovo;
    }

    //getters
    public String getMarca() {
        return marca;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public boolean isEhNovo() {
        return ehNovo;
    }

    //setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public void setEhNovo(boolean ehNovo) {
        this.ehNovo = ehNovo;
    }  
}
