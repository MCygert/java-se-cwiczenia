package Objective;

import Family.Figure;
import Family.Square;
import Family.Rectangle;
import Family.Triangle;

public class PolymorphismTest {
    public static void main(String[] args) {
        Square myRect = new Square("red", 10.00);
        Rectangle mySqure = new Rectangle(10.10, 15.00, "black");
//        Diamond myDiamond = new Diamond(10.00, 20, "green");
        Triangle myTriangle = new Triangle("green", 10.00, 15.0);


        Figure[] figures = new Figure[3];
        figures[0] = myRect;
        figures[1] = mySqure;
//        figures[2] = myDiamond;
        figures[2] = myTriangle;

        double area = 0.0;
        for (Figure figure : figures) {
            area += figure.countArea();
        }
        System.out.println("Area of all fields: " + area);
    }
}
