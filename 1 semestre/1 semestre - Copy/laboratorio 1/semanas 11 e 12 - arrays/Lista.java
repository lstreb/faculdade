import java.util.Scanner;

public class Lista {
    public void exercicio1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o número total de notas: ");
        int totalNotas = scanner.nextInt();
        double[] notas = new double[totalNotas];
        double soma = 0;

        for (int i = 0; i < totalNotas; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }

        double media = soma / totalNotas;
        System.out.println("A média aritmética das notas é: " + media);
    }

    public void exercicio2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a quantidade de nomes: ");
        int quantidadeNomes = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha
        String[] nomes = new String[quantidadeNomes];

        for (int i = 0; i < quantidadeNomes; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        System.out.print("Dados informados: ");
        for (int i = 0; i < quantidadeNomes; i++) {
            if (i == quantidadeNomes - 1) System.out.print(nomes[i] + ".");
            else System.out.print(nomes[i] + ", ");
        }
    }

    public int exercicio3(int[] array) {
        int soma = 0;
        for (int num : array) {
            soma += num;
        }
        return soma;
    }

    public boolean procuraNome(String[] array, String nome) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equalsIgnoreCase(nome)) {
                System.out.println("Nome localizado na posição " + i);
                return true;
            }
        }
        return false;
    }

    public int[] exercicio5(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return null;
        }
        int[] somaArray = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            somaArray[i] = array1[i] + array2[i];
        }
        return somaArray;
    }

    public void exercicio6(double[] array) {
        if (array.length == 0) return;

        double maior = array[0];
        double menor = array[0];
        double soma = 0;

        for (double num : array) {
            if (num > maior) maior = num;
            if (num < menor) menor = num;
            soma += num;
        }

        double media = soma / array.length;

        System.out.println("Maior valor do array: " + maior);
        System.out.println("Menor valor do array: " + menor);
        System.out.println("Média dos valores do array: " + media);
    }

    public void exercicio7() {
        int tamanho = (int) ((Math.random() * 100) + 1);
        int[] array = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            array[i] = (int) ((Math.random() * 1000) + 1);
        }

        System.out.println("Tamanho do array: " + tamanho);
        System.out.print("Elementos do array: ");
        for (int i = 0; i < tamanho; i++) {
            if (i == tamanho - 1) System.out.print(array[i]);
            else System.out.print(array[i] + " - "); 
        }
    }
}
