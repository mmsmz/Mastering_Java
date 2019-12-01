package MJ17_Concurrency_MultiThreading_1;

class Hi extends Thread{
    public void run(){ // instead of show name it run because we are calling start

        for (int i = 0; i <5 ; i++) {
            System.out.println("HI");
        // if you want to slow the execution process of this object then use the following command
            try{Thread.sleep(1000);} catch (Exception e){}
        // 500 millisecond it will print after .5 (half) a second for each output
        // 1000 millisecond means one second for each output
        }
    }
}

class Hello extends Thread{
    public void run(){
        for (int i = 0; i <5 ; i++) {
            System.out.println("Hello!!");
            try{Thread.sleep(1000);} catch (Exception e){}
        }
    }
}

public class M3_ThreadDemo {
    public static void main(String[] args) {

        Hi obj = new Hi();
        Hello obj1 = new Hello();
        obj.start();
        try{Thread.sleep(10);} catch (Exception e){}
        obj1.start();

//        obj.show();
//        obj1.show();
    }
}
