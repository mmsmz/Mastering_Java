package MJ22_FeatureOfJava8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class JF1_Foreach {
    public static void main(String[] args) {
        //https://www.journaldev.com/2389/java-8-features-with-examples#iterable-forEach
      /*   - forEach() method in Iterable interface
           - default and static methods in Interfaces
           - Functional Interfaces and Lambda Expressions
           - Java Stream API for Bulk Data Operations on Collections
           - Java Time API
           - Collection API improvements
           - Concurrency API improvements
           - Java IO improvements
           - Miscellaneous Core API improvements*/

        //creating sample Collection
        List<Integer> myList = new ArrayList<Integer>();
        for(int i=0; i<10; i++) myList.add(i);

        //traversing using Iterator
        Iterator<Integer> it = myList.iterator();
        while(it.hasNext()){
            Integer i = it.next();
            System.out.println("Iterator Value::"+i);
        }

        myList.forEach(new Consumer<Integer>() {

            public void accept(Integer t) {
                System.out.println("forEach anonymous class Value::"+t);
            }

        });
//traversing with Consumer interface implementation
        MyConsumer action = new MyConsumer();
        myList.forEach(action);
    }
}
//Consumer implementation that can be reused
class MyConsumer implements Consumer<Integer>{

    public void accept(Integer t) {
        System.out.println("Consumer impl Value::"+t);
    }
}