public class Principal {
    public static void main(String[] args) {
        Exercicio1 exercicio1 = new Exercicio1();
        int[][] resultado = exercicio1.exercicio1a();

        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[i].length; j++) {
                System.out.print(resultado[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
