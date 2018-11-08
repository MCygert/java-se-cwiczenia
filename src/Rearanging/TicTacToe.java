package Rearanging;

import java.lang.reflect.Array;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] gameBoard = new char[3][3];
        boolean gameContinue = true;
        char[][] fullgameboard = empyGameBoard(gameBoard);
        /*
        while (gameContinue) {
            empyGameBoard(gameBoard);
            System.out.println(Array.toString(gameBoard));
        }*/
    }

    static int readNumberFromConsole(int numberInOrder) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczb: " + numberInOrder);
        return scanner.nextInt();
    }

    static char[][] empyGameBoard(char[][] Array) {
        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array.length; j++) {
                Array[i][j] = '?';

            }
        }
        return Array;
    }
}
