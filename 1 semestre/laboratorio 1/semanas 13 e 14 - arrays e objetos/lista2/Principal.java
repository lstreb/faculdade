import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //criando uma biblioteca com capacidade de livros entre 1 e 200
        int capacidadeBiblioteca = (int)(Math.random() * 200 + 1);
        Biblioteca biblioteca = new Biblioteca(capacidadeBiblioteca);
        
        //sorteando um valor entre 1 e 300 e armazenando em quant
        int quant = (int)(Math.random() * 300 + 1);
        
        //tentando inserir quant livros na biblioteca
        for (int i = 0; i < quant; i++) {
            int tipoLivro = (int)(Math.random() * 2 + 1);
            Livro livro;
            String titulo = "Livro" + (i + 1);
            String autor = "Autor" + (i + 1);
            double preco = Math.random() * 100 + 1;
            int anoDeCriacao = (int)(Math.random() * 2024 + 1);

            if (tipoLivro == 1) {
                double valorDeDesconto = Math.random() * 20 + 1;
                livro = new Novo(titulo, autor, preco, anoDeCriacao, valorDeDesconto);
            } 
            else {
                int numeroDeEdicao = (int)(Math.random() * 10 + 1);
                livro = new Antigo(titulo, autor, preco, anoDeCriacao, numeroDeEdicao);
            }

            if (biblioteca.insereLivro(livro)) {
                System.out.println("Livro inserido com sucesso: " + livro);
            } 
            else {
                System.out.println("Falha ao inserir o livro: " + livro);
            }
        }

        Scanner scanner = new Scanner(System.in);
        
        //solicitando ao usuário um título de livro para procurar na biblioteca
        System.out.print("\nInforme o título do livro para procurar: ");
        String tituloProcurado = scanner.nextLine();
        Livro livroProcurado = biblioteca.procuraLivroPorTitulo(tituloProcurado);
        if (livroProcurado != null) {
            System.out.println("Livro encontrado: " + livroProcurado);
        } 
        else {
            System.out.println("Livro não encontrado.");
        }

        //solicitando ao usuário um título de livro para verificar o desconto
        System.out.print("\nInforme o título do livro para verificar o desconto: ");
        String tituloDesconto = scanner.nextLine();
        double desconto = biblioteca.verificaDesconto(tituloDesconto);
        if (desconto != -1) {
            System.out.println("Desconto do livro '" + tituloDesconto + "': R$" + desconto);
        } 
        else {
            System.out.println("Livro não encontrado ou não possui desconto.");
        }

        //imprimindo as edições dos livros do tipo Antigo da biblioteca
        System.out.println("\nEdições dos livros antigos:");
        biblioteca.imprimeEdicoes();

        //imprimindo as informações dos livros em ordem decrescente de ano de criação
        System.out.println("\nLivros em ordem decrescente de ano de criação:");
        biblioteca.imprimeLivroPorAno();

        //imprimindo a média dos preços dos livros presentes na biblioteca
        double mediaPreco = biblioteca.calculaMediaPreco();
        System.out.println("\nMédia de preços dos livros: R$" + mediaPreco);

        //imprimindo as informações do livro com o maior título na biblioteca
        Livro livroMaiorTitulo = biblioteca.livroComMaiorTitulo();
        System.out.println("\nLivro com maior título: " + (livroMaiorTitulo != null ? livroMaiorTitulo : "Nenhum livro disponível"));
        
        scanner.close();
    }
}
