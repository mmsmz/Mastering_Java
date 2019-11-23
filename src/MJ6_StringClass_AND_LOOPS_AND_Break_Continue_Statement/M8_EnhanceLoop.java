package MJ6_StringClass_AND_LOOPS_AND_Break_Continue_Statement;

public class M8_EnhanceLoop {
    public static void main(String[] args) {
        int a [] ={5,6,8,9,5};

        for (int i : a){
            System.out.print(i + " ");
        }
        // ** use for each for array
        System.out.println();
        System.out.println();

        int d[][] = {
                {1,2,3,4},
                {2,4,8},
                {5,6,7,8,8}
        };

        for (int y[] : d){
            for (int q : y) {
                System.out.println(" " + q);
            }
            System.out.println();
        }

    }
}
