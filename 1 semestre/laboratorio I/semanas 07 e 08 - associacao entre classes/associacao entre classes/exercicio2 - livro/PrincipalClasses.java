import java.util.Scanner;

public class PrincipalClasses {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Cliente[] clientes = new Cliente[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("\nInforme os dados do cliente " + (i + 1) + ":");

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Idade: ");
            int idade = Integer.parseInt(scanner.nextLine());

            System.out.print("Sexo: ");
            String sexo = scanner.nextLine();

            System.out.print("Email: ");
            String email = scanner.nextLine();

            System.out.print("Senha: ");
            String senha = scanner.nextLine();

            System.out.println("Informe os dados do livro do cliente " + (i + 1) + ":");

            System.out.print("Título: ");
            String titulo = scanner.nextLine();

            System.out.print("Autor: ");
            String autor = scanner.nextLine();

            System.out.print("Ano de publicação: ");
            int anoPublicacao = Integer.parseInt(scanner.nextLine());

            System.out.print("Preço: ");
            double preco = Double.parseDouble(scanner.nextLine());

            System.out.print("Quantidade de páginas: ");
            int quantidadePaginas = Integer.parseInt(scanner.nextLine());

            Livro livro = new Livro(titulo, autor, anoPublicacao, preco, quantidadePaginas);
            clientes[i] = new Cliente(nome, idade, sexo, email, senha, livro);
        }

        for (Cliente cliente : clientes) {
            Livro livro = cliente.getLivro();
            double precoPorPagina = livro.calcularPrecoPorPagina();
            System.out.print("\n");
            System.out.printf("O cliente %s está com o livro %s, e o preço por página deste livro é R$%.2f%n", cliente.getNome(), livro.getTitulo(), precoPorPagina);
        }

        for (Cliente cliente : clientes) {
            cliente.imprimeInformacoes();
        }

        scanner.close();
    }
}
