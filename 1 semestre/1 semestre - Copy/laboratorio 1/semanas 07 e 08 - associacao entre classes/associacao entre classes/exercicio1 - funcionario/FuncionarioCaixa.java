public class FuncionarioCaixa {
    private String nome, endereco, sexo;
    private Calculadora calculadora;

    //inicializa com valores padrao
    public FuncionarioCaixa() {
        this.nome = "Laura";
        this.endereco = "Novo Hamburgo";
        this.sexo = "F";
        this.calculadora = new Calculadora("Branca");
    }

    //recebe parâmetros para inicializar todos os atributos
    public FuncionarioCaixa(String nome, String endereco, String sexo, Calculadora calculadora) {
        this.nome = nome;
        this.endereco = endereco;
        this.sexo = sexo;
        this.calculadora = calculadora;
    }

    //getters
    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getSexo() {
        return sexo;
    }

    public Calculadora getCalculadora() {
        return calculadora;
    }

    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setCalculadora(Calculadora calculadora) {
        this.calculadora = calculadora;
    }

    //metodos
    public double soma(double val1, double val2){
        return calculadora.soma(val1, val2);
    }

    public double subtrai(double val1, double val2){
        return calculadora.subtrai(val1, val2);
    }

    public double multiplica(double val1, double val2){
        return calculadora.multiplica(val1, val2);
    }

    public double divide(double val1, double val2){
        return calculadora.divide(val1, val2);
    }

    public int elevaAoQuadrado(int val){
        return calculadora.elevaAoQuadrado(val);
    }

    public int elevaAoCubo(int val){
        return calculadora.elevaAoCubo(val);
    }

    public String imprimeInfo(){
        return "\n\nINFORMACOES DO FUNCIONARIO\n" +
               "Nome: " + nome + "\n" +
               "Endereço: " + endereco + "\n" +
               "Sexo: " + sexo +
               calculadora.imprimeInfo();
    }
}
