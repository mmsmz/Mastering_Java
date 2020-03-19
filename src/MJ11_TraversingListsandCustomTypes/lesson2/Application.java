package MJ11_TraversingListsandCustomTypes.lesson2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        //ArrayList<String> animals = new ArrayList<String>();
        List<String> animals = new ArrayList<String>();
        animals.add("Lion");
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Bird");

        // two ways to loop over this
        // 1. forloop
        // 2. foreach loop and it was introduce Java 5

//      for (int i = 0; i < animals.size(); i++) {
//           System.out.println(animals.get(i)); // now this will allows to traverse this entire list and print out the data.
//      }

        for (String value : animals){
            System.out.println(value);
        }

        //ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
        List<Vehicle> vehicles = new LinkedList<>(); // instead of LinkedList use list for reference

        // the below is another way of initializing by creating the Vehicle Object
        Vehicle vehicle2 = new Vehicle("Toyata","Camery",1200,false);

        vehicles.add(new Vehicle("Honda","Accord",12000,false)); // this is the zeroth index 0
        vehicles.add(vehicle2);
        vehicles.add(new Vehicle("Jeep","Wrangler",25000,true));

        vehicles.remove(0);
        for (Vehicle car:vehicles) {
            // System.out.println(car); // this prints an hashcode like this MJ11_TraversingListsandCustomTypes.lesson2.Vehicle@4554617c
                                        // create a toString() method in the Vehicle class and then this will print in a readable way.
           System.out.println(car.getMake()); // instead of getting all the values you can get individual values like this.
           System.out.println(car.getModel());
           System.out.println(car.getPrice());
        }

//      for (Vehicle car:vehicles) {
//         System.out.println(car); // create a toString() method in the Vehicle class and then this will print in a readable way.
//      }


       // List<String> values = new ArrayList<String>();
        printElement(vehicles);
        printElement(animals);
    }

    public static void printElement(List someList){ // even with ArrayList or LinkedList it works
        for (int i = 0; i < someList.size(); i++) {
            System.out.println(someList.get(i));
            // someList.remove()
        }

    }
}
