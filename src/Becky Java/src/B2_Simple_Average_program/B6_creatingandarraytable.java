package B2_Simple_Average_program;

import java.util.Random;

public class B6_creatingandarraytable {
    public static void main(String[] args) {

//        System.out.println("Index/tValue");
//        int value[] ={32,56,2,185,21,56,3,1};
//
//        for (int counter = 0; counter<=value.length; counter++)
//        {
//            System.out.println(counter +  "\t" + value[counter]);
//        }


        // calcualtes the total value
//        int numbers [] ={32,56,2,185,21,56,3,1};
//        int counter =0;
//        int total =0;
//        while (counter<numbers.length) {
//            total = total + numbers[counter];
//            counter++;
//        }
//        System.out.println("The total value is : " + total);

        // array element as Counters
        Random rand = new Random();
        int freq[] = new int[7]; // size dice is 6 but we have 7 array because 0123456 that is 7 elements

        for(int roll = 1; roll<1000; roll++){
            ++freq[1+rand.nextInt(6)];
        }

        System.out.println("Face\tFrequency");

        for (int face=1; face<freq.length;face++){
            System.out.println(face + "\t" + freq[face]);
        }


    }
}
