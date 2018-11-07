import java.util.Scanner;

public class Petle2 {
    public static void main(String[] args) {
        //Scannner
        Scanner in = new Scanner(System.in);
        System.out.println("Podaje liczbe");
        int num = in.nextInt();
        //Inicjalizacja zmiennych
        int previous = 1;
        int second = 1;
        int result;
        //Wyjatki na liczbach 1 i 0
        if(num == 0){
            System.out.println(0);
        } else if (num == 1){
            System.out.println(1);
            //Petla ktora liczy fibonanaciego
        } else {
            for(int i = 2; i<num; i++){
                result = previous + second;
                second = previous;
                previous = result;

                System.out.println("Result: " + result);


            }


        }
    }
}
