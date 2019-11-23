package MJ4_ClassInheritance;

class Ax {
    public void show() {
        System.out.println("In Ax");
    }
}
class Bx extends Ax{
    public void show() {
        System.out.println("In Bx");
    }
    public void config() {
        System.out.println("In Bx Config");
    }// we cannot access config()  because is not available in Ax class
}

class Cx extends Ax{
    public void show() {
        System.out.println("In Cx");
    }
}
public class M5_DynamicMethodDispatch {
    // compile time polymorphism and run time polymorphism
    public static void main(String[] args) {
    // create a reference of Ax and a object of Bx
        Ax obj1 = new Bx(); // this will be linked with Ax and Bx only in the "runtime polymorphism"
        obj1.show(); // which show method to call will be decided only at runtime.
        // obj1.config();error

        obj1 = new Cx();
        obj1.show();// once you change the object it changes the metod and its called as "Dynamic method Dispatch"


    }
}
