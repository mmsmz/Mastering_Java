package MJ18_Concurrency_MultiThreading_2;

public class MJ4_RunnableInterface {
    public static void main(String[] args) {
//        System.out.println("Starting Thread 1");
//        Task3 taskrun = new Task3("Task-A");
//        Thread t1 = new Thread(taskrun);
//        t1.run();
//
//        System.out.println("Starting Thread 2");
//        Task3 taskrun1 = new Task3("Task-B");
//        Thread t2 = new Thread(taskrun1);
//        t2.run();

        System.out.println("Starting Thread 1");
        Thread t1 = new Thread(new Task3("Task-A"));
        t1.run();

        System.out.println("Starting Thread 2");

        Thread t2 = new Thread(new Task3("Task-B"));
        t2.run();
    }
}

class Task3 implements Runnable{
    String name;

    public Task3(String name) {
        this.name = name;
    }

    public void run() {
        Thread.currentThread().setName(name);
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

