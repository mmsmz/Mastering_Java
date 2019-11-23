package MJ1_Basic_Java;

public class M4_ArithmaticOperators_SWITCH {
    public static void main(String[] args) {
    /*    int n = 3;

        switch (n){
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
        default:
            System.out.println("not valid!!!");
        }*/
        // -------------------------------------------------------------------
/*
        char n = 'A';

        switch (n){
            case 'A':
                System.out.println("AAAAAAAAA");
                break;
            case 'B':
                System.out.println("BBBBBBBBB");
                break;
            default:
                System.out.println("not valid!!!");
        }*/
        //------------------------
//
//        double n = 5.5; // ******** we cannot pass double in switch !!!!
//
//        switch (n) {
//            case 2:
//                System.out.println("AAAAAAAAA");
//                break;
//            case 3:
//                System.out.println("BBBBBBBBB");
//                break;
//            default:
//                System.out.println("not valid!!!");
//        }
//-----------------------------------------------------
        String n = "One"; // **** we cannot pass string inside switch below 1.7 and only above 1.7 it works!!

        switch (n) {
            case "One":
                System.out.println("AAAAAAAAA");
                break;
            case "B":
                System.out.println("BBBBBBBBB");
                break;
            default:
                System.out.println("not valid!!!");

        }
    }
}