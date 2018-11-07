import java.sql.SQLOutput;

public class MathExercise {
    public static void main(String[] args) {
        //Inicjalizacja zmiennych
        double myPoint = 98.123;
        double myTimeHour = 10;
        double myTimeMinutes = 25;
        double destPoint = 123.123;
        Hemisphere myHemisphere = Hemisphere.EAST;
        Hemisphere destHemisphere = Hemisphere.WEST;
        final int minutesPerDeg = 4;

        //moje Podejscie
        /*
        if(myHemisphere != destHemisphere){
            if (destHemisphere == Hemisphere.WEST){
                double minutes=  destPoint - myPoint;
                double timeMinutes = minutes * minutesPerDeg;
                myTimeMinutes = timeMinutes % 60;
                myTimeHour = (int) (timeMinutes / 60);
            }
        }
        */

        //Zrobione wspolnie
        double minuteDiff = 0.0;
        // Sprawdzamy czy szerokosc powinna byc dodatnia czy ujemne
        if (myHemisphere == Hemisphere.EAST) {
            destPoint *= -1;
        }
        if(myPoint > destPoint){
            minuteDiff = (myPoint - destPoint) * 4;

        } else {
            minuteDiff = (destPoint - myPoint) * 4;
        }
        double myMinutes = myTimeHour * 60 + myTimeMinutes;
        double destMinutes = minuteDiff + myMinutes;


        //obcianmy koncowke zeby nie bylo ulamkow w godzinach i minutach
        int destTimeHour = (int) destMinutes / 60;
        int destTimeMinutes = (int) destMinutes % 60;
        System.out.println(destTimeHour);
        System.out.println(destTimeMinutes);


    }

    enum Hemisphere {
        WEST, EAST
    }
}
