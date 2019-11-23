package MJ1_Basic_Java;

public class M2_Variable_ConversionAND_Casting {
    public static void main(String[] args) {
        char c = 'A';
        c = 66; // (ASCII) // ever character in the keyboard there is a Unique number and that is ASCII

        System.out.println(c); // B

        // storing integer value in the double  as d1, and it works as below
        double d1 = 5; // this is called as ***** implicit type conversion and double support
        System.out.println(d1); // 5.0

        // Type Casting......................................

        // Task : storing integer 5.5
        int var = (int) 5.5; //   ****** explicit type conversion
        System.out.println(var); // 5

        // therefore we can assign
        // int to long
        // byte to short
        // short to int

        // how the above works??

        // byte -> short --> int --> long --> float --> double
              //   char -----^

        // byte var2 = 5.5; // error byte required found double
        // byte var2 = (short)9.5; // 9
        // byte var2 = (byte) 9.5; // 9

        // double var2 = (float)6.7; // 6.699999809265137
        // double var2 = (int)  6.7; // 6.0
        // double var2 = (byte) 6.7; // 6.0
        // double var2 = (long) 6.7; // 6.0
        // double var2 = (char) 6.7; // 6.0
        // double var2 = (short) 6.7; // 6.0

       // float v = (double)5.5; // error float required found double
       //  int v1 = (double)5.5; // error int required found double

        System.out.println();


        float f1 = 35e3f;
        double  d11 = 12E4d;
        System.out.println(f1); // 35000.0
        System.out.println(d11);  // 120000.0

        char A = 65, B = 66, C = 67;
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);

/*        Widening Casting (automatically) - converting a smaller type to a larger type size
        byte -> short -> char -> int -> long -> float -> double

        Narrowing Casting (manually) - converting a larger type to a smaller size type
        double -> float -> long -> int -> char -> short -> byte*/

        // Widening Casting
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0


        // Narrowing Casting
        double myDoublee = 9.78;
        int myIntt = (int) myDoublee; // Manual casting: double to int

        System.out.println(myDoublee);   // Outputs 9.78
        System.out.println(myIntt);      // Outputs 9

    }
}
