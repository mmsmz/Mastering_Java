package MJ17_Concurrency_MultiThreading_1;

public class M6_MT_Join_OR_isAlive_method {
    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread(() ->
        {
            for (int i = 0; i < 5; i++) {
                System.out.println("HI");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i <5 ; i++) {
                System.out.println("Hello!!");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }
        });
        t1.start();

        try{Thread.sleep(10);} catch (Exception e){}
        t2.start();

        System.out.println(t1.isAlive());
        t1.join();
        t1.join();
        System.out.println(t1.isAlive()); // using this we can check wether the thread is in running state or not
        System.out.println("Bye"); // you will get this after Hi and why is do we get it?
    }
}
