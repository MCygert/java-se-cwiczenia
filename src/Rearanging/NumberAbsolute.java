package Rearanging;

import java.util.Scanner;

public class NumberAbsolute {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int num1 = in.nextInt();

    }

    static int absolute(int number1) {
        if (number1 > 0) {
            return number1;
        } else {
            return -number1;
        }
    }
}
