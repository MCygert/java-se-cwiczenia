package Rearanging;

import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {
        //Initialization of numbers
        int a = readNumberFromConsole("cathetus");
        int b = readNumberFromConsole("second cathetus");
        int c = readNumberFromConsole("hypotenuse");


    }

    static int readNumberFromConsole(String numberInOrder) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give number: " + numberInOrder);
        return scanner.nextInt();
    }

    static boolean isItRightTriangle(double a, double b, double c) {
        if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
            return true;
        } else {
            return false;
        }
    }
}

