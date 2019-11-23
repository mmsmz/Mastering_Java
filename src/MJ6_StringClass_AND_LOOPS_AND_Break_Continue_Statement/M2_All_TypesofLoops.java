package MJ6_StringClass_AND_LOOPS_AND_Break_Continue_Statement;

public class M2_All_TypesofLoops {
    public static void main(String[] args) {
        // while, do while, for , for-each

        // while loop -------------------------------------------------------------------------
//        while (true){ // this statement will print infinitive times
//            System.out.println("Hello");
//        }

        int i = 1; // initial value of i
        while (i <= 5) { // here is the condition
            System.out.print("Hello "); // Hello Hello Hello Hello Hello
            i++; // incrementing i by 1
        }
        System.out.println(); // breaks the line

        // do while loop ----------------------------------------------------------------------
        // using do while loop, it will print ablest once before reaching the condition
        int x = 1;
        do {
            System.out.print("Hi ");
            x++;
        } while (x <= 5);

        // for loop ---------------------------------------------------------------------------
        // when we know th starting point and ending point go for the for loop
        for (int k= 1; k<=5;k++) {
            System.out.println("Mohamed");
        }

        // for each
        // used for arrays and collections
    }
}
