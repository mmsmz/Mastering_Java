package B19_AbstractClasses_and_ConcreteClass;

public class Department {

   // Employee asd = new Employee(); we get an error because Employee is a abstract class
   //  Employee asd = new IT(); // this works becuase this class IT has no restriction

    // what is abstract method
    // it is a method that must be over written

    public void departmentName(Employee x){
        x.yourID();
    }

}
