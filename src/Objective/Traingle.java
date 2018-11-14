package Objective;

//Inherittence first then interfaces and u can implement many interfaces after ","
public class Traingle  extends Figure implements AreaCountable{
    private double a;
    private double b;


    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public Traingle(double a, double b) {
        super("Kolorowy");
        this.a = a;
        this.b = b;
    }
//Usage of implemented interface without this Override u cant make this class
    @Override
    public double countArea() {
        return 0;
    }
}
