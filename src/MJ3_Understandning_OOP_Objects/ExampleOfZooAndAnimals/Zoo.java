package MJ3_Understandning_OOP_Objects.ExampleOfZooAndAnimals;

public class Zoo {
    public static void main(String[] args) {

        Animal animal1=  new Animal("Lion","Male",15,42.6f);
        Animal animal2=  new Animal("Elepant", "Female",15,105f);
        Animal animal3=  new Animal("Tiger","Female",16,36f);

        animal1.eat();
        animal2.sleep();
        animal3.sleep();

        Bird bird = new Bird();
        bird.fly();

        Fish fish = new Fish();
        fish.swim();
    }
}
