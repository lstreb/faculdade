public class Figura {
    double x, y;

    public Figura() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public Figura(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "\nFigura{" +
                "x=" + x +
                ", y=" + y + '}';
    }
}
