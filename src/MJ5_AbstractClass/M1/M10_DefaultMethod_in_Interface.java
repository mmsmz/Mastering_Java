package MJ5_AbstractClass.M1;

// Abstract class -> Define and Declare
// Interace -> declare -> 1.7
// NOTE: but Java 1.8 can define methods in the interface

@FunctionalInterface
        // just to check it i have used this annotation
interface Demo { // Functional interface will only have one abstract method and any amount of default methods
    void abc(); // public abstract void abc();
    default void show() {
        System.out.println("in show!!");
    }
}

class DemoImp implements Demo {
    public void abc() {
        System.out.println("in abc !!");
    }

    public void show() { // checking whether this method is overriding or not
        System.out.println("in New show!!"); // yes it can override which means we can override a default method in the interface Demo
    }

}

public class M10_DefaultMethod_in_Interface {
    public static void main(String[] args) {
        Demo obj = new DemoImp();
        obj.abc();
        obj.show();
    }
}
