public class Churro {
    private String sabor;
    private double preco;

    public Churro() {
        this.sabor = "Sabor padrão";
        this.preco = 0.0;
    }

    public Churro(String sabor) {
        this.sabor = sabor;
        this.preco = 0.0;
    }

    public Churro(String sabor, double preco) {
        this.sabor = sabor;
        this.preco = preco;
    }

    //getters
    public String getSabor() {
        return sabor;
    }

    public double getPreco() {
        return preco;
    }

    //setters
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    @Override
    public String toString() {
        return "Churro[sabor: " + sabor + ", preco: " + preco + "]";
    }
}
