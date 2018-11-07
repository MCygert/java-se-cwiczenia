public class Logic {
    public static void main(String[] args) {

        //Wartosci logiczne w polaczeniu z if
        boolean isCircle =true;
        double r = 5.25;

        double circleField =  3.14 * r * r;

        //To jest to samo co if kazdy if jest wartoscia boolean mozna by uzyc zmiennej isBigCircle do pierwszgo if
        boolean isBigCircle = isCircle && r > 10;

        if(isCircle && r > 10) {
            System.out.println("To jest kolko");
        }else if (isCircle){
            System.out.println("To jest malo kolo");
        }else {
            System.out.println("To nie jest kolo");
        }
    }
}
