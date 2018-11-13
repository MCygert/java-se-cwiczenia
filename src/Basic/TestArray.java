package Basic;

public class TestArray {
    public static void main(String[] args) {
        //Sposoby  na stworzenei/ inicjalizacje tablicy
        int xCoordinatesCount = 1000;
        int[] yCoordinates = {1, 2, 3, 4, 5};
        int[] xCoordinates2 = new int[xCoordinatesCount];
        int[] yCoordinates2 = new int[5];

        //Wkladaanie wartosci do tablicy poprzez indeksy
        yCoordinates2[0] = 1;
        yCoordinates2[1] = 2;
        yCoordinates2[2] = 3;
        yCoordinates2[3] = 4;
        yCoordinates2[4] = 5;

        System.out.println(yCoordinates2[3]);

        //dynamiczna alokacja tablicy gdzie mozemy uzyc zmienniej oraz przypisanie wartosci kazdej zmienniej
        int[] xCoordinates = new int[xCoordinatesCount];
        for (int i = 0; i < xCoordinatesCount; i++) {
            xCoordinates[i] = i;
        }
        //wypisanie kazdej zmiennej w tablicy
        for (int i = 0; i < xCoordinatesCount; i++) {
            System.out.println(xCoordinates[i]);
        }
        //IndexOutofBound szukamy koordynatu ktory nie istnieje
        int sum = 0;
        for (int i=0; i<6; i++){
            sum += yCoordinates[i];
        }

        //Tablice wielowymiaowe


    }
}
