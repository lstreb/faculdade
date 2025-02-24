public class Prateleira {
    private Produto produto1, produto2, produto3;

    public Prateleira(Produto p1, Produto p2, Produto p3){
        this.produto1 = p1;
        this.produto2 = p2;
        this.produto3 = p3;
    }

    public Prateleira(){
        this.produto1 = null;
        this.produto2 = null;
        this.produto3 = null;
    }

    //getters
    public Produto getProduto1(){
        return produto1;
    }

    public Produto getProduto2(){
        return produto2;
    }

    public Produto getProduto3(){
        return produto3;
    }

    //setters
    public void setProduto1(Produto produto1){
        this.produto1 = produto1;
    }

    public void setProduto2(Produto produto2){
        this.produto2 = produto2;
    }

    public void setProduto3(Produto produto3){
        this.produto3 = produto3;
    }

    //metodos
    public Produto produtoMaisCaro(){
        Produto maisCaro = null;
        if (produto1 != null) maisCaro = produto1;

        if (produto2 != null && (maisCaro == null || produto2.getPreco() > maisCaro.getPreco()))
            maisCaro = produto2;

        if (produto3 != null && (maisCaro == null || produto3.getPreco() > maisCaro.getPreco())) 
            maisCaro = produto3;
        
        return maisCaro;
    }

    @Override
    public String toString() {
        return "\nINFORMACOES DOS PRODUTOS" + produto1 + produto2 + produto3;
    }
}
