package MJ6_StringClass_AND_LOOPS_AND_Break_Continue_Statement;

public class M5_NestedLoops_Excercises {
    public static void main(String[] args) {
        /*
        print this using for loop

        * * * *
        * * * *
        * * * *
        * * * *

        */
//        for (int h = 1; h<=4; h++){
//            for (int i = 1; i <= 4; i++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        // ------------------------------------------------- task 2
        /*
        print this using for loop

        1 2 3 4
        1 2 3 4
        1 2 3 4
        1 2 3 4

        */
//        for (int x = 1; x <= 4; x++) {
//            for (int i = 1; i <= 4; i++) {
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }

        /*
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
        1 2 3 4 5 6
        */

//        for (int m = 1; m <= 6; m++) {
//            for (int i = 1; i <= m; i++) {
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }
        /*
        A
        A B
        A B C
        */
        /*char n = (int )65;
        char nc = 65;
        System.out.println(n);// A
        System.out.println(nc);// A*/

//        for (int x = 65; x<=67; x++){
//            for (char i=65; i <=x; i++){
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }

        /*
        $ $ $ $
        $     $
        $     $
        $ $ $ $
        */
// ---------------------------------------------------------------------------------------------111111-------
//        for(int row=1;row<=4;row++){
//            for(int col=1;col<=4;col++){
//                if(row==1 ||  row==4  ||  col==1  ||  col==4)
//                    System.out.print("$ ");
//                else
//                    System.out.print("  ");
//            }
//            System.out.println();
//        }

// ---------------------------------------------------------------------------------------------22222--------
//        for (int i = 0; i < 5; i++) {
//            if (i != 2) {
//                String dollar = i % 2 == 0 ? "$ $ $ $" : "$     $";
//                System.out.println(dollar);
//            }
//        }
// --------------------------------------------------------------------------------------------333333--------
//        for (int i = 0; i < 1; i++) {
//            System.out.println("$ $ $ $");
//            for (int j = 0; j < 2; j++) {
//                System.out.println("$     $");
//            }
//            System.out.println("$ $ $ $");
//
//        }
// --------------------------------------------------------------------------------------------444444--------
//        for(int i = 0; i <= 3;  i++){
//            System.out.println("$ $ $ $");
//            for( ; i <= 1; i++){
//                System.out.println("$     $");
//            }
//        }

// --------------------------------------------------------------------------------------------555555-------
        /*for(int j = 1; j <= 4; j++) {
            for(int i = 1; i <= 4; i++) {
                if((j == 1 || j== 4)) {
                    System.out.print("$ ");
                }else if(i == 2 || i == 3) {
                    System.out.print("  ");
                }else {
                    System.out.print("$ ");
                }

            }
            System.out.println();
        }*/
// --------------------------------------------------------------------------------------------6666666-------
        for(int i=0; i<=3; i++)
        {
            for(; i>=1 && i<=2; i++)
            {
                System.out.println("$     $");
            }
            System.out.println("$ $ $ $");
        }

    }
}
