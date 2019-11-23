package MJ5_AbstractClass.Polymophism;

public class Chicken extends Bird {
    public Chicken(String name, String gender, int age, float weight) {
        super(name, gender, age, weight);
    }
    // Overriding the method defined in Bird
    // Overriding basically means that we are replacing a method that we are inheriting
    public void fly() {
        System.out.println("not able to fly.....");
    }
}

