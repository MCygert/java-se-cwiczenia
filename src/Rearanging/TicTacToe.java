/*
package Rearanging;

import java.lang.reflect.Array;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] gameBoard = new char[3][3];
        boolean gameContinue = true;
        char[][] fullgameboard = empyGameBoard(gameBoard);
        printingGameBoard(fullgameboard);
        int xCoordinate = askForXCoordinate();
        int YCoordinate = askForYCoordinate();


        */
/*
        while (gameContinue) {
            empyGameBoard(gameBoard);
            System.out.println(Array.toString(gameBoard));
        }*//*

    }

    static boolean winningCondiion(char[][] gameBoard) {
        checkYaxis(gameBoard);
        checkXaxis(gameBoard);
        checkAngle(gameBoard);
        return true;
    }

    static boolean checkYaxis(char[][] gameBoard) {
        for (int yAxis = 0; yAxis < gameBoard.length; yAxis++) {
            char znak = gameBoard[yAxis][0];
            for (int xAxis = 0; xAxis < gameBoard.length; xAxis++) {
                if (gameBoard[xAxis][yAxis] == '?') {
                    return false;
                } else if (gameBoard[xAxis][yAxis] != znak) {
                    return false;
                } else {
                    return true;
                }

            }
        }

    }

    static boolean checkXaxis (char[][] gameBoard) {
        for (int xAxis = 0; xAxis < gameBoard.length; xAxis++) {
            char znak = gameBoard[xAxis][0];
            for (int yAxis = 0; xAxis < gameBoard.length; xAxis++) {
                if (gameBoard[xAxis][xAxis] == '?') {
                    return false;
                } else if (gameBoard[xAxis][xAxis] != znak) {
                    return false;
                } else {
                    return true;
                }

            }
        }

    }

    static boolean checkAngle(char[][] gameBoard) {
        for (int i = 0; i < gameBoard.length; i++) {
            if (gameBoard[i][i] == '?') {
                return false;
            } else {
                char player = gameBoard[i][i];
                for (int j = 0; j < gameBoard.length ; j++) {
                    if (player == gameBoard[i + 1][i + 1]) {

                    }
                }



            }
        }
    }


    static char[][] empyGameBoard(char[][] Array) {
        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array.length; j++) {
                Array[i][j] = '?';

            }
        }
        return Array;
    }

    static void printingGameBoard(char[][] gameBoard) {
        for (int i = 0; i < gameBoard.length; i++) {
            System.out.println("");
            for (int j = 0; j < gameBoard.length; j++) {
                System.out.print(gameBoard[i][j]);
            }
        }
    }

    static int askForXCoordinate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wspolrzedna x: ");
        return scanner.nextInt();
    }

    static int askForYCoordinate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wspolrzedna y: ");
        return scanner.nextInt();
    }
}
*/
