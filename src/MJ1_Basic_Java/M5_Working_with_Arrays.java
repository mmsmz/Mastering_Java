package MJ1_Basic_Java;

class Student {
    int rollNo;
    String name;
}


public class M5_Working_with_Arrays {
    public static void main(String[] args) {
        //     int values[] = new int[2_147_483_647]; // here we get only 2_147_483_647 much of slots

        int val[] = new int[100];
        val[2] = 222222;
        val[99] = 999999;
        System.out.println(val[99]);

        // -----
        double dval[] = new double[100];
        dval[2] = 222222;
        dval[20] = 222.222;
        dval[99] = 999.999;
        System.out.println(dval[20]); // output 222222.0

        // ------
        String words[] = new String[]{"My", "Name", "is", "Marnik"};
        System.out.println(words[3]);

        // -----
        String words1[] = new String[4];
        words1[0] = "My";
        words1[1] = "Name";
        words1[2] = "is";
        words1[3] = "Marnik";
        System.out.println(words1[0]);
        // can you increase the words1 array?
        // once initialized we cannot expand the we can only create brand new of array slots
        words1 = new String[10]; // now there want be any old value of data stored in these new slots
        // this will create a new array list of 10 slots
        //words1= new String[10]; this create a new array and doesn't store old values in it ***
        System.out.println(words1[0]); // output = null , null which means it is empty
        System.out.println(words1[2]);
        // Array
        /**
         *  a. 1Dimension Array
         *  b. 2Dimension Array
         *  c. Jagged Array
         */

        // 1Dimension Array
        // ------------------------------------------------------------------------
 /*       int num[] = new int[4];
        num[0] = 8;
        num[1] = 12;
        num[2] = 76;
        num[3] = 54;

        for (int i = 0; i <4 ; i++) {
            System.out.println(num[i]);
        }*/

        // ------------------------------------------------------------------------
        int nums[] = {5, 10, 56, 58}; // we can simply initiate the value here itself.
        for (int n : nums) {
            System.out.println(n);
        }

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        // instead of creating 4 object this way

//       Student s[] = new Student[4]; // i can specify

//       Student s[] = {s1,s2,s3,s4}; // create it in an array


        // 2Dimension Array
        // ------------------------------------------------------------------------
//        int a[] = {1,2,3,4};
//        int b[] = {2,4,6,8};
//        int c[] = {5,6,7,8}; instead of doing this we can initiate in a 2 dimension array
          // r c
        int d[][] = {
                       // a, b, c
                        /*col*/
                /*row*/ {1,2,3,4},
                        {2,4,6,8},
                        {5,6,7,8}
                    };

        System.out.println(d[0]);  // prints whole row output: [I@4554617c

        // to print all
//        for (int i = 0; i < 3; i++) { // count number of row
//            for (int j = 0; j < 4; j++) { // count number of col
//                System.out.print(" " + d[i][j]);
//            }
//            System.out.println();
//        }

        // Jagged Array
        // ------------------------------------------------------------------------
        int jag[][] = {
                    {1,2,3,4},
                    {2,4,8},
                    {5,6,8,9,7}
                    };

        // to print all
        for (int i = 0; i < jag.length; i++) { // count number of row
            for (int j = 0; j < jag[i].length ; j++) { // count number of col
                System.out.print(" " + jag[i][j]);
            }
            System.out.println();
        }
    }
}
