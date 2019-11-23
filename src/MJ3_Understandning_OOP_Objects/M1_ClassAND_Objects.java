package MJ3_Understandning_OOP_Objects;

class Calc {
    int num1;
    int num2;
    int result; // we are here **********
    // here we have not assigned any value therefore we have to call the perform()

    public void perform (){
        result = num1 + num2;
    }
}

public class M1_ClassAND_Objects {
    public static void main(String[] args) {
        Calc obj = new Calc();
        obj.num1 = 3;
        obj.num2 = 7;
        System.out.println(obj.result);//  this is accessing the int result ********
        obj.perform();
        System.out.println(obj.result); // now it returns and prints 10
    }
}
