package MJ13_HashMaps_LinkedHashMap_TreeMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class M1_HashMap_AND_LinkedHashMap {
    public static void main(String[] args) {
        // HashMap & LinkedHashMap
/*        HashMap<String, String> dictionary = new HashMap<>();
        dictionary.put("MN0001", "Ruby");
        dictionary.put("MN0003", "Sapphire");
        dictionary.put("MN0002", "Star");
        dictionary.put("MN0004", "Blue");
        dictionary.put("MN0005", "Thread");
        dictionary.put("MN0006", "Red");
        dictionary.put("MN0004", "Bluexx");*/
        // <Key , values >

        //  for (String mylist : dictionary.keySet()) { // we need to invoke the .keySet() that we are looping over
        //      System.out.print(mylist + " "); //MN0005 MN0006 MN0003 MN0004 MN0001 MN0002
        //  }

      /*  for (String mylist : dictionary.keySet()) { // we need to invoke the .keySet() that we are looping over
            // System.out.println(mylist); // as above
            // System.out.println(dictionary.get(mylist)); MN0005 Thread // displays both
            // System.out.println(mylist + " " + dictionary.get(mylist));
        }*/

//        for (String mylist : dictionary.values()) {
//             System.out.print(mylist + " "); // output : Thread Red Sapphire Bluexx updated Ruby Star
//        }

// ------------------------------------------------------------------------------------------------------------------ 1
        LinkedHashMap<String, String> stocks = new LinkedHashMap<>();
        stocks.put("MN0001", "Ruby");
        stocks.put("MN0003", "Sapphire");
        stocks.put("MN0002", "Star");
        stocks.put("MN0004", "Blue");
        stocks.put("MN0005", "Thread");
        stocks.put("MN0006", "Red");
        stocks.put("MN0004", "Bluexx");

//        for (String val : stocks.keySet()){ //
//            System.out.println(val + " " + stocks.get(val)); // get the value of Key of Value
//        }

        //****  to loop them K and V together we must know whats an entryset() is !!
        for (Map.Entry<String, String> entry:stocks.entrySet() )
        {
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        // the LinkedHashMap will print in order as sorted
    }
}
