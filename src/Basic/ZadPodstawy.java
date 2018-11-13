package Basic;

import java.util.Scanner;

public class ZadPodstawy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int num1 = in.nextInt();
        System.out.println("Podaj liczbe");
        int num3 = in.nextInt();
        System.out.println("Podaj liczbe");
        int num2 = in.nextInt();

        double medium = (num1+num2+num3)/3;
        System.out.println("Srednia to: " + medium);
    }
}
