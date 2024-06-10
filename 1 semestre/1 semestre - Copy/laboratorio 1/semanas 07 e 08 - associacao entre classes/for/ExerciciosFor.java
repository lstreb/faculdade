import java.util.Scanner;

public class ExerciciosFor {
    public Scanner scanner = new Scanner(System.in);

    public String[] exercicio1(int x){
        String[] nomes = new String[x];

        for(int i = 0; i < x; i++){
            System.out.printf("Insira o nome da pessoa %d: ", i+1);
            nomes[i] = scanner.nextLine();
        }
        return nomes;
    }

    public void exercicio2(int x){
        for(int i = 0; i <= x; i++){
            System.out.print(i);
            System.out.print("\n");
        }
    }

    public void exercicio3(int x){
        if(x < 0){
            System.out.print("Erro! Numero negativo!");
            return;
        }

        for(int i = 0; i <= x; i++){
            if((x % 2) == 0){
                System.out.print(i);
                System.out.print("\n");
            }
        }
    }

    public void exercicio4(int x){
        if(x < 0){
            System.out.print("Erro! Numero negativo!");
            return;
        }

        for(int i = x; i >= 0; i--){
            System.out.print(i);
            System.out.print("\n");
        }
    }

    public void exercicio5(int x){
        String time;
        int contador = 0;

        for(int i = 0; i < x; i++){
            System.out.printf("Time do usuario %d: ", i+1);
            time = scanner.nextLine();

            if(time.equals("gremio")){
                contador++;
            }
        }
        System.out.printf("%d usuarios torcem para o gremio", contador);
    }

    public double exercicio6(int x){
        double soma = 0;
        double numero;

        System.out.print("Digite numeros com ponto flutuante\n");
        for(int i = 0; i < x; i++){
            System.out.printf("Insira o numero %d: ", i+1);
            numero = Double.parseDouble(scanner.nextLine());
            soma += numero;
        }
        return soma;
    }

    public void exercicio7(){
        int numero;
        int soma = 0;

        System.out.print("Insira 10 valores inteiros\n");
        for(int i = 0; i < 10; i++){
            System.out.printf("Valor %d: ", i+1);
            numero = Integer.parseInt(scanner.nextLine());
            soma += numero;
        }
        System.out.printf("\nSoma: %d", soma);
    }

    public void exercicio8(){
        System.out.print("Quantos números deseja inserir: ");
        int quant = Integer.parseInt(scanner.nextLine());

        int numero;

        for(int i = 0; i < quant; i++){
            System.out.printf("Numero %d: ", i+1);
            numero = Integer.parseInt(scanner.nextLine());

            if(numero < 0){
                System.out.print("\nNumero negativo");
            }
            else if (numero == 0) {
                System.out.print("\nO numero eh zero");
            }
            else System.out.print("\nO numero eh positivo");
        }
    }

    public void exercicio9(int val1, int val2){
        if(val1 < 0 || val2 < 0){
            System.out.print("\nNumero negativo");
            return;
        }

        int maior;
        int menor;

        if(val1 > val2){
            maior = val1;
            menor = val2;
        }
        else{
            maior = val2;
            menor = val1;
        }

        for(int i = menor; i <= maior; i++){
            if((i % 2) == 0){
                System.out.print(i);
                System.out.print("\n");
            }
        }
    }

    public int exercicio10(){
        int soma = 0;

        for(int i = 0; i < 199; i++){
            soma += i;
        }
        return soma;
    }

    public int exercicio11(int val1, int val2){
        int maior;
        int menor;
        int soma = 0;

        if(val1 > val2){
            maior = val1;
            menor = val2;
        }
        else{
            maior = val2;
            menor = val1;
        }

        for(int i = menor; i <= maior; i++){
            if((i % 2) != 0){
                soma += i;
            }
        }
        return soma;
    }

    public float exercicio12(){
        int soma = 0;
        int contador = 0;

        while(true){
            System.out.print("\nDigite um número positivo (ou um número negativo para terminar): ");
            int numero = scanner.nextInt();

            if (numero < 0) break;

            soma += numero;
            contador++;
        }

        if (contador == 0) return 0;
        
        return soma / contador;
    }

    public int exercicio13(int numero){
        int fatorial = 1;

        for(int i = 1; i <= numero; i++){
            fatorial *= i;
        }
        return fatorial;
    }

    public boolean exercicio14(int x){
        if (x < 2) return false;

        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) return false; 
        }

        return true; //nenhum divisor encontrado
    }

    public void exercicio15(int x){
        int soma = 0;

        for (int i = 2; i <= x; i++) {
            boolean primo = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    primo = false;
                    break;
                }
            }

            if(primo){
                System.out.print(i + " ");
                soma += i;
            }
        }
        System.out.println("\nSoma dos numeros primos: " + soma);
    }
}
