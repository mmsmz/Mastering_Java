package MJ3_Understandning_OOP_Objects;

class Casiono {
    int num1;
    int num2;
    String operation;
    public Casiono(){
        num1 = 0;
        num2 = 0;
        operation = "nothing";
    }
    public Casiono(int p){
        num1 = p;
        num2 = 0;
        operation = "nothing";
    }
    public Casiono(int l,int h){
        num1 = l;
        num2 = h;
        operation = "nothing";
    }
    public Casiono(int l, int h, String op){
        num1 = l;
        num2 = h;
        operation = op;
    }
    // having multiple constructors with same name but different parameters is called constructor overloading
}

public class M5_Constructor_Overloading {

    public static void main(String[] args) {
        Casiono obj = new Casiono(6,6,"ADD");
    }
}
