package MJ6_StringClass_AND_LOOPS_AND_Break_Continue_Statement;

public class M3_WhileLoop {
    public static void main(String[] args) {

        //  int count = 0;
        /*while(!(count<=10)){
            System.out.println(count + "I am Arafath");
            count = count +1;
        }*/ // it doesnt get printed

      /*  while(count<=10){
            System.out.println(count + "I am Arafath");
            count = count +1;

            if(count == 5){
                break;
            }
        }*/

        String str = "We have a large inventory of things in out warehouse falling in "
                + "the category:apparel and the slightly "
                + "more in demand category:makeup along with the category:furniture and ..";

        printCategoaries(str);

    }

    public static void printCategoaries(String str) {
        // task is to print the apparel, makeup , furniture

        int x = 0;
        while (true) {
            int findpos = str.indexOf("category:",x);
            // we want the first occurrence of category
            if(findpos == -1)break;
            int start =findpos +9;
            // start of the actual category // 9 is the starting position of the string that we are looking
            int end = str.indexOf(" " , start);
            String printcategory = str.substring(start,end);
            System.out.println(printcategory);
            //x++;
            x = end+1;
        }


    }
}
