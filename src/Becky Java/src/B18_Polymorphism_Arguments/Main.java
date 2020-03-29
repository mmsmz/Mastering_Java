package B18_Polymorphism_Arguments;

public class Main {
    public static void main(String[] args) {
        Department dpmt = new Department();
     //   Employee emp  = new Employee();
        // now here your can pass objects inside a methods
//        dpmt.departmentName(emp);

        // and also we can pass subclass inside a methods

        Employee newemp  = new HR();
        dpmt.departmentName(newemp);

        // when we did tin the whole program
        // we have created a dempt name
        // we create a Employee objects because Deparment takes the emp inside a method
        // after that we create a HR Object because this HR object is a subclass from the Employee which is the superclass

    }
}
