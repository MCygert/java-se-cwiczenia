package Rearanging;

import java.util.Scanner;

public class AverageExercise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int num1 = in.nextInt();
        System.out.println("Podaj liczbe");
        int num3 = in.nextInt();
        System.out.println("Podaj liczbe");
        int num2 = in.nextInt();

        System.out.println("Srednia to: " + averageNumber(num1, num2, num3));
    }

    static double averageNumber(int number1, int number2, int number3) {
        double medium = (number1 + number2 + number3) / 3;
        return medium;
    }
}
