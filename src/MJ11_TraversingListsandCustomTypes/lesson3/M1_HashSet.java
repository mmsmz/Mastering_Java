package MJ11_TraversingListsandCustomTypes.lesson3;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class M1_HashSet {
    public static void main(String[] args) {
  /*      HashSet<Integer> vals = new HashSet<Integer>();
        //  ** HashSet prevents from entering duplicate values and it does't maintain an order.
        // ArrayList managers the order of inserted values but the HashSet doesn't manage that
        vals.add(10);
        vals.add(43);
        vals.add(15);
        vals.add(67);
        vals.add(43);

        for (Integer value: vals){
            System.out.print(value + " "); //67 10 43 15  // no order here
        }
        System.out.println();*/
// ----------------------------------------------------------------------------------------------------------------------1
/*        HashSet<String> values = new HashSet<String>();
        values.add("Random");
        values.add("Animals");
        values.add("People");
        values.add("Random");
        values.add("Random");

        for (String value: values){
            System.out.print(value +  " " ); // outputs with an order : Animals Random People
        }
        System.out.println();*/
//-----------------------------------------------------------------------------------------------------------------------2

        //  *** ** if you want the order to be maintained use the "LinkedHashSet"
        LinkedHashSet<String> valuess = new LinkedHashSet<String>();
        // this orders as inserted and it doesn't allow duplicate values
        valuess.add("Random");
        valuess.add("Animals");
        valuess.add("People");
        valuess.add("People");
        valuess.add("Zoo");
        valuess.add("Random");
        valuess.add("Car");

        // System.out.println(valuess); // output : [Random, Animals, People, Zoo, Car]
        for (String value: valuess){
            System.out.println(value);
        }


    }
}
