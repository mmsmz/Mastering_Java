package MJ5_AbstractClass.M1;

interface Abcs {
    void show();
}

//class Imp implements Abcs {
//    public void show() {
//        System.out.println("anything!!");
//    }
//} // instead of this we can initiate it within the object itself.

public class M8_AnonymousClassWithInterface {
    public static void main(String[] args) {
//        Abcs obj = new Imp();
//        obj.show();

        // here we cannot create an object of interface
        // Abcs obj = new Abcs(); // error

        // but we can create an object if we  initailize an anonymous class
        Abcs obj = new Abcs(){
            public void show()
                            {
                              System.out.println("anything!!");
                            }
                        }; // this is how we use anonymous class to instanciate the interface
        obj.show();

        // the advantages of anonymous class
        // it will not take much of a memory
        // if you are not going to use a anonymous class then use show();
        // ww dont need to create a new class for anonymouse class we can use it with the new Abcs object
    }
}
