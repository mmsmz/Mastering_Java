package MJ5_AbstractClass.M1;

abstract class Human {

    public abstract void eat(); // declare a method

    public void walk() { // we can define a method also in the abstract class
        System.out.println();
    }
}
class Man extends Human{ // conrete class
    // now we have to define the eat()
    public void eat(){
        System.out.println("eatting");
    }
}

public class M1_AbractDemo {
    public static void main(String[] args) {

        // Human obj = new Human(); now we cannot create an object
        Human obj = new Man();
        // we can refere Human class and create a object for the Man

    }
}
