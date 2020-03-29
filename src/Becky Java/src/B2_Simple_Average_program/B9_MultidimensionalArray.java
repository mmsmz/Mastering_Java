package B2_Simple_Average_program;

public class B9_MultidimensionalArray {
    public static void main(String[] args) {
                                               //    _0_ _1_ _2_ _3
        int firstarray[][] = {{4,5,6,7},       // 0 | 4 | 5 | 6 | 7
                              {14,15,16,17},   // 1 | 14|15 |16 |17
                             };

        //System.out.println(firstarray[0][2]); // 6

        int secondarray[][] = {{30,31,32,33}, // call elements in this array [0][0] => 30 [0][1] =>31
                               {43},          // call elements in this array [1][0] => 43
                               {4,5,6}        // call elements in this array [2][0] => 4 [2][1] => 5
                              };

        System.out.println("This is the first array");
        display(firstarray);

        System.out.println("This is the second array");
        display(secondarray);
    }

    // create a visual table

    public static void display(int x[][]){
        for (int row=0; row<x.length; row++){
            for (int column=0; column<x[row].length; column++){
                System.out.print(x[row][column] + "\t");
            }
            System.out.println();
        }
    }

}
