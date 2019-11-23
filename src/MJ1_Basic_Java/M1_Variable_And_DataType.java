package MJ1_Basic_Java;

public class M1_Variable_And_DataType {

    public static void main(String[] args) {

        int x; // declaration
        x = 34; // assigning
        System.out.println(x);

        x = 26;
        System.out.println(x);

        x = x + 24;
        System.out.println(x);

        String words;
        words = "This is a sentence";
        System.out.println(words + " and more data");

        // we can also assign and declare in the same line as well.
        int x1 = 34; // declaration & assigning
        String words2 = "sentence "; // declaration & assigning


        byte byteNumber = 127;
        // byte --->  -128 to 127  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> 1 byte  ->>>>>>>>>> 8 bits
        short shortNumber = 32_767;
        // short --> -32_768 to 32_767 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> 2 bytes ->>>>>>>>>> 16 bits
        int intNumber = 2_147_483_647;
        // int ----> -2_147_483_648 32_768 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> 4 bytes ->>>>>>>>>> 32 bits
        long longNumber = 9_223_372_036_854_775_807l;
        // long -------> -9_223_372_036_854_775_808l 32_768 >>>>>>>>>>>>>>>>>> 8 bytes ->>>>>>>>>> 64-bits
        float floatNumber = 340_282_346_638_528_860_000_000_000_000_000_000_000.000000F;
        // float --> 340_282_346_638_528_860_000_000_000_000_000_000_000.000000F >>> 4 bytes ->>>> -bits
        double doubleNumber = 1.79769313486231570E+308;
        // double is a default datatype for decimal value ----->>>>>>>>>>>>>>>>>>>>> 8 bytes ->>>> -bits
        // 	double Stores fractional numbers. Sufficient for storing 15 decimal digits
        char charletter = '%';
        // char	2 bytes
        // only takes the single character here!!! 	Stores a single character/letter or ASCII values
        // American Standard Code Information Interchange (ASCII)

        boolean bool = true; // 1 bit
        if(bool==false){
            System.out.println("no false");
        }




    }
}
