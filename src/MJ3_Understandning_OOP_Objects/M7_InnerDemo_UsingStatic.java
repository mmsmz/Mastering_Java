package MJ3_Understandning_OOP_Objects;

class Outterr {
    int a;
    public void show() {
    }

    // **** we can have static variable, method and a static class as well
    static class Innerr {
        public void display() {
            System.out.println("In Display");
        }
    }

}

public class M7_InnerDemo_UsingStatic {
    public static void main(String[] args) {
        Outterr obj = new Outterr();
        obj.show();


//      Outterr.Innerr obj1 = obj.new Innerr();
        // but in order to create an object of inner class
        //obj1.display();

        Outterr.Innerr obj1 = new Outterr.Innerr(); // but when it comes to constructor we have to use only the class name and
        // no need for an object here!!

        System.out.println(obj1);

        /*
         * Inner class
         * Member class -> normal class without a static keyword it is a Member class
         * Static class ->
         * Anonymous class ->
         *
         */


    }
}
