import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        boolean conitnueProgram = true;
        Scanner in = new Scanner(System.in);
        //Petla ktora podtrzymuje kalkulator
        while (conitnueProgram) {
            //Pobranie liczb
            System.out.println("Podaj liczbe: ");
            int num1 = in.nextInt();
            System.out.println("Podaj druga liczbe: ");
            int num2 = in.nextInt();

            //Pobranie rodzaju aplikacji
            System.out.println("Podaj operacje");
            System.out.println("+ dodaje");
            System.out.println("- odejmuje");
            System.out.println("* mnozy");
            System.out.println("/ dzieli");
            System.out.println("q konczy dzialanie");
            String operation = in.next();

            //Switch z operacjami kalkulator
            switch (operation) {
                case "+":
                    System.out.println(num1 + num2);
                    break;
                case "-":
                    System.out.println(num1 - num2);
                    break;
                case "*":
                    System.out.println(num1 * num2);
                    break;
                case "/":
                    System.out.println(num1 / num2);
                    break;
                case "q":
                    conitnueProgram = false;
                    break;
                default:
                    System.out.println("Operacja" + operation);
            }

        }
    }
}