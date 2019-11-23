package MJ11_TraversingListsandCustomTypes.lesson3;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class M1_HashSet {
    public static void main(String[] args) {
        /*HashSet<Integer> values = new HashSet<Integer>(); // Hashset prevents from entering duplicate values and itdoest mantain an order
        // ArrayList managers the order of inserted values but the Hashset doesnt manage that
        values.add(10);
        values.add(43);
        values.add(15);
        values.add(67);
        values.add(43);

        for (Integer value: values){
            System.out.println(value);
        }*/

//        HashSet<String> values = new HashSet<String>();
//        values.add("Random");
//        values.add("Animals");
//        values.add("People");
//        values.add("Random");
//        values.add("Random");
//
//        for (String value: values){
//            System.out.println(value);
//        }

        // if you want the order to maintain use LinkedHashSet

        LinkedHashSet<String> values = new LinkedHashSet<String>();
        // this orders as inserted and it doesnt allow duplicate values
        values.add("Random");
        values.add("Animals");
        values.add("People");
        values.add("People");
        values.add("Zoo");
        values.add("Random");
        values.add("Car");

        for (String value: values){
            System.out.println(value);
        }


    }
}
