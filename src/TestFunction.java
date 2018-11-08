public class TestFunction {
    public static void main(String[] args) {
        int[] vals1 = {1, 2, 3, 4, 5, 6, 7};
        int[] vals2 = {4, 6, 1, 2, 3, 5};


        countSumOfElements(vals1);
        System.out.println(averageOfArray(vals1));
        System.out.println(averageOfArray(vals2));

    }

    //Zadeklarowanie funkcji
    static int countSumOfElements(int[] inputArray) {
        int sum = 0;
        for (int i = 0; i < inputArray.length; i++) {
            sum += inputArray[i];

        }
        //Zwracana wartosc funkcji
        return sum;
    }

    //Zadeklarowanie kolejnej funkcji
    static double countVelocity(double time, double route) {
        double velocity = route / time;
        System.out.println(velocity);

        //Zwracana wartosc z funkcj
        return velocity;
    }

    //Funkcje liczaca srednia z tablicy intow
    static double averageOfArray(int[] inputArray) {
        double averageSum = 0;
        for (int number : inputArray) {
            averageSum += number;
        }
        //dzielenie sredniej z tablicy przez ilosc liczb w niej zawartej
        return averageSum / inputArray.length;

    }
}
