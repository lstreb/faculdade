public class Exercicio1 {
    public int[][] exercicio1a() {
        int[][] matriz = new int[10][3];
        int valor = 1;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = valor;
                valor++;
            }
        }

        return matriz;
    }

    // public int[][] exercicio1b(

    // }

    // public int[][] exercicio1c() {

    // }

    // public int[][] exercicio1d() {

    // }
}
