import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Lista exercicios = new Lista();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Teste do Exercício 1");
        exercicios.exercicio1();
        
        System.out.println("\nTeste do Exercício 2");
        exercicios.exercicio2();
        
        System.out.println("\n\nTeste do Exercício 3");
        int[] array3 = {1, 2, 3, 4, 5};
        int soma = exercicios.exercicio3(array3);
        System.out.println("Somatório do array: " + soma);
        
        System.out.println("\nTeste do Exercício 4");
        String[] nomes = {"Joao", "Maria", "Jose"};
        System.out.print("Digite um nome para procurar: ");
        String nomeProcurado = scanner.nextLine();
        boolean encontrado = exercicios.procuraNome(nomes, nomeProcurado);
        if (!encontrado) System.out.println("Nome não localizado.");
        
        System.out.println("\nTeste do Exercício 5");
        int[] array5a = {1, 2, 3};
        int[] array5b = {4, 5, 6};
        int[] somaArrays = exercicios.exercicio5(array5a, array5b);
        if (somaArrays != null) {
            System.out.print("Soma dos arrays: ");
            for (int num : somaArrays) {
                System.out.print(num + " ");
            }
            System.out.println();
        } 
        else System.out.println("Os arrays não têm o mesmo tamanho.");
        
        System.out.println("\nTeste do Exercício 6");
        double[] array6 = {1.5, 2.5, 3.5, 4.5, 5.5};
        exercicios.exercicio6(array6);
        
        System.out.println("\nTeste do Exercício 7");
        exercicios.exercicio7();
    }
}
