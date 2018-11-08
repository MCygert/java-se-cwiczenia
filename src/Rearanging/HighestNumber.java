package Rearanging;

import java.util.Scanner;

public class HighestNumber {
    public static void main(String[] args) {
        int number1 = readNumberFromConsole(1);
        int number2 = readNumberFromConsole(2);
        int number3 = readNumberFromConsole(3);


    }

    static int readNumberFromConsole(int numberInOrder) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczeb: " + numberInOrder);
        return scanner.nextInt();
    }

    static int[] numberComparision(int... numbers) {
        int resultCount = 0;
        int[] result = new int[numbers.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = -1;
        }
        int greates = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > greates) {
                greates = numbers[i];
            }
        }
        int GreatestCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == greates) {
                GreatestCount++;
            }
        }
        int[] result1 = new int[GreatestCount];
        for (int i = 0; i < GreatestCount; i++) {
            result1[1] = greates;
        }
        return result1;


    }
}
