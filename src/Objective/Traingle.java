package Objective;

import exeptions.InvalidHeightException;
import exeptions.InvalidSideException;
import exeptions.InvalidValueException;

//Inherittence first then interfaces and u can implement many interfaces after ","
public class Traingle extends Figure implements AreaCountable {
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

    //Constructor must have 'throws' to show exception, Using higher abstract exception to throw all exception from family
    public Traingle(double a, double b) throws InvalidValueException {
        super("Kolorowy");
        if (a <= 0) {
            throw new InvalidSideException();
        }
        if (b <= 0) {
            throw new InvalidHeightException();
        }
        this.a = a;
        this.b = b;
    }

    //Usage of implemented interface without this Override u cant make this class
    @Override
    public double countArea() {
        return 0;
    }
}
