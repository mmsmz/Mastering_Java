package MJ4_ClassInheritance;

class A{
    int i;
    public A(){
            System.out.println("In A");
        }
    public A(int i){
        System.out.println("In A int ");
    }
}

class B extends A{
    int i;
    public B(){
        super.i=8; // this goes to class A
        // super(); *** even if you don't mention super() here it calls the superclass by default.
        System.out.println("In B");
    }
    public B(int i){
        // super(); again this will call the constructor of super class
      //   super(i); // now it will call the second (int i )constructor
        super(6); // pass in i or a value
        System.out.println("In B int ");
    }
}

public class M4_SuperMethod {
    public static void main(String[] args) {
        // A obj = new A(); // when creating an object of A this call the constructor of A
        // B obj = new B(); // when creating an object of B this call the constructor of A and constructor of B
        // output with the first one method in every class
        // In A
        // In B

        B obj1 = new B(5); // after entering two int methods
        // output with the first one method in every class
        // In A // this will call the default constructor of the class A
        // In B int

        // but what if you want to call the parameterized one in the class A
        // **  then use super keyword

    }
}
