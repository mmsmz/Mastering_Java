package MJ21_Common;

public class M5_StringSplittingFrom_CSV_comma_sepeated_Values {
    public static void main(String[] args) {
        String str = "Arun, Ajith, Vijay"; // here your string str is immutable where we cannot change the value
        str = "jilla, Ron"; // now this str will create a new value in your string pool

        // mutable is achieved in StringBuffer, StringBuilder
        // immutability is achieved in string class
        String name [] = str.split(",");

        // System.out.println(str);
        System.out.println(name[1]);

    }
}
