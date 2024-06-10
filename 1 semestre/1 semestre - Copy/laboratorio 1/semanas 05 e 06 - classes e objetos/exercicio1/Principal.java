import java.util.Scanner;

public class Principal {
    public static void main(String [] args){
        Livro[] livros = new Livro[3]; 
        Cliente[] clientes = new Cliente[3];

        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira as informações sobre 3 livros e 3 clientes. \n");
        
        for(int i = 0; i <= 2; i++){
            livros[i] = new Livro(null, null, i, i, i);
            clientes[i] = new Cliente(null, i, null, null, null);

            System.out.printf("INFORMAÇÕES CLIENTE %d", i+1);
            System.out.print("\nInsira o nome: ");
            clientes[i].setNome(scanner.nextLine());

            System.out.print("Insira a idade: ");
            clientes[i].setIdade(Integer.parseInt(scanner.nextLine()));

            System.out.print("Insira o sexo: ");
            clientes[i].setSexo(scanner.nextLine());

            System.out.print("Insira o email: ");
            clientes[i].setEmail(scanner.nextLine());

            System.out.print("Insira a senha: ");
            clientes[i].setSenha(scanner.nextLine());

            System.out.printf("\nINFORMAÇÕES LIVRO %d", i+1);
            System.out.print("\nInsira o titulo: ");
            livros[i].setTitulo(scanner.nextLine());

            System.out.print("Insira o nome do autor: ");
            livros[i].setAutor(scanner.nextLine());

            System.out.print("Insira o ano de publicação: ");
            livros[i].setAnoPublicacao(Integer.parseInt(scanner.nextLine()));

            System.out.print("Insira o preço: ");
            livros[i].setPreco(Float.parseFloat(scanner.nextLine()));

            System.out.print("Insira o número de páginas: ");
            livros[i].setNumeroPaginas(Integer.parseInt(scanner.nextLine()));
        }

        scanner.close();

        System.out.print("\n\nINFORMAÇÕES DOS LIVROS");
        for(int i = 0; i <= 2; i++){
            System.out.printf("\nInformações livro %d:", i);
            System.out.print(livros[i]);
        }
        
        System.out.print("\n\nINFORMAÇÕES DOS CLIENTES");
        for(int i = 0; i <= 2; i++){
            System.out.printf("\nInformações cliente %d:", i);
            System.out.print(clientes[i].imprimeInformacoes());
        }
    }
}
