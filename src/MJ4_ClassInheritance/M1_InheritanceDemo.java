package MJ4_ClassInheritance;

// note
// IS-A, HAS-A
// IS-A ->>> example dog IS A animal ->>>>
// HAS-A ->>> when we have a class and when we are going to create a object of that class its is called HAS-A
            // ->>  example bathroom HAS-A Tub

class Calcul{  // super class
    public int add(int i, int j){
        return  i+j;
    }
}

class CalculAdvance extends Calcul{ // sub class // single level inheritance
    public int substract(int i, int j) {
        return i - j;
    }
    public int multiply(int i, int j) {
        return i * j;
    }
}

class CalcuVeryAdv extends CalculAdvance{ // multi level inheritance
    // this class will have details of Calcul and CalculAdvance
    public int division(int i, int j){
        return i/j;
    }
}

public class M1_InheritanceDemo {
    public static void main(String[] args) {
//        Calcul c1 = new Calcul();
//        int result = c1.add(5,4);
//        System.out.println(result);

        CalculAdvance c1 = new CalculAdvance();
        int result1 =  c1.add(5,6);// here we can access methods from super class
        System.out.println(c1.add(5,6)); // 11

        int result2 = c1.substract(10,5);
        System.out.println(result2);



    }
}
