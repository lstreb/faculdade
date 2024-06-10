import java.util.Random;

public class Principal2 {
    public static void main(String[] args){
        Random random = new Random();
        Figura[] figuras = new Figura[4];

        //criando objetos aleatórios do tipo Circulo ou Retangulo
        for(int i = 0; i < figuras.length; i++){
            if(random.nextBoolean()){ //escolhe entre Circulo ou Retangulo
                double raio = random.nextDouble() * 10; //valor aleatório para o raio
                figuras[i] = new Circulo(random.nextDouble() * 10, random.nextDouble() * 10, raio);
            } 
            else{
                double base = random.nextDouble() * 10; //valor aleatório para a base
                double altura = random.nextDouble() * 10; //valor aleatório para a altura
                figuras[i] = new Retangulo(random.nextDouble() * 10, random.nextDouble() * 10, base, altura);
            }
        }

        //área de cada figura
        for(int i = 0; i < figuras.length; i++){
            if(figuras[i] instanceof Circulo){
                System.out.println("Círculo - Área: " + ((Circulo) figuras[i]).calculaArea());
            } 
            else if (figuras[i] instanceof Retangulo) {
                System.out.println("Retângulo - Área: " + ((Retangulo) figuras[i]).calculaArea());
            }
        }
    }
}
