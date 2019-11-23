package MJ5_AbstractClass.M1;

abstract class Writter{
    public abstract void read(int i);
    public abstract void read(double i);

}
class Pen extends Writter{
    public void read(int i) {
        System.out.println("Reading the Pen int ");
    }
    public void read(double i){
        System.out.println("Reading the Pen double ");
    }
}
class Pencil extends Writter{
    public void read(int i) {
        System.out.println("Reading the Pen int ");
    }
    public void read(double i) {
        System.out.println("Reading the Pencil double");
    }

}

public class M3_AbstractEx {
    public static void main(String[] args) {
        // Writter p1 = new Writter(); // error : abstract class cannot be instantiated
//        Writter p1 = new Pen();
//        p1.read();
//        p1 = new Pencil();
//        p1.read();

        Writter p1 = new Pencil();
        p1.read(2.3);


    }
}
