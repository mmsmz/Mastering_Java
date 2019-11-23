package MJ5_AbstractClass.M1;

class A1 {
    public void show() {
        System.out.println("in A1 Show!!");
    }
}

//class B1 extends A1{
//    public void show(){
//        System.out.println("in B1 Show!!");
//    }
//}

public class M7_AnonymousDemo {
    public static void main(String[] args) {
//        A1 a1 = new A1();
//        a1.show(); // output: in A1 Show!!
    //    A1 a1 = new B1();
     //   a1.show(); // output: in B1 Show!!

        A1 a1 = new A1(){ // now this class doesnt have a name and its called anonymous class
                            public void show(){
                                System.out.println("in B1 Show!!");
                             }
                        };
        a1.show(); // This show is not calling the class A it is calling the anonymous class
        // ** If your intention is to use a class one time then use anonymous class
        // This will override the method and uses the "in B1 Show!!"

        // ** we can create an anonymous class by specifying the object and then the implementation of it.

    }
 }

