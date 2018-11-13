package CodeWars;


/**
 * The new "Avengers" movie has just been released! There are a lot of people at the cinema box office standing in a huge line.
 * Each of them has a single 100, 50 or 25 dollars bill. An "Avengers" ticket costs 25 dollars.
 * Vasya is currently working as a clerk. He wants to sell a ticket to every single person in this line.
 * Can Vasya sell a ticket to each person and give the change if he initially has no money and sells the tickets strictly
 * in the order people follow in the line?
 * Return YES, if Vasya can sell a ticket to each person and give the change with the bills he has at hand at that moment.
 * Otherwise return NO.
 */
public class Line {
    public static String Tickets(int[] peopleInLine)
    {
        int[] money = new int[7];
        int vasyaMoney = 0;
        if (peopleInLine[0] != 25) {
            return "NO";
       // todo: Add first person to vasyaMoney
       // todo: Create algorithm for checking if vasya can give change from money that he have      
        } else {


        }

    }
}