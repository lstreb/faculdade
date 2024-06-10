import java.util.Scanner;

public class PrincipalWhile {
    public static void main(String [] args){
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        Exercicios testes = new Exercicios();

        int opcao;
        
        while(true){
            System.out.print("\n\n1- conta até 300 \n2- imprime pares \n3- verifica primo \n\n");
            System.out.print("Opcao escolhida: ");
            opcao = Integer.parseInt(scanner.nextLine());

            switch(opcao){
                case 1:
                    System.out.print("Insira o valor: ");
                    testes.contador(Integer.parseInt(scanner.nextLine()));
                    break;
                case 2:
                    System.out.print("Insira o valor: ");
                    testes.imprimePares(Integer.parseInt(scanner.nextLine()));
                    break;
                case 3:
                    System.out.print("Insira o valor: ");
                    System.out.print(testes.verificaPrimo(Integer.parseInt(scanner.nextLine())));
                    break;
                default:
                    System.out.print("Invalido!");
                    return;
            }
        }
    }
}
