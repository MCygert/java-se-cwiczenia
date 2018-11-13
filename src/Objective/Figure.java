package Objective;


//abstract class u cant make this object, only usage is inheritance
public abstract class Figure {
    //protected only accesable by Class and  inheritance
    protected String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
