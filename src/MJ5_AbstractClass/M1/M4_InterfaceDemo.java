package MJ5_AbstractClass.M1;

// we came up with writer class
abstract class Writterr {
//    public void write() { }
    public abstract void write();
}

class Penn extends Writterr { // *** if pen wants to extend one more class then we have to use Interface
    public void write() {
        System.out.println("I am Pen!!");
    }
}

class Pencill extends Writterr {
    public void write() {
        System.out.println("I am Pencil!!");
    }
}

class Kit {
    //    public void doSomthing(Penn p) {
//        p.write();
//    }
    public void doSomthing(Writterr p) {
        p.write();
    }
}

public class M4_InterfaceDemo {
    public static void main(String[] args) {
      /*  Kit k = new Kit();
        // k.doSomthing(p); // error in order to do something we will have to create an Object of a Pen
        Penn p = new Penn();
        p.write();

        Pencill pc = new Pencill();
        pc.write(); // since we have no used extend we have to create every object when we call the method*/

        // there create a writter class
        // use the reference of Writter and create different objects

        Writterr p2 = new Penn();
        Writterr p1 = new Pencill();
        p1.write();
        p2.write();

        /**
         * Since Java doesnt except multiple inheritance therefore we use interface
         *
         */

    }
}
