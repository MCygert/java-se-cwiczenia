package Rearanging;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        //Initialization of numbers
        int a = readNumberFromConsole('a');
        int b = readNumberFromConsole('b');
        int c = readNumberFromConsole('c');

        int delta = calculateDelta(a, b, c);

        if (delta < 0) {
            System.out.println("There isnt' any solution");
        } else if (delta == 0) {
            int sum = -b / (2 * a);
            System.out.println(sum);
        } else {
            double sum1 = (-b - Math.sqrt(delta)) / 2 * a;
            double sum2 = (-b + Math.sqrt(delta)) / 2 * a;
            System.out.println("X1: " + sum1);
            System.out.println("X2: " + sum2);
        }


    }


    static int readNumberFromConsole(char numberInOrder) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give number: " + numberInOrder);
        return scanner.nextInt();
    }

    static int calculateDelta(int a, int b, int c) {
        int delta = (b * b) - (4 * a * c);
        return delta;
    }
}
