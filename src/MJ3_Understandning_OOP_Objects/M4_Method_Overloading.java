package MJ3_Understandning_OOP_Objects;

class Casio {
    public Casio(){

    }
    public Casio(int p){

    }
    public Casio(int l,int h){

    }

    public void add(int i, int j) {
        System.out.println(i + j);
    }
    public void add(int i, int j, int k) {
        System.out.println(i + j);
    }
    public void add(double i, double j) {
        System.out.println(i + j);
    }
    // having multiple methods with same name but different parameters is called method overloading
}

public class M4_Method_Overloading {
    public static void main(String[] args) {
        Casio obj = new Casio();
        obj.add(4,4);
        obj.add(4,4,2);
        obj.add(4.7,4.5);

    }
}
