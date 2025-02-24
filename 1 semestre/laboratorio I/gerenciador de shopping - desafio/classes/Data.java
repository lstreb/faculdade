public class Data {
    private int dia, mes, ano;

    //construtor
    public Data(int dia, int mes, int ano) {
        if (dataValida(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("Data inválida, definindo data padrão 1/1/2000.");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    //getters
    public int getDia(){
        return dia;
    }

    public int getMes(){
        return mes;
    }

    public int getAno(){
        return ano;
    }

    //setters
    public void setDia(int dia){
        if (dataValida(dia, this.mes, this.ano)) {
            this.dia = dia;
        } 
        else System.out.println("Dia inválido.");
    }

    public void setMes(int mes){
        if (dataValida(this.dia, mes, this.ano)) {
            this.mes = mes;
        } 
        else System.out.println("Mês inválido.");
    }

    public void setAno(int ano){
        if (dataValida(this.dia, this.mes, ano)) {
            this.ano = ano;
        } 
        else System.out.println("Ano inválido.");
    }

    //metodos
    @Override
    public String toString(){
        return dia + "/" + mes + "/" + ano;
    }

    private boolean dataValida(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12 || dia < 1) return false;
        
        int[] diasPorMes = {31, verificaAnoBissexto(ano) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return dia <= diasPorMes[mes - 1];
    }

    private boolean verificaAnoBissexto(int ano) {
        if (ano % 4 == 0) {
            if (ano % 100 == 0) {
                return ano % 400 == 0;
            } 
            else return true; 
        } 
        else return false;
    }

    public boolean verificaAnoBissexto() {
        return verificaAnoBissexto(this.ano);
    }
}
