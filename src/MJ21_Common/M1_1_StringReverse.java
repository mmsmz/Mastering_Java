package MJ21_Common;

import java.util.Scanner;

public class M1_1_StringReverse {
    public static void main(String[] args) {

        // create two string objects
        String original; // for storing user inputs
        String reverse = "" ; // for storing reverse of string

        // take input from user
        System.out.println("Enter the String");

        Scanner input = new Scanner(System.in);
        original = input.nextLine();

        int len = original.length();

        for (int i = len-1; i>=0 ; i--) {
            reverse = reverse + original.charAt(i);
        }
        System.out.println("original : " + original);
        System.out.println("reverse : " + reverse);
    }
}
