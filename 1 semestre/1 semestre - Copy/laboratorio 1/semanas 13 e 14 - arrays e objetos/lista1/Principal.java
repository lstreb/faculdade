public class Principal {
    public static void main(String[] args) {
        // Criando alguns churros
        Churro churro1 = new Churro("Chocolate", 5.0);
        Churro churro2 = new Churro("Doce de Leite", 4.5);
        Churro churro3 = new Churro("Nutella", 6.0);
        Churro churro4 = new Churro("Morango", 4.0);
        Churro churro5 = new Churro("Chocolate", 5.0);

        // Criando uma banca de churros com espaço para 10 churros
        BancaDeChurros banca = new BancaDeChurros(10);

        // Inserindo churros na banca
        banca.insereChurro(churro1);
        banca.insereChurro(churro2);
        banca.insereChurro(churro3);
        banca.insereChurro(churro4);
        banca.insereChurro(churro5);

        // Imprimindo todos os churros na banca
        System.out.println("Churros na banca:");
        banca.imprimeChurros();

        // Verificando o estoque de churros de chocolate
        int estoqueChocolate = banca.estoqueChurros("Chocolate");
        System.out.println("Estoque de churros de Chocolate: " + estoqueChocolate);

        // Calculando o valor total dos churros na banca
        double valorTotal = banca.valorTotal();
        System.out.println("Valor total dos churros na banca: R$ " + valorTotal);

        // Vendendo churros de chocolate
        banca.vendeChurros("Chocolate");

        // Imprimindo todos os churros na banca após a venda
        System.out.println("Churros na banca após a venda:");
        banca.imprimeChurros();

        // Lendo pedidos
        banca.lePedidos("João", "Chocolate", 2);
    }
}
