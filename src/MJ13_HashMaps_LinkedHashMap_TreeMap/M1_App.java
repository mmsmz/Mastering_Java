package MJ13_HashMaps_LinkedHashMap_TreeMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class M1_App {
    public static void main(String[] args) {
        // HashMap & LinkedHashMap
       // HashMap<String,String> dictionary = new HashMap<>();
        //LinkedHashMap<String,String> dictionary = new LinkedHashMap<>();
        TreeMap<String,String> dictionary = new TreeMap<>();
        dictionary.put("MN0001","Ruby");
        dictionary.put("MN0003","Sapphire");
        dictionary.put("MN0002","Star");
        dictionary.put("MN0004","Blue");
        dictionary.put("MN0005","Thread");
        dictionary.put("MN0006","Red");
        dictionary.put("MN0004","Bluexx updated");

//        for (String mylist : dictionary.keySet()){
////           // System.out.println(mylist);
////            System.out.println(dictionary.get(mylist));
////        }

//        for (String mylist : dictionary.values()) {
//             System.out.println(mylist);
//        }
        // to loop them together we must know whats an entry set is !!
        for (Map.Entry<String,String> entry: dictionary.entrySet()){
            // System.out.println(entry);
            System.out.println(entry.getKey() + " " +entry.getValue());

        }

    }
}
