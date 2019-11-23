package MJ3_Understandning_OOP_Objects;

class Outter {
     int a;
     public void show() {
    }

    // **** we can have static variable, method and a static class as well
     class Inner { // name of this class will be Outter$Inner.class
        public void display() {
            System.out.println("In Display");
        }
    }

}

public class M7_InnerDemo {

    //variable and methods and also class
    public static void main(String[] args) {
        Outter obj = new Outter();
        obj.show();

        // in order to access the inner class we have use the Outter.Inner class as :
        Outter.Inner obj1 = obj.new Inner();
                        //= in order to create an object of the inner class we have to use object of the Outter class
        obj1.display();

        // why we create a inner class
        // ---------------------------
        // if we want to use the inner class only because we are using the Outter class

    }
}
