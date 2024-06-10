import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);;

        Cadeira[] cadeiras = new Cadeira[4];
        cadeiras[0] = new CadeiraComMesa(new Cor(255, 0, 0), 50.0, 30.0);
        cadeiras[1] = new CadeiraComMesa(new Cor(0, 255, 0), 60.0, 40.0);
        cadeiras[2] = new CadeiraComRodinhas(new Cor(0, 0, 255), new Data(1, 5, 2023));
        cadeiras[3] = new CadeiraComRodinhas(new Cor(255, 255, 0), new Data(15, 4, 2024));

        //cria sala
        Sala sala = new Sala(cadeiras);
        System.out.println(sala);

        //entrada de alunos
        for (int i = 0; i < 2; i++) {
            System.out.print("Digite o nome do aluno: ");
            String nomeAluno = scanner.nextLine();
            System.out.print("Digite a idade do aluno: ");
            int idadeAluno = Integer.parseInt(scanner.nextLine());
            System.out.print("Digite o tipo de cadeira desejada (mesa/rodinha): ");
            String tipoCadeira = scanner.nextLine();

            Aluno aluno = new Aluno(nomeAluno, idadeAluno);
            Cadeira cadeira = sala.entraAluno(aluno, tipoCadeira);

            if (cadeira != null) {
                System.out.println("Aluno " + nomeAluno + " entrou na " + cadeira);
            } else {
                System.out.println("Não havia lugar na sala para o aluno " + nomeAluno);
            }
        }

        //data da última manutenção de cada cadeira com rodinhas
        for (Cadeira cadeira : cadeiras) {
            if (cadeira instanceof CadeiraComRodinhas) {
                CadeiraComRodinhas cadeiraComRodinhas = (CadeiraComRodinhas) cadeira;
                System.out.println("Data da última manutenção: " + cadeiraComRodinhas.getDataManutencao());
            }
        }

        scanner.close();
    }
}
