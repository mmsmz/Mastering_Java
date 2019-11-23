package MJ2_MethodsandClasses;

// We can use Final Keyword at three places
// 1. Final keyword with Variable
// 2. Final keyword with Methods
// 3. Final keyword with Class

class A{
    final int DAY; // *** final variable and use the variable as capital letter
    public A() {
        DAY = 10;
        //  i = 10; now we cannot change the value because after using final its constance
    }
    public final void show(){
        System.out.println("in show!");
    }
}
//final class  B{
//    public void show(){
//        System.out.println("in show!");
//    }
//}
// *** final class used if you dont want to extend any class
//class  C extends B{ // since B class is final C cannot extend it
//
//}

//class  B extends A {
//    public void show(){ // error:
//  error : since show() is extend from class A we cannot not use the same method because it is Final method
//        System.out.println("in show!");
//    }

public class M2_FinalKeyword {
    public static void main(String[] args) {
//        A obj = new A();
//        System.out.println(obj.i);

    }
}
