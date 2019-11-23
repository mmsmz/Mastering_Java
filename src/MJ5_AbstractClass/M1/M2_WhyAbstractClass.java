package MJ5_AbstractClass.M1;

class Printer {
    //     public void show(Number i){ // Note : Integer or Double or etc extends the Number class
//        System.out.println(i);
//    }
//    // create another method
//    public void show(Double i){
//        System.out.println(i);
//    }
    public void show(Number i) {
        System.out.println(i);
    }

}

public class M2_WhyAbstractClass {
    public static void main(String[] args) {
        Printer obj = new Printer();
        obj.show(5);
        // obj.show(5.5); this will not give 5.5 because we are passing a Integer Value, so create another method
        obj.show(5.5);
    }

    // why we need abstract because
    // 1. We don't want anyone to create an object of an abstract class
    // 2. Instead of using two or more methods we can use only one method as example of Number class
}
