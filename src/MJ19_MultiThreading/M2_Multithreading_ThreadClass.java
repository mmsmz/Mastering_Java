package MJ19_MultiThreading;

import javax.sound.midi.Soundbank;



class MyThread extends Thread {
    int[] values = {6,5,1,7,8};
    public void run(){
        for (int i= 0; i<5; i++){
            values[i] = values[i]*2;
            System.out.println(values[i]);
        }
    }
}

public class M2_Multithreading_ThreadClass {
    public static void main(String[] args) {
    //*** by default we have a main thread which is one thread !!
        Thread t1 = new MyThread();
        t1.run();
        System.out.println("Good");
    }
}