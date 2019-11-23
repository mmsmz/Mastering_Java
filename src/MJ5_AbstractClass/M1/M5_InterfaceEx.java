package MJ5_AbstractClass.M1;

//abstract class Writterrr {
interface Writterrr {
    //    public void write() { }
    //public abstract void write(); // ** we don't have to mention public and abstract here their by default in the interface
    void write();
    // public void readd(){} // error we cannot define
}
class abc{

}

class Pennn extends abc implements Writterrr { // *** instead of using extends what if we create an interface
    // we can extend one class but we can extend any amount of interfaces
    public void write() {
        System.out.println("I am Pen!!");
    }
}

class Pencilll implements Writterrr {
    public void write() {
        System.out.println("I am Pencil!!");
    }
}

class Kitt {
    //    public void doSomthing(Penn p) {
//        p.write();
//    }
    public void doSomthing(Writterrr p) {
        p.write();
    }
}

public class M5_InterfaceEx  {
    public static void main(String[] args) {
        Writterrr p2 = new Pennn();
        Writterrr p1 = new Pencilll();
        p1.write();
        p2.write();

        /**
         *Difference between abstract and interface
         *
         * in abstract class we can have abstract methods and also we can have normal methods
         *      // abstract class we can define and declare methods
         * in the interface we can have all the methods of abstract but we cannot define any method
         *      // interface we cannot define any method, we can only define.
         *
         */

        // note : we cannot create an object of an interface we can only create a reference of it
        // we can achieve multiple inheritance by implementing multiple interface but we cannot extend multiple classes
        // all the methods in the interface is by default public and abstract
        // mostly use interface but if you want to define any methods use abstract classes
        // interface is same like abstract class but we cannot define any methods

        // Writterrr writterrr = new Writterrr(); // error!!
        Writterrr writterrr = new Pencilll(); // correct!!
    }
}

