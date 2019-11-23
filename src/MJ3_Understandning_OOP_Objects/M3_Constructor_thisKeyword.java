package MJ3_Understandning_OOP_Objects;

class Calcul {
    int num1;
    int num2;// number1 and number2 are instance variables
    int result;
//
//    public Calcul(int number1 , int number2) { // number1 and number2 are local variables
//        num1 = number1;
//        num2 = number2; // num is blue color
//    }

    public Calcul(int num1, int num2) { // number1 and number2 are local variables
//        num1 = num1;
          // 0 = 4
//        num2 = num2;
          // 0 = 5
        this.num1 = num1;
        this.num2 = num2;
        // specifying that this num1 is not a local variable and its a instance variable
        // therefore use this keyword
    }
}

public class M3_Constructor_thisKeyword {
    public static void main(String[] args) {

        Calcul obj = new Calcul(4,5);
        System.out.println(obj.num1);
        System.out.println(obj.num2);

    }
}