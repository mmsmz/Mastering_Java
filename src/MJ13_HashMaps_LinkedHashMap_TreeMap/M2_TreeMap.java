package MJ13_HashMaps_LinkedHashMap_TreeMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class M2_TreeMap {
    public static void main(String[] args) {
        //TreeMap
        TreeMap<String,String> dictionary = new TreeMap<>();
        dictionary.put("MN0001","Ruby");
        dictionary.put("MN0003","Sapphire");
        dictionary.put("MN0002","Star");
        dictionary.put("MN0004","Blue");
        dictionary.put("MN0005","Thread");
        dictionary.put("MN0006","Red");
        dictionary.put("MN0004","Bluexx updated");

//      for (String mylist : dictionary.keySet()){
////         // System.out.println(mylist);
////         System.out.println(dictionary.get(mylist));
////    }

//      for (String mylist : dictionary.values()) {
//            System.out.println(mylist);
//      }

        //****  to loop them K and V together we must know whats an entryset() is !!

        // dictionary.entrySet() means both of K V together

        for (Map.Entry<String,String> entry: dictionary.entrySet()){
            // System.out.println(entry);
            System.out.println(entry.getKey() + " " +entry.getValue());
        }
        // the TreeMap will print in order of sorted

    }
}
