public class Exercicios {
    public void contador(int x){
        while(x <= 300){
            System.out.printf("%d\n", x);
            x++;
        }
    }

    public void imprimePares(int x){
        if(x < 0){
            System.out.print("Numero negativo!");
            return;
        }

        System.out.print("\nNumeros pares:");
        for(int i = 0; i <= x; i++){
            if((i % 2) == 0){
                System.out.printf("\n%d", i);
            }
        }
    }

    public boolean verificaPrimo(int x){
        if (x <= 1) return false;

        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) return false; 
        }

        return true;
    }
}
