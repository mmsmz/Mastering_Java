package MJ10_CollectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;

public class M2_Appliction {
    public static void main(String[] args) {
/*
        ArrayList word = new ArrayList();
        word.add("Hello"); //0
        word.add("There"); // 1
        //word.remove(0);
        word.add(10);      //2
        word.add(9);      //3
        word.add(12.00);
        word.add('H');*/

//        String itm1 =  (String) word.get(2); // java.lang.Integer cannot be cast to java.lang.String
//        String itm2 =  (String) word.get(3);
//        System.out.println(itm1 +itm2); ** this will not work because we are passing a string value

//        Object itm1 =  word.get(2);
//        Object itm2 =  word.get(3);
//        System.out.println(itm1 + itm2); // we also cannot apply to object

//        int itm1 =  (int)word.get(2); // had to cast it because its an int value which is added in the arraylist
//        int itm2 =  (int) word.get(3);
//        System.out.println(itm1 +itm2); // ouput : 19  this will print because we are reading an interger value

// ---------------------------------------------------------------------------------------------------------------- 1
        // Java 5 introduced a concept of Generics which deals with collection more easier.

        ArrayList<String> words = new ArrayList<String>(); // type safety if we use <String>
        words.add("Hello");
        words.add("There");
        //words.add(10); // this shows an error because we cannot store integer value
        words.add("10");
        //words.removeFirst(); // removeFirst() method is not available here

        String item1 = words.get(2);
        System.out.println(item1); // output : 10
        System.out.println();

        LinkedList<Integer> numbers = new LinkedList<Integer>();
        // we have wrapper class Integer and we cant use primitive datatype example such as int, float, double

        numbers.add(100); // this value will be removed because of removeFirst();
        numbers.add(200);
        numbers.add(45);
        numbers.add(1000);
        numbers.removeFirst(); // remove the 100

        System.out.println("the zeroth index is : " + numbers.get(0)); // since the value 100 is remove,
                                                                        // it will move the entire array to zeroth index.
        for (int number : numbers){ // we can use for-each to iterate with array or linked lists
            System.out.println(number); // output: 200,45,1000
        }

    // ArrayList basically using an array in the implementation whereas the LinkedList using node objects
        //  ArrayList is a resizable array and the LinkedList is a bunch of nodes that are linked together
    // ** refer how practical data structures and algorithms to study more..

                    // How it is implemented under the hood
                    //-------------------------------------
        // ArrayList
        // ArrayList is a resizable array but you might think because when we create an array we cant change the number of slots and its correct
        // but the way that ArrayList is implemented its default starting size is array is 10 slots
        // and when we add 11 element into the slot the size of array slots will double to 20 slots by creating new array
        // and when we add 21 element into the slot the size of array slots will double to 40 slots by creating new array
        // basically it will enhances the size of array

        // LinkedList
 /* The LinkedList has a sort of  like, imagine you have a train with a different box carts connected together
    with links and that's exactly how to envision this LinkedList data structure. When we need to add more data
    all it does is attaches a new cart at the end of the train and continues to do that and it's pretty dynamic. */

 /* So the LinkedList data structure is actually better for manipulating the data compared to the ArrayList you see
  when you want to remove something from the beginning of the ArrayList, all of the items that follows will be copied back
  to the zeroth index position back one slot over a LinkedList uses something called a
  doubly LinkedList data structure which you can review. */

// ** But basically the LinkedList is faster for manipulating and Arraylist faster for retrieving data to retrieve values from a LinkedList.
// ** It would have to be traversed completely to find the particular element whereas an ArrayList much faster retrieval
// you just give the index position and there is no traversal. It just immediately goes to the particular slot and gives us that data.

//So LinkedList is faster for manipulation but slower for retrieval.
//The ArrayList is faster for retrieval but slower for data manipulation because you'd have to create a new arrays as you add data.
    }
}
