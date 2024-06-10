public class TesteExerciciosFor {
    public static void main(String [] args){
        ExerciciosFor testes = new ExerciciosFor();

        System.out.print("Exercicio 01\n");
        testes.exercicio1(2);

        System.out.print("\nExercicio 02\n");
        testes.exercicio2(10);

        System.out.print("\nExercicio 03\n");
        testes.exercicio3(10);

        System.out.print("\nExercicio 04 parte 01\n");
        testes.exercicio4(10);
        System.out.print("\nExercicio 04 parte 02\n");
        testes.exercicio4(-10);

        System.out.print("\nExercicio 05\n");
        testes.exercicio5(3);

        System.out.print("\nExercicio 06\n");
        System.out.print(testes.exercicio6(3));

        System.out.print("\nExercicio 07\n");
        testes.exercicio7();

        System.out.print("\nExercicio 08\n");
        testes.exercicio8();

        System.out.print("\nExercicio 09 parte 01\n");
        testes.exercicio9(1, 10);
        System.out.print("\nExercicio 09 parte 02\n");
        testes.exercicio9(10, 1);

        System.out.print("\nExercicio 10\n");
        System.out.print(testes.exercicio10());

        System.out.print("\nExercicio 11\n");
        System.out.print(testes.exercicio11(1, 5));

        System.out.print("\nExercicio 12\n");
        System.out.print(testes.exercicio12());

        System.out.print("\nExercicio 13\n");
        System.out.print(testes.exercicio13(5));

        System.out.print("\nExercicio 14 parte 01\n");
        System.out.print(testes.exercicio14(3));
        System.out.print("\nExercicio 14 parte 02\n");
        System.out.print(testes.exercicio14(4));

        System.out.print("\nExercicio 15\n");
        testes.exercicio15(10);
    }
}
