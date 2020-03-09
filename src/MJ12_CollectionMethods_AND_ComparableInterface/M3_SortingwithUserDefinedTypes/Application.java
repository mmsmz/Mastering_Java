package MJ12_CollectionMethods_AND_ComparableInterface.M3_SortingwithUserDefinedTypes;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        HashSet<Employee> emplist = new HashSet<Employee>();
        emplist.add(new Employee("Ron",12000,"Brandix"));
        emplist.add(new Employee("Richard",120000,"HR"));
        emplist.add(new Employee("Sam",45000,"Marketing"));

        // Two ways of initializing the value either above OR Below ---------------------------------------------------
        Employee employee = new Employee("John",65000,"IT");
        emplist.add(employee);

        // ----------------------------------- ---- ---- -- -- -- -- -- ------ ----
        List<Employee>  sortingMyList = new ArrayList<Employee>(emplist);
        // Collections.sort(sortingMyList); error becuase its not applicable
        Collections.sort(sortingMyList);  // to make this sorting work Employee class must implement the Comparable<Employee>
        System.out.println(sortingMyList);
//outputs: [Employee{name='Ron', salary=12000, department='Brandix'}, Employee{name='Sam', salary=45000, department='Marketing'}, Employee{name='John', salary=65000, department='IT'}, Employee{name='Richard', salary=120000, department='HR'}]

        // Sorting it with foreach
        for (Employee emp : sortingMyList) {
            System.out.println(emp);
        }
            // output :
      /*Employee{name='Ron', salary=12000, department='Brandix'}
        Employee{name='Sam', salary=45000, department='Marketing'}
        Employee{name='John', salary=65000, department='IT'}
        Employee{name='Richard', salary=120000, department='HR'}*/
    }
}
