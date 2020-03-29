package B2_Simple_Average_program;

public class B7_EnhanceForLoop {
    public static void main(String[] args) {
        // print the total value from the array val[]
        int val[] = {2,56,5,8,9,5,5};

        int total =0;

        for (int xva : val) {
            total += xva;
        }
        System.out.println(total);
    }

}
