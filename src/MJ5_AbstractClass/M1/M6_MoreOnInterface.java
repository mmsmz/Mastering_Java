package MJ5_AbstractClass.M1;

// *** reason to use interface is to achieve generalization

interface ABC {
    void show();
}

class Implementor implements ABC{
    public void show(){
        System.out.println("anything");
    }
}
public class M6_MoreOnInterface {
    public static void main(String[] args) {
           /*
           * First create an interface and create all the methods
           * */

           // we cannt create a object of interface
        // ABC bc = new ABC(); error cannot create an object because no constructor in the interface
        ABC bc; // we can create only th reference of the interface
        // bc.show(); error becase bc is not initialized

        // using Implementor we can call show()
        bc = new Implementor();
        bc.show();
        //    ABC bc = new Implementor();
    }
}
