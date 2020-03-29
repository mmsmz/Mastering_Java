package B2_Simple_Average_program;

import java.util.Random;

public class B4_RandomCal {
    public static void main(String[] args) {
        Random dice = new Random();
        int number ;

        for (int counter = 1; counter<=10; counter++){
            // number = dice.nextInt(); // it takes numbers between -2,147,483,648 to 2,147,483,647
            // number = dice.nextInt(6); //  0 to 5
            number = 1+ dice.nextInt(6); //  1 to 6
            System.out.println(number +  " ");
        }
    }
}
