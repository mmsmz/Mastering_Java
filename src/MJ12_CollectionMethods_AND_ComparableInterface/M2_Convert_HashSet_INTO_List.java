package MJ12_CollectionMethods_AND_ComparableInterface;

import java.util.*;

public class M2_Convert_HashSet_INTO_List {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<Integer>();
        myHashSet.add(12);
        myHashSet.add(43);
        myHashSet.add(15);
        myHashSet.add(67);
        myHashSet.add(43);

        // List<Integer> li = new ArrayList<Integer>(myHashSet);
        //**** now if i want to sort the myHashSet

        // Collections.sort(myHashSet); we cant sort this using HashSet, because Collections" "sort" except only "List"
        // therefor convert HashSet to List

    //*--------------------------------------------------------------------------------------------------------------------1
        List<Integer> mylist = new ArrayList<Integer>(myHashSet);
        Collections.sort(mylist);
        System.out.println(mylist); // output : [12, 15, 43, 67]

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
        System.out.println(mynamesSorted); // output : [Alpha, Basha, Mike, Ron, Zone]
    }
}
