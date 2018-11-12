package Rearanging;

import java.util.Scanner;

public class AlphabetCheceker {
    public static void main(String[] args) {
        //Initialization of all Ascii Characters and user String
        String userString = readStringFromConsole();
        char[] userCharArray = userString.toCharArray();
        char aFromAlphabet = 'a';
        char zFromAlphaber = 'z';
        boolean isInArray;
        //Looping all alphabet
        for (int i = aFromAlphabet; i < (int) zFromAlphaber; i++) {
            //flag for marking characters that isn't in array
            isInArray = false;
            //Looping for whole String Array if loop found same character it braeks it
            for (int number : userCharArray) {
                if (number == i) {
                    isInArray = true;
                    break;
                }
            }
            //If it didnt found then it prints it in terminal
            if (isInArray == false) {
                System.out.println((char) i);
            }

        }

    }

    static String readStringFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give String:");
        return scanner.nextLine();
    }
}

