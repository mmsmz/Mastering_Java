package MJ5_AbstractClass;

public class Zoo {
    public static void main(String[] args) {

        // abstract class is almost a regular class which can have methods in there.
        // from creating an interface remember what that method was, it was an abstract method.
        // abstract class has only abstract methods in it.

        // abstract class can only be extended we cannot instantiate an instance of an abstract class.

        // Animal sparrow = new Sparrow("Spar","male",2,1.3f);
        // now the object is created in someplace in memory and the object is not of type Animal.
        // the object is a type of Sparrow but the variable that points to that object is of type Animal

       // sparrow.move();

        // now i cannot include the method fly()

        Animal sparrow1 = new Sparrow("Spar","male",2,1.3f);
       // sparrow1.move();

        Animal fish1= new Fish("fishhy","male",1,2.5f);
       // fish1.move();

        moveAniamls(fish1);
        moveAniamls(sparrow1);
    }

    public static void moveAniamls(Animal animal){
        animal.move();
    }

}
