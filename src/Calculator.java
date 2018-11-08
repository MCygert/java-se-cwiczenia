import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        boolean conitnueProgram = true;
        Scanner in = new Scanner(System.in);
        //Petla ktora podtrzymuje kalkulator
        while (conitnueProgram) {
            //Pobranie liczb
            int num1 = readNumberFromConsole(1);
            int num2 = readNumberFromConsole(2);

            //Pobranie rodzaju aplikacji
            printMenuOptions();
            String operation = in.next();

            //Odwolanie do funkcji z Switchem z operacjami kalkulatora
            conitnueProgram = shouldConitnueProgram(conitnueProgram, num1, num2, operation);

        }
    }

    static boolean shouldConitnueProgram(boolean conitnueProgram, int num1, int num2, String operation) {
        switch (operation) {
            case "+":
                add(num1, num2);
                break;
            case "-":
                substracion(num1, num2);
                break;
            case "*":
                multiplication(num1, num2);
                break;
            case "/":
                substracion(num1, num2);
                break;
            case "q":
                conitnueProgram = false;
                break;
            default:
                System.out.println("Operacja" + operation);
        }
        return conitnueProgram;
    }

    static int readNumberFromConsole(int numberInOrder) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczeb: " + numberInOrder);
        return scanner.nextInt();
    }

    static int add(int num1, int num2) {
        int result = num1 + num2;
        System.out.println(result);
        return result;
    }

    static int substracion(int num1, int num2) {
        int result = num1 - num2;
        System.out.println(result);
        return result;
    }

    static int multiplication(int num1, int num2) {
        int result = num1 * num2;
        System.out.println(result);
        return result;
    }

    static int division(int num1, int num2) {
        int result = num1 / num2;
        System.out.println(result);
        return result;
    }

    static void printMenuOptions() {
        System.out.println("Podaj operacje");
        System.out.println("+ dodaje");
        System.out.println("- odejmuje");
        System.out.println("* mnozy");
        System.out.println("/ dzieli");
        System.out.println("q konczy dzialanie");
    }


}
