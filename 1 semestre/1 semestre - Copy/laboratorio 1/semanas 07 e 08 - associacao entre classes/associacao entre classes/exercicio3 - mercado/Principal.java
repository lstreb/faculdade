import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço do amaciante: ");
        double precoAmaciante = Double.parseDouble(scanner.nextLine());
        while (precoAmaciante <= 0) {
            System.out.print("Preço inválido. Digite novamente o preço do amaciante: ");
            precoAmaciante = Double.parseDouble(scanner.nextLine());
        }
        Produto produto1 = new Produto("Amaciante", precoAmaciante, new Data(10, 4, 2014));

        System.out.print("Digite o preço do creme dental: ");
        double precoCremeDental = Double.parseDouble(scanner.nextLine());
        while (precoCremeDental <= 0) {
            System.out.print("Preço inválido. Digite novamente o preço do creme dental: ");
            precoCremeDental = Double.parseDouble(scanner.nextLine());
        }
        Produto produto2 = new Produto("Creme Dental", precoCremeDental, new Data(5, 5, 2015));

        System.out.print("Digite o preço do leite condensado: ");
        double precoLeiteCondensado = Double.parseDouble(scanner.nextLine());
        while (precoLeiteCondensado <= 0) {
            System.out.print("Preço inválido. Digite novamente o preço do leite condensado: ");
            precoLeiteCondensado = Double.parseDouble(scanner.nextLine());
        }
        Produto produto3 = new Produto("Leite Condensado", precoLeiteCondensado, new Data(4, 12, 2012));

        Prateleira prateleira1 = new Prateleira(produto1, produto2, produto3);

        //cria a segunda prateleira e adicionar um produto
        Prateleira prateleira2 = new Prateleira();
        Produto produto4 = new Produto("Cortina", 167.98, new Data(13, 10, 2025));
        prateleira2.setProduto1(produto4);

        //cria o mercado com as duas prateleiras
        Mercado mercado = new Mercado(prateleira1, prateleira2);

        //mostra produtos vencidos na data 25/04/2023
        Data dataAtual = new Data(25, 4, 2023);
        System.out.println("\nProdutos vencidos até " + dataAtual + ":");
        Produto[] produtos = {
            prateleira1.getProduto1(), prateleira1.getProduto2(), prateleira1.getProduto3(),
            prateleira2.getProduto1(), prateleira2.getProduto2(), prateleira2.getProduto3()
        };

        for (Produto produto : produtos) {
            if (produto != null && produto.verificaProdutoVencido(dataAtual)) {
                System.out.println(produto);
            }
        }

        //produto mais caro do mercado
        Produto produtoMaisCaro = prateleira1.produtoMaisCaro();
        System.out.println("Produto mais caro prateleira 1: " + produtoMaisCaro);

        produtoMaisCaro = prateleira2.produtoMaisCaro();
        System.out.println("Produto mais caro prateleira 2: " + produtoMaisCaro);

        //média de preço dos produtos do mercado
        System.out.println("Média de preço dos produtos do mercado: R$" + mercado.mediaValorProdutos());

        scanner.close();
    }

    public static void verificarProdutosVencidos(Prateleira prateleira, Data dataAtual) {
        Produto[] produtos = { prateleira.getProduto1(), prateleira.getProduto2(), prateleira.getProduto3() };
        for (Produto produto : produtos) {
            if (produto != null && produto.verificaProdutoVencido(dataAtual)) {
                System.out.println(produto);
            }
        }
    }
}
