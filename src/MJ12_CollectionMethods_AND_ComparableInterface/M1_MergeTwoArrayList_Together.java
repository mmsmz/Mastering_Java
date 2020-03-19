package MJ12_CollectionMethods_AND_ComparableInterface;

import java.util.ArrayList;
import java.util.List;

public class M1_MergeTwoArrayList_Together {
    public static void main(String[] args) {
        // Merging two lists together, use a method called addall();

        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(12);
        list1.add(43);
        list1.add(15);
        list1.add(67);
        list1.add(43);

//        for (Integer lists : list1) {
//            System.out.print(lists + " ");
//        }                           // outputs : 12 43 15 67 43

        List<Integer> newlist1 = new ArrayList<Integer>();
        newlist1.add(10);
        newlist1.add(67);
        newlist1.add(19);

        // merge together
       // list1.addAll(newlist1);  // output: [12, 43, 15, 67, 43, 10, 67, 19]
       // list1.removeAll(newlist1);  // output: [12, 43, 15, 43]

      /*1*/ //list1.clear(); // output: [] // clears all the values

      /*2*/ //System.out.println(list1);// outputs values in the array slots :  [12, 43, 15, 67, 43]

        //boolean hasValue = list1.contains(67); // output: true
        // boolean hasValue = list1.isEmpty(); // output: false // if the entire array is empty
        boolean hasValue = list1.retainAll(newlist1); // show the value that are deleted  // output is true

        // if the /*1*/ and /*2*/ is commented
        list1.retainAll(newlist1); // output: [67] eliminated all and shows only the duplicated value

        System.out.println(list1);
    }
}
