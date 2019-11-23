package MJ2_MethodsandClasses;

public class MyUtils {

    public static void printSomeJunk(){
        System.out.println("Some Blah Blah Blah");
    }
    public static void printSomeJunk(String a){
        System.out.println(a + " Welcome Back"); // apending "a" memthod here
    }
    public static void printSomeJunk(int i){
        System.out.println(i + " integer passed in "); // apending integer "i"
    }


    public static void sum2Numbers(int fNum, int secNum){
        System.out.println( "Total sum is : " + fNum + secNum); // output : 1020
        System.out.println( "Total sum is : " + (fNum + secNum)); // output : 30
    }

    public static int add10(int someArgument){
       int  result = someArgument  + 10;
       return result; // void method cannot return a value
    }

    public static String printSomeJunkNew(String a){
            String name = "Hi " + a;
            return name;
    }

    // we can reference these above method directly by using the Class name because we have use the static

    // this following method doesn't belong to this Class directly it belongs to the instance of this Class

    public int resultNum(int number){
        return number;
    }


}
