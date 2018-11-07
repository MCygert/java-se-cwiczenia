public class ArrayExercise7 {
    public static void main(String[] args) {
         int[] tArray = {1,2,3,4,5};
         int[] tempArray = new int[3];
         final int x = 3;
         //Wziecei kazdej liczby po kolei jako pierwsza
         for (int i = 0; i<tArray.length; i++){
             //Sprawdzanie z kazda kolejna liczba w tej samej tablicy
             for (int j = 1; j<tArray.length; j++){
                 if(tArray[i]+tArray[j] == x){
                     //Usuniecie elemntu j z tablicy:dodanie liczby i do nowej tablicy
                     


                 }
             }
        }
    }
}
