public class Circulo extends Figura{
    private double raio;

    public Circulo() {
        super();
        this.raio = 0.0;
    }

    public Circulo(double x, double y, double raio) {
        super(x, y);
        this.raio = raio;
    }

    public Circulo(double raio) {
        super();
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    //mtodos
    public double calculaArea() {
        return 3.14 * raio * raio;
    }

    @Override
    public String toString() {
        return "\nCirculo{" +
                "x=" + super.getX() +
                ", y=" + super.getY() +
                ", raio=" + raio +
                ", area=" + calculaArea() + '}';
    }
}
