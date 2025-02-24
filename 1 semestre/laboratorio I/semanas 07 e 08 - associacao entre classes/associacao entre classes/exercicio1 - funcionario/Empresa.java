public class Empresa {
    private String nome;
    private FuncionarioCaixa funcionario1, funcionario2;

    //recebe todos os parâmetros para inicializar os atributos
    public Empresa(String nome, FuncionarioCaixa funcionario1, FuncionarioCaixa funcionario2) {
        this.nome = nome;
        this.funcionario1 = funcionario1;
        this.funcionario2 = funcionario2;
    }

    //recebe apenas o nome da empresa, inicializando os funcionários em null
    public Empresa(String nome) {
        this.nome = nome;
        this.funcionario1 = null;
        this.funcionario2 = null;
    }

    //não recebe parâmetros, inicializando os funcionários em null e o nome com um valor padrão
    public Empresa() {
        this.nome = "Empresa padrão";
        this.funcionario1 = null;
        this.funcionario2 = null;
    }

    //getters
    public String getNome() {
        return nome;
    }

    public FuncionarioCaixa getFuncionario1() {
        return funcionario1;
    }

    public FuncionarioCaixa getFuncionario2() {
        return funcionario2;
    }

    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFuncionario1(FuncionarioCaixa funcionario1) {
        this.funcionario1 = funcionario1;
    }

    public void setFuncionario2(FuncionarioCaixa funcionario2) {
        this.funcionario2 = funcionario2;
    }
    
    //metodos
    public String imprimeInfo(){
        return "\n\nINFORMACOES DA EMPRESA\n" +
               "Nome: " + nome +
               funcionario1.imprimeInfo() +
               funcionario2.imprimeInfo();
    }
}
