package MJ5_AbstractClass;

public class Fish extends Animal {
    public Fish(String name, String gender, int age, float weight) {
        super(name, gender, age, weight);
    }


    public void move() {
        System.out.println("Fish is swimming......");
    }

    public void swim(){
        System.out.println("Fishing will swim in the sea");
    }
}
