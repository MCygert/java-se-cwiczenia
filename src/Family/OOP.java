package Family;

public class OOP {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10.0, 15.0, "Blue");
        Square square = new Square("red", 10.0);
        //Using of inheritated metods
        System.out.println("Prostokat: " + rectangle.countArea());
        System.out.println("Kwadrat: " + square.countArea());
        //Showing overloaded setters
        square.setWideA(6);
        rectangle.setWideA(8);
    }
}
