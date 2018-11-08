package Rearanging;

import com.sun.xml.internal.fastinfoset.util.CharArray;

public class BattleExerciseFunctions {
    public static void main(String[] args) {
        String war = "wwwpmqdz";
        char[] warArray = war.toCharArray();
        //Przypisanie wartosci do stron za pomoca funkcji addPower
        int leftPower = addPowerOfLeftLetter(warArray);
        int rightPower = addPowerOfRightLetter(warArray);

        //Wypisanie zwycieskiej strony
        System.out.println(whoWon(leftPower, rightPower));


        //Zliczanie punktow lewej strony za pomoca funkcji checkLeftPOwer
    }

    static int addPowerOfLeftLetter(char[] letters) {
        int leftPower = 0;
        for (char letter : letters) {
            leftPower += checkLeftPower(letter);
        }
        return leftPower;
        //Zliczanie punktow prawej strony za pomoca funkcji checkRightPOwer
    }

    static int addPowerOfRightLetter(char[] letters) {
        int rightPower = 0;
        for (char letter : letters) {
            rightPower += checkRightPower(letter);
        }
        return rightPower;
    }


    //Zliczanie sily poszczegolnych liter lewej strony
    private static int checkLeftPower(char letter) {
        int leftSide = 0;
        switch (letter) {
            case 'w':
                leftSide += 4;
                break;
            case 'p':
                leftSide += 3;
                break;
            case 'b':
                leftSide += 2;
                break;
            case 's':
                leftSide += 1;
                break;
        }
        return leftSide;
    }

    //Zliczanie sily poszczegolnych liter prawej strony
    private static int checkRightPower(char letter) {

        int rightSide = 0;
        switch (letter) {
            case 'm':
                rightSide += 4;
                break;
            case 'q':
                rightSide += 3;
                break;
            case 'd':
                rightSide += 2;
                break;
            case 'z':
                rightSide += 1;
                break;

        }
        return rightSide;
    }

    //Sprawdzanei zwycieskiej strony
    private static WinningScore whoWon(int leftPower1, int rightPower1) {
        if (leftPower1 > rightPower1) {
            return WinningScore.LEFT;
        } else if (leftPower1 == rightPower1) {
            return WinningScore.DRAW;
        } else {
            return WinningScore.RIGHT;
        }
    }

    enum WinningScore {
        RIGHT, LEFT, DRAW
    }
}







