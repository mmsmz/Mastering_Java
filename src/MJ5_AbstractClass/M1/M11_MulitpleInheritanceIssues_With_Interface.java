package MJ5_AbstractClass.M1;

interface Dem{
    default void show(){
        System.out.println("in Dem");
    }
}
interface MyDem{
    default void show(){
        System.out.println("in MyDem");
    }
}

class CallDem implements Dem, MyDem{ // Error : Ambiguity problem which method to call
    public void abc() {
        System.out.println("in CallDem abc");
    }
    // to solve the error *** "one way" is create a method inside this class itself
//    public void show(){
//        System.out.println("In CallDem show");
//    }

    // to solve the error *** "second way" ctrl+space select @Override
    @Override
    public void show() {
        Dem.super.show();//enter which super to call Dem or MyDem
    }
}
public class M11_MulitpleInheritanceIssues_With_Interface {
    public static void main(String[] args) {
        Dem obj = new CallDem();
        obj.show();
    }
}
