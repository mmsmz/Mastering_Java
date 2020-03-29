package B2_Simple_Average_program;

import java.util.Scanner;

public class B1_CalAverageProg {
    public static void main(String[] args) {
        Scanner input, numberofsubjects;
        input =  new Scanner(System.in);
        numberofsubjects =  new Scanner(System.in);

        int total, counter, marks;
        total = 0;
        counter = 1;

        System.out.println("Enter the amount of subject first : ");
        int nr = numberofsubjects.nextInt();
        while (counter<=nr){
            System.out.print("subject " +  counter +  " :");
            marks = input.nextInt();
            total += marks;
            counter++;
        }
        double average = total/nr;
        System.out.println("The total is : " + total);
        System.out.println("The average result is : " + average);
    }
}
