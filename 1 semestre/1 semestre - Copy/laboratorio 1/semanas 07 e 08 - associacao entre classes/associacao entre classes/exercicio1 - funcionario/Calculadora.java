public class Calculadora {
    private int memoria;
    private String cor;

    public Calculadora(String cor) {
        this.memoria = 0;
        this.cor = cor;
    }

    //getters
    public int getMemoria() {
        return memoria;
    }

    public String getCor() {
        return cor;
    }

    //setters
    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    //metodos
    public double soma(double val1, double val2){
        return val1 + val2;
    }

    public double subtrai(double val1, double val2){
        return val1 - val2;
    }

    public double multiplica(double val1, double val2){
        return val1 * val2;
    }

    public double divide(double val1, double val2){
        return val1 / val2;
    }

    public int elevaAoQuadrado(int val){
        return val * val;
    }

    public int elevaAoCubo(int val){
        return val * val * val;
    }

    public String imprimeInfo(){
        return "\n\nINFORMACOES DA CALCULADORA\n" +
               "Memoria: " + memoria + "\n" +
               "Cor: " + cor;
    }
}
