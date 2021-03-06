package MJ3_Understandning_OOP_Objects.ExampleOfZooAndAnimals;

public class Animal {
    String name;
    String gender;
    int age;
    float weight;

    public Animal(String name, String gender, int age, float weight) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
    }

    public void eat() {
        System.out.println("The animal " + name + " had its meal!!");
        System.out.println("It is a " + gender + " animal and it "+ age+" years old");
        System.out.println("It weighs " + weight);
    }

    public void sleep() {
        System.out.println("The " + gender + " animals are sleeping!!");
    }

}
