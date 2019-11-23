package MJ12_CollectionMethods_AND_ComparableInterface;

import java.util.*;

public class M2_Convert_HashSet_INTO_List {
    public static void main(String[] args) {
        HashSet<Integer> list1 = new HashSet<Integer>();
        list1.add(12);
        list1.add(43);
        list1.add(15);
        list1.add(67);
        list1.add(43);

        // List<Integer> li = new ArrayList<Integer>(list1);

        //*----------------------------------------------------------------------

        // now if i want to sort the list1

        // Collections.sort(list1); we cant sort this using HashSet, because Collections" "sort" except only "List"
        // therefor convert HashSet to List

        List<Integer> mylist = new ArrayList<Integer>(list1);
        Collections.sort(mylist);
        System.out.println(mylist);

        //----------------------------------------------------------------------------------

        // Task sort the String as well

        HashSet<String> names  = new HashSet<String>();
        names.add("Ron");
        names.add("Alpha");
        names.add("Mike");
        names.add("Zone");
        names.add("Basha");

        List<String> mynamesSorted = new ArrayList<String>(names);
        Collections.sort(mynamesSorted);
        System.out.println(mynamesSorted);
    }
}
