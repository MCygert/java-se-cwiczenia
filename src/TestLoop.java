public class TestLoop {
    public static void main(String[] args) {
        int[] yCoordinates = {1, 2, 3, 4, 5};

        //for
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += yCoordinates[i];
        }

        //while
        sum = 0;
        int i = 0;
        while (i < 5) {
            sum += yCoordinates[i];
            i++;
        }

        //for-each
        sum = 0;
        for (int yCoordinate :
                yCoordinates) {
            sum += yCoordinate;
        }

        //do..while
        sum = 0;
        i = 0;
        do {
            sum += yCoordinates[i];
            i++;
        } while (i < 5);
    }
}
