package Rearanging;

public class PowerWithRecursion {
    public static void main(String[] args) {
        System.out.println(powerNumber(10));

    }

    static int powerNumber(int iterator) {
        if (iterator >= 0) {
            int result = iterator * iterator;
            ;
            powerNumber(iterator - 1);
            System.out.println(result);
            return result;
        } else {
            return 0;
        }


    }
}
