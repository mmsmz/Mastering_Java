package MJ5_AbstractClass.M1;

// we use static methods in Java 8 within interface
// we can have absract method, default method and static method but can we have variables

interface Demmo {
    int num =8; // *** we can create a variable but by default this will be constant which is final
    void abc();

    //    default void show(){
//        System.out.println("hi");
//    }
    static void show() {
        System.out.println("hi");
    }
}

class ImpDemo implements Demmo{
    public void abc(){
        // num = 9; // since its final variable we cannot update
    }

}


public class M12_StaticMethod_in_Interface {
    public static void main(String[] args) {
        // to call this method we dont need to create an object
        Demmo.show();
    }
}

