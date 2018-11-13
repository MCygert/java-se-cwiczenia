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

    //Overloading equals method
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        //Checking if obj is Square
        if (obj instanceof Square) {
            Square squareToCompare = (Square) obj;
            return (this.wideA == squareToCompare.wideA &&
                    this.wideB == squareToCompare.wideB);
        } else {
            return false;
        }
    }
}
