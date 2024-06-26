public class Endereco {
    private String nomeDaRua, cidade, estado, pais, cep, numero, complemento;

    //construtor
    public Endereco(String nomeDaRua, String cidade, String estado, String pais, String cep, String numero, String complemento){
        this.nomeDaRua = nomeDaRua;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
    }

    //getters
    public String getNomeDaRua() {
        return nomeDaRua;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getPais() {
        return pais;
    }

    public String getCep() {
        return cep;
    }

    public String getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    //setters
    public void setNomeDaRua(String nomeDaRua) {
        this.nomeDaRua = nomeDaRua;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    //metodos
    @Override
    public String toString() {
        return "Endereco{" +
                "nomeDaRua: '" + nomeDaRua + '\'' +
                ", cidade: '" + cidade + '\'' +
                ", estado: '" + estado + '\'' +
                ", pais: '" + pais + '\'' +
                ", cep: " + cep + '\'' +
                ", numero: '" + numero + '\'' +
                ", complemento: '" + complemento + '\'' +
                '}';
    }
}
