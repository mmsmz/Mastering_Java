package MJ5_AbstractClass;

public class Bird extends Animal {

    public Bird(String name, String gender, int age, float weight) {
        super(name, gender, age, weight);
    }


    public void move() {
        System.out.println("birds are flapping....");
    }

    public void fly(){
        System.out.println("Birds will fly any where and everywhere!!");
    }
}
