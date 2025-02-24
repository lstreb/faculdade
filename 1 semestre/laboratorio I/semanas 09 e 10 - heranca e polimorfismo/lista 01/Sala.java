public class Sala {
    private Cadeira[] cadeiras;

    public Sala(Cadeira[] cadeiras) {
        this.cadeiras = cadeiras;
    }

    public Cadeira[] getCadeiras() {
        return cadeiras;
    }

    public void setCadeiras(Cadeira[] cadeiras) {
        this.cadeiras = cadeiras;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nCadeiras=[");
        for (Cadeira cadeira : cadeiras) {
            sb.append(cadeira.toString()).append(", ");
        }
        sb.append("]}");
        return sb.toString();
    }

    public int cadeirasComMesaDisponiveis() {
        int count = 0;
        for (Cadeira cadeira : cadeiras) {
            if (cadeira instanceof CadeiraComMesa && cadeira.getAluno() == null) {
                count++;
            }
        }
        return count;
    }

    public int cadeirasComRodinhasDisponiveis() {
        int count = 0;
        for (Cadeira cadeira : cadeiras) {
            if (cadeira instanceof CadeiraComRodinhas && cadeira.getAluno() == null) {
                count++;
            }
        }
        return count;
    }
    
    public Cadeira entraAluno(Aluno aluno, String tipoCadeira) {
        for (Cadeira cadeira : cadeiras) {
            if (tipoCadeira.equals("mesa") && cadeira instanceof CadeiraComMesa && cadeira.getAluno() == null) {
                cadeira.setAluno(aluno);
                return cadeira;
            } 
            else if (tipoCadeira.equals("rodinha") && cadeira instanceof CadeiraComRodinhas && cadeira.getAluno() == null) {
                cadeira.setAluno(aluno);
                return cadeira;
            }
        }
    
        for (Cadeira cadeira : cadeiras) {
            if (cadeira.getAluno() == null) {
                cadeira.setAluno(aluno);
                return cadeira;
            }
        }
        
        return null;
    }    
}
