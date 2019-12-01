package MJ18_Concurrency_MultiThreading_2;

public class MJ3_RenamingtheThreadNames {
    public static void main(String[] args) {

        System.out.println("Starting Thread 1");
        Task2 taskrun = new Task2("Task-A");
        taskrun.start();

        System.out.println("Starting Thread 2");
        Task2 taskrun1 = new Task2("Task-B");
        taskrun1.start();

    }
}

class Task2 extends Thread {
    String name;

    public Task2(String name) {
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
