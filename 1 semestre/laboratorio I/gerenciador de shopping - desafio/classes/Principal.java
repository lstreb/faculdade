import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Loja loja = null;
        Produto produto = null;
        Shopping shopping = null;

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Criar uma loja");
            System.out.println("2. Criar um produto");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            if (opcao == 1) {
                scanner.nextLine(); // Consumir nova linha

                System.out.print("Nome da loja: ");
                String nomeLoja = scanner.nextLine();

                System.out.print("Quantidade de funcionários: ");
                int quantidadeFuncionarios = scanner.nextInt();

                System.out.print("Dia da fundação: ");
                int diaFundacao = scanner.nextInt();

                System.out.print("Mês da fundação: ");
                int mesFundacao = scanner.nextInt();

                System.out.print("Ano da fundação: ");
                int anoFundacao = scanner.nextInt();

                Data dataFundacao = new Data(diaFundacao, mesFundacao, anoFundacao);

                scanner.nextLine(); // Consumir nova linha
                System.out.print("Rua: ");
                String rua = scanner.nextLine();

                System.out.print("Cidade: ");
                String cidade = scanner.nextLine();

                System.out.print("Estado: ");
                String estado = scanner.nextLine();

                System.out.print("Pais: ");
                String pais = scanner.nextLine();

                System.out.print("CEP: ");
                String cep = scanner.nextLine();

                System.out.print("Numero: ");
                String numero = scanner.nextLine();

                System.out.print("Complemento: ");
                String complemento = scanner.nextLine();

                Endereco endereco = new Endereco(rua, cidade, estado, pais, cep, numero, complemento);

                System.out.print("Quantidade máxima de produtos: ");
                int quantidadeMaximaProdutos = scanner.nextInt();

                System.out.println("Tipo de loja:");
                System.out.println("1. Cosmetico");
                System.out.println("2. Vestuario");
                System.out.println("3. Bijuteria");
                System.out.println("4. Alimentacao");
                System.out.println("5. Informatica");
                System.out.print("Escolha uma opção: ");
                int tipoLoja = scanner.nextInt();

                if (tipoLoja == 1) {
                    System.out.print("Taxa de comercialização: ");
                    double taxaComercializacao = scanner.nextDouble();

                    loja = new Cosmetico(nomeLoja, quantidadeFuncionarios, endereco, dataFundacao, quantidadeMaximaProdutos, taxaComercializacao);

                } else if (tipoLoja == 2) {
                    System.out.print("Produtos importados (true/false): ");
                    boolean produtosImportados = scanner.nextBoolean();

                    loja = new Vestuario(nomeLoja, quantidadeFuncionarios, endereco, dataFundacao, quantidadeMaximaProdutos, produtosImportados);

                } else if (tipoLoja == 3) {
                    System.out.print("Meta de vendas: ");
                    double metaVendas = scanner.nextDouble();

                    loja = new Bijuteria(nomeLoja, quantidadeFuncionarios, endereco, dataFundacao, quantidadeMaximaProdutos, metaVendas);

                } else if (tipoLoja == 4) {
                    System.out.print("Dia do alvará: ");
                    int diaAlvara = scanner.nextInt();

                    System.out.print("Mês do alvará: ");
                    int mesAlvara = scanner.nextInt();

                    System.out.print("Ano do alvará: ");
                    int anoAlvara = scanner.nextInt();

                    Data dataAlvara = new Data(diaAlvara, mesAlvara, anoAlvara);

                    loja = new Alimentacao(nomeLoja, quantidadeFuncionarios, endereco, dataFundacao, quantidadeMaximaProdutos, dataAlvara);

                } else if (tipoLoja == 5) {
                    System.out.print("Seguro de eletrônicos: ");
                    double seguroEletronicos = scanner.nextDouble();

                    loja = new Informatica(nomeLoja, quantidadeFuncionarios, endereco, dataFundacao, quantidadeMaximaProdutos, seguroEletronicos);
                }

                System.out.println("Loja criada com sucesso!");

            } else if (opcao == 2) {
                scanner.nextLine(); // Consumir nova linha
                System.out.print("Nome do produto: ");
                String nomeProduto = scanner.nextLine();

                System.out.print("Preço do produto: ");
                double precoProduto = scanner.nextDouble();

                System.out.print("Dia de validade: ");
                int diaValidade = scanner.nextInt();

                System.out.print("Mês de validade: ");
                int mesValidade = scanner.nextInt();

                System.out.print("Ano de validade: ");
                int anoValidade = scanner.nextInt();

                Data dataValidade = new Data(diaValidade, mesValidade, anoValidade);
                produto = new Produto(nomeProduto, precoProduto, dataValidade);

                System.out.println("Produto criado com sucesso!");

            } else if (opcao == 3) {
                System.out.println("Saindo...");
                break;

            } else {
                System.out.println("Opção inválida");
            }
        }

        if (loja != null && produto != null) {
            Data dataAtual = new Data(20, 10, 2023);

            if (produto.estaVencido(dataAtual)) {
                System.out.println("PRODUTO VENCIDO");
            } else {
                System.out.println("PRODUTO NÃO VENCIDO");
            }

            System.out.println(loja);
        }

        scanner.close();
    }
}
