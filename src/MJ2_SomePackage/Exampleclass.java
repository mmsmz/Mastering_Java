package MJ2_SomePackage;

import MJ2_MethodsandClasses.MyUtils;

public class Exampleclass {
    public static void doSomthing(){
        MyUtils.add10(90); // this is working here because the package is called over here !!!!
        // now excercise
        // invoke this doSomthing method in the Earth method
        // invoke means call that method inside another class
        System.out.println("in the exampleclass");
    }
}
