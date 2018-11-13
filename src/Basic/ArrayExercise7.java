package Basic;

public class ArrayExercise7 {
    public static void main(String[] args) {
        int[] tArray = {1, 2, 3, 4, 5};
        int[] tempArray = new int[10];
        final int x = 3;
        int count = 0;
        //Wziecei kazdej liczby po kolei jako pierwsza
        for (int i = 0; i < tArray.length; i++) {
            //Sprawdzanie z kazda kolejna liczba w tej samej tablicy
            for (int j = 1; j < tArray.length; j++) {
                if (tArray[i] + tArray[j] == x) {
                    //Dodanie zlego elemntu do tymczasowej tablicy
                    tempArray[i] = tArray[j];
                    count++;
                }

            }
        }
        int[] result = new int[4 - count];
        for (int i = 0; i < tArray.length; i++) {
            if (tArray[i] == tempArray[0]) {
                i -= 1;
                continue;
            }
            result[i] = tArray[i];

        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}



