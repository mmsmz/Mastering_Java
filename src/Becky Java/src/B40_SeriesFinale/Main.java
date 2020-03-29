package B40_SeriesFinale;

public class Main {
    public static void main(String[] args) {

        String a = "apples";
        String b = "bucky";
        String c = "BUCKY";
        System.out.println(a.length());

        if(a.equals("apples")){
            System.out.println("yes it is apples!!");
        }

        if(b.equals(c)){
            System.out.println("this matches");
        }

        if(b.equalsIgnoreCase(c)){
            System.out.println("this matches ignores the cases");
        }
    }
}
