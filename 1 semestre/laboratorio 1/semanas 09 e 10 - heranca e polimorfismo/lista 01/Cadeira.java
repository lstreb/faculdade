public class Cadeira {
    private Cor cor;
    private Aluno aluno;

    public Cadeira(Cor cor) {
        this.cor = cor;
        this.aluno = null;
    }

    //getters
    public Cor getCor() {
        return cor;
    }

    public Aluno getAluno() {
        return aluno;
    }

    //setters
    public void setCor(Cor cor) {
        this.cor = cor;
    }
    
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    
    @Override
    public String toString() {
        return "\nCor: " + cor + "\n" + 
                "Ocupada por: " + aluno;
    }
}
