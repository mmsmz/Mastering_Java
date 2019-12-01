package MJ18_Concurrency_MultiThreading_2;

public class MJ2_StartingThreads {
    public static void main(String[] args) {

        System.out.println("Starting Thread 1");
        Task1 taskrun = new Task1();
        taskrun.start();

        System.out.println("Starting Thread 2");
        Task1 taskrun1 = new Task1();
        taskrun1.start();

    }
}

class Task1 extends Thread {

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
}