package MJ1_Basic_Java;

public class M6_Methods {
    public static void main(String[] args) {
        System.out.println("Data to be Displayed");
        printSomeJunk("I'm arafath");
        printSomeJunk(35);
    }

    public static void printSomeJunk(){
        System.out.println("Some Blah Blah Blah");
    }
    public static void printSomeJunk(String a){
        System.out.println(a + " Welcome Back"); // apending "a" memthod here
    }
    public static void printSomeJunk(int i){
        System.out.println(i + " integer passed in "); // apending integer "i"
    }

}
