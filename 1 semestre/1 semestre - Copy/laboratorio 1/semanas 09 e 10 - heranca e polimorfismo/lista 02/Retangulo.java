public class Retangulo extends Figura{
    private double base, altura;

    public Retangulo() {
        super();
        this.base = 0.0;
        this.altura = 0.0;
    }

    public Retangulo(double x, double y, double base, double altura) {
        super(x, y);
        this.base = base;
        this.altura = altura;
    }

    public Retangulo(double base, double altura) {
        super();
        this.base = base;
        this.altura = altura;
    }
    
    public double getBase(){
        return base;
    }

    public double getAltura(){
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //metodos
    public double calculaArea() {
        return base * altura;
    }

    @Override
    public String toString() {
        return "\nRetangulo{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", base=" + base +
                ", altura=" + altura +
                ", area=" + calculaArea() + '}';
    }
}
