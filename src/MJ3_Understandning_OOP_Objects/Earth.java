package MJ3_Understandning_OOP_Objects;

public class Earth {
    public static void main(String[] args) {
 //       Human tom;
     //   tom = new Human();
        // tom is a variable
        // "new" method is used to call the constructor method to create a new object

        //tom.speak(); // we are invoking the speak method on that object so we are basically asking tom to speak now
    /*    Hello my name is : null
        My height is : 0
        I am : 0
        My eye color is : null */
/*
        tom.age = 5;
        tom.eyeColor = "brown";
        tom.heightInInches = 3;
        tom.name = "Tommy Mick";
        tom.speak();

        Human joe = new Human();
        joe.age = 17;
        joe.eyeColor = "brown";
        joe.heightInInches = 6;
        joe.name = "Joe Simha";
        joe.speak();*/

        Human human1 = new Human("Tom",19,6,"Blue");
        // we have initialized and instantiated the object with different values
        Human human2 = new Human("Joe",25,16,"brown");

        human1.speak();
        human2.speak();

    }
}
