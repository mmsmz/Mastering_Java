package MJ1_Basic_Java;

import java.util.Scanner;

public class M7_Scanner_Inputs {
    public static void main(String[] args) {
        int n = 0 ;
        Scanner sc = new Scanner(System.in); // from where are you going to get the input
                            // from file, keyboard , system
        n = sc.nextInt(); // benefits of Scanner
                        // 1. advantage is we dont need to create an exception
                        // 2. advantage is we dont need to convert String to integer

        System.out.println(n);

        // Scanner
        // BufferReader /// converting string to integer happens in BufferReader ***
    }
}
