package MJ15_Generics.client;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Object myObject = new Object();
        String myVar = "hello";
        myObject = myVar;
// ----------------------------------------------------------------------------------------------------------1

        Employee emp = new Employee();
        Accountant acc = new Accountant();
        emp = acc; // an account is an employee and this is polymorphism
        // here Employee is the parent class of Accountant
// ----------------------------------------------------------------------------------------------------------2
        // ArrayList<Employee> employees = new ArrayList<>();
        ArrayList<Object> employees = new ArrayList<>(); // even if you change to Object bcoz Object is the Parent
        //  of all other classes

        ArrayList<Accountant> accountants = new ArrayList<>();
        //  employees  = accountants; //  this is not allowed
// ----------------------------------------------------------------------------------------------------------3
        // this <?> is wildcard which means a list with unknown type
        ArrayList<?> employee2 = new ArrayList<>();
        // ArrayList<Accountant> accountants2 = new ArrayList<>();
        // i can also change to String
        ArrayList<String> accountants2 = new ArrayList<>();
        employee2 = accountants2; // now there is no problem
// ----------------------------------------------------------------------------------------------------------4

        ArrayList<? extends Employee> employees3 = new ArrayList<>();
        //<? extends Employee> means this is a list that accepts data of M of type employee as well as children of employee
        ArrayList<String> accountants3 = new ArrayList<>();// we know string is not a child class of the employee that why its working !!
        // employees3 = accountants3; // there for change the String to Accountant

// ----------------------------------------------------------------------------------------------------------4
        // this is Upper bound.
        ArrayList<? extends Employee> employees4 = new ArrayList<>();
        ArrayList<Accountant> accountants4 = new ArrayList<>();
        employees4 = accountants4; // this works beacuse Account is sub of Employee

        // therefore the highest type of the class can go into the list. <? extends Employee>  here like Employee
        // and also it allows not only the class also the interface

// ----------------------------------------------------------------------------------------------------------5
        // this is Lower bound.
        // this <? super Employee>  means only excepts super class of Employee like Object or else this will show error.
        ArrayList<? super Employee> employees5 = new ArrayList<>();
        ArrayList<Object> accountants5 = new ArrayList<>();
        employees5 = accountants5; // this works beacuse Account is sub of Employee

        // therefore the highest type of the class can go into the list. <? extends Employee>  here like Employee
        // and also it allows not only the class also the interface

// ----------------------------------------------------------------------------------------------------------
//

        ArrayList<Employee> employees6 = new ArrayList<>();
        employees6.add(new Employee());
        ArrayList<Accountant> accountants6 = new ArrayList<>();
        // employees  = accountants;
        accountants6.add(new Accountant());

        // makeEmployeeWork(employees6);
        makeEmployeeWork(accountants6);
    }
    public static void makeEmployeeWork(List<? extends Employee> employees) { // all children of Employee can pass
//        for (Employee emp : employees) {
//            emp.work();
//        }
        // for (Accountant emp : employees) { emp.work(); }// we have to downcast this
//        for (HRManger emp : (ArrayList<HRManger>) employees) {
//
//        }
        for (Employee emp : employees) {
            emp.work();
        }
    }
}
