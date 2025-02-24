package exercicio2;

public class Aluno {
    private String nome, matricula;
    private float notaGrauA, notaGrauB;

    public Aluno(String nome, String matricula, float notaGrauA, float notaGrauB) {
        this.nome = nome;
        this.matricula = matricula;
        this.notaGrauA = notaGrauA;
        this.notaGrauB = notaGrauB;
    }

    //getters
    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public float getNotaGrauA() {
        return notaGrauA;
    }

    public float getNotaGrauB() {
        return notaGrauB;
    }

    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setNotaGrauA(float notaGrauA) {
        this.notaGrauA = notaGrauA;
    }

    public void setNotaGrauB(float notaGrauB) {
        this.notaGrauB = notaGrauB;
    }

    //metodos
    public double calculaMediaFinal(){
        return ((notaGrauA * 0.33) + (notaGrauB * 0.67));
    }

    public String imprimeInfo(){
        return "\nNome: " + nome + "\n" +
                "Matricula: " + matricula + "\n" +
                "Nota grau A: " + notaGrauA + "\n" +
                "Nota grau B: " + notaGrauB + "\n" +
                "Media final: " + calculaMediaFinal() + "\n";
    }
}
