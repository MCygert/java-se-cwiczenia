package Basic;

public class RecursionTest {
    public static void main(String[] args) {
        recursiveFunction(10);
    }

    //Funkcja rekurencyjna
    static void recursiveFunction(int iterator) {
        if (iterator > 0) {
            System.out.println("Iterator value" + iterator);
            //Odwolanie do funkcji samej siebie
            recursiveFunction(iterator - 1);
        }
        System.out.println("Recursion is over");
    }
}
