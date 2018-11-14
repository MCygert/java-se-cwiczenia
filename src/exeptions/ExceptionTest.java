package exeptions;

import Objective.Traingle;

public class ExceptionTest {
    public static void main(String[] args) {


        try {

            Traingle triangle = new Traingle(10, 20);
        } catch (InvalidSideException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
