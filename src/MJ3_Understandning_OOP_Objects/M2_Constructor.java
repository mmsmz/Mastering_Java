package MJ3_Understandning_OOP_Objects;

class A {
    int i; // by default i is 0
    float f; // by default i is 0.0
    // 1. Constructor is a member methods
    // 2. It has the same name as class name
    // 3. Constructor will never return anything
    // 4. It will be used to allocate memory
    // 5. Every time when we create an object it will call the constructor, it will be called automatically...
    public A(){ // default Constructor
        // if i want to provide an initial value to the i and f
        i = 5;
        f = 5.5f;
        System.out.println("hi");
    }

    public A(int k){
        System.out.println("Second Hello");
    }
    // Having Constructor with different parameters is called Constructor Overloading

    public A(int k, float s){
        System.out.println("Second Hello");
    }
}
public class M2_Constructor {


    public static void main(String[] args) {
         A obj = new A();
        // obj is the reference
        // we use new to create a object of a class which provides space and that space will be in the Heap Memory


        A obj1 = new A(1);
        A obj2 = new A(1,5.5f);
    }
}
