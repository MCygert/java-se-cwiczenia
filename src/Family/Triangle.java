package Family;


public class Triangle extends Figure {
    protected double a;
    protected double height;

    public Triangle(String color, double a, double height) {
        super(color);
        this.a = a;
        this.height = height;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double countArea() {
        return (a * height) / 2;
    }
}
