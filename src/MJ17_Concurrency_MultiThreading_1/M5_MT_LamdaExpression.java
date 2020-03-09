package MJ17_Concurrency_MultiThreading_1;

//class HHii implements Runnable {
//    public void run(){
//        for (int i = 0; i <5 ; i++) {
//            System.out.println("HI");
//            try{Thread.sleep(1000);} catch (Exception e){}
//        }
//    }
//} // since we are using only one method in the HHii class we can put the method as an anonymous class in while creating an reference

//class HHelloo implements Runnable {
//    public void run(){
//        for (int i = 0; i <5 ; i++) {
//            System.out.println("Hello!!");
//            try{Thread.sleep(1000);} catch (Exception e){}
//        }
//    }
//}


public class M5_MT_LamdaExpression {
    public static void main(String[] args) {
//        Runnable obj = new Runnable() {
//                                public void run(){
//                                    for (int i = 0; i <5 ; i++) {
//                                        System.out.println("HI");
//                                        try{Thread.sleep(1000);} catch (Exception e){}
//                                    }
//
//                                }
//                          };
//        Runnable obj1 = new Runnable() {
//                            public void run(){
//                                for (int i = 0; i <5 ; i++) {
//                                    System.out.println("Hello!!");
//                                    try{Thread.sleep(1000);} catch (Exception e){}
//                                }
//                            }
//                         };


//        Runnable obj = () ->
//                    {
//                        for (int i = 0; i < 5; i++) {
//                            System.out.println("HI");
//                            try {
//                                Thread.sleep(1000);
//                            } catch (Exception e) {
//                            }
//                    }
//                    };
//        Runnable obj1 = () -> {
//                        for (int i = 0; i <5 ; i++) {
//                            System.out.println("Hello!!");
//                            try {
//                                Thread.sleep(1000);
//                            } catch (Exception e) {
//                            }
//                        }
//                        };
        // since we are running the obj and obj1 only once we can simply the code further as below
        //obj.start();
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

    }
}
