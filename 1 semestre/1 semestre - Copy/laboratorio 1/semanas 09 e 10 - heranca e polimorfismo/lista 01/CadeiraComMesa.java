public class CadeiraComMesa extends Cadeira {
    private double largura, profundidade;

    public CadeiraComMesa(Cor cor, double largura, double profundidade) {
        super(cor);
        this.largura = largura;
        this.profundidade = profundidade;
    }

    //getters
    public double getLargura() {
        return largura;
    }

    public double getProfundidade() {
        return profundidade;
    }

    //setters
    public void setLargura(double largura) {
        this.largura = largura;
    }

    public void setProfundidade(double profundidade) {
        this.profundidade = profundidade;
    }

    //metodo tostring
    @Override
    public String toString() {
        return "\nLargura: " + largura + "\n" +
                "Profundidade: " + profundidade +
                super.toString();
    }
}
