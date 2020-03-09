package MJ2_MethodsandClasses;

import MJ2_SomePackage.Exampleclass;

public class Main {
    public static void main(String[] args) {

        MyUtils.printSomeJunk();
        MyUtils.printSomeJunk("I'm arafath");
        MyUtils.printSomeJunk(3000);

        MyUtils.sum2Numbers(10, 20);
        MyUtils.add10(90); // this will not print anything to the screen

        int val =  MyUtils.add10(90);
        System.out.println(val); // output is 100 // this will print to the screen

        // adding a value the return value
        int newval =  MyUtils.add10(90) + 100 -50;
        System.out.println(newval); // output is 150


       // String welcomeMsg =  myul1.printSomeJunkNew("Mohamed");
        // System.out.println(welcomeMsg);

        // or can just print using System.out.println
        System.out.println(MyUtils.printSomeJunkNew("Mohamed"));

        // solution
        Exampleclass.doSomthing();

        // to access that method without static keyword will have to create instances of MyUtils
        MyUtils myVar; // i have declared the data
        myVar = new MyUtils(); // now i have assigned the data

        //myVar.resultNum(10); // this is return a value
        int s = myVar.resultNum(10);
        System.out.println(s); // output : 10

    }
}
