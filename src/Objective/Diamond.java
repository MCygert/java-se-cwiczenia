package Objective;

public class Diamond extends Figure {
    //To jest pole
    //Private parameter in program programmer cant change this variable
    private double e;
    //Public this parameter programmer can change
    private double f;
    private double a;

    //Constructor encourages programmer to define thiis diamon before making it
    public Diamond(double e, double f) {
        this.e = e;
        this.f = f;
        this.color = "czerwony";
    }

    //Construcot overload u can do it aswell with methods
    public Diamond(double a) {
        this.a = a;
    }


    double countArea() {
        return e * f;
    }


    void incrementE() {
        e++;
    }
}
