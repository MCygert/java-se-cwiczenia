package Basic;

public class ArrayPointerTest {
    public static void main(String[] args) {

        double[] xCoordinates = {10, 20, 30, 51.5};
        int xSum = countSumOfElements(xCoordinates);
    }

    private static int countSumOfElements(double[] xCoordinates) {
        int sum = 0;
        for (int i = 0; i < xCoordinates.length; i++) {
            sum += xCoordinates[i];
        }
        xCoordinates[1] = -5000; //Blad nei zmieniaj wartosci w funkcjach!
        return sum;
    }
}
