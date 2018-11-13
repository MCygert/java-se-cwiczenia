package Objective;

public class Diamond extends Figure {
    //To jest pole
    //Private parameter in program programmer cant change this variable
    private double e;
    //Public this parameter programmer can change
    private double f;
    private double a;

    //Constructor encourages programmer to define thiis diamon before making it
    public Diamond(double e, double f, String color) {
        //Odnosi sie do konstruktora o jeden wyzej poziom
        //
        super(color);
        this.e = e;
        this.f = f;
        // usage of inheritaded parameter
    }

    //Construcot overload u can do it aswell with methods
//    public Diamond(double a, String color) {
//        this(a / 10, 1 / 5, color);
//    }
//

    double countArea() {
        return e * f;
    }


    void incrementE() {
        e++;
    }
}
