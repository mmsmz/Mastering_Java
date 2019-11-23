package MJ6_StringClass_AND_LOOPS_AND_Break_Continue_Statement;

public class M4_ForLoop {
    public static void main(String[] args) {
        // print the string as a pacific character

        String name = "Mohamed Arafath";
        /*for (int i = 0; i <= name.length()-1 ; i++) {
            System.out.println("Char" + name.charAt(i));
        }*/

        // task to print the chracter starting from h to M
        /*for (int i = name.length()-1; i >= 0 ; i--) {
            System.out.println("Char : " + name.charAt(i));
        }*/


        // task to print all numbers between 0 to 100
        /*for (int i =0; i <=100 ; i=i+2) { //i+=2
            System.out.println(i);
        }*/

        // task to print all even characters from string between the strings
        for (int i =0; i <=name.length()-1; i++) {
            if(i%2==1){ // odd will print even
                System.out.println(i + ". " + name.charAt(i));
            }
        }


    }
}
