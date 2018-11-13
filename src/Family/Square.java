package Family;

public class Square extends Rectangle {

    public Square(String color, double WideA) {
        super(WideA, WideA, color);

    }

    //Overloading methods
    public void setWideA(double wideA) {
        System.out.println("Set w kwadracie");
        this.wideA = wideA;
        this.wideB = wideA;
    }

    //Overloading methods
    public void setWideb(double wideB) {
        this.wideA = wideB;
        this.wideB = wideB;
    }


}
