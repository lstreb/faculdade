public class Produto {
    private String nome;
    private Double preco;
    private Data dataValidade;
    
    public Produto(String nome, Double preco, Data dataValidade){
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    //getters
    public String getNome(){
        return nome;
    }

    public Double getPreco(){
        return preco;
    }

    public Data getDataValidade(){
        return dataValidade;
    }

    //setters
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPreco(Double preco){
        this.preco = preco;
    }

    public void setDataValidade(Data dataValidade){
        this.dataValidade = dataValidade;
    }

    //metodos
    public boolean verificaProdutoVencido(Data dataAtual){
        if (dataValidade.getAno() < dataAtual.getAno()) { 
            return true;
        }
        
        else if (dataValidade.getAno() == dataAtual.getAno()) {
            if (dataValidade.getMes() < dataAtual.getMes()){ 
                return true;
            }
 
            else if (dataValidade.getMes() == dataAtual.getMes()) {
                if (dataValidade.getDia() < dataAtual.getDia()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString(){
        return "\nNome: " + nome + "\n" +
               "Preço: " + preco + "\n" +
               "Data de validade: " + dataValidade + "\n";
    }
}
