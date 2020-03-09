package MJ18_Concurrency_MultiThreading_2;

public class MJ1_Thread {
    // how to start a Thread in java
    // creating the first Thread in java Program
    public static void main(String[] args) { // it will start with the main thread first and prints the "The Engineer"
        Task taskRunner = new Task();
        taskRunner.start(); // this is one thread
        System.out.println("The Engineer "); // the main thread is running when we execute this.

        // how to run the taskRunner again
        //   taskRunner.start();  // its illegal we cannot start a thread more than once
        // Note we can do it by creating a new instance of Task taskRunner2
        Task taskRunner2 = new Task();
        taskRunner2.start();// this is one thread
        // * now it prints the both the methods repeating two times
    }
}

class  Task extends Thread{
    public void run(){
        for (int i = 0; i <1000 ; i++) {
            System.out.println("number " + i);
        }
    }

}
