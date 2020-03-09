package MJ21_Common;

public class M7_1_StringBuffer_StringBuilder {
    public static void main(String[] args) {
        // how to filter only number and remove string
        // example
            // 978bv68a667
            // 97868667     - final output should as this

         // by default string is immutable
        // which means when you assigna value to an object the reference the value will the same,
        // incase you want to change this will create a new variable and then it will assign.
        // as below shown example str = str means its referring to new reference.
        String str = "hello"; // now in the string pool we have to objects "one is hello"
        str = str + " World"; // and the other "second one is world"
        // String immutable once assigning a value to an object you cannot change the same object,
            // we have to create a new object. like str = str + "world" .

        // but if you want to change the value of string then use StringBuffer
        // by default String is immutable and StringBuffer and StringBuilder is mutable.
        StringBuffer sb =  new StringBuffer(str);
        sb.append(" world");

        System.out.println(sb );

        // StringBuffer is threadsafe which means we don't have problem with multiple threads.
        // StringBuilder is not thread safe they don't provide synchronization.

    }
}
