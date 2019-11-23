package MJ4_ClassInheritance;

public class Bird extends Animal{

    public Bird(String name, String gender, int age, float weight) {
        super(name, gender, age, weight);
    }

    public void move() {
        System.out.println("Flapping the wings....");
    }

    public void fly(){
        System.out.println("Birds will fly any where and everywhere!!");
    }
}
