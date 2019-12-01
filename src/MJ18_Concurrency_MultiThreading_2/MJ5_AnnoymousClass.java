package MJ18_Concurrency_MultiThreading_2;

public class MJ5_AnnoymousClass {
    public static void main(String[] args) {
        System.out.println("Starting Thread 1");
                                // another way is inside this constructor class i can define an anonymous class of
                                // Runnable and we are not going to need the argument
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("The number is " + i + " - " + Thread.currentThread().getName());
                    // we can slow down the loop by below :
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t1.run();

        System.out.println("Starting Thread 2");
//        Thread t2 = new Thread(new Tasks("Task-B"));
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("The number is " + i + " - " + Thread.currentThread().getName());
                    // we can slow down the loop by below :
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t2.run();
    }
}

