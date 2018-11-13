package Family;

public class Rectangle extends Figure {
    protected double wideA;
    protected double wideB;


    public Rectangle(double wideA, double wideB, String color) {
        super(color);
        this.wideA = wideA;
        this.wideB = wideB;
    }

    public double getWideA() {
        return wideA;
    }

    public void setWideA(double wideA) {
        this.wideA = wideA;
    }

    public double getWideB() {
        return wideB;
    }

    public void setWideB(double wideB) {
        this.wideB = wideB;
    }

    public double countArea() {
        return wideB * wideA;
    }

    public double countPerimeter() {
        return wideB * 2 + wideA * 2;
    }
}
