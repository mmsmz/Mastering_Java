package MJ6_StringClass_AND_LOOPS_AND_Break_Continue_Statement;

public class M6_NestedLoopsANDDebugger {
    public static void main(String[] args) {
        /*
        int counter = 0;
        for (int i =0; i <=100; i++) {
            System.out.println(i);;
            int temp = counter + 1;
            counter = temp;
        }*/
/*
        for (int idx = 0; idx <100 ; idx++) {
            for (int j = 0; j < 100; j++) {
                for (int i = 0; i < 100; i++) {
                    for (int x = 0; x < 100; x++) {
                        System.out.println("The value is of idx was  " + idx + "-----" + j + "----" + i + "----" + x);
                    }
                }
            }
        }*/

        int counter = 0;
        for (int idx = 0; idx < 1000; idx++) {
            for (int j = 0; j < 1000; j++) {
                System.out.println("The value is of idx was  " + idx + "-----" + j);
                counter++;
            }
        }
        System.out.println("Counter: " +counter);

    }
}
