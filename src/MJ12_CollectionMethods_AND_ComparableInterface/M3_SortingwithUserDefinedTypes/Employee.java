package MJ12_CollectionMethods_AND_ComparableInterface.M3_SortingwithUserDefinedTypes;

public class Employee implements Comparable<Employee> {
    String name;
    int salary;
    String department;

    public Employee(String name, int salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    @Override // this method coming from Comparable<Employee>
    public int compareTo(Employee o) { // we need this code to compare one employee with another
        if(this.salary<o.salary){ // you can use the sorting the salary where it starts from low to higher salary
            return  -1;
        } else if(this.salary>o.salary){
            return 1;
        }
        return 0;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }


}
