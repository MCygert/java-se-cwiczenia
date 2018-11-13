package test;

import Family.Rectangle;
import Family.Square;

public class OOP {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10.0, 20.0, "red");
        Square square = new Square("Blue", 10.00);
        System.out.println("Prostak: " + rectangle.countArea());
        System.out.println("Kwadrat: " + square.countArea());
        Square bigSquare = new Square("Green", 20);


        //Using overrided equal method and checking if squares have same width
        if (square.equals(bigSquare)) {
            System.out.println("Same");
        } else {
            System.out.println("Not same");
        }


    }
}
