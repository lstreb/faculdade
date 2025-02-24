public class BancaDeChurros {
    private Churro[] churros;

    // Construtor que recebe o array de churros preenchido
    public BancaDeChurros(Churro[] churros) {
        this.churros = churros;
    }

    // Construtor que recebe a quantidade máxima de churros
    public BancaDeChurros(int maxChurros) {
        this.churros = new Churro[maxChurros];
    }

    // Método que retorna a quantidade de churros de um determinado sabor
    public int estoqueChurros(String sabor) {
        int quantidade = 0;
        for (Churro churro : churros) {
            if (churro != null && churro.getSabor().equals(sabor)) {
                quantidade++;
            }
        }
        return quantidade;
    }

    // Método que insere um churro na primeira posição livre do array
    public boolean insereChurro(Churro churro) {
        for (int i = 0; i < churros.length; i++) {
            if (churros[i] == null) {
                churros[i] = churro;
                return true;
            }
        }
        return false;
    }

    // Método que retorna o valor total dos churros no array
    public double valorTotal() {
        double total = 0.0;
        for (Churro churro : churros) {
            if (churro != null) total += churro.getPreco();
        }
        return total;
    }

    // Método que vende um churro de um determinado sabor
    public boolean vendeChurros(String sabor) {
        for (int i = 0; i < churros.length; i++) {
            if (churros[i] != null && churros[i].getSabor().equals(sabor)) {
                System.out.println("Churro vendido por: R$ " + churros[i].getPreco());
                churros[i] = null;
                return true;
            }
        }
        System.out.println("Churro de sabor " + sabor + " não encontrado.");
        return false;
    }

    // Método que imprime as informações de todos os churros do array
    public void imprimeChurros() {
        for (Churro churro : churros) {
            if (churro != null) System.out.println(churro);
        }
    }

    // Método que lê os pedidos e tenta vender a quantidade de churros solicitada
    public void lePedidos(String nome, String sabor, int quantidade) {
        System.out.println("Cliente: " + nome + " deseja comprar " + quantidade + " churros de sabor " + sabor);
        for (int i = 0; i < quantidade; i++) {
            boolean sucesso = vendeChurros(sabor);
            if (sucesso) System.out.println("Venda realizada com sucesso!");
            else System.out.println("Falha na venda do churro de sabor " + sabor);  
        }
    }
}
