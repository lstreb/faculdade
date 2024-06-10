public class Produto {
    private String nome;
    private double preco;
    private Data dataValidade;

    //construtor
    public Produto(String nome, double preco, Data dataValidade){
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    //getters
    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public Data getDataValidade() {
        return dataValidade;
    }

    //setters
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

    //metodos
    @Override
    public String toString() {
        return "Produto{" +
                "nome: '" + nome + '\'' +
                ", preco: " + preco +
                ", dataValidade: " + dataValidade +
                '}';
    }

    public boolean estaVencido(Data dataAtual) {
        if (this.dataValidade.getAno() < dataAtual.getAno()) {
            return true;
        } 
        else if (this.dataValidade.getAno() == dataAtual.getAno()) {
            if (this.dataValidade.getMes() < dataAtual.getMes()) {
                return true;
            } 
            else if (this.dataValidade.getMes() == dataAtual.getMes()) {
                return this.dataValidade.getDia() < dataAtual.getDia();
            }
        }
        return false;
    }
}
