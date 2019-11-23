package MJ11_TraversingListsandCustomTypes.lesson3;

import MJ3_Understandning_OOP_Objects.ExampleOfZooAndAnimals.Animal;

import java.util.HashSet;

public class M2_HashSet_AnotherExample {
    public static void main(String[] args) {

        HashSet<Animals> animals= new HashSet<Animals>();

        Animals animal1 = new Animals("Dog",12); // here
        Animals animal2 = new Animals("Cat",8);
        Animals animal3 = new Animals("Bird",3);
        Animals animal4 = new Animals("Dog",12);  // repeats
        Animals animal5 = new Animals("kangaroo",24);

        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);
        animals.add(animal4);
        animals.add(animal5);

        for (Animals value: animals){
            System.out.println(value);
        }

        // in this example HashSet cannot manage unique values even through we know "Dog" , 12 is a repeat
// this is because the hashcode is different and they are not equal, check with .equals() method below

        // System.out.println(animal1.equals(animal4)); // it returns false which means they are not equal
        //System.out.println(animal1.hashCode());
        // System.out.println(animal4.hashCode());

        // note after create a method equals and hashcode method in the Animals this program will not duplicate "Dog",12 again

        System.out.println(animal1.equals(animal4)); // this will return true



    }
}
