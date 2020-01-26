package MJ21_Common;

import java.util.Scanner;

public class M1_2_StringReverse {
    public static void main(String[] args) {
        // second way using JAVA API
        // for this we will need a object of StringBuffer


        // create two string objects
        String original; // for storing user inputs
        String reverse = "" ; // for storing reverse of string

        // take input from user
        System.out.println("Enter the String");

        Scanner input = new Scanner(System.in);
        original = input.nextLine();


        // for this we will need a object of StringBuffer
        StringBuffer sb = new StringBuffer(original);
        reverse = sb.reverse().toString();

        System.out.println("original : " + original);
        System.out.println("reverse : " + reverse);
    }
}
