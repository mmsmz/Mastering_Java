package MJ3_Understandning_OOP_Objects;


public class Human {
    String name;
    int age;
    int heightInInches;
    String eyeColor;

//    public Human() {
//        age = 5;
//        eyeColor = "brown";
//        heightInInches = 3;
//        name = "Tommy Mick";
//    }


    public Human(String name, int age, int heightInInches, String eyeColor) {
        this.name = name;
            // this keyword is variable in java and it point to current Object
        this.age = age;
        this.heightInInches = heightInInches;
        this.eyeColor = eyeColor;
    }

    public void speak() {
        System.out.println("Hello my name is : " + name);
        System.out.println("My height is : " + heightInInches);
        System.out.println("I am : " + age);
        System.out.println("My eye color is : " + eyeColor);
    }

    public void eat() {
        System.out.println("Eating ..... ");
    }

    public void walking() {
        System.out.println("Walking ..... ");
    }

    public void sleeping() {
        System.out.println("Sleeping ..... ");
    }

}
