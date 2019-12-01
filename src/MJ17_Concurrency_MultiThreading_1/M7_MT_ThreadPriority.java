package MJ17_Concurrency_MultiThreading_1;

public class M7_MT_ThreadPriority {
    public static void main(String[] args) throws Exception{
        Thread t1 = new Thread(() ->
        {
            for (int i = 0; i < 5; i++) {
                System.out.println("HI" + Thread.currentThread().getPriority());
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }
        },"Hi Thread");

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello!!");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }
        },"Hello Thread"); // we can also name the thread here!!
        // we can change the below name of (Thread-0)
//        t1.setName("Hi");
//        t2.setName("Hello");
        // another wy when we create a Thread it will ask for two parameters


//        System.out.println(t1.getName()); // output: Thread -0
//        System.out.println(t2.getName()); // output: Thread -1

//        t1.setPriority(1);
//        t2.setPriority(10); update the following to instantce of thread

        t1.setPriority(Thread.MIN_PRIORITY);
        t1.setPriority(Thread.MAX_PRIORITY);
        // Thread Priority - and the range is between 1 to 10
        System.out.println(t1.getPriority());  // output: 5
        System.out.println(t2.getPriority()); // output: 5

        t1.start();
        try {
            Thread.sleep(10);
        } catch (Exception e) {
        }
        t2.start();



        System.out.println(t1.isAlive());
        t1.join();
        t1.join();
    }
}
