package Objective;

public class Rectangle {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    double countArea() {
        return a * b;
    }

    double countPerimeter() {
        return (2 * a) + (2 * b);
    }
}
