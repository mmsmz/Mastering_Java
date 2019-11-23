package MJ12_CollectionMethods_AND_ComparableInterface;

import java.util.ArrayList;

public class M1_MergeTwoArrayList_Together {
    public static void main(String[] args) {
        // Merging two lists together, use a method called addall();

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(12);
        list1.add(43);
        list1.add(15);
        list1.add(67);
        list1.add(43);

        ArrayList<Integer> newlist1 = new ArrayList<Integer>();
        newlist1.add(10);
        newlist1.add(67);
        newlist1.add(19);

        // merge together
       // list1.addAll(newlist1);  // output: [12, 43, 15, 67, 43, 10, 67, 19]
        //list1.removeAll(newlist1);  // output: [12, 43, 15, 43]

       // list1.clear(); // output: [] // clears all the values

//        System.out.println(list1);

        //boolean hasValue = list1.contains(67); // output: true
        // boolean hasValue = list1.isEmpty(); // output: false
        //boolean hasValue = list1.retainAll(newlist1); // show the value that are deleted  // output is true
        list1.retainAll(newlist1); // output: [67]
        System.out.println(list1);
    }
}
