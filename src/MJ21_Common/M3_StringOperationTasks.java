package MJ21_Common;

import java.sql.SQLOutput;
import java.util.Scanner;

public class M3_StringOperationTasks {
    public static void main(String[] args) {
        // Write a program to accept two strings from user and perform the following operations
        // 1. Find the length of the both the strings
        // 2. Concatenation of two Strings
        // 3. Convert first string into UPPERCASE

        String s1, s2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two Strings ");
        s1 = sc.nextLine();
        s2 = sc.nextLine();

        // if individual
//        int lens1 = s1.length();
//        int lens2 = s2.length();
//
//        System.out.println(s1 + " : length is :  " + lens1); //love : length is :  4
//        System.out.println(s2 + " : length is :  " + lens2);//asdf : length is :  4
        // task 1
        int lensofStrings = s1.length() + s2.length();
        System.out.println("both length : " + lensofStrings);

        // task two
        String s3 = s1.concat(" " +s2);
        System.out.println(s3);

        // task three upppercase the both the strings

        System.out.println(s3.toUpperCase());


    }
}
