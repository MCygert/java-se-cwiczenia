package Objective;

public class Oop {

    public static void main(String[] args) {

        Diamond[] diamonds = new Diamond[10];

        for (int i = 0; i < 10; i++) {
            diamonds[i] = new Diamond(i, i, "REd");
        }
        //making object with constructor
        Diamond smallDiamond = new Diamond(10.0, 5.0, "REd");
        Diamond bigDiamond = new Diamond(15.0, 30.0, "REd");
        //U can change public paremeter

//        smallDiamond.f =15.0;

        System.out.println("Pole duzego rombu: " + bigDiamond.countArea());
        System.out.println("Pole malego rombu: " + smallDiamond.countArea());


        //Changing parameters with method
        Diamond newDiamond = new Diamond(10.0, 20.0, "REd");
        System.out.println("Pole = " + newDiamond.countArea());
        newDiamond.incrementE();
        System.out.println("Pole = " + newDiamond.countArea());


        //******************RECTANGLE**********************
        Rectangle smallRectangle = new Rectangle(10.0, 15.0);
        System.out.println("Area of Rectangle: " + smallRectangle.countArea());
        System.out.println("Permieter of Rectangle: " + smallRectangle.countPerimeter());
    }
}
