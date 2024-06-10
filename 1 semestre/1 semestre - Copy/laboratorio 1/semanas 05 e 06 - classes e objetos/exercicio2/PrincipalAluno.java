package exercicio2;

import java.util.Scanner;

public class PrincipalAluno {
    public static void main(String [] args){
        Aluno[] alunos = new Aluno[3];
        alunos[0] = new Aluno("Brandamente Brasil", "1585258", 5, 9);
        alunos[1] = new Aluno("Radigunda Cercená ", "2254879 ", 8, 2);
        alunos[2] = new Aluno("Vitimado José Araújo", "0085994", 7, 1);

        for(int i = 0; i <=2; i++){
            System.out.print(alunos[i].imprimeInfo());
        }

        alunos[1].setNotaGrauA(9);
        System.out.printf("\nNova media final: %f", alunos[1].calculaMediaFinal());

        System.out.print(alunos[2].getMatricula());

        alunos[0].setMatricula("1585228");
        System.out.print("\nNova matricula: ");
        System.out.print(alunos[0].getMatricula());

        Scanner scanner = new Scanner(System.in);
        System.out.print("\n\nInsira a nota do grau B de Radigunda: ");
        alunos[1].setNotaGrauB(scanner.nextInt());
        scanner.close();
        System.out.print(alunos[1].getNotaGrauB());
    }
}
