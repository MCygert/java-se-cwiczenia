package Basic;

import java.util.Scanner;

public class Logika1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int num = in.nextInt();
        if(num<0){
            System.out.println(-num);
        } else {
            System.out.println(num);
        }
    }
}
