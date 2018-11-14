package TicTacToe;

import java.util.Scanner;

public class ConsoleReader {
    private Scanner scanner;

    public ConsoleReader(){
        scanner = new Scanner(System.in);
    }

    public int ReadInteger() {
        return scanner.nextInt();
    }

    public String ReadString() {
        return scanner.nextLine();
    }
}
