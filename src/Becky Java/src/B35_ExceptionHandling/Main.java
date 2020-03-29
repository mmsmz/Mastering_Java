package B35_ExceptionHandling;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter first num1: ");
//        int num1 = input.nextInt();
//        System.out.println("Enter first num2: ");
//        int num2 = input.nextInt();
//
//        int sum = num1 / num2;
//        System.out.println(sum);  when divide by zero whole this will not work


        Scanner input = new Scanner(System.in);
        int x = 1;

        do {
            try {
                System.out.println("Enter first num1: ");
                int num1 = input.nextInt();
                System.out.println("Enter first num2: ");
                int num2 = input.nextInt();
                int sum = num1 / num2;
                System.out.println(sum);
                x=2;
                break;
            } catch (Exception e) {
                System.out.println("you cant do that!");
            }
        }while (x==1);
    }
}
