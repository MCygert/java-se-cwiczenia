import java.util.Scanner;

public class Potegi {
    public static void main(String[] args) {
        //Przyjecie liczby od czlowieka
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj Liczbe");
        int num = in.nextInt();
        //inicjalizacja zmiennych
         int sum = 0;
         int result = 0;
         //petla ktora podnosi do kwadratu kazda liczbe
        for(int i = 0; i<num; i++){
            sum = i * i;
            System.out.println(sum);
            result += sum;
        }
        System.out.println("Suma: " + result);

    }
}
