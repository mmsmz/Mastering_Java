package MJ5_AbstractClass;

public class Sparrow extends Bird implements Flyable {
    public Sparrow(String name, String gender, int age, float weight) {
        super(name, gender, age, weight);
    }

    public void fly(){
        System.out.println("this sparrow can fly");
    }
}
