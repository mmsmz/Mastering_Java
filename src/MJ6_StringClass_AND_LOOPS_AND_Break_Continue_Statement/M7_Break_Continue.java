package MJ6_StringClass_AND_LOOPS_AND_Break_Continue_Statement;

public class M7_Break_Continue {
    public static void main(String[] args) {
        /*
            for (int i = 1; i <=10 ; i++) {
               System.out.println("value is " + i); // printing upto 10
            }
        */

        /*
        // break if i==7    ->>>>>>>>>>>> this print only upto 6
        for (int i = 1; i <=10 ; i++) {
            if(i==7){
               break;
            }
            System.out.println("value is " + i); // printing only upto 1 to 6
        }
        */


        for (int i = 1; i <=10 ; i++) {
            if(i>3){
                break;
            }
            System.out.println("value is " + i); // printing only upto 1 to 3
        }


        // continue if i==7 ->>>>>>>>>>>> this will skip 7
      /*  for (int i = 1; i <=10 ; i++) {
            if(i==7){
                continue;
            }
            System.out.println("value is " + i); // printing upto 1 to 10 but 7 will not be printed
        }*/




    }
}
