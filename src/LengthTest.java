public class LengthTest {
    public static void main(String[] args) {
        //Inicjalizacja zmiennych
        double coordinateX1 = 127.89;
        double coordinateY1 = 92.12;

        double coordinateX2 = 24.12;
        double coordinateY2 = 82.91;

        //Dzialanie bez uzywania funkcji
        double distance = Math.sqrt((coordinateX2 - coordinateX1) * (coordinateX2 - coordinateX1) + (coordinateY2 - coordinateY1) * (coordinateY2 - coordinateY1));
        //Dzialanie z uzyciem funkcji
        double niceDistance = Math.sqrt(Math.pow((coordinateX2 - coordinateX1), 2) + Math.pow((coordinateY2 - coordinateY1), 2));

        //Wyswietlenie wynikow
        System.out.println(distance);
        System.out.println(niceDistance);
    }
}
