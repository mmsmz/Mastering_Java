package MJ6_StringClass_AND_LOOPS_AND_Break_Continue_Statement;

public class M0_StringPractice {
    public static void main(String[] args) {
      /*  String a = "Hello";
        System.out.println(a.length()); // 5
        // string is a sequence of characters

        String a1 = "Hello    /-/**--][\';/. "; // even the space is known as characters
        System.out.println(a1.length()); // 23
        */

      //------------------------------------------
      /* String str = "ABCDEFG";
        //System.out.println(str.charAt(0)); // A
        //str.length(); // 7 characters
        String extractedSting =   str.substring(1); // it skips the first two character and prints the rest
        System.out.println(extractedSting); // BCDEFG

        //  if we want to print value from C to F only
        String exString2 = str.substring(2,6 );
        System.out.println(exString2);*/
        String a = "hello"; // string is Object other types such as int, bool, float etx is primitives datatype
        String b = "there";

        if(a=="hello"){
             // this is a trap, don't do this..
        }
        if(a.equals("hello")){
            // use this
        }

        if(a.equals(b)){
            // use this
        }

        // ---------------------------------------
        // indexOf(String s)
        // it starts from left to right
      /*  String str1 = "Hello there yogi";
        int inNum = str1.indexOf("there"); // t is in 6 index
        System.out.println(inNum);

        //---------------------------------------
        String str2 = "Hello there yogi there"; // if there is another there after yogi
        int inNum1 = str2.indexOf("there",7);
        //int inNum1 = str2.indexOf("there",0); 0 means it will be start from the begining and it is set default as zero
        System.out.println(inNum1);

        //---------------------------------------------------
        // lastIndexOf
        // this will start from right to left
        String str3 = "Hello there yogi there";
        int inNum3 = str3.lastIndexOf("yogi");
        System.out.println(inNum3); // 12*/

        // lastIndexOf
        // this will start from right to left
        /*String str4 = "Hello yogi there there";
        int a1 = str4.indexOf("yogi");
        int b1 = str4.lastIndexOf("yogi");
        System.out.println(a1); // left to right = 6
        System.out.println(b1); // right to left = 6
        */

        // and if
        String str4 = "Hello yogi there yogi there";
        int a1 = str4.indexOf("yogi");
        int b1 = str4.lastIndexOf("yogi");
        System.out.println(a1); // left to right = 6
        System.out.println(b1); // right to left = 17
    }
}
