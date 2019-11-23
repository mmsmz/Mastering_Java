package MJ19_MultiThreading;

class Counter {
    int count;

    public void increment() {
        count++; // count = count + 1;
    }
}


public class M8_MT_SynchronizedKeyword {
    public static void main(String[] args) throws InterruptedException {

        Counter obj = new Counter();
//        obj.increment();
//        obj.increment();
//        obj.increment(); // count 3

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    obj.increment();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    obj.increment();
                }
            }
        });
//        t1.start();
//        t1.join();
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("count" + obj.count);
    }
}
